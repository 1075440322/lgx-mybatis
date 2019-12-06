package com.lgx.form;

import com.lgx.vo.Area;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/9/29 0029.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaForm {

    private Integer id;
    private Area parent;
    private String title;
    private String code;
    private String titleAll;
    private String codeAll;
    private Integer sequence;
    private String searchTag;
    private String nameStep;
    private List<AreaForm> areas = new ArrayList<AreaForm>(10);

}
