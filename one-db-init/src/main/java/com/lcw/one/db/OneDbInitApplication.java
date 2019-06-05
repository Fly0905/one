package com.lcw.one.db;

import com.lcw.one.util.utils.SpringContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
/**
 * @Title: one-db-init是基于flyway来首次初始化数据的，也可用于以后更新数据库
 * @ClassName: com.lcw.one.db.OneDbInitApplication.java
 * @Description:
 *
 * @Copyright 2019 芯盾网安 - Powered By 研发一部
 * @Author: 王延飞
 * @Date:  2019-06-05 13:48
 * @Version V1.0
 */
@SpringBootApplication
@ComponentScan("com.lcw.one")
public class OneDbInitApplication {

	private static final Logger logger = LoggerFactory.getLogger(OneDbInitApplication.class);
	
    public static void main(String[] args) {
    	ApplicationContext applicationContext = SpringApplication.run(OneDbInitApplication.class, args);
		SpringContextHolder.setApplicationContext(applicationContext);
		logger.info("Registry ApplicationContext");
    }

}
