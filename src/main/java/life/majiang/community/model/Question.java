package life.majiang.community.model;

import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2019/11/19 14:18
 * @Description:
 */

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;

}
