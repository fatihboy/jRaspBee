#!/bin/bash

cd "${0%/*}"

java -jar jarjar-1.4.jar process rules.txt gson-2.2.2.jar gson-2.2.2.enterprisecoding.jar
