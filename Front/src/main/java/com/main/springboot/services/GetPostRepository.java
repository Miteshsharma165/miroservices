package com.main.springboot.services;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface GetPostRepository extends CassandraRepository<GetPostService, String>{

}
