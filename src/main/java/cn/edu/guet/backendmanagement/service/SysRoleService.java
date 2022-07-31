package cn.edu.guet.backendmanagement.service;

import cn.edu.guet.backendmanagement.bean.SysMenu;
import cn.edu.guet.backendmanagement.bean.SysRole;
import cn.edu.guet.backendmanagement.http.HttpResult;
import org.springframework.http.HttpRequest;

import java.util.List;


/**
 * 角色管理
 *
 * @author zhh
 * @Date 2022-07-30 11:25
 * @version 1.0
 */
public interface SysRoleService {

    /**
     * 查询全部
     *
     * @return
     */
    List<SysRole> findAll();


    HttpResult deleteMsg(Long id);

    int addMsg(SysRole sysRole);

    List<SysMenu> getNewMsg(Long id);

    HttpResult updateName(SysRole sysRole);

    HttpResult updateRoleMenu(List<String> nameList,Long id);

    List<SysRole> searchMsg(String msg);
}
