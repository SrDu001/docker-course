# docker build -t test-spring .
# docker run -dp 4000:3000 node-started
FROM maven:3.6.3-jdk-8-slim AS builder
WORKDIR /test
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B package

FROM tomcat:9.0.43
COPY --from=builder /test/target/testdocker.war /usr/local/tomcat/webapps
EXPOSE 8080
CMD ["catalina.sh", "run"]