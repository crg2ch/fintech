#!/bin/sh

# Setting versions
VERSION='1.0.1'

cd ..
./gradlew clean build -x test

SHELL_PATH=`pwd`
echo $SHELL_PATH

echo 'api docker image build...'
cd $SHELL_PATH/api
echo `pwd`
docker buildx build -t api:$VERSION .
echo 'api docker image build... Done'

echo 'consumer docker image build...'
cd $SHELL_PATH/consumer
echo `pwd`
docker buildx build -t consumer:$VERSION .
echo 'consumer docker image build... Done'

echo 'css docker image build...'
cd $SHELL_PATH/css
echo `pwd`
docker buildx build -t css:$VERSION .
echo 'css docker image build... Done'

echo 'nginx docker image build...'
cd $SHELL_PATH/nginx
echo `pwd`
docker buildx build -t nginx:$VERSION .
echo 'nginx docker image build... Done'