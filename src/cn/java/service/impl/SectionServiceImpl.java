package cn.java.service.impl;

import cn.java.entity.Section;
import cn.java.mapper.SectionMapper;
import cn.java.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:ChenYanyu Date:13:31 2019/1/24
 */
@Service
public class SectionServiceImpl implements SectionService {

  // 这里手写
  // 使用依赖注入
  @Autowired
  private SectionMapper sm;

  @Override
  public int deleteByPrimaryKey(Integer id) {
    return 0;
  }

  @Override
  public int insert(Section record) {
    return 0;
  }

  @Override
  public int insertSelective(Section record) {
    return 0;
  }

  @Override
  public Section selectByPrimaryKey(Integer id) {
    return sm.selectByPrimaryKey(id);
  }

  @Override
  public int updateByPrimaryKeySelective(Section record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKeyWithBLOBs(Section record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKey(Section record) {
    return 0;
  }
}
