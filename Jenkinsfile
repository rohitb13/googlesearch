pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'This is Building..'
                bat "mvn clean install"
            }
        }
        
    }
}