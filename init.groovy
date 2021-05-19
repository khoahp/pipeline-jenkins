#!/usr/bin/env groovy

@Library(['pipeline-library-khoavu', 'lib-pipeline'])_

import com.cleverbuilder.GlobalVars

stage('Demo') {

    echo 'Hello World'

    sayHello 'Dave'

    println('******')

    println(GlobalVars.foo)

    println('******')

}