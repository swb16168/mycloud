package com.swb.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:12
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment
{
    private Long id;
    private String serial;
}
