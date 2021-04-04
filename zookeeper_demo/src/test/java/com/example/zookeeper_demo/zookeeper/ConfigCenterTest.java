package com.example.zookeeper_demo.zookeeper;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.junit.jupiter.api.Test;

import java.util.List;

class ConfigCenterTest {

    @Test
    public void test1() {
        ZkClient zkClient = ConfigCenter.getZookeeperConntion();
        zkClient.create("/test","ce shi zhong ...", CreateMode.PERSISTENT);

    }

    @Test
    public void test2() {
        ZkClient zkClient = ConfigCenter.getZookeeperConntion();
        List<String> list =zkClient.getChildren("/test");
        list.stream().forEach(System.out::println);

    }
}