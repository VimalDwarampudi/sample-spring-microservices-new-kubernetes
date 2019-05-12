package com.codebigbear.services.organization.repository;

import org.springframework.data.repository.CrudRepository;

import com.codebigbear.services.organization.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
	
}
