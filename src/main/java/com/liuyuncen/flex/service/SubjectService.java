package com.liuyuncen.flex.service;

import com.liuyuncen.flex.entity.Subject;
import com.mybatisflex.core.service.IService;


/**
 * @author xiang
 */
public interface SubjectService extends IService<Subject> {

    /**
     * 查询 s_subject
     * @return s_subject
     */
    Subject queryById(Long id);
}
