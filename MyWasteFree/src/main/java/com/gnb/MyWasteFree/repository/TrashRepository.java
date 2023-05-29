package com.gnb.MyWasteFree.repository;

import com.gnb.MyWasteFree.domain.Trash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrashRepository extends JpaRepository<Trash,Long> {

    // 쓰레기 이름으로 검색

    @Query("select t from Trash t where t.name LIKE '%' || :name || '%'")
    public List<Trash> findByName(@Param("name") String name);

}
