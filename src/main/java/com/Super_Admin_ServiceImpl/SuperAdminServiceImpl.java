package com.Super_Admin_ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Super_Admin_Domain.SuperAdminRequest;
import com.Super_Admin_Domain.SuperAdminResponse;
import com.Super_Admin_Entity.SuperAdminDetail;
import com.Super_Admin_Repository.SuperAdminDetailRepository;
import com.Super_Admin_Service.SuperAdminService;

@Service
public class SuperAdminServiceImpl implements SuperAdminService {

	@Autowired
	SuperAdminDetailRepository superAdminDetailRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public SuperAdminResponse createSuperAdmin(SuperAdminRequest superAdminRequest) {

		SuperAdminResponse superAdminResponse = new SuperAdminResponse();
		SuperAdminDetail superAdminDetail = new SuperAdminDetail();

		try {
			if (superAdminRequest != null) {

				if (superAdminRequest.getId() != null) {
					superAdminDetail.setId(superAdminRequest.getId());
				}

				if (superAdminRequest.getPhoneNumber() != null) {
					superAdminDetail.setPhoneNumber(superAdminRequest.getPhoneNumber());
				}

				if (superAdminRequest.getRole() != null) {
					superAdminDetail.setRole(superAdminRequest.getRole());
				}

				if (superAdminRequest.getStatus() != null) {
					superAdminDetail.setStatus(superAdminRequest.getStatus());
				}

				if (superAdminRequest.getFirstName() != null) {
					superAdminDetail.setFirstName(superAdminRequest.getFirstName());
				}

				if (superAdminRequest.getLastName() != null) {
					superAdminDetail.setLastName(superAdminRequest.getLastName());
				}

				if (superAdminRequest.getEmail() != null) {
					superAdminDetail.setEmail(superAdminRequest.getEmail());
				}

				if (superAdminRequest.getPassword() != null) {
					String encodedPassword = passwordEncoder.encode(superAdminRequest.getPassword());

					superAdminDetail.setPassword(encodedPassword);
				}

				superAdminDetailRepository.save(superAdminDetail);

			}

		} catch (Exception e) {
			e.getStackTrace();
		}

		superAdminResponse.setMsg("Data Saved Successfully");
		return superAdminResponse;
	}
}