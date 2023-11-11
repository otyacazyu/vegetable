package com.example.vegetable;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
interface NameMapper<VegetableName> {

    @Select("SELECT * FROM vegetables")
    List<VegetableName> findAll();
}
