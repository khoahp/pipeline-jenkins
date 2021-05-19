#!/usr/bin/env groovy

@Library(['pipeline-library-demo', 'lib-pipeline'])_


stage('Demo') {

    echo 'Hello World'

    sayHello 'Dave'

    callTest 'Khoa $$$'
}