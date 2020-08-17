package com.example.demo.controller;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
public class StudentCoursesControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	private CountDownLatch latch;
	
	
	@Test
	public void getStudentCourses() {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCourses");
		try {
			mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		RequestBuilder request = null;
//		request = MockMvcRequestBuilders.get("/getCourses");
//		ResultActions actions;
//		try {
//			actions = mockMvc.perform(request);
//			actions.andExpect(MockMvcResultMatchers.status().isOk());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	@Test
	public void getStudentCoursesMore() {
		ExecutorService pool = Executors.newCachedThreadPool();
		latch= new CountDownLatch(199);
		for (int i = 0; i < 200; i++) {
			Mythread thread = new Mythread();
			pool.execute(thread);
			if (i == 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			//判断线程是否均已运行结束
			latch.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭线程池,释放资源
		pool.shutdown();
	}
	
	class Mythread implements Runnable{

		@Override
		public void run() {
			RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCourses");

			try {
				mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// 使用一次就减一
				latch.countDown();
			}
		}
		
	}
	
}
