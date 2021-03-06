package wjc.scab.ch0705.customurl;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义流控异常处理
 **/
@Component
public class CustomUrlBlockHandler implements UrlBlockHandler {
    @Override
    public void blocked(HttpServletRequest request, HttpServletResponse response, BlockException e) throws IOException {
        MyResponse errorResponse = null;
        // 不同的异常返回不同的提示语
        if (e instanceof FlowException) {
            errorResponse = MyResponse.builder()
                    .status(100).msg("接口限流了")
                    .build();
        } else if (e instanceof DegradeException) {
            errorResponse = MyResponse.builder()
                    .status(101).msg("服务降级了")
                    .build();
        } else if (e instanceof ParamFlowException) {
            errorResponse = MyResponse.builder()
                    .status(102).msg("热点参数限流了")
                    .build();
        } else if (e instanceof SystemBlockException) {
            errorResponse = MyResponse.builder()
                    .status(103).msg("触发系统保护规则")
                    .build();
        } else if (e instanceof AuthorityException) {
            errorResponse = MyResponse.builder()
                    .status(104).msg("授权规则不通过")
                    .build();
        }

        response.setStatus(500);
        response.setCharacterEncoding("utf-8");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(response.getWriter(), errorResponse);
    }
}

