package org.oreframework.boot.security;

import org.springframework.security.core.context.SecurityContextHolder;

public class UserInfoHolder
{
    public static UserInfo getUserInfo()
    {
        UserInfo userInfo = null;
        try
        {
            userInfo = (UserInfo)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }
        catch (Exception e)
        {
            return null;
        }
        
        return userInfo;
        
    }
}
