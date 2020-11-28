# How to build a cluster on kubernetes

### To build the docker image
```docker build --build-arg JAR_FILE=target/*.jar -t barelyenough/heregoesnothing:2.6 <target directory>```

### To run the docker image after building it

Detached mode : 
```docker run -d -p 9092:9092 -t barelyenough/heregoesnothing:2.6```

Attached mode : 
```docker run -it -p 9092:9092 -t barelyenough/heregoesnothing:2.6```

### Remove all images and containers
```docker system prune -a```

### Create the pod
```kubectl create -f pod.yml```

### For watching
```watch -n 1 kubectl get pods```

### For getting all pods
```kubectl get pods```

### Create deployment
```kubectl create -f deployment.yml```

### For getting all deployments
```kubectl get deployments```

### Create service
```kubectl create -f service.yml```

### Delete a service/pod/deployment
```kubectl delete <service/pod/deployment> <name>```

### Get the kubernetes cluster info
```kubectl cluster-info```

### Use the master ip and then use the port shown by 'get services' command and that is where the API is accessible.

### Put all the config yml in one file and run it as a single command.

### References :
- https://medium.com/bb-tutorials-and-thoughts/how-to-run-java-rest-api-on-minikube-4b564ea982cc
- https://spring.io/guides/gs/spring-boot-docker/
- https://kubernetes.io/docs/tutorials/hello-minikube/
- https://kubernetes.io/docs/tutorials/
