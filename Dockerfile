FROM ubuntu:22.04
LABEL maintainer TechHub
RUN apt-get -y update
RUN apt-get -y install openjdk-17-jdk
ADD /target/DevOpsTest-latest.war DevOpsTest-latest.war
EXPOSE 8081
ENTRYPOINT ["java","-jar","DevOpsTest-latest.war"]
