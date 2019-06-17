package com.lambdaschool.school.service;

import com.lambdaschool.school.SchoolApplication;
import com.lambdaschool.school.SchoolApplicationTests;
import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.model.Instructor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;

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
//        assertEquals(6, courseService.findAll().size());
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

    @Test
    public void save()
    {
        Instructor i1 = new Instructor("roger");
        i1.setInstructid(1);

        Course c1 = new Course("geology", i1);

        Course saveCourse = courseService.save(c1);

        assertNotNull(saveCourse);

        Course foundCourse = courseService.findCourseById(saveCourse.getCourseid());

        assertEquals(saveCourse.getCoursename(), foundCourse.getCoursename());
    }
}