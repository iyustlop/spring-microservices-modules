pipeline {
    agent any
    stages {
        stage ('Compile stage'){
        steps{
            withMaven(maven:'maven_3_6_0'){
                sh 'mvn clean compile'
            }
        }
        stage ('Testing stage'){
        steps{
            withMaven(maven:'maven_3_6_0'){
                sh 'mvn test'
            }
        }

        stage ('Sonar stage'){
        steps{
            withMaven(maven:'maven_3_6_0'){
                sh 'mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install sonar:sonar -X'
            }
        }

    }
}