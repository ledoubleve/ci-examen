job('version1') {
    scm {
        git {
            remote {
                url('git@github.com:romoliere/ci-examen.git')
            }
            branch('v1')
        }
    }
    steps {
        shell('docker-compose build')
        shell('docker-compose up -d')
    }
}
