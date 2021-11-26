echo ######################### Package Backend #########################
cd demo-k8s-be
mvn clean package -DskipTests
echo ######################### Build backend docker images #########################
docker build -t demo-k8s-server .
cd ..
echo ######################### Package Frontend #########################
cd demo-k8s-fe
npm install
ng build
echo ######################### Build frontend docker images #########################
docker build -t demo-k8s-frontend .
echo ############################# Done #############################
