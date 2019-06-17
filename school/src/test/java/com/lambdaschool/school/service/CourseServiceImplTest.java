package com.lambdaschool.school.service;

import com.lambdaschool.school.SchoolApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
 import static junit.framework.TestCase.assertEquals;
 import static junit.framework.TestCase.assertNotNull;
 
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolApplication.class)
public class CourseServiceImplTest
{

    @Autowired
    private CourseService courseService;



    @Before
    public void setUp()  throws Exception
    {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown()  throws Exception
    {
    }

    @Test
    public void findAll()
    {
        assertEquals(6, courseService.findAll().size());
    }

    @Test
    public void getCountStudentsInCourse()
    {
    }

    @Test
    public void delete()
    {
    }

    @Test
    public void findCourseById()
    {
           assertEquals("Node.js", courseService.findCourseById(3).getCoursename());
    }
}