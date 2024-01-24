pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage ('build') {
            steps {
                echo 'Building app...'
                sh 'mvn -B clean package'
                echo 'Building succeeded!'
            }
        }
    }
}