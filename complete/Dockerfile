FROM oracle/graalvm-ce:19.3.0-java8 as graalvm
COPY . /home/app/micronautguide
WORKDIR /home/app/micronautguide
RUN gu install native-image
RUN native-image --no-server -cp build/libs/complete-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/micronautguide /app/micronautguide
ENTRYPOINT ["/app/micronautguide","-Xmx68m"]