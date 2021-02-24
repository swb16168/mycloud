package com.swb.cloud.service;

/**
 * @author 72774
 * @Description
 * @create 2021-02-23 18:12
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
