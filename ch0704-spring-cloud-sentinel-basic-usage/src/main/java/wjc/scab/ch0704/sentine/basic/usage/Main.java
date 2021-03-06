package wjc.scab.ch0704.sentine.basic.usage;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-04 10:31
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class Main {
    private static void doSomething() {
        try (Entry entry = SphU.entry("doSomething")) {
            // 业务逻辑处理
            System.out.println("hello World " + System.currentTimeMillis());
        } catch (BlockException ex) {
            // 处理被流控的逻辑
        }
    }

    private static void initFlowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("doSomething");
        rule.setGrade (RuleConstant.FLOW_GRADE_QPS);
        rule.setCount (20);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }

    public static void main(String[] args) {
        initFlowRules();
        while (true){
            doSomething();
        }
    }
}
