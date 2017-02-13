package com.dituhui.mutischema;


import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.util.StringUtils;

public class TenantIdResolver implements CurrentTenantIdentifierResolver {
	
	@Override
	public String resolveCurrentTenantIdentifier() {
		System.out.println("*****tenantId*********"+Login.getTenantId());
		if(StringUtils.isEmpty(Login.getTenantId())){
			return "mycat";
		}
		return Login.getTenantId();
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return false;
	}

}
