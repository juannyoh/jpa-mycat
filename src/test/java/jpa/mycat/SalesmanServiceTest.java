package jpa.mycat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dituhui.mutischema.Login;

/**
 * Created by ssab on 17-1-5.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SalesmanServiceTest {
  @Autowired
  private SalesmanService service;
  
  @Autowired
  private GuestService guestService;
  
  
  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  @Test
  public void testFindAll() {
	  String egispdevs[]={"mycat","mycat1","mycat2"};
		for(int k=0;k<10;k++){
			String egispdev=egispdevs[RandomUtils.nextInt(2)+1];
			Login.setTenantId(egispdev);
			System.out.println("------------第"+(k+1)+"次--------读取"+egispdev+"------------");
			List<Guest> guestlist=this.guestService.queryAll();
			for(int i=0;i<guestlist.size();i++){
				System.out.println(egispdev+"******"+guestlist.get(i).toString());
			}
		}
  }
  
  
  
//	@Test
	public void testSaveGuest() {
//		String sessionfactorys[]={"s1_sessionFactory","s2_sessionFactory"};
		String egispdevs[]={"mycat","mycat1","mycat2"};
		for(int i=0;i<10;i++){
//			String sessionfactoryname=sessionfactorys[RandomUtils.nextInt(2)];
			String egispdev=egispdevs[RandomUtils.nextInt(2)+1];
			Login.setTenantId(egispdev);
//			Login.setTenantId("mycat2");
			Guest guest=new Guest();
			guest.setAddress("addr--"+(i+1)+"--");
			guest.setCreattime(sdf.format(new Date()));
			guest.setEmail("session@supermap.cloud");
			guest.setName("name:"+egispdev);
			guest.setTelephone("13605124512");
			this.guestService.saveGuest(guest);
//			Login.setTenantId(egispdev);
//			Login.setTenantId("mycat1");
			System.out.println("#####"+egispdev+"####"+guest);
		}
	}
  

//  @Test
  public void testSave(){
    Salesman salesman = new Salesman();

    salesman.setUserNum("3333333");
    salesman.setTrueName("ssab");

    salesman.setAddress("山东省莱芜市");
    salesman.setMobile("152222222");
    salesman.setDisabled(0);

    service.save(salesman);
  }
}
