package com.example.demo.servicea.test;

import com.example.demo.servicea.bean.AA;
import com.example.demo.servicea.mapper.AAMapper;
import com.example.demo.servicea.service.AAService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("my")
public class TestAA {
    @Autowired
    private AAMapper aaMapper;
    @Autowired
    private AAService aaService;

    @Test
    public void test(){
        AA aa = new AA();
        aa.setName("dadsa");
        aaMapper.insert(aa);
    }

    @Test
    public void test2(){
        aaService.test();
    }
}

