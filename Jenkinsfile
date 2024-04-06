pipeline{
	agent any
	stages{
		stage("Code Checkout"){
			steps{
				echo "Started Code Checkout"
				git branch:'master', url: 'https://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@github.com/TechHubRepo/devopstest.git'
				echo "Ended Code Checkout"
			}
		}

		stage("Compiling"){
			steps{
				echo "Started Compiling"
				sh 'mvn clean compile'
				echo "Ended Compiling"
			}
		}

		stage("Unit Testing"){
			steps{
				echo "Started Running JUnit"
				sh 'mvn test'
			    echo "Ended Running JUnit"
			}
		}

		stage("Packaging"){
			steps{
				echo "Started Checking Code Coverage"
				sh 'mvn package'
				echo "Ended Checking Code Coverage"
			}
		}
	}
}