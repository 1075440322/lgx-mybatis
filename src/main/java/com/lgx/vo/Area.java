package com.lgx.vo;

import lombok.*;


import java.util.List;

/**
 * Created by Administrator on 2019/9/9 0009.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Area {

    private Integer id;
    private Integer parentId;
    private String title;
    private String code;
    private String titleAll;
    private String codeAll;
    private Integer sequence;
    private String searchTag;
    private String nameStep;

    // 当出现自我关联上级和下级集合的时候 需要排除掉这两个字段其中一个，否则在调用toString()方法时会产生死循环
    @ToString.Exclude
    private Area area;

    //@ToString.Exclude
    private List<Area> areas = null;


}
