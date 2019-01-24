package cn.java.service.impl;


import cn.java.entity.Knowledge;
import cn.java.mapper.KnowledgeMapper;
import cn.java.service.knowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:ChenYanyu Date:13:57 2019/1/24
 */
@Service
public class knowledgeServiceImpl implements knowledgeService {

  @Autowired
  private KnowledgeMapper km;
  @Override
  public int deleteByPrimaryKey(Integer id) {
    return 0;
  }

  @Override
  public int insert(Knowledge record) {
    return 0;
  }

  @Override
  public int insertSelective(Knowledge record) {
    return 0;
  }

  @Override
  public Knowledge selectByPrimaryKey(Integer id) {
    return km.selectByPrimaryKey(id);
  }

  @Override
  public int updateByPrimaryKeySelective(Knowledge record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKeyWithBLOBs(Knowledge record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKey(Knowledge record) {
    return 0;
  }
}
