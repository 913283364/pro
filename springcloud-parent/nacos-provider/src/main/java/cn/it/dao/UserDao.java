package cn.it.dao;

import cn.it.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper//当前的接口，是mybatis的mapper层接口
public interface UserDao {


    @Select("select * from tb_user where id = #{id}")
    User findById(Integer id);
}
