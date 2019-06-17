package com.lambdaschool.school.service;

import com.lambdaschool.school.SchoolApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolApplication.class)
public class CourseServiceImplTest
{

    @Autowired
    private CourseService courseService;



    @BeforeEach
    void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
    void findAll()
    {
        assertEquals(6, courseService.findAll().size());
    }

    @Test
    void getCountStudentsInCourse()
    {
    }

    @Test
    void delete()
    {
    }
}