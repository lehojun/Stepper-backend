package com.example.stepperbackend.repository;

import com.example.stepperbackend.domain.Comment;
import com.example.stepperbackend.domain.Member;
import com.example.stepperbackend.domain.Post;
import com.example.stepperbackend.domain.enums.BodyPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost_IdAndMember_Id(Long post_id, Long member_id);

    @Query("SELECT count(e) FROM Comment e WHERE e.post = :post")
    int getCountByPost(Post post);

    List<Comment> findByMember(Member member);

    List<Comment> findAllByPostId(@Param("postId") Long postId);

    // 특정 댓글의 대댓글들을 조회하는 메소드
    @Query("SELECT e FROM Comment e WHERE e.parentComment = :parentComment")
    List<Comment> findByParentComment(Comment parentComment);
}
