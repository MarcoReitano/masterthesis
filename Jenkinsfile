node {
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git url: 'https://github.com/MarcoReitano/masterthesis.git', branch: 'master'
   }
   stage('Build') {
      echo 'Hello World! Testpush'
   }
   stage('Deploy'){
      sh 'ls'
      sh 'docker stack up -c docker-compose.yml Mitneve'
   }
}
