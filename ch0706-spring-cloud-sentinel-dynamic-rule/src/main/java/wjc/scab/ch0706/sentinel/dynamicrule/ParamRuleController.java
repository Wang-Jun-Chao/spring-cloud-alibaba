//package wjc.scab.ch0706.sentinel.dynamicrule;
//
//import com.alibaba.csp.sentinel.annotation.SentinelResource;
//import com.alibaba.csp.sentinel.slots.block.RuleConstant;
//import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRule;
//import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRuleManager;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.PostConstruct;
//import javax.websocket.server.PathParam;
//import java.util.Collections;
//
//
//@RestController
//public class ParamRuleController {
//
//    private final String resourceName = "wjc.scab.ch0705.sentinel.dynamicrule.DynamicController:sayHello(java.lang.String)";
//
//    @PostConstruct
//    public void initParamRule() {
//        ParamFlowRule rule = new ParamFlowRule(resourceName);
//        rule.setParamIdx(0);
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        rule.setCount(1);
//        ParamFlowRuleManager.loadRules(Collections.singletonList(rule));
//    }
//
//    /*  @GetMapping("/hello")
//      public String sayHello(@PathParam("id")String id,@PathParam("name")String name){
//          Entry entry=null;
//          try {
//              entry=SphU.entry(resourceName, EntryType.IN,1,id);
//              return "access success";
//          } catch (BlockException e) {
//              e.printStackTrace();
//              return "block";
//          }finally {
//              if(entry!=null) {
//                  entry.exit();
//              }
//          }
//      }*/
//
//    @SentinelResource
//    @GetMapping(value = "/hello")
//    public String sayHello(@PathParam("id") String id) {
//        return "access success";
//    }
//}
