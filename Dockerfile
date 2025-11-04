FROM eclipse-temurin:21
WORKDIR /app
COPY src/ /app/
RUN javac *.java
CMD ["java", "Main"]
