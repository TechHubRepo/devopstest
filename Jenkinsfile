pipeline{
	agent any

	tools {
        maven 'MyMaven'
        jdk 'MyJDK'
    }

	stages{
		stage("1. Code Checkout"){
			steps{
				echo "Started Code Checkout"
				git branch:'master', url: 'https://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@github.com/TechHubRepo/devopstest.git'
				echo "Ended Code Checkout"
			}
		}

		stage("2. Compiling"){
			steps{
				echo "Started Compiling"
				sh 'mvn clean compile'
				echo "Ended Compiling"
			}
		}

		stage("3. Unit Testing"){
			steps{
				echo "Started Running JUnit"
				sh 'mvn test'
			    echo "Ended Running JUnit"
			}
		}

		stage("4. Packaging"){
			steps{
				echo "Started Packaging"
				sh 'mvn package'
				echo "Ended Packaging"
			}
		}

        stage("5. Building and Pushing Docker image") {
           steps {
               script {
                 def customImage = docker.build("techeduhub/devopstest:1.0.0", ".")
                 docker.withCredentials([usernamePassword(credentialsId: 'MyDockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
                        sh "echo ${env.dockerHubPassword} > /tmp/dockerpassword.txt"
                        sh "cat /tmp/dockerpassword.txt | docker login --username ${env.dockerHubUser} --password-stdin"
                        sh "docker push techeduhub/devopstest:1.0.0"
                        sh "/tmp/dockerpassword.txt"
                 }
           	  }
           }
        }
	}
}