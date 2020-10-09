package vip.huhailong.findcar.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.stereotype.Repository;
import vip.huhailong.findcar.entity.Release;

import java.util.List;
import java.util.Map;

@Repository
public interface ReleaseDao {
    int insert(@Param("pojo")Release pojo);

    List<Release> select(@Param("pojo")Release pojo);

    List<Map<Object,Object>> findCount(@Param("userId")String userId);

    int delete(@Param("id")Integer id);
}
