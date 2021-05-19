#!/usr/bin/env groovy

@Library(['pipeline-library-khoavu'])_

import org.example.Constants

/*
stage('Demo') {

    echo 'Hello World'

    sayHello 'Dave'

    println('******')

    println(Constants.SLACK_MESSAGE)
}*/

pipeline {
    agent {
        label '!windows'
    }

    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
    }

    stages {
        stage('Build') {
            steps {
                sayHello 'Dave'

                println(Constants.SLACK_MESSAGE)

                echo "Database engine is ${DB_ENGINE}"
                echo "DISABLE_AUTH is ${DISABLE_AUTH}"
                sh 'printenv'
            }
        }
    }
}
