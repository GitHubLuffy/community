package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @Auther: luffy
 * @Date: 2020-04-12 00:31
 * @Description:
 */

@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
