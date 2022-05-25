import com.xx.ssm.domain.User;
import com.xx.ssm.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTests {

    private ClassPathXmlApplicationContext context;

    private UserService userService;

    @Before
    public void beforeTest1() {
        context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
    }

    @Test
    public void test1() {
        userService = (UserService) context.getBean("userService");
    }

    @After
    public void afterTest1() {
        User user = userService.queryUserById(1);
        System.out.println(user);
    }
}
