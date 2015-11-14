FROM debian
MAINTAINER Patrick Bogen <pdbogen-docker@cernu.us>
RUN echo deb http://http.debian.net/debian jessie-backports main >> /etc/apt/sources.list
RUN apt-get update && \
    apt-get --no-install-recommends -y install openjdk-8-jre-headless && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*
