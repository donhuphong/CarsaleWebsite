package com.vn.gao.salecar.reponsitory;

import com.vn.gao.salecar.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarReponsitory extends JpaRepository<CarEntity,Long> {

}
