package com.piggsoft.fastpigg.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


/**
 *
 * @author piggsoft
 * @since 1.0
 * @version 1.0
 * @create 2018/04/17
 */
@Document
data class Blog (@Id val id: Long, val title: String, val content: String)