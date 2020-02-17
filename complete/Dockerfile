FROM oracle/graalvm-ce:19.3.1-java8 as graalvm
#FROM oracle/graalvm-ce:19.3.1-java11 as graalvm # For JDK 11
RUN gu install native-image

COPY . /home/app/micronautguide
WORKDIR /home/app/micronautguide

RUN native-image --no-server --static -cp build/libs/complete-*-all.jar

FROM scratch
EXPOSE 8080
COPY --from=graalvm /home/app/micronautguide/micronautguide /micronautguide/micronautguide
ENTRYPOINT ["/micronautguide/micronautguide", "-Xmx68m"]
