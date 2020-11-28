# How to build a cluster on kubernetes

### To build the docker image
> docker build --build-arg JAR_FILE=target/*.jar -t springio/gs-spring-boot-docker .

### To run the docker image after building it
> detached mode : docker run -d -p 9092:9092 -t springio/gs-spring-boot-docker
> attached mode : docker run -it -p 9092:9092 -t springio/gs-spring-boot-docker

### remove all images and containers
> docker system prune -a

### create the pod
> kubectl create -f pod.yml

### for watching
> watch -n 1 kubectl get pods

### for getting all pods
> kubectl get pods

### create deployment
> kubectl create -f deployment.yml

### for getting all deployments
> kubectl get deployments

### create service
> kubectl create -f service.yml

### delete a service/pod/deployment
> kubectl delete <service/pod/deployment> <name>

### get the kubernetes cluster info
> kubectl cluster-info

### use the master ip and then use the port shown by 'get services' command and that is where the API is accessible.

### put all the config yml in one file and run it as a single command.
