package com.basic.manager.common.exception.user;

import com.basic.manager.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author Zoom
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
