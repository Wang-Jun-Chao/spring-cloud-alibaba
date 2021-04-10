package wjc.scab.ch0705.sentinel.urlclean;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlCleaner;
import org.springframework.util.StringUtils;

/**
 * <pre>
 * Sentinel 中HTTP服务的限流默认由Sentinel - Web-Servlet包中的Common Filter来实现，
 * 这个Filter会把每个不同的URL都作为不同的资凉来处理。对于带路径参数的path监控不准确
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-11 07:00
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class CustomerUrlCleaner implements UrlCleaner {
    @Override
    public String clean(String originUrl) {
        if (StringUtils.isEmpty(originUrl)) {
            return originUrl;
        } else if (originUrl.startsWith("/clean/")) {
            return "/clean/*";
        }


        return originUrl;

    }
}
