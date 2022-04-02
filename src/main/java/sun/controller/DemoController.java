package sun.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.repository.CrmLeadRepository;
import sun.repository.Sun;
import sun.repository.entity.CrmLead;

import javax.annotation.Resource;

/**
 * @Author sun
 * @Data 2022/2/24 14:52
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    Sun sun;

    @Resource
    CrmLeadRepository crmLeadRepository;

    @Resource
    RedisTemplate redisTemplate;

    @GetMapping("/test")
    public Integer test() {
//        Optional<Installer> installer = installerRepository.findById("5f8080817409aa2b017410107f2000fe");
//        return installer.orElse(null);
        redisTemplate.opsForValue().set("key", 12342);
        return (Integer) redisTemplate.opsForValue().get("key");

    }


    @GetMapping("/convert")
    public CrmLead convert() {
        CrmLead crmLead = crmLeadRepository.findById(61L).get();
        log.info(crmLead.toString());
        return crmLead;
    }


}
