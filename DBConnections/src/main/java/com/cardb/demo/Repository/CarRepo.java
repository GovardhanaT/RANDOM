package com.cardb.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cardb.demo.Model.Cardetails;

@Repository
public interface CarRepo extends JpaRepository<Cardetails,Integer>
{
}
/*@Query(value="select * from cardetails",nativeQuery = true)
public List<Cardetails> getAllData();

@Query(value="select name from cardetails where id=?2" ,nativeQuery=true )
public List<Cardetails> byCarName(@Param("id") int id);

@Query(value="select name from cardetails where id between ?2 and ?4",nativeQuery = true)
public List<Cardetails> startEnd(@Param("end") int start,@Param("end") int end);
}


@Modifying
@Transactional
@Query(value="delete from cardetails where id=?2 and id=?5",nativeQuery = true)
Integer deleteId(@Param("id") int cid,@Param("name") String cname);

@Modifying
@Transactional
@Query(value="update cardetails from ")*/