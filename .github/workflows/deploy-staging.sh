#!/bin/bash
set -x


az extension add --name spring
ACTIVEDEPLOYMENT=$(az spring app show -n api-gateway -s springappssvc5e4b10  -g asa_springlabs_rg --query properties.activeDeployment.name -o tsv)

if [ "$ACTIVEDEPLOYMENT" = "default" ]; then
              NEWDEPLOYMENT="staging"
            else
              NEWDEPLOYMENT="default"
            fi
            echo 'new deployment: ' $NEWDEPLOYMENT
            echo 'active deployment': $ACTIVEDEPLOYMENT
            NEWDEPLOYMENTEXISTS=$(az spring app deployment list --app api-gateway -s springappssvc5e4b10  -g asa_springlabs_rg --query "[?name=='$NEWDEPLOYMENT'].name" -o tsv)
            if [ "$NEWDEPLOYMENTEXISTS" = "$NEWDEPLOYMENT" ]; then
              echo $NEWDEPLOYMENT ' already exists'
            else
              echo 'creating deployment ' $NEWDEPLOYMENT
              az spring app deployment create --app api-gateway -n $NEWDEPLOYMENT
            fi
            az spring app deploy -n api-gateway --jar-path jarchenonce -d $NEWDEPLOYMENT