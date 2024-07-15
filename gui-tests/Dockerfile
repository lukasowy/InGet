FROM maven:3.9.8-eclipse-temurin-21

WORKDIR /app

COPY . .

RUN mvn -B install -DskipTests -U

CMD mvn clean test -pl gui-tests

