pipeline {
    agent any

    stages {
    
        stage('IntegrationTest') {
            steps {
                echo 'IntegrationTest'
                bat "mvn clean install"
            }
			}
            
            stage('DeployTestServer') {
            steps {
                echo 'DeployTestServer'
                
            }
			}
            
            stage('SeliniumTest') {
            steps {
                echo 'SeliniumTest.'
                bat "mvn test"
                
            }
			}
            
            stage('DeployProdServer') {
            steps {
                echo 'DeployProdServer'
                
            }
			}
        
	}
}
  
