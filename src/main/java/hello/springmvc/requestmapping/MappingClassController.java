package hello.springmvc.requestmapping;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    // 회원 목록 조회
    // @RequestMapping("/mapping/users") 어노테이션 클래스에 달면 중복되는 URL 삭제 가능
//    @GetMapping("/mapping/users") <- 어노테이션 달기 전
    @GetMapping
    public String user() {
        return "get users";
    }

    // 회원 등록
    @PostMapping
    public String addUser() {
        return "post user";
    }

    // (특정) 회원 조회
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId = " + userId;
    }

    // (특정) 회원 업데이트
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId = " + userId;
    }

    // (특정)   회원 삭제
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete  userId = " + userId;
    }

}
