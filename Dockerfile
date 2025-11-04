FROM eclipse-temurin:21-jdk-slim
WORKDIR /app
COPY src/ /app/
RUN javac *.java
CMD ["java", "Main"]
