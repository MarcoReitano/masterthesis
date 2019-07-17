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
      docker.withServer('tcp://172.17.0.1:2375') {
        sh 'echo $(hostname) '
      }
   }
}
