#!/usr/bin/env groovy

@Library(['pipeline-library-khoavu'])_

stage('Demo') {

    echo 'Hello World'

    sayHello 'Dave'

    println('******')

}