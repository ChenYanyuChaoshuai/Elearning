package cn.java.service;


import cn.java.entity.Paragraph;
import org.springframework.stereotype.Repository;

/**
 * author:ChenYanyu Date:14:02 2019/1/24
 */
@Repository
public interface ParagraphService {
  int deleteByPrimaryKey(Integer id);

  int insert(Paragraph record);

  int insertSelective(Paragraph record);

  Paragraph selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(Paragraph record);

  int updateByPrimaryKeyWithBLOBs(Paragraph record);

  int updateByPrimaryKey(Paragraph record);

}
