#!/bin/bash

COUNT=$1
for ((i=1;i<=$COUNT;i++));
do
    TIMESTAMP=$(date +%Y%m%d%H%M%S%N)
    curl http://localhost:8080/api/v1/publish?message=$i-$TIMESTAMP
done