pipeline {
    agent any
    tools {
        maven 'maven-3.5.0'
        jdk 'jdk-8'
    }
    stages {
        stage ('checkout') {
            steps {
                checkout scm
            }
        }
        stage ('build') {
            steps {
                sh 'mvn --show-version --batch-mode --fail-at-end -Dsurefire.rerunFailingTestsCount=2 clean install'
            }
        }
        stage ('archive results') {
            steps {
                step([$class: 'JUnitResultArchiver', testResults: '**/target/*-reports/*.xml'])
            }
        }
        stage ('Cleanup') {
            steps {
                deleteDir()
            }
        }
    }
}
