pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Dynamically checkout the branch being built
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Use Gradle or Maven to build the Spring Boot project
                sh './gradlew clean build'  // If you use Gradle
                // OR
                // sh 'mvn clean install'  // If you use Maven
            }
        }
        stage('Test') {
            steps {
                // Run the tests
                sh './gradlew test'  // For Gradle
                // OR
                // sh 'mvn test'  // For Maven
            }
        }
    }

    post {
        success {
            echo 'Build and Test successful!'
        }
        failure {
            echo 'Build or Test failed!'
        }
    }
}
