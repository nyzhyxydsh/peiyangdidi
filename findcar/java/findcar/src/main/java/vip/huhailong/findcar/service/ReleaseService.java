package vip.huhailong.findcar.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.huhailong.findcar.entity.Release;
import vip.huhailong.findcar.mapper.ReleaseDao;
import vip.huhailong.findcar.utils.JsonUtil;

import java.util.List;
import java.util.Map;

@Service
public class ReleaseService {
    @Autowired
    ReleaseDao releaseDao;

    @Autowired
    JsonUtil util;

    //增加一条发布信息
    public JSONObject addRelease(Release release){
        return util.updateJson(releaseDao.insert(release));
    }
    //选择一条信息
    public PageInfo<Release> selectRelease(Release release){
        PageHelper.startPage(release.getPageNum(),release.getPageSize());
        List<Release> list = releaseDao.select(release);
        return new PageInfo<>(list);
    }
    //查询
    public List<Map<Object,Object>> findCount(String userId){
        return releaseDao.findCount(userId);
    }
    //删除一条信息
    public JSONObject delete(Integer id){
        return util.updateJson(releaseDao.delete(id));
    }

}
