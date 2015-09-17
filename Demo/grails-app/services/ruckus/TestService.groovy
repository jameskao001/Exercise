package ruckus

import grails.transaction.Transactional

@Transactional
class TestService {

    def serviceMethod() {
		println "service"
		
		println "after service"
    }

    def executeMyScript() {
		println "service executeMyScript"
		def cmd = ['groovy.bat', 'E:\\Ruckus\\workspace\\Exercise\\foo.groovy']
		cmd.execute()
    	// "groovy cp src/groovy scripts/myscript.groovy".execute()
		println "after service executeMyScript"
	}
}
