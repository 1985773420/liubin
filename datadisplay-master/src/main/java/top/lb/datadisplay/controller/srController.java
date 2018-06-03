package top.lb.datadisplay.controller;

import top.lb.datadisplay.domain.srDO;
import top.lb.datadisplay.services.srService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 学生信息列表
 * controller层
 *
 * @author WarMj
 * @date 2018-05-16
 */
@Controller
@RequestMapping("sr")
public class srController {

  private final srService srService;

  public srController(srService srService) {
    this.srService = srService;

  }

  /**
   * @return
   */
  @GetMapping("listsr")
  @ResponseBody
  public List<srDO> listStudent() {
    return srService.listsr();
  }

}
