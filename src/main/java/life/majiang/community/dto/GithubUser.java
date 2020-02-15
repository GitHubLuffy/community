package life.majiang.community.dto;

import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2019/8/8 10:12
 * @Description:
 */

@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
