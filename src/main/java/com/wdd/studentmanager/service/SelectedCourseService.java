package com.wdd.studentmanager.service;

import com.wdd.studentmanager.domain.SelectedCourse;
import com.wdd.studentmanager.util.PageBean;

import java.util.Map;

/**
 * @Classname SelectedCourseService
 * @Description None
 * @Date 2019/6/30 10:48
 * @Created by WDD
 */
public interface SelectedCourseService {
    PageBean<SelectedCourse> queryPage(Map<String, Object> paramMap);
}