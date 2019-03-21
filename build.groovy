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
        shell('docker run -v ${pwd}:/app --rm phpunit/phpunit ci-examen/tests')
    }
}
