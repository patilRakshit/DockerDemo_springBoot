FROM openjdk:17

COPY  ./target/SimpleRestApi*.jar usr/data/dockerdemo

WORKDIR /usr/data

ENTRYPOINT [ "java" ,"-jar","dockerdemo.java" ]