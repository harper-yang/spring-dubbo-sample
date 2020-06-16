package harper.github.io.consumer;

import harper.github.io.user.IUserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Reference
    private IUserService userService;

    @GetMapping
    public String getUserNameById(Long id) {

        return userService.getUserNameById(id);
    }
}
