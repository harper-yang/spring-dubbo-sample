package harper.github.io.user;

import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String getNameById(Long id) {


        return "Harper yang";
    }
}
