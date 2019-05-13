pipeline {
    agent any
    tools {
        maven 'maven-3.6.0'
        jdk 'jdk8'
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
                sh 'pwd'
                sh 'ls -alF'
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
