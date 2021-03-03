package com.example.demo;

import com.example.demo.zookeeper.ZKManager;
import com.example.demo.zookeeper.ZKManagerImpl;
import java.io.IOException;
import org.apache.zookeeper.KeeperException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		try {
			ZKManager zkManager = new ZKManagerImpl();
			Object node = zkManager.getZNodeData("/MyFirstZNode", false);
			System.out.println(node);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (KeeperException e) {
			e.printStackTrace();
		}
	}

}
