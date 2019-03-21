job('version1') {
    scm {
        git {
            remote {
                url('https://github.com/romoliere/ci-examen.git')
            }
            branch('v1')
        }
    }
    steps {
        shell('docker-compose build')
        shell('docker login --username rverdin --password fixme')
        shell('docker push rverdin/ci_examen_verdin_nginx:1.0')
        shell('docker push rverdin/ci_examen_verdin_php:1.0')
        shell('docker run -v ${pwd}:/app --rm phpunit/phpunit tests')
    }
}
