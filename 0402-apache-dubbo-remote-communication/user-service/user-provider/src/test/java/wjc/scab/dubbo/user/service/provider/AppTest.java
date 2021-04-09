package wjc.scab.dubbo.user.service.provider;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import wjc.scab.dubbo.user.service.provider.spi.Driver;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void connectTest() {
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver = extensionLoader.getExtension("mysqlDriver");
        System.out.println(driver.connect());
    }
}
