pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './gradlew clean'
                sh './gradlew test --stacktrace'
                sh './gradlew build'
            }   
        }
    }
}
