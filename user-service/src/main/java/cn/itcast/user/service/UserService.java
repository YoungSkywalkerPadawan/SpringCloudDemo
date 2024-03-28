package cn.itcast.user.service;

import cn.itcast.user.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Autowired
//    private UserMapper userMapper;

    public User queryById(Long id) {
        User user = new User();
        user.setUsername("张姣姣");
        user.setAddress("河南省襄城县");
        user.setId(new Long(1));
        System.out.println("哈哈，我被调用了！");
        return user;
    }
}
