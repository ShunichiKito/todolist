package com.example.fabrikam.TodoDemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

//@Runwith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = App.class)

public class TodoItemRepositoryTest {
    @Autowired
    private TodoItemRepository todoItemRepository;
    @Before
    public void before() throws Exception {
        TodoItem item1 = new TodoItem();
        item1.setCategory("job1cate1");
        item1.setName("job1");
        item1.setComplete(true);
        todoItemRepository.save(item1);
    }
    @Test
    public void findone() {
        TodoItem item = todoItemRepository.findOne(1);
        Assert.assertEquals(item.category, "jobcate1");
    }


}
