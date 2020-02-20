package life.majiang.community.exception;

/**
 * @Auther: luffy
 * @Date: 2020-02-19 02:58
 * @Description:
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND("你找的问题不在了，要不要换个试试?");

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}