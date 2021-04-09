# 第一步：安装docker
# 第二步：拉取zookeeper镜像
docker pull zookeeper
# 第三步：运行zookeeper
docker run -itd -p 2181:2181 --name some-zookeeper --restart always zookeeper
# 第四步：运行docker zkui
# docker pull juris/zkui
# docker run -d --name zkui -p 9090:9090 -e ZKUI_ZK_SERVER=<external_DNS/IP>:2181[,<external_DNS/IP>:2181] qnib/zkui
docker run -itd --name zkui -p 9090:9090 -e ZKUI_ZK_SERVER=127.0.0.1:2181 juris/zkui