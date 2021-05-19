#!/usr/bin/env groovy

/**
 * Sample Jenkinsfile for Jenkins2 Pipeline
 * from https://github.com/hotwilson/jenkins2/edit/master/Jenkinsfile
 * by wilsonmar@gmail.com
 */

import hudson.model.*
import com.khoavu.pipeline.EmailHelper


node {
    stage '\u2776 Stage 1'
    echo "\u2600 BUILD_URL=${env.BUILD_URL}"

    def workspace = pwd()
    echo "\u2600 workspace=${workspace}"

    echo "${env.JOB_NAME}"

    echo "${env.BUILD_NUMBER}"

    echo "${env.BUILD_URL}"

    EmailHelper emailHelper = new EmailHelper()

    emailHelper.simpleFunc()

    stage '\u2777 Stage 2'
}
