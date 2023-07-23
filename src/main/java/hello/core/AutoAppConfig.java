package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //우리 예제 코드에 있는 Configuration 을 제외한다, 기본 예제 코드들과 충돌을 방지하기 위해 이 방법을 선택함
        //실무에서는 제외하지 않는다
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)

public class AutoAppConfig {

}


