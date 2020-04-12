package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2020-03-13 21:11
 * @Description:
 */

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
