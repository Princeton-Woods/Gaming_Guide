package com.project2.project2spring.service;

import com.project2.project2spring.entity.Forum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ForumService {
    Forum saveForum(Forum forum);
    List<Forum> getAllForum();
    Forum deleteForum(Long forumId);
}
