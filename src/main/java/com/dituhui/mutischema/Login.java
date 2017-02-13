package com.dituhui.mutischema;

public class Login {
	
	@SuppressWarnings("rawtypes")
	private static final ThreadLocal contextHolder = new ThreadLocal();
	
	public  static String getTenantId() {
		return (String) contextHolder.get();
	}

	@SuppressWarnings("unchecked")
	public static  void setTenantId(String myTenantId) {
		contextHolder.set(myTenantId);
	}
	
	
	public static void clearTenantId(){
		contextHolder.remove();
	}
	
}
