pipeline {
    agent any

    environment {
        BRANCH = "${env.BRANCH_NAME ?: 'Unknown'}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the branch dynamically
                echo "Checking out branch: ${BRANCH}"
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    try {
                        echo "Building on branch: ${BRANCH}"
                        // Use Gradle or Maven to build the Spring Boot project
                        sh './gradlew clean build'  // For Gradle
                        // OR
                        // sh 'mvn clean install'  // For Maven
                    } catch (Exception e) {
                        echo "Build failed on branch: ${BRANCH}"
                        error("Build failed with exception: ${e}")
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    try {
                        echo "Running tests on branch: ${BRANCH}"
                        // Run tests
                        sh './gradlew test'  // For Gradle
                        // OR
                        // sh 'mvn test'  // For Maven
                    } catch (Exception e) {
                        echo "Tests failed on branch: ${BRANCH}"
                        error("Tests failed with exception: ${e}")
                    }
                }
            }
        }
    }

    post {
        success {
            echo "Build and tests successful on branch: ${BRANCH}"
        }
        failure {
            echo "Build or tests failed on branch: ${BRANCH}"
        }
        always {
            echo "Pipeline finished for branch: ${BRANCH}"
        }
    }
}
