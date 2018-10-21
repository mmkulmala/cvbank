FROM java:8
VOLUME /tmp
ADD target/cvbank-0.0.1-SNAPSHOT.jar cvbank.jar
EXPOSE 8080
RUN sh -c 'touch /cvbank.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongocontainer/cvbank", "-Djava.security.egd=file:/dev/./urandom","-jar","/cvbank.jar"]

