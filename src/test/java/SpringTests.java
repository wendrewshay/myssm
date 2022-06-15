import com.xx.ssm.domain.User;
import com.xx.ssm.service.A;
import com.xx.ssm.service.Person;
import com.xx.ssm.service.Student;
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

    /**
     * 测试IOC
     */
    @Test
    public void test1() {
        userService = (UserService) context.getBean("userService");
        User user = userService.queryUserById(1);
        System.out.println(user);
    }

    /**
     * 测试循环依赖
     */
    @Test
    public void test2() {
        A a = context.getBean(A.class);
        System.out.println(a.doMethodA());
    }

    /**
     * 测试aop
     */
    @Test
    public void test3() {
        Person person = context.getBean(Person.class);
        person.say();
    }

    @After
    public void afterTest1() {
        context.close();
    }
}
