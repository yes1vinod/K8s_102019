# K8s_102019
# https://github.com/cncf/presentations/tree/master/kubernetes
This project is going is to demonstrate the an application that will be deployed on k8s cluster
    1  pwd
    2  ls -ltr
    3  mkdir k8s-demo
    4  cd k8s-demo/
    5  git clone https://github.com/yes1vinod/K8s_102019.git
    6  ls -ltr
    7  cd K8s_102019/
    8  ls -ltr
    9  cd dbscripts/
   10  ls -ltr
   11  docker build .
   12  docker images
   13  docker run 22bd79676563
   14  docker tag 22bd79676563 db-loader
   15  docker images
   16  docker push db-loader
   17  docker tag db-loader gcr.io/recruit-pro/db-loader:latest
   18  docker images
# docker push gcr.io/<ProjectID>/db-loader
   20  docker push db-loader
   21  history
   22  ls -ltr
   23  cd k8s-demo/
   24  ls -ltr
   25  vi db-app.yaml
   # gcloud container clusters get-credentials standard-cluster-1 --zone us-central1-a --project <ProjectName>
   27  kubectl
   28  kubectl apply -f ./db-app.yaml --validate
   29  kubectl get pods
   30* kubectl logs db-deployme
   31  history
   32  vi db-app.yaml
   33  cat db-app.yaml
   34  kubectl get pods
   35  kubectl get deployments
   36  kubectl delete deployment db-deployment
   37  kubectl get deployments
   38  kubectl get pods
   39  history
