package com.lgx.service;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.lgx.form.AreaForm;
import com.lgx.vo.Area;
import com.mysql.jdbc.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Administrator on 2019/9/9 0009.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AreaServiceTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void findById() throws Exception {

        Area area  = areaService.findById(4);
        System.out.println(area);
        //System.out.println(area.getAreas());
    }
    @Test
    public void findByTest() throws Exception {

        Area area  = areaService.findByIdTest(1);
        System.out.println(area);
        System.out.println(area.getAreas());
    }

    @Test
    public void insert(){
        AreaForm areaForm = new AreaForm();
        areaForm.setTitle("湖人9898");
        areaForm.setTitleAll("洛杉矶湖人");
        //areaForm.setParent(areaService.findByIdTest(1));
        Area area = new Area();
        BeanUtils.copyProperties(areaForm,area);
        //area.setParentId(1);
        areaService.insert(area);
        log.info("area {}",area);
    }
    @Test
    public void update(){
        Area area = areaService.findByIdTest(15);
        System.out.println(area);
        area.setTitle("科比牛逼");
        // area.setParentId(1);
        areaService.update(area);
        System.out.println(area);
    }

    @Test
    public void delete(){
        areaService.delete(17);
    }


    @Test
    public void findByForm(){
        log.info("???????????????????????????");
        AreaForm areaForm = areaService.findByForm(17);
        System.out.println(areaForm);
    }

    @Test
    public void findTest5(){
        log.info("???????????????????????????");
        Area area = areaService.findTest5(1);
        for (Area a:area.getAreas()) {
            System.out.println(a.getTitle());
        }
        System.out.println(area);
    }

    @Test
    public void findTest6(){

        Area area = areaService.findAllById(4);
        log.info("测试区域 {}",area);
        //System.out.println(area);
        System.out.println("-------------------------------------------------------");
        /*for (Area area2 :area.getAreas()){
            System.out.println(area2);
        }*/
        //Arrays.deepToString();

    }

    @Test
    public void findByAreaForm(){
        log.info("开始了");
        AreaForm areaForm = new AreaForm();
        areaForm.setId(4);
        Area area = areaService.findByAreaForm(areaForm);
        log.info(""+area);
    }

    @Test
    public void findByLike(){
        List<Area> areas = areaService.findByLike("山东");
        log.info(""+areas);
    }

    @Test
    public void associationDemo(){
        Area area = areaService.associationDemo(4);
        //log.info("area:{}",area);

        log.info("parent:{}",area.getArea());
    }




}