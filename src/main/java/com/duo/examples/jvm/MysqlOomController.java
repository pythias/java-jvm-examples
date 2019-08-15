package com.duo.examples.jvm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pythias
 * @since 2019-08-15
 */
@RestController
@RequestMapping("/mysql")
public class MysqlOomController {
    @RequestMapping("/oom")
    public String oom() {
        return "Hi Mysql.";
    }
}
