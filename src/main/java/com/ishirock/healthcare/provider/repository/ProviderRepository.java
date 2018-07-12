package com.ishirock.healthcare.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishirock.healthcare.provider.model.Provider;

public interface ProviderRepository extends JpaRepository<Provider,Long>{

}
