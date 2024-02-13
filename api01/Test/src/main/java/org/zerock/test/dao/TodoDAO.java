package org.zerock.test.dao;

import lombok.Cleanup;
import org.zerock.test.domain.TodoVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

public class TodoDAO {

    public void insert(TodoVO vo) throws Exception {
        String sql = "insert into tbl_todo (name, id, password, age, gender, hobbies, travel, content) values (?,?,?,?,?,?,?,?)";

        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, vo.getName());
        preparedStatement.setString(2, vo.getId());
        preparedStatement.setString(3, vo.getPassword());
        preparedStatement.setString(4, vo.getAge());
        preparedStatement.setString(5, vo.getGender());
        preparedStatement.setString(6, Arrays.toString(vo.getHobbies()));
        preparedStatement.setString(7, vo.getTravel());
        preparedStatement.setString(8, vo.getContent());

        preparedStatement.executeUpdate();
    }
   /* public List<TodoVO> selectAll() throws Exception {
        String sql = "select * from tbl_todo";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();

        List<TodoVO> list = new ArrayList<>();

        while (resultSet.next()){
            TodoVO vo = TodoVO.builder()

                    .title(resultSet.getString("title"))
                    .dueDate(resultSet.getDate("dueDate").toLocalDate())
                    .finished(resultSet.getBoolean("finished"))
                    .build();
            list.add(vo);
        }
        return list;
    }*/
    /*public TodoVO selectOne(Long tno) throws Exception {
        String sql = "select * from tbl_todo where tno = ?";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setLong(1, tno);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();
        TodoVO vo = TodoVO.builder()
                .tno(resultSet.getLong("tno"))
                .title(resultSet.getString("title"))
                .dueDate(resultSet.getDate("dueDate").toLocalDate())
                .finished(resultSet.getBoolean("finished"))
                .build();
        return vo;
    }*/
   /* public void deleteOne(Long tno) throws Exception {
        String sql = "delete from tbl_todo where tno = ?";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, tno);
        preparedStatement.executeQuery();
    }
    public void updateOne(TodoVO todoVO)throws Exception {
        String sql = "update tbl_todo set title = ?, dueDate = ?, finished = ? where tno = ?";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, todoVO.getTitle());
        preparedStatement.setDate(2, Date.valueOf(todoVO.getDueDate()));
        preparedStatement.setBoolean(3, todoVO.isFinished());
        preparedStatement.setLong(4, todoVO.getTno());

        preparedStatement.executeUpdate();
    }*/
}
