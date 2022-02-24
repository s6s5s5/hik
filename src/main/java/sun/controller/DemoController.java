package sun.controller;

import cn.hutool.json.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.repository.InstallerRepository;
import sun.repository.entity.Installer;
import cn.hutool.json.JSONUtil;
import javax.annotation.Resource;
import java.util.Optional;

/**
 * @Author sun
 * @Data 2022/2/24 14:52
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    InstallerRepository installerRepository;
    @Resource
    RedisTemplate redisTemplate;

    @GetMapping("/test")
    public Integer test() {
//        Optional<Installer> installer = installerRepository.findById("5f8080817409aa2b017410107f2000fe");
//        return installer.orElse(null);
        redisTemplate.opsForValue().set("key",12342);
        return  (Integer) redisTemplate.opsForValue().get("key");

    }
}
