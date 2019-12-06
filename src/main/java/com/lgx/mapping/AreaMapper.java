package com.lgx.mapping;

import com.lgx.form.AreaForm;
import com.lgx.vo.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/9/9 0009.
 */

@Mapper
@Repository
public interface AreaMapper {

    Area findById(Integer id);
    Area findByIdTest(@Param("id") Integer id);
    void insert(Area area);
    void update(Area area);
    void delete(Integer id);
    AreaForm findByFormId(Integer id);
    Area findTest5(Integer id);
    Area findAllById(Integer id);
    List<Area> findAll();

    /** 根据对象查找 */
    Area findByAreaForm(@Param("areaForm") AreaForm areaForm);

    List<Area> findByLike(@Param("name") String name);
}
