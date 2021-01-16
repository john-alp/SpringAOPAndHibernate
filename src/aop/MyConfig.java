package aop;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScans("aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
