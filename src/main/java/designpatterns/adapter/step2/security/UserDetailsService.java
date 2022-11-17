package designpatterns.adapter.step2.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
