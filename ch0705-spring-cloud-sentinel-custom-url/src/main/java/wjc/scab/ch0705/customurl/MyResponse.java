package wjc.scab.ch0705.customurl;

import lombok.Builder;
import lombok.Data;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-11 06:48
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
@Data
@Builder
public class MyResponse {
    private int status;
    private String msg;
}
