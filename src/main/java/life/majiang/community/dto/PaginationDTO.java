package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: luffy
 * @Date: 2020-02-09 04:17
 * @Description:
 */

@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showFirstPage;//第一页
    private boolean showPrevious;//之前
    private boolean showNext;//之后
    private boolean showEndPage;//最后页

    //current page
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;

        pages.add(page);
        for (int i=1;i<=3;i++){
            //往前循环
            if (page-i>0){
                pages.add(0,page-i);
            }

            //往后循环
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }


        //是否展示上一页
        if (page == 1){
            showPrevious = false;
        }else {
            showPrevious =true;
        }

        //是否展示下一页
        if (page == totalPage){
            showNext = false;
        }else {
            showNext = true;
        }

        //是否展示第一页
        if (pages.contains(1)) {
            showFirstPage = false;
        }else {
            showFirstPage = true;
        }

        //是否展示最后一页
        if (pages.contains(totalPage)) {
            showEndPage = false;
        }else {
            showEndPage = true;
        }

    }
}

