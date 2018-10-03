#!/usr/bin/env bash

# This script will do a release of the artifact according to http://maven.apache.org/maven-release/maven-release-plugin/
git checkout $TRAVIS_BRANCH
git config --global user.email "travis@travis-ci.org";
git config --global user.name "Travis CI";
mvn -X -s settings.xml -Dusername=$GITHUB_API_KEY release:prepare -B
mvn -X -s settings.xml release:perform -Darguments="-Dgpg.skip=false"
