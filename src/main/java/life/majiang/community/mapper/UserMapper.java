package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: luffy
 * @Date: 2019/8/19 15:57
 * @Description:
 */

@Mapper
public interface UserMapper {
    /**
     * 下面的insert会自动去调用User的get方法，放入#{name},#{accountId}等之中
     * */
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void  insert(User user);

    @Select("select * from user where token =#{token}")
    User findByToken(@Param("token") String token);
}
