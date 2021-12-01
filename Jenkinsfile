pipeline {
  agent any

  stages {
    stage('Test') {
      steps {
        echo 'Test pass'
      }
    }
    stage('Build') {
      steps {
        echo 'Build pass'
      }
    }
    stage('Deploy') {
      steps {
        withKubeConfig(credentialsId: 'kubeconfigid') {
          // sh 'curl -LO "https://storage.googleapis.com/kubernetes-release/release/<version-kubectl>/bin/linux/amd64/kubectl"'  
          // sh 'chmod u+x ./kubectl'
          sh 'kubectl cluster-info'
        }
      }
    }
  }
}