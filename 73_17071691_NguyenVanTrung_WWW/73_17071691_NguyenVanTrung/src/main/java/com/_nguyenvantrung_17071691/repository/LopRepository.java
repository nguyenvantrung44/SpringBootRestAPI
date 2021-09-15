/**
 * 
 */
package com._nguyenvantrung_17071691.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com._nguyenvantrung_17071691.entity.Lop;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Repository
public interface LopRepository extends JpaRepository<Lop,Integer> {

}
