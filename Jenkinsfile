pipeline {
    agent any

    stages {
    
        stage('IntegrationTest') {
            steps {
                echo 'This is Building..'
                bat "mvn clean install"
            }
			}
            
            stage('DeployTestSertver') {
            steps {
                echo 'DeployTestSertver'
                
            }
			}
            
            stage('SeliniumTest') {
            steps {
                echo 'SeliniumTest'
                
            }
			}
            
            stage('DeployProdServer') {
            steps {
                echo 'DeployProdServer'
                
            }
			}
        
	}
}
  
