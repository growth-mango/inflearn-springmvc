package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    // @Slf4j 애노테이션 쓰면 이렇게 주입할 필요가 없음
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        // 로그 찍을 때 레벨을 정할 수 있음 -
        log.trace(" trace log={}", name);
        log.debug(" debug log={}", name); // 예. 현재 로그는 디버그 할 때 보는 거다 ~
        log.info(" info log={}", name); // 예. 현재 로그는 개발 할 때 보는 정보다~
        log.warn(" warn log={}", name); // 이거는 경고 위험한거야 ~
        log.error(" error log={}", name); // 이거는 에러야 빨리 확인해야해

        return "ok";
    }
}
