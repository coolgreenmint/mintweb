package org.mint.mintweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: MintWebApplication
 * @Description: springboot项目主类
 * @author: mint
 * @date: 2021/9/16 10:33
 */

/*
   @springbootapplication  注解标识此程序是一个springboot程序,此处为入口类
                           此注解为组合注解，其下的三个注解分别为
                           @springbootconfiguration  springboot配置类
                           @enableautoconfiguration  开启自动装配，注册并导入候选配置项
                           @comptentscan  自动扫描包位置
    1. springboot在启动的时候从类路径下的meta-inf/spring.factories中获取enableautoconfiguration指定的值
    2. 将这些值作为自动配置类导入容器 ， 自动配置类就生效 ， 帮我们进行自动配置工作；
    3. 以前我们需要自己配置的东西 ， 自动配置类都帮我们解决了
    4. 整个j2ee的整体解决方案和自动配置都在springboot-autoconfigure的jar包中；
    5. 它将所有需要导入的组件以全类名的方式返回 ， 这些组件就会被添加到容器中 ；
    6. 它会给容器中导入非常多的自动配置类 （xxxautoconfiguration）, 就是给容器中导入这个场景需要的所有组件 ， 并配置好这些组件 ；
    7. 有了自动配置类 ， 免去了我们手动编写配置注入功能组件等的工作；
 */
@SpringBootApplication
public class MintWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MintWebApplication.class, args);
    }
}
