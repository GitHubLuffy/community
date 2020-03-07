package life.majiang.community.enums;

/**
 * @Auther: luffy
 * @Date: 2020-02-20 19:57
 * @Description:
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type) {
                return true;

            }
        }
        return false;
    }

    public Integer getType(){
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }
}
