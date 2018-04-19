package com.piggsoft.fastpigg

import com.piggsoft.fastpigg.model.Blog
import com.piggsoft.fastpigg.respository.BlogRespository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class FastPiggApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Autowired
	lateinit var blogRespository: BlogRespository

	@Test
	fun test01() {
		var s = blogRespository.save(Blog(1, "2", "2"))
		s.block()
	}

}
