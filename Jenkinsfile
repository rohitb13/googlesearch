pipeline {
    agent any

    stages {
    
        stage('Build') {
            steps {
                echo 'IntegrationTest'
                bat "mvn clean install"
                
            }
			}
            
            stage('Deploy') {
            steps {
                echo 'DeployTestServer'
                
            }
			}
            
            stage('Test') {
            steps {
                echo 'SeliniumTest1.'
              
                
            }
			}
            
            stage('Release') {
            steps {
                echo 'DeployProdServer'
                
            }
			}
        
	}
}
  
