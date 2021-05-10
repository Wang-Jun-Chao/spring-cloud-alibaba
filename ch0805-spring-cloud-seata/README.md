https://blog.csdn.net/qq853632587/article/details/111644295
https://blog.csdn.net/liuqinglong_along/article/details/52191382

```shell
sh seata-nacos-config.sh \
  -h 192.168.241.128 \
  -p 8848 \
  -g SEATA_GROUP \
  -t e1250570-24fc-47c9-973d-fda5b0a09077 \
  -u nacos \
  -w nacos
  
```

### 项目启动
- ch0805-seata-common为公共组件，需要先通过mvn install安装到本地仓库，给其他服务依赖。
- 接下来启动账户服务ch0805-seata-account-provider , 它会被订单服务调用。 
- 启动订单服务ch0805-seata-order-provider。
- 启动库存服务ch0805-seata-repo-provider。
- 启动ch0805-seata-rest-web , 它作为REST的业务入口，最后启动。

通过如下curl命令进行整体下单流程的测试， 并监控数据库表中对应数据的变化，确保整个洞用链路是正 常的。
```shell
curl http://localhost:8080/order -H "Accept: application/json" -H "Content-type:application/json;charset=UTF-8" -X POST -d {"\"userid\"":1001, "\"product Code\"":"\"GP20200202001\"", "\"name\"":"\"键盘\"","\"count\"":1,"\"amount\"":400}
```


