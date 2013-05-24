#Uninstall the application
import sys

deployEAR=''.join(sys.argv[0])

AdminApp.install(deployEAR, '-cell srvwasvecCell01 -node srvwasvecNode01 -server server1')
#save
AdminConfig.save()
