pipeline {
    agent any
    tools {

    }
    stages {
        stage ('build') {
            steps {
                echo 'Building app...'
                script {
                    'mvn build'
                }
                echo 'Building succeeded!'
            }
        }
    }
}