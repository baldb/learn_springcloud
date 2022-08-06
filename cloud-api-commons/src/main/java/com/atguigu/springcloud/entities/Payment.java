package com.atguigu.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author linyi
 * @date 2022/7/27
 * 1.0
 */
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
