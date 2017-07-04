package org.oreframework.boot.autoconfigure.cas.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author huangzz 
 * 2017年3月19日
 */
@ConfigurationProperties(prefix = "ore.app")
public class AppProperties
{
    // 应用访问地址
    private String serverUrl;
    
    // 应用登录地址
    private String loginUrl;
    
    // 应用登出地址
    private String logoutUrl;
    
    public String getServerUrl()
    {
        return serverUrl;
    }
    
    public void setServerUrl(String serverUrl)
    {
        this.serverUrl = serverUrl;
    }
    
    public String getLoginUrl()
    {
        return loginUrl;
    }
    
    public void setLoginUrl(String loginUrl)
    {
        this.loginUrl = loginUrl;
    }
    
    public String getLogoutUrl()
    {
        return logoutUrl;
    }
    
    public void setLogoutUrl(String logoutUrl)
    {
        this.logoutUrl = logoutUrl;
    }
    
}
