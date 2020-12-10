package com.solvd.university.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.solvd.university.model.Address;

public interface IAddressDAO extends DAO<Address, Long> {
	@Delete("delete from Address where id = #{id}")
	boolean removeById(Long id);
	@Select("select * from Address  where id = #{id}")
	Optional<Address> getById(Long id);
	@Select("select * from Address")
	List<Address> getAll();
}
