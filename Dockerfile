FROM hypriot/rpi-java:jre-1.8.111

COPY src/main/resources/configuration.yaml /data/
COPY target/rpi-java-test-service-1.0-SNAPSHOT.jar /data/

CMD java -jar /data/rpi-java-test-service-1.0-SNAPSHOT.jar server /data/configuration.yaml
