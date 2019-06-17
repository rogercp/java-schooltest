package com.lambdaschool.school.service;

import com.lambdaschool.school.SchoolApplication;
import com.lambdaschool.school.SchoolApplication;
import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.model.Instructor;
import com.lambdaschool.school.model.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;
 
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
        courseService.delete(6);
        assertEquals(5,courseService.findAll().size());
    }

    @Test(expected= EntityNotFoundException.class)
    public void deleteNotFound()
    {
        courseService.delete(23324234);
        assertEquals(2,courseService.findAll().size());
    }

    

    @Test
    public void findCourseById()
    {
           assertEquals("Node.js", courseService.findCourseById(3).getCoursename());
    }
}