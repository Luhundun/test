package nuaa.luning.phone;

import org.junit.jupiter.api.Test;

public class GetPhoneTest {
    @Test
    public void getPhoneInfoTest(){
        //����һ��MobileCodeWSSoap����
        MobileCodeWSSoap mobileCodeWSSoap = new MobileCodeWS().getMobileCodeWSSoap();
        //����WebService�ṩ��getMobileCodeInfo������ѯ�ֻ�����Ĺ�����
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo("13372018629", null);
        String name = "luning";
        //     �����Ϣ1
        System.out.println(name+"���ֻ���"+searchResult);
    }
}
