FROM openjdk:17

COPY  ./target/DockerDemo_springBoot*.jar usr/data/dockerdemo

WORKDIR /usr/data

ENTRYPOINT [ "java" ,"-jar","dockerdemo.java" ]