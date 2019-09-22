package com.example.demo.servicea.test;

import com.example.demo.servicea.bean.AA;
import com.example.demo.servicea.mapper.AAMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("my")
public class TestAA {
    @Autowired
    private AAMapper aaMapper;
    @Test
    public void test(){
        AA aa = new AA();
        aa.setName("dadsa");
        aaMapper.insert(aa);
    }
}

