pipeline {

  agent any

  tools {
    docker 'Docker'
  }

  stages {
    stage('Deploy'){
      steps {
        sh 'ls'
        docker.withServer('tcp://10.10.10.99:2375', 'MitneveVM') {
          sh 'echo bla'
          sh 'docker ps'
        }
      }
    }
  }
}
