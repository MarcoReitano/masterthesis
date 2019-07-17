pipeline {

  agent any

  stages {
    stage('Deploy'){
      steps {
        script {
          sh 'ls'
          sh 'echo bla'
          sh 'docker ps'
          sh 'docker stack deploy -c docker-compose.yml Mitneve'
        }
      }
    }
  }
}
