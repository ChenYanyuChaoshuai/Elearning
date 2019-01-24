package cn.java.service;

import cn.java.entity.Knowledge;
import cn.java.entity.Section;
import org.springframework.stereotype.Repository;

/**
 * SectionMapper继承基类
 */
@Repository
public interface knowledgeService {
  int deleteByPrimaryKey(Integer id);

  int insert(Knowledge record);

  int insertSelective(Knowledge record);

  Knowledge selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(Knowledge record);

  int updateByPrimaryKeyWithBLOBs(Knowledge record);

  int updateByPrimaryKey(Knowledge record);
}