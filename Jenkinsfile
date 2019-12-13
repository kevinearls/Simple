pipeline {
    agent any
    tools {
        maven 'M3'
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
                //sh 'mvn --show-version --batch-mode --fail-at-end -Dsurefire.rerunFailingTestsCount=2 clean install'
                sh "mvn --show-version -Dmaven.test.failure.ignore=true clean package"
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
