/*
 * package com.javainuse.springbootsecurity.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * com.javainuse.springbootsecurity.config.CustomAuthenticationProvider;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity //@ComponentScan("com.baeldung.security") public class
 * SecurityConfig extends WebSecurityConfigurerAdapter {
 * 
 * @Autowired private CustomAuthenticationProvider authProvider;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.authenticationProvider(authProvider); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests().anyRequest().authenticated() .and().httpBasic(); } }
 * 
 */