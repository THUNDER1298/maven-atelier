// Jenkinsfile CORRIGÉ
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Démarrage de la compilation Maven...'
                // CORRECTION ICI : 'sh' est la commande pour Linux
                sh 'mvn clean install'
            }
        }
    }
}