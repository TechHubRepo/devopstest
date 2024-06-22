pipeline{

	agent any

    environment {
        APP_VERSION = '1.0.3'
    }

	tools {
        maven 'MyMaven'
        jdk 'MyJDK'
    }

	stages{
		stage("1. Code Checkout"){
			steps{
				echo "Checking Out The Code"
				git branch:'master', url: 'https://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@github.com/TechHubRepo/devopstest.git'
				echo "Code Checkout Completed"
			}
		}

		stage("2. Compiling"){
			steps{
				echo "Compiling the code"
				sh 'mvn clean compile'
				echo "Code compilation completed"
			}
		}

		stage("3. Unit Testing"){
			steps{
				echo "Running JUnit Test"
				sh 'mvn test'
			    echo "JUnit Test Completed"
			}
		}

		stage("4. Packaging"){
			steps{
				echo "Packaging The Code"
				sh 'mvn package'
				echo "Code Packaging Completed"
			}
		}

        stage("5. Building Docker image") {
           steps {
                echo "Building Docker Image"
                script {
                    def customImage = docker.build("techeduhub/devopstest:${APP_VERSION}", ".")
           	    }
           	    echo "Docker Image Build Completed"
           }
        }

        stage("6. Pushing Docker Image to Registry"){
        	steps{
        		echo "Pushing Docker Image"
        		sh "cat /.dockercfg/dockerhubpassword.txt | docker login --username techeduhub --password-stdin"
        		sh "docker push techeduhub/devopstest:${APP_VERSION}"
        	    echo "Image Pushing Completed"
            }
        }

        stage("7. Deploying the Application") {
            steps {
                echo "Started Deploying"
                sh '/usr/local/bin/helm upgrade --install devopstest-deployment devopstest-chart'
                echo "Deployment Completed"
            }
        }
	}
}