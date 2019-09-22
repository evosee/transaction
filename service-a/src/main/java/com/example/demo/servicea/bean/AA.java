package com.example.demo.servicea.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("a_a")
public class AA {
    @TableId(type=IdType.AUTO)
    private Integer id;
    private String name;
}
