package jpa.mycat;

import java.util.List;


public interface GuestService {
	
	public void saveGuest(Guest guest);
	
	public List<Guest> queryAll();
	
	
	public void updateMethod();

}
