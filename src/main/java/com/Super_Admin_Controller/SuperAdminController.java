package com.Super_Admin_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Super_Admin_Domain.SuperAdminRequest;
import com.Super_Admin_Domain.SuperAdminResponse;
import com.Super_Admin_Service.SuperAdminService;


@RequestMapping("/rest/hotel")
@RestController
public class SuperAdminController {

	@Autowired
	
    private SuperAdminService superAdminService;

    @PostMapping(
        value = "/createSuperAdmin",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<SuperAdminResponse> createSuperAdmin(
            @RequestBody SuperAdminRequest superAdminRequest) {

        return new ResponseEntity<>(
            superAdminService.createSuperAdmin(superAdminRequest),
            HttpStatus.OK
        );
    }
}

