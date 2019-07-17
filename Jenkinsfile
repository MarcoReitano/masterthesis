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
      docker.withServer('tcp://10.10.10.99:2375', 'MitneveVM') {
        sh 'echo bla'
        sh 'docker ps'
      }
   }
}
