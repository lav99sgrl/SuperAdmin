package com.Super_Admin_Service;

import com.Super_Admin_Domain.SuperAdminRequest;
import com.Super_Admin_Domain.SuperAdminResponse;

public interface SuperAdminService {

	SuperAdminResponse createSuperAdmin(SuperAdminRequest superAdminRequest);

}
