package store;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import store.service.UserService;


@Component
public class StoreAppStartupRunner implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		userService.createUser("admin1", "admin1", "admin@admin.com", Arrays.asList("ROLE_USER", "ROLE_ADMIN"));	
	}
}

