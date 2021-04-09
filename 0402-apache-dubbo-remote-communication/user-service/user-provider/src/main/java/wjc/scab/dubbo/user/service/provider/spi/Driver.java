package wjc.scab.dubbo.user.service.provider.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Driver {
    String connect();
}
