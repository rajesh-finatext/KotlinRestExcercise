pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './gradlew clean'
                sh './gradlew build --warning-mode all'
            }   
        }
        stage('Deploy') {
            steps {
                sh './gradlew bootRun'
            }
        }
    }
}
