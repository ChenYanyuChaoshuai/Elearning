package cn.java.service.impl;

import cn.java.entity.Paragraph;
import cn.java.mapper.ParagraphMapper;
import cn.java.service.ParagraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:ChenYanyu Date:14:04 2019/1/24
 */
@Service
public class ParagraphServiceImpl implements ParagraphService {

  @Autowired
  private ParagraphMapper pm;

  @Override
  public int deleteByPrimaryKey(Integer id) {
    return 0;
  }

  @Override
  public int insert(Paragraph record) {
    return 0;
  }

  @Override
  public int insertSelective(Paragraph record) {
    return 0;
  }

  @Override
  public Paragraph selectByPrimaryKey(Integer id) {
    return pm.selectByPrimaryKey(id);
  }

  @Override
  public int updateByPrimaryKeySelective(Paragraph record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKeyWithBLOBs(Paragraph record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKey(Paragraph record) {
    return 0;
  }
}
