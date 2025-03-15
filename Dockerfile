FROM maven:latest
LABEL authors="joonasronimus"
WORKDIR /app


ENTRYPOINT ["top", "-b"]