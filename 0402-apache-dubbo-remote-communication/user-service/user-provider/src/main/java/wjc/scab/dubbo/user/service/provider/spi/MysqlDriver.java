package wjc.scab.dubbo.user.service.provider.spi;

public class MysqlDriver implements Driver {
    @Override
    public String connect() {
        return "使用SPI连接MySQL数据库";
    }
}
