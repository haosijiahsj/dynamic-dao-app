package com.husj.dynamicdao;

import com.husj.dynamicdao.model.EntityPo;
import com.husj.dynamicdao.model.Status;
import com.husj.dynamicdao.service.SaveService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @author 胡胜钧
 * @date 7/4 0004.
 */
@Slf4j
public class SaveServiceTest extends BaseTest {

    @Autowired
    private SaveService service;

    @Test
    public void save1Test() {
        int n = service.save1("husj", 1, "18812345678", true);
        log.info("{}", n);
    }

    @Test
    public void save2Test() {
        int n = service.save2("husj", 1, "18812345678", true);
        log.info("{}", n);
    }

    @Test
    public void save3Test() {
        int n = service.save3("husj", 1, "18812345678", true);
        log.info("{}", n);
    }

    @Test
    public void save4Test() {
        int n = service.save4("husj", 1, "18812345678", true);
        log.info("{}", n);
    }

    @Test
    public void save5Test() {
        int n = service.save5("husj", 1, "18812345678", true);
        log.info("{}", n);
    }

    @Test
    public void save6Test() {
        int n = service.save6("husj", 1, "18812345678", true);
        log.info("{}", n);
    }

    @Test
    public void save8Test() {
        EntityPo entityPo = new EntityPo();
        entityPo.setName("hhssjj");
        entityPo.setSex(1);
        entityPo.setTel("18812345678");
        entityPo.setAvailable(false);
        entityPo.setCreateTime(LocalDateTime.now());
        entityPo.setStatus(Status.SUCCESS);
        entityPo.setId(100);

        int n = service.save8(entityPo);
        log.info("{}", n);
    }

    @Test
    public void save9Test() {
        EntityPo entityPo = new EntityPo();
        entityPo.setName("hhssjj");
        entityPo.setSex(1);
        entityPo.setTel("18812345678");
        entityPo.setAvailable(false);
        entityPo.setCreateTime(LocalDateTime.now());
        entityPo.setStatus(Status.SUCCESS);
        entityPo.setId(10000);

        service.save9(Collections.singletonList(entityPo));
    }

    @Test
    public void save10Test() {
        EntityPo entityPo = new EntityPo();
        entityPo.setName("hhssjj");
        entityPo.setSex(1);
        entityPo.setTel("18812345678");
        entityPo.setAvailable(false);
        entityPo.setCreateTime(LocalDateTime.now());
        entityPo.setStatus(Status.SUCCESS);
        entityPo.setId(10000);

        service.save10(entityPo);
    }

}
