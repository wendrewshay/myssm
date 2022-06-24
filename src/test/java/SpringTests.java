import com.xx.ssm.domain.User;
import com.xx.ssm.service.A;
import com.xx.ssm.service.Bear;
import com.xx.ssm.service.Person;
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
     * 测试aop、jdk代理
     */
    @Test
    public void test3() {
        // 不仅开启aop代理中的proxy-target-class属性，且事务管理器的proxy-target-class属性设置也会影响到全局代理的创建是jdk代理还是CGLIB代理
        Person person = context.getBean(Person.class);
        person.say();
    }

    /**
     * 测试cglib代理
     */
    @Test
    public void test4() {
        Bear bear = context.getBean(Bear.class);
        bear.say();
    }

    @After
    public void afterTest1() {
        context.close();
    }
}
