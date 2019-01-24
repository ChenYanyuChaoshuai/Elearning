package cn.java.controller.front;

import cn.java.entity.College;
import cn.java.entity.Course;
import cn.java.entity.Knowledge;
import cn.java.entity.Paragraph;
import cn.java.entity.Section;
import cn.java.service.CourseService;
import cn.java.service.ParagraphService;
import cn.java.service.SectionService;
import cn.java.service.knowledgeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:ChenYanyu Date:22:48 2019/1/23
 */
@Controller
public class ShowController {

  //使用依赖注入
  //Controller拥有一个Service层的对象，使用Service提供的服务
  @Autowired
  private CourseService cs;
  @Autowired
  private SectionService ss;
  @Autowired
  private knowledgeService ks;
  @Autowired
  private ParagraphService ps;

  //为了方便展示，先把url的对外访问路径设置为t1，t2，t3，t4
  // 主页
  // @RequestMapping("show_index")
  @RequestMapping("t1")
  @ResponseBody
  public List<Course> showIndex(){
    //从数据库动态获取课程目录
    //这里仅考虑左侧目录栏只有软件学院的情况
    List<Course> courses = new ArrayList<Course>();
    //查找课程目录，循环可变
    for (int i=1; i<=4;i++){
      courses.add(cs.selectByPrimaryKey(i));
    }
    //返回课程视图的json
    return courses;
  }

  // 课程的章节目录
  // @RequestMapping("show_course_catalogue")
  @RequestMapping("t2")
  @ResponseBody
  public List<Section> showCourseCatalogue() {
    //从数据库动态获取课程的章节目录
    List<Section> sections = new ArrayList<Section>();
    //目录存放在一个列表中
    for (int i = 1; i <= 28; i++) {
      sections.add(ss.selectByPrimaryKey(i));
    }
    return sections;
  }

  // 课程的知识点
  // @RequestMapping("show_course_knowledge")
  @RequestMapping("t3")
  @ResponseBody
  public List<Knowledge> showCourseKnowledge(){
    //从数据库动态获取课程的知识点
    List<Knowledge> knowledges = new ArrayList<Knowledge>();
    //目录存放在一个列表中
    for (int i = 1; i <= 23; i++) {
      knowledges.add(ks.selectByPrimaryKey(i));
    }
    return knowledges;
  }

  // 课程的知识点的段落
  // @RequestMapping("show_course_Paragraph")
  @RequestMapping("t4")
  @ResponseBody
  public List<Paragraph> showCourseParagraph(){
    //从数据库动态获取课程的知识点
    List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    //目录存放在一个列表中
    for (int i = 1; i <= 32; i++) {
      paragraphs.add(ps.selectByPrimaryKey(i));
    }
    return paragraphs;
  }


}
