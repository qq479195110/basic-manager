package com.basic.manager.system.service;

import java.util.List;
import com.basic.manager.system.domain.SysConfig;

/**
 * 参数配置 服务层
 * 
 * @author Zoom
 */
public interface ISysConfigService
{
    /**
     * 查询参数配置信息
     * 
     * @param configId 参数配置ID
     * @return 参数配置信息
     */
    SysConfig selectConfigById(Long configId);

    /**
     * 根据键名查询参数配置信息
     * 
     * @param configKey 参数键名
     * @return 参数键值
     */
    String selectConfigByKey(String configKey);

    /**
     * 查询参数配置列表
     * 
     * @param config 参数配置信息
     * @return 参数配置集合
     */
    List<SysConfig> selectConfigList(SysConfig config);

    /**
     * 新增参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
    int insertConfig(SysConfig config);

    /**
     * 修改参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
    int updateConfig(SysConfig config);

    /**
     * 批量删除参数配置信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteConfigByIds(String ids);

    /**
     * 清空缓存数据
     */
    void clearCache();

    /**
     * 校验参数键名是否唯一
     * 
     * @param config 参数信息
     * @return 结果
     */
    String checkConfigKeyUnique(SysConfig config);
}
