package top.lb.datadisplay.services;

import top.lb.datadisplay.domain.srDO;

import java.util.List;

/**
 * 学生信息列表
 * service层
 *
 * @author WarMj
 * @date 2018-05-16
 */
public interface srService {
  List<srDO> listsr();
}
