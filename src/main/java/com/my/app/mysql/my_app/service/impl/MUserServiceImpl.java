package com.my.app.mysql.my_app.service.impl;

import com.my.app.mysql.my_app.entity.MUser;
import com.my.app.mysql.my_app.mapper.MUserMapper;
import com.my.app.mysql.my_app.service.IMUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ms
 * @since 2023-11-20
 */
@Service
public class MUserServiceImpl extends ServiceImpl<MUserMapper, MUser> implements IMUserService {

}
