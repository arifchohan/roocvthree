package com.egeroo.roocvthree.core.tenant;

import java.util.List;

public interface TenantMapper {
	public List<TenantConnection> getTenantList();
	public Tenant getTenant(String identifier);
}
