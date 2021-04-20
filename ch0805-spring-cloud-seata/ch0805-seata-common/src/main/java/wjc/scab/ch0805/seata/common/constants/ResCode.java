package wjc.scab.ch0805.seata.common.constants;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-18 06:53
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public enum ResCode {
    SUCCESS(200, "成功"),
    SYSTEM_EXCEPTION(500, "系统异常"),
    FAILED(999, "系统错误");
    private int code;
    private String message;

    ResCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
