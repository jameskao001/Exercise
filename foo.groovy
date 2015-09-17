println 'it works!'
println 'http://www.google.com'.toURL()
def sout = new StringBuffer(), serr = new StringBuffer()
//def proc = 'pybot E:/Ruckus/workspace/Exercise/Exercise_for_Ruckus.txt'.execute()
def proc = 'ls E:/Ruckus/workspace/Exercise/'.execute()
proc.consumeProcessOutput(sout, serr)
proc.waitForOrKill(1000)
println "out> $sout err> $serr"