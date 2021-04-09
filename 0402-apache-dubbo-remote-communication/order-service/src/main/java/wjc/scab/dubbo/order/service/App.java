package wjc.scab.dubbo.order.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import wjc.scab.dubbo.user.service.api.IUserService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:META-INF/spring/consumer.xml");
        IUserService iUserService = (IUserService) context.getBean("userService");
        System.out.println(iUserService.getNameById("1001"));
    }
}
