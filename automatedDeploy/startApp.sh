#!/bin/bash

/opt/IBM/WebSphere/AppServer/profiles/AppSrv01/bin/wsadmin.sh -username wasadmin -password 1234 -lang jython -f ./startApp.py $1 

