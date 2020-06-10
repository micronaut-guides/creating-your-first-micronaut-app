FROM oracle/graalvm-ce:20.0.0-java8 as graalvm
#FROM oracle/graalvm-ce:20.0.0-java11 as graalvm # For JDK 11
RUN gu install native-image

COPY . /home/app/micronautguide
WORKDIR /home/app/micronautguide

RUN native-image --no-server -cp build/libs/complete-*-all.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/micronautguide/micronautguide /micronautguide/micronautguide
ENTRYPOINT ["/micronautguide/micronautguide", "-Xmx68m"]
