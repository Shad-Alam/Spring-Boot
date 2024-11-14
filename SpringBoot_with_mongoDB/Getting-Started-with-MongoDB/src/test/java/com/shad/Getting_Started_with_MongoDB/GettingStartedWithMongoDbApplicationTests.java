package com.shad.Getting_Started_with_MongoDB;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class GettingStartedWithMongoDbApplicationTests {

	@Test
	void contextLoads() {
	}

}
