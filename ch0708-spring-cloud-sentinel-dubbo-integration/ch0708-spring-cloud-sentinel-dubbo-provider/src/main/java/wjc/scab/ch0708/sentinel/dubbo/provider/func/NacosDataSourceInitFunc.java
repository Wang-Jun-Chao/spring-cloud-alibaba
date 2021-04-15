package wjc.scab.ch0708.sentinel.dubbo.provider.func;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

public class NacosDataSourceInitFunc implements InitFunc {
    private final String serverAddr = "192.168.241.128:8848";
    private final String groupId = "DEFAULT_GROUP";
    private final String dataId = "ch0708-spring-cloud-sentinel-dubbo-provider";

    @Override
    public void init() throws Exception {
        loadNacosData();
    }

    private void loadNacosData() {
        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>(
                serverAddr, groupId, dataId, source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
        }));
        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
    }
}
