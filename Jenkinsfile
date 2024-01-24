pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage ('build') {
            steps { //liten ändring
                echo 'Building app...'
                sh 'mvn -B clean package'
                echo 'Building succeeded!'
            }
        }
    }
}