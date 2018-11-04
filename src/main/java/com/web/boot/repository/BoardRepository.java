package com.web.boot.repository;

import com.web.boot.domain.Board;
import com.web.boot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
