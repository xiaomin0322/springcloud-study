package qg.fangrui.cloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取 Config
 * Created by zggdczfr on 2017/2/20.
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value("${configword}")
    String configword;

    @RequestMapping("/config")
    
    /**
     * ====================qg.fangrui.cloud.web.ConfigController@682e422c
====================qg.fangrui.cloud.web.ConfigController@682e422c
====================qg.fangrui.cloud.web.ConfigController@682e422c
====================qg.fangrui.cloud.web.ConfigController@682e422c
====================qg.fangrui.cloud.web.ConfigController@682e422c
-----------------更新过后的日志------------------换了一个对象，更新了当前的对象，注入到spring 容器中
====================qg.fangrui.cloud.web.ConfigController@5d6db19b
     * 
     * @return
     */
    public String printfConfig(){
    	System.out.println("===================="+this);
        return "The Config Word Is : "+configword;
    }
}
