package cn.java.service;

import cn.java.entity.Section;
import org.springframework.stereotype.Repository;

/**
 * SectionMapper继承基类
 */
@Repository
public interface SectionService  {
  int deleteByPrimaryKey(Integer id);

  int insert(Section record);

  int insertSelective(Section record);

  Section selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(Section record);

  int updateByPrimaryKeyWithBLOBs(Section record);

  int updateByPrimaryKey(Section record);
}