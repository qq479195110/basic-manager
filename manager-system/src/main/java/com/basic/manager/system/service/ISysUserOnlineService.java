package com.basic.manager.system.service;

import java.util.Date;
import java.util.List;
import com.basic.manager.system.domain.SysUserOnline;

/**
 * 在线用户 服务层
 * 
 * @author Zoom
 */
public interface ISysUserOnlineService
{
    /**
     * 通过会话序号查询信息
     * 
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    SysUserOnline selectOnlineById(String sessionId);

    /**
     * 通过会话序号删除信息
     * 
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    void deleteOnlineById(String sessionId);

    /**
     * 通过会话序号删除信息
     * 
     * @param sessions 会话ID集合
     * @return 在线用户信息
     */
    void batchDeleteOnline(List<String> sessions);

    /**
     * 保存会话信息
     * 
     * @param online 会话信息
     */
    void saveOnline(SysUserOnline online);

    /**
     * 查询会话集合
     * 
     * @param userOnline 分页参数
     * @return 会话集合
     */
    List<SysUserOnline> selectUserOnlineList(SysUserOnline userOnline);

    /**
     * 强退用户
     * 
     * @param sessionId 会话ID
     */
    void forceLogout(String sessionId);

    /**
     * 清理用户缓存
     * 
     * @param loginName 登录名称
     * @param sessionId 会话ID
     */
    void removeUserCache(String loginName, String sessionId);

    /**
     * 查询会话集合
     * 
     * @param expiredDate 有效期
     * @return 会话集合
     */
    List<SysUserOnline> selectOnlineByExpired(Date expiredDate);
}
