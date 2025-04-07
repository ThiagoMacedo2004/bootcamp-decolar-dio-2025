package dio.java.service;

import dio.java.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);

}
