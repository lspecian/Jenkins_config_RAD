#Uninstall the application
import sys

appName=''.join(sys.argv[0])
AdminApp.uninstall(appName)
#save
AdminConfig.save()
