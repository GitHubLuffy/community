package life.majiang.community.dto;

import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2019/8/6 19:53
 * @Description:
 */

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}