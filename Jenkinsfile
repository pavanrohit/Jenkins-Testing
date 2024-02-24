pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your code from version control
                checkout scm
            }
        }

        stage('Setup') {
            steps {
                // Set up a virtual environment and install dependencies
                script {
                    sh 'python -m venv venv'
                    sh 'source venv/bin/activate && pip install -r requirements.txt'
                }
            }
        }

        stage('Test') {
            steps {
                // Run your Python tests
                script {
                    sh 'source venv/bin/activate && python -m pytest'
                }
            }
        }
    }

    
}