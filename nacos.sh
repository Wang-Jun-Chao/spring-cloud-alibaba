# 第一步：拉取镜像
docker pull nacos/nacos-server
# 第二步：创建配置
mkdir -p "/home/ubuntu/docker/nacos/init.d" "/home/ubuntu/docker/nacos/logs"
touch /home/ubuntu/docker/nacos/init.d/custom.properties
# 第三步：添加信息
echo "management.endpoints.web.exposure.include=*" >> /home/ubuntu/docker/nacos/init.d/custom.properties
# 第四步：运行镜像
docker run -itd -p 8848:8848 \
  -e MODE=standalone \
  -e PREFER_HOST_MODE=hostname \
  -v /home/ubuntu/docker/nacos/init.d/custom.properties:/home/nacos/init.d/custom.properties \
  -v /home/ubuntu/docker/nacos/logs:/home/nacos/logs \
  --restart always \
  --name nacos \
  nacos/nacos-server

# 安装sentinel-dashboard
docker pull bladex/sentinel-dashboard
docker run --name sentinel -d -p 8858:8858 -p 8719:8719 -d bladex/sentinel-dashboard

# 安装seata
# https://blog.csdn.net/qq_38157516/article/details/112973755

# 启动seata
docker run --name seata-server \
  -p 8091:8091 \
  -e SEATA_CONFIG_NAME=file:/root/seata-config/registry \
  -e SEATA_IP=192.168.241.128 \
  -v /home/ubuntu/docker/seata/resources:/root/seata-config \
  -d seataio/seata-server


