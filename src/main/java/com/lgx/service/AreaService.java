package com.lgx.service;

import com.lgx.form.AreaForm;
import com.lgx.mapping.AreaMapper;
import com.lgx.vo.Area;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * Created by Administrator on 2019/9/9 0009.
 */
@Service
@Slf4j
public class AreaService {

    @Autowired
    private AreaMapper areaMapper;

    public Area findById( Integer id){
        Area area = areaMapper.findById(id);
        return area;
    }
    public Area findByIdTest( Integer id){
        Area area = areaMapper.findByIdTest(id);
        return area;
    }
    public void insert(Area area){

        areaMapper.insert(area);

    }
    public void update(Area area){
        areaMapper.update(area);
    }

    public void delete(Integer id){
        areaMapper.delete(id);

    }

    public AreaForm findByForm(Integer id){

        return areaMapper.findByFormId(id);
    }
    public Area findTest5(Integer id){

        return areaMapper.findTest5(id);
    }

    public Area findTest6( Integer id){
        return areaMapper.findAllById(id);
    }

    public List<Area> findAll(){
        return areaMapper.findAll();

    }

    public Area findAllById(int id) {
        return areaMapper.findAllById(id);
    }

    public Area findByAreaForm(AreaForm areaForm){
        return areaMapper.findByAreaForm(areaForm);
    }

    public List<Area> findByLike(String name) {
        return areaMapper.findByLike(name);
    }
}
