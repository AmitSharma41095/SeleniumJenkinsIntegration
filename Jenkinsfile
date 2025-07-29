node {
    stage('Checkout') {
        git branch: 'main', url: 'https://github.com/AmitSharma41095/SeleniumJenkinsIntegration.git'

    }

    stage('Build') {
        echo 'Running Maven Clean Install...'
        bat 'mvn clean install'
    }

    stage('Test') {
        echo 'Running TestNG Tests...'
        bat 'mvn test'
    }

    stage('Post') {
        echo 'Build completed'
    }
}
