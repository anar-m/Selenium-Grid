package tets;

import manage.DriverManage;
import org.testng.annotations.Test;

public class Grid_03 {

    DriverManage driverManage = new DriverManage();

    @Test
    void Test01(){
        driverManage
                .setupChromeDriver().get("https://wisequarter.com");
    }

    @Test
    void Test02(){
        driverManage.setupFirefoxDriver().get("https://wisequarter.com");
    }


}
