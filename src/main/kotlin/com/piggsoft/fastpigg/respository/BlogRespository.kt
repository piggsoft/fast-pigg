package com.piggsoft.fastpigg.respository

import com.piggsoft.fastpigg.model.Blog
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

/**
 *
 * @author piggsoft
 * @since 1.0
 * @version 1.0
 * @create 2018/04/17
 */
interface BlogRespository : ReactiveMongoRepository<Blog, Long> {
}