pipeline {
    agent any

    /*
    parameters {
        choice(name: 'DEPLOY_ENV', choices: ['dev', 'qa', 'prod'], description: 'Select target environment')
    }
    */

    environment {
        DOCKERHUB_USER = 'satheeshdevops03'
        IMAGE_NAME = "${DOCKERHUB_USER}/phoenix"
        IMAGE_TAG = "${BUILD_NUMBER}"
        FULL_IMAGE = "${IMAGE_NAME}:${IMAGE_TAG}"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Satheesh-DevOps-03/phoenix.git'
            }
        }

        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
            environment {
                SONAR_TOKEN = credentials('sonar-token') 
            }
            steps {
                withSonarQubeEnv('SonarServer') {
                    sh 'mvn sonar:sonar -Dsonar.projectKey=phoenix \
                                        -Dsonar.login=$SONAR_TOKEN'
                }
            }
        }

        stage('Build JAR') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $FULL_IMAGE .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry([ credentialsId: 'dockerhub-creds', url: '' ]) {
                    sh 'docker push $FULL_IMAGE'
                }
            }
        }
    }

    post {
        always {
            echo "Build completed. Docker Image: $FULL_IMAGE"
        }
        success {
            echo "✅ Build succeeded! Ready to deploy."
            // Optionally: notify via Slack/email here
        }
        failure {
            echo "❌ Build failed. Please check the logs."
            // Optionally: alert via Slack/email here
        }
    }
}
