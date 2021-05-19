#!/usr/bin/env groovy

@Library(['pipeline-library-khoavu'])_

import org.example.Constants

stage('Demo') {

    echo 'Hello World'

    sayHello 'Dave'

    println('******')

    println(Constants.SLACK_MESSAGE)
}