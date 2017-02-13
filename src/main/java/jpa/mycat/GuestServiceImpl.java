package jpa.mycat;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("guestService")
public class GuestServiceImpl implements GuestService {
	
	@Autowired
    public	JPAGuestDao jpaguestDao;
	
	@Override
//	@Transactional
	public void saveGuest(Guest guest) {
		this.jpaguestDao.save(guest);
	}

	@SuppressWarnings("unchecked")
	@Override
//	@Transactional
	public List<Guest> queryAll() {
//		return (List<Guest>) this.guestDao.getAllGuest();
		return (List<Guest>) this.jpaguestDao.findAll();
//		List list=this.guestDao.getAllGuest();
//		return formatResult(list) ;
	}

	@Override
	public void updateMethod() {
		System.out.println("----special-----");
	}
	
	public List<Guest> formatResult(List list){
		List<Guest> gulist=null;
		if(null!=list&&list.size()>0){
			gulist=new ArrayList<Guest>();
			for(Object o:list){
				Object [] objarr=(Object[]) o;
				Guest guest=new Guest();
				guest.setId((Integer)objarr[0]);
				guest.setAddress((String) objarr[3]);
				guest.setCreattime((String) objarr[5]);
				guest.setEmail((String) objarr[4]);
				guest.setName((String) objarr[1]);
				guest.setTelephone((String) objarr[2]);
				gulist.add(guest);
			}
		}
		return gulist;
	}

}
