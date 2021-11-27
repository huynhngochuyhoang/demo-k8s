# Simple application deploy to k8s platform
## Requirment tools:
- Jdk 11
- Maven
- Node
- Angular CLI
- Docker
- Kubernetes
## First step
> If you don't want to change any thing, just skip this section
1. Edit `package.sh` to change the docker image name.
2. Tagging both of the images with command ```docker tag <your-image> <your-dockerhub-id/your-image>```
3. Pushing it to your docker registry.
4. Go to *k8s* directory, edit `client-deployment.yml` and `server-deployment.yml` to using your docker image.
```image: <your-dockerhub-id/your-image>```
5. Done, using command below to deploy application to kubenetes cluster and wait a few seconds.
> If you using Linux or MacOS, then open browser and access with minikube ip address ,otherwise use localhost instead.
## Deploy application
```kubectl apply -f k8s```