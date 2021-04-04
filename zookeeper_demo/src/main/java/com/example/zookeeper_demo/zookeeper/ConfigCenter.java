package com.example.zookeeper_demo.zookeeper;


import org.I0Itec.zkclient.ZkClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigCenter {
    @Value("${zookeeper.cluster.ip}")
    private String con;
 public static ZkClient getZookeeperConntion(){
     String conn = "127.0.0.1:2181,127.0.0.1:2182,127.0.0.1:2183";
     ZkClient zkClient = new ZkClient(conn);
     return zkClient;
 }

}
