package life.majiang.community.dto;

import lombok.Data;

/**
 * @Auther: luffy
 * @Date: 2020-04-24 18:51
 * @Description:
 */

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
