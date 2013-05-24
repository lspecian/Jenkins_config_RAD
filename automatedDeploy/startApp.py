#!
import sys


appName=''.join(sys.argv[0])
appManager=AdminControl.queryNames('cell=srvwasvecCell01,node=srvwasvecNode01,type=ApplicationManager,process=server1,*')
print appManager
AdminControl.invoke(appManager, 'startApplication', appName)
