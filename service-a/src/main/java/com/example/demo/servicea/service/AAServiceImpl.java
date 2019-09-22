package com.example.demo.servicea.service;

import com.example.demo.servicea.bean.AA;
import com.example.demo.servicea.mapper.AAMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AAServiceImpl implements AAService {

    @Autowired
    private AAMapper aaMapper;

    @Transactional
    @Override
    public void test() {
        AA aa = new AA();
        aa.setName("test");
        aaMapper.insert(aa);
        int i = 1/0;
    }
}
