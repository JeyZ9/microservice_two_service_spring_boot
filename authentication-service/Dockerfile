#FROM arm64v8/openjdk:17-slim
#
#MAINTAINER Wisarut Saelao, Wisarut@gmail.com
#
#COPY ./target/authentication-service-0.0.1-SNAPSHOT.jar authentication-service.jar
#
#EXPOSE 8081
#
#ENTRYPOINT ["java", "-jar", "/authentication-service.jar"]
#



#FROM openjdk:17-slim AS builder
#
#MAINTAINER Wisarut Saelao, 664259015@webmail.npru.ac.th
#
#COPY ./target/authentication-service-0.0.1-SNAPSHOT.jar authentication-service.jar
#
#FROM --platform=${BUILDPLATFORM:-linux/amd64} openjdk:17-slim
#COPY --from=builder /authentication-service.jar /
#EXPOSE 8081
#ENTRYPOINT ["java", "-jar", "/authentication-service.jar"]






FROM openjdk:17-alpine
#
#MAINTAINER Wisarut Saelao, Wisarut@gmail.com
#
EXPOSE 8081

COPY ./target/authentication-service-0.0.1-SNAPSHOT.jar authentication-service.jar
#
ENTRYPOINT ["java", "-jar", "/authentication-service.jar"]
#
