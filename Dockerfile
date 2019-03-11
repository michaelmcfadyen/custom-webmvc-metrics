FROM java:8

COPY target/*.jar /app.jar

CMD java $JAVA_OPTS -jar /app.jar