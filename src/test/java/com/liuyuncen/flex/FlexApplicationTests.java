package com.liuyuncen.flex;

import com.liuyuncen.flex.entity.Subject;
import com.liuyuncen.flex.service.impl.SubjectServiceImpl;
import com.mybatisflex.core.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FlexApplicationTests {

    @Autowired
    private SubjectServiceImpl subjectService;

    @Test
    void contextLoads() {
        Subject subject = subjectService.getById(1);
        System.out.println("subject = " + subject);
    }

}
