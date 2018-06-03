package top.lb.datadisplay.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.lb.datadisplay.domain.srDO;

import java.util.List;

/**
 * 学生信息列表
 * dao层
 *
 * @author WarMj
 * @date 2018-05-16
 */
@Mapper
@Repository
public interface srDao {
  /**
   * @return
   */
  List<srDO> listsr();

}
