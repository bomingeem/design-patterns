package designpatterns.adapter.step1.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
