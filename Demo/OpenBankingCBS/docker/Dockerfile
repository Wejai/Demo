FROM java:8
VOLUME /tmp
ADD OpenBankDemo.jar OpenBankDemo.jar
RUN bash -c 'touch /OpenBankDemo.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/OpenBankDemo.jar"]