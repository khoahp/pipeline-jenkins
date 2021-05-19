#!/usr/bin/env groovy

@Library(['pipeline-library-khoavu', 'lib-pipeline'])_

stage('Demo') {

    echo 'Hello World'

    sayHello 'Dave'

    println('******')

}