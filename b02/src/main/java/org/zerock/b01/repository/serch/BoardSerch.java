package org.zerock.b01.repository.serch;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.zerock.b01.domain.Board;
import org.zerock.b01.dto.BoardListReplyCountDTO;
import org.zerock.b01.dto.upload.BoardListAllDTO;

public interface BoardSerch {
    Page<Board> serch1(Pageable pageable);

    Page<Board> serchAll(String [] types, String keyword, Pageable pageable);

    Page<BoardListReplyCountDTO> searchWithReplyCount(String[] types, String keyword, Pageable pageable);

    Page<BoardListReplyCountDTO> searchWithall(String[] types, String keyword, Pageable pageable);

    Page<BoardListAllDTO> serchWithAll(String[] types, String keyword, Pageable pageable);
}
