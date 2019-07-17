pipeline {

  agent any

  stages {
    stage('Deploy'){
      steps {
        script {
          sh 'ls'
          docker.withServer('tcp://10.10.10.99:2375', 'MitneveVM') {
            sh 'echo bla'
            sh 'docker ps'
          }
        }
      }
    }
  }
}
