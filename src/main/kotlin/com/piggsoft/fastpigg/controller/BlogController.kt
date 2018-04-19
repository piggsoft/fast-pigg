package com.piggsoft.fastpigg.controller

import com.piggsoft.fastpigg.model.Blog
import com.piggsoft.fastpigg.respository.BlogRespository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

/**
 *
 * @author piggsoft
 * @since 1.0
 * @version 1.0
 * @create 2018/04/17
 */
@RestController
@RequestMapping("/blog")
class BlogController(val blogRespository: BlogRespository) {

    @GetMapping
    fun index(): Flux<Blog> = blogRespository.findAll()

}