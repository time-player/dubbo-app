package cn.zealon.app.user.dao;

import cn.zealon.app.user.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into org_user(id,userid,userName,created) values(#{id},#{userId},#{userName},#{created})")
    public int insert(User user);

    @Select("select id,userId,userName,created from org_user where userId=#{userId} ")
    public User getUserById(String userId);
}
