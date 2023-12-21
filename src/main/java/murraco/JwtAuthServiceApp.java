package murraco;

import lombok.RequiredArgsConstructor;
import murraco.model.Profile;
import murraco.model.Role;
import murraco.model.User;
import murraco.service.ProfileService;
import murraco.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class JwtAuthServiceApp implements CommandLineRunner {

    final UserService userService;
    final ProfileService profileService;

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthServiceApp.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public void run(String... params) throws Exception {
        try {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword("admin");
            admin.setFirstname("admin");
            admin.setLastname("admin");
            admin.setEmail("admin@email.com");
            admin.setRoles(new ArrayList<>(Arrays.asList(Role.ROLE_ADMIN)));
            userService.signup(admin);

            User employee = new User();
            employee.setUsername("employee");
            employee.setPassword("employee");
            employee.setFirstname("employee");
            employee.setLastname("employee");
            employee.setEmail("employee@email.com");
            employee.setRoles(new ArrayList<>(Arrays.asList(Role.ROLE_EMPLOYEE)));
            userService.signup(employee);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
