FROM debian
MAINTAINER Patrick Bogen <pdbogen-docker@cernu.us>
RUN echo deb http://http.debian.net/debian jessie-backports main >> /etc/apt/sources.list
RUN apt-get update && \
    apt-get --no-install-recommends -y install openjdk-8-jre-headless=8u66-b17-1~bpo8+1 && \
    apt-get dist-upgrade && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*
