#!/bin/bash
sudo docker pull bakhyegyeong/gaori_backend
sudo docker ps -q --filter name=spring | grep -q . && docker rm -f \$(docker ps -aq --filter name=spring)
sudo docker run -d --name spring -p 9090:9090 bakhyegyeong/gaori_backend
