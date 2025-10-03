// Jenkinsfile - Un exemple simple
pipeline {
    agent any // Exécute ce pipeline sur n'importe quel agent Jenkins disponible

    stages {
        // Un "stage" est une étape logique du processus
        stage('Build') {
            steps {
                // "steps" sont les commandes à exécuter
                echo 'Démarrage de la compilation Maven...'
                
                // Pour Windows, on utilise la commande 'bat'
                bat 'mvn clean install'
                
                // Sur un serveur Linux, on utiliserait 'sh'
                // sh 'mvn clean install'
            }
        }
    }
}