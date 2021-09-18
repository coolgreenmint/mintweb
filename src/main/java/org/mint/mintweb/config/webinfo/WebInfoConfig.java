package org.mint.mintweb.config.webinfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: WebInfoConfig
 * @Description: 自定义网站信息配置
 * @author: Mint
 * @date: 2021/9/18 14:38
 */
@Component
@ConfigurationProperties(prefix = "webinfo")
public class WebInfoConfig {

    private String year;
    private String company;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
