package ro.code4.textParserReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import ro.code4.textParserReview.entity.User;
import ro.code4.textParserReview.repository.UserRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    public static User testUser = new User("user", "password");

    @Autowired
    SimpleUserRepositoryAuthenticationProvider authenticationProvider;

    @Autowired UserRepository userRepository;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/home"
                        ).permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll()
        ;

        initDefaultUsers();
    }

    private void initDefaultUsers() {
        userRepository.save(testUser);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
//            .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");

                .authenticationProvider(authenticationProvider)
        ;
    }


}