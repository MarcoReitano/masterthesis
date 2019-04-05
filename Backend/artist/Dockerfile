FROM openjdk:8-jre
MAINTAINER Marco Reitano <marcoreitano@th-koeln.de>

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]

COPY src/main/resources/artistsdata /usr/shar/myservice/artistsdata
COPY target/artist-0.0.1-SNAPSHOT.jar /usr/share/myservice/myservice.jar
