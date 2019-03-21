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
        // shell('docker run -v ${pwd}:/app --rm phpunit/phpunit tests')
    }
}
job('version2') {
    scm {
        git {
            remote {
                url('https://github.com/romoliere/ci-examen.git')
            }
            branch('v2')
        }
    }
    steps {
        shell('docker-compose build')
        shell('docker login --username rverdin --password fixme')
        shell('docker push rverdin/ci_examen_verdin_nginx:2.0')
        shell('docker push rverdin/ci_examen_verdin_php:2.0')
        // shell('docker run -v ${pwd}:/app --rm phpunit/phpunit tests')
    }
}
job('version3') {
    scm {
        git {
            remote {
                url('https://github.com/romoliere/ci-examen.git')
            }
            branch('v3')
        }
    }
    steps {
        shell('docker-compose build')
        shell('docker login --username rverdin --password fixme')
        shell('docker push rverdin/ci_examen_verdin_nginx:3.0')
        shell('docker push rverdin/ci_examen_verdin_php:3.0')
        // shell('docker run -v ${pwd}:/app --rm phpunit/phpunit tests')
    }
}
