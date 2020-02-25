FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/AakashSap.jar AakashSap.jar
ENTRYPOINT ["java","-jar","sAakashSap.jar"]