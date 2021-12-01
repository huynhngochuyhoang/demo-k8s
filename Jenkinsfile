pipeline {
  agent any

  environment {
    GITCOMMIT="${sh(returnStdout: true, script: 'git rev-parse HEAD')}"
  }
  
  stages {
    stage('Test') {
      steps {
        echo "Git commit hash is ${GITCOMMIT}"
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
