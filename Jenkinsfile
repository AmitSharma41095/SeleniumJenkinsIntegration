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
    
    stage('Post') {
            echo 'Build completed successfully.'
            
            // Success Email Notification
            emailext (
                subject: "SUCCESS: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
                body: """<p>Build succeeded!</p>
                         <p>Job: ${env.JOB_NAME}</p>
                         <p>Build Number: ${env.BUILD_NUMBER}</p>
                         <p><a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>""",
                to: 'amitsharma41095@gmail.com', // Replace with your email
                mimeType: 'text/html'
            )
        }

    } catch (err) {
        echo "Build failed: ${err}"

        // Failure Email Notification
        emailext (
            subject: "FAILED: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
            body: """<p>Build failed!</p>
                     <p>Job: ${env.JOB_NAME}</p>
                     <p>Build Number: ${env.BUILD_NUMBER}</p>
                     <p><a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>""",
            to: 'amitsharma41095@gmail.com', // Replace with your email
            mimeType: 'text/html'
        )

        // Re-throw to mark build as failed
        throw err
    }
    
}
