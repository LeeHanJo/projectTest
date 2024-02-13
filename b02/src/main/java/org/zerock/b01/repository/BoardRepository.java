package org.zerock.b01.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.b01.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.b01.repository.serch.BoardSerch;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSerch {
    @EntityGraph(attributePaths =  {"imageSet"})
    @Query("select b from Board b where b.bno =:bno")
    Optional<Board> findByIdWithImages(@Param("bno") Long bno);
}
