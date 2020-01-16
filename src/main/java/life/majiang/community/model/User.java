package life.majiang.community.model;

import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2019/8/19 16:09
 * @Description:
 */

@Data
public class User {
    private Integer id;
    private  String name;
    private String accountId;
    private  String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
