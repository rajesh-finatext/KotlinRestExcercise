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
                // sh './gradlew bootRun'
                sh 'bash ./scripts/deploy.sh > /dev/null &'
                timeout(time: 2, unit: 'MINUTES') {
                    sh 'bash ./scripts/healthCheck.sh'
                }
            }
        }
    }
}
