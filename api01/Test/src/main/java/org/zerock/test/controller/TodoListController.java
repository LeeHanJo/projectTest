package org.zerock.test.controller;

import org.zerock.test.dto.TodoDTO;
import org.zerock.test.service.TodoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "todoListController", value = "/todo/list")
public class TodoListController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");

        dispatcher.forward(req, resp);

        TodoDTO todoDTO = TodoDTO.builder()
                .name(req.getParameter("name"))
                .id(req.getParameter("id"))
                .password(req.getParameter("password"))
                .age(req.getParameter("age"))
                .gender(req.getParameter("gender"))
                .hobbies(req.getParameterValues("hobbies"))
                .travel(req.getParameter("travel"))
                .content(req.getParameter("content"))
                .build();

        try{
            todoService.register(todoDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //resp.sendRedirect("/todo/list");
    }
}
