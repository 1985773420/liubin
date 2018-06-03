package top.lb.datadisplay.services.impl;

import top.lb.datadisplay.dao.srDao;
import top.lb.datadisplay.domain.srDO;
import top.lb.datadisplay.services.srService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class srServiceImpl implements srService {

  @Autowired
  private srDao srDao;

  /**
   *
   * @return
   */
  @Override
  public List<srDO> listsr() {
    return srDao.listsr();
  }
}
