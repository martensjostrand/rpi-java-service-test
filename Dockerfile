FROM hypriot/rpi-java:jre-1.8.111

COPY config.yaml /data/config.yaml
COPY target/my-service.jar /data/my-service.jar

CMD java -jar /data/my-service server /data/config.yaml
