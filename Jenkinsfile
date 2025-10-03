// Jenkinsfile CORRIGÉ
pipeline {
    agent any

    // On demande à Jenkins d'utiliser l'outil Maven configuré sous le nom 'M3'
    tools {
        maven 'M3'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Démarrage de la compilation Maven...'
                sh 'mvn clean install'
            }
        }
    }
}