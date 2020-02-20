package life.majiang.community.dto;

import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2020-02-20 15:01
 * @Description:
 */

@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
