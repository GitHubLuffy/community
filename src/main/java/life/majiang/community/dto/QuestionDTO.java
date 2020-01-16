package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2019-12-21 17:37
 * @Description:
 */

@Data
public class QuestionDTO {
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
        private User user;
}
