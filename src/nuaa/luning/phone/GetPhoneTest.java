package nuaa.luning.phone;

import org.junit.jupiter.api.Test;

public class GetPhoneTest {
    @Test
    public void getPhoneInfoTest(){
        //创建一个MobileCodeWSSoap对象
        MobileCodeWSSoap mobileCodeWSSoap = new MobileCodeWS().getMobileCodeWSSoap();
        //调用WebService提供的getMobileCodeInfo方法查询手机号码的归属地
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo("13372018629", null);
        String name = "luning";
        //     输出信息1
        System.out.println(name+"的手机号"+searchResult);
    }
}
