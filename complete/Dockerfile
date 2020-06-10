FROM openjdk:14-alpine
COPY build/libs/complete-*-all.jar complete.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "complete.jar"]