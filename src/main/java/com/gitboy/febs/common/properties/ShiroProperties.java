package com.gitboy.febs.common.properties;

public class ShiroProperties {

    private String anonUrl;

    /**
     * token默认有效时间 1小时
     */
    private Long jwtTimeOut = 3600L;

    public String getAnonUrl() {
        return anonUrl;
    }

    public void setAnonUrl(String anonUrl) {
        this.anonUrl = anonUrl;
    }

    public Long getJwtTimeOut() {
        return jwtTimeOut;
    }

    public void setJwtTimeOut(Long jwtTimeOut) {
        this.jwtTimeOut = jwtTimeOut;
    }
}
