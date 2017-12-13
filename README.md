# nexus-introduction-lab

### Get a Nexus image from dockerhub

Search for a suitable sonar nexus image from www.dockerhub.com

Create a docker-compose file based on the image.

Make sure to expose all ports that is needed to the docker host

### Start nexus!

Login to the nexus web console to ensure that the application is up and running.

Standard credentials are admin/admin123

### Deploy an artifact to nexus

Find a maven-based project of your choice. Feel free to use the one embedded in this repo.

Build the project with maven:
```
mvn package
```

This will produce a war-artifact.

Modify the pom.xml to add the correct distribution management settings for your nexus-application.

For help and documentation, see: https://maven.apache.org/pom.html

When configured, deploy your artifact to nexus and assure that the artifact is uploaded by searching the repositories in the web
console.

```
mvn deploy
```
