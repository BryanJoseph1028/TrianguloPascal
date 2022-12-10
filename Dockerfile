FROM openjdk:11
COPY . /usr/src/myapps
WORKDIR /usr/src/myapps
CMD ["java","-jar","/usr/src/myapps/target/TrianguloPascal-1.0.jar"]

