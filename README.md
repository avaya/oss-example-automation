# OSS Automation Server

The OSS Automation Server is an example of a server that handles Automation callbacks from Avaya OSS.  This example has been written as a Spring Boot application.  The example just logs any messages it receives.  It can be used as a basis for actual automation.

### Runtime Usage

The runtime of the example server consists of a single jar file and optionally an application.properties file in the same directory if you wish to override any of the server's defaults.  To start the server, simply run the following command in the directory containing the jar file using a console window:
java -jar sub-mgmt-server.jar

The server writes its output and logs to stdout so you must run it in a console window.   The server only takes a few seconds to start once Spring completes its initialization.

### Customization

The server is configurable using an application.properties file in the same directory as the jar file.  It's optional - you only need it if you wish to override a default configuration.  The contents of this file (what you can override) as well as the defaults, are presented below:
```
# Port the server is running on
server.port=62666
#
# User and password that clients must use if authentication is turned on
auth.username=testuser
auth.password=testpass
#
# Values are as follows:
#   basic - HTTP Basic Authentication
#   digest - HTTP Digest Authentication
#   none - Security is turned off.
auth.type=basic
```

As you can see, the example server can be run on any port.  It can be run with or without security.  You can choose one of two common authentication schemes and pick any user and password string.

