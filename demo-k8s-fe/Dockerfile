# Defining nginx image to be used
FROM nginx:latest
# Copying compiled code and nginx config to different folder
# NOTE: This path may change according to your project's output folder
COPY ./dist/demo-k8s-fe /usr/share/nginx/html
COPY ./nginx.conf  /etc/nginx/conf.d/default.conf
# Exposing a port, here it means that inside the container
# the app will be using Port 9595 while running in container
EXPOSE 4200
