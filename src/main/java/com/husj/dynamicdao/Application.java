package com.husj.dynamicdao;

import com.husj.dynamicdao.spring.DynamicDaoScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Application
 *
 * @author shengjun.hu
 * @date 2021/6/15
 */
@DynamicDaoScan(value = "com.husj.dynamicdao.dao")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
