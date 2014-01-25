#!/bin/sh
# Packaging the swagger-ui
bower install swagger-ui
rm -r resources/swagger-ui
cp -r bower_components/swagger-ui/dist/ resources/swagger-ui
cp index.html resources/swagger-ui
rm -r bower_components
