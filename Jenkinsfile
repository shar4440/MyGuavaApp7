pipeline {
    agent any  // Use any available Jenkins agent

    tools {
        maven 'Maven'  // Use the Maven tool configured in Jenkins (must match name in Jenkins settings)
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone the GitHub repository
                git branch: 'master', url: 'https://github.com/shar4440/MyGuavaApp7.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean package'  // Corrected: should be "mvn", not "maven"
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }

        stage('Run-Application') {
            steps {
                // Run the main class using Maven Exec plugin
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

    post {
        success {
            echo 'Build and deployment succeeded'
        }
        failure {
            echo 'Build failed'
        }
    }
}
