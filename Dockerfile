FROM adoptopenjdk:11-jre-hotspot
COPY build/libs/msRewardCentral-1.0.0.jar msrewardcentral.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "msrewardcentral.jar"]