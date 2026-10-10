package Super_Admin_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"Super_Admin_Service",
	    "com.Super_Admin_Service",
	    "com.Super_Admin_ServiceImpl",
	    "com.Super_Admin_Controller",
	    "com.Super_Admin_Configuration",
	    "com.Super_Admin_Domain",
	    "com.Super_Admin_Entity",
	    "com.Super_Admin_Repository"
	})
@EnableJpaRepositories(basePackages = "com.Super_Admin_Repository")
@EntityScan(basePackages = "com.Super_Admin_Entity")
public class SuperAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperAdminServiceApplication.class, args);
	}

}
