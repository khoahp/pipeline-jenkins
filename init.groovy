#!/usr/bin/env groovy

@Library('lib-pipeline')_

stage('Demo') {
    echo 'Hello world'

    callTest()
}