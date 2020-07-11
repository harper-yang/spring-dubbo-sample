package harper.github.io.user;

import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Override
    public String getUserNameById(Long id) {

        return "wowowowo";
    }

    public static void main(String args[ ]){
        int x=4;
        System.out.println("value is "+ ((x>4) ? 99 :9));
    }
}
