package life.majiang.community.enums;

/**
 * @Auther: luffy
 * @Date: 2020-04-17 23:45
 * @Description:
 */
public enum NotificationStatusEnum {
    UNREAD(0),READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status){
        this.status = status;
    }

}
