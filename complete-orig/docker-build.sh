#!/bin/sh
docker build . -t micronautguide
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 micronautguide"