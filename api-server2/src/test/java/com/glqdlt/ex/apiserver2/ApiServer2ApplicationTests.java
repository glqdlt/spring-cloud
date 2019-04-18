package com.glqdlt.ex.apiserver2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServer2ApplicationTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new ApiServer2Application())
                .build();
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void greetingTest() throws Exception {
        MvcResult response = this.mockMvc.perform(get("/api/greeting")).andReturn();
        String body = response.getResponse().getContentAsString();
        Assert.assertEquals("i'm number 2 server", body);
    }

}
