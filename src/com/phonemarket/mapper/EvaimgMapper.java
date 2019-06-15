package com.phonemarket.mapper;

import com.phonemarket.entity.Evaimg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaimgMapper {
    Integer addEvaimg(Evaimg evaimg);

    Evaimg findEvaimgById(Integer id);

    List<Evaimg> findEvaimgByEvaId(Integer evaId);
}
