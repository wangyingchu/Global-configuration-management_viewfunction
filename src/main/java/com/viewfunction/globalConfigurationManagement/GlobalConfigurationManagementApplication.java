package com.viewfunction.globalConfigurationManagement;

import com.viewfunction.globalConfigurationManagement.util.ApplicationLauncherUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GlobalConfigurationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalConfigurationManagementApplication.class, args);
        ApplicationLauncherUtil.printApplicationConsoleBanner();
	}
}
