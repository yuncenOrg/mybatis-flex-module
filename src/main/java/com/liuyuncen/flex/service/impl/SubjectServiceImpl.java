package com.liuyuncen.flex.service.impl;

import com.liuyuncen.flex.entity.Subject;
import com.liuyuncen.flex.mapper.SubjectMapper;
import com.liuyuncen.flex.service.SubjectService;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;




/**
 * @author xiang
 */
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

    @Override
    public Subject queryById(Long id) {
        return getById(id);
    }
}
