# Install the App
    $ helm install devopstest-deployment app-chart
    $ helm list
    $ kubectl get pods

# Check the installation status
    $ helm status devopstest-deployment

# UnInstall the Apps from default Namespace
    $ helm uninstall devopstest-deployment

# Copy role to Kubernetes management host
    $ export K8S_MGMT_HOST='13.233.149.189'
    $ scp -r -i ${AWS_KEY} devopstest-chart ubuntu@${K8S_MGMT_HOST}:/home/ubuntu/devopstest-chart

