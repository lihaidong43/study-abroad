package com.studyabroad.repository;

import com.studyabroad.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by frank on 2017/1/2.
 */
@RepositoryRestResource(collectionResourceRel = "role",path = "role")
public interface RoleRepository extends PagingAndSortingRepository<Role,Long>{
}
