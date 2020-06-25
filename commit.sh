#!/bin/bash  
git pull origin master
git add .
git commit -m "$*"
git push origin alan