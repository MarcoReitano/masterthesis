pipeline {

  agent any

  stages {
    stage('Deploy'){
      steps {
        script {
          sh 'ls'
          sh 'echo bla'
          sh 'docker ps'
          withCredentials(
          [usernamePassword(credentialsId: 'keycloakadmin', usernameVariable: 'KEYCLOAK_USER', passwordVariable: 'KEYCLOAK_PASSWORD')]
          ) {
            sh 'docker stack deploy -c docker-compose.yml Mitneve'
          }
        }
      }
    }
  }
}
