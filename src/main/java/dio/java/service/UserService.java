package dio.java.service;

import dio.java.domain.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;


public interface UserService {

    User findById(Long id);

    User create(User user);

}
