package com.gnb.MyWasteFree.repository;

import com.gnb.MyWasteFree.domain.Category;
import com.gnb.MyWasteFree.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
