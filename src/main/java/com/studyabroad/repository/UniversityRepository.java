package com.studyabroad.repository;

import com.studyabroad.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Created by frank on 2017/1/2.
 */
@RepositoryRestResource(collectionResourceRel = "university",path = "university")
public interface UniversityRepository extends PagingAndSortingRepository<User,Long> {
}
