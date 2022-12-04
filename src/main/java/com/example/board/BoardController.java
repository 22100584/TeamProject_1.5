package com.example.controller;

import com.example.bean.BoardVO;
import com.example.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {
    @Autowired
    BoardDAO boardDAO;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String boardlist(Model model){
        model.addAttribute("posts",boardDAO.getBoardList());
        return "/WEB-INF/list.jsp";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addPost(){
        return "board/addpostform";
    }

    @RequestMapping(value = "/addok",method = RequestMethod.GET)
    public String addPostOK(BoardVO vo){
        int i=boardDAO.insertBoard(vo);
        if(i==0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공");
        return "redirect:list";
    }

    @RequestMapping(value = "/editpost/{id}",method=RequestMethod.GET)
    public String editPost(@PathVariable("id") Integer id, Model model){
        BoardVO boardVO = boardDAO.getBoard(id);
        model.addAttribute("boardVO,boardVO");
        return "editform";
    }
    @RequestMapping(value = "/editok",method = RequestMethod.POST)
    public String editPostOK(BoardVO vo){
        int i=boardDAO.updateBoard(vo);
        if(i==0)
            System.out.println("데이터 수정 실패");
        else
            System.out.println("데이터 수정 성공");
        return "redirect:list";
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deletePost(@PathVariable("id") int id){
        if(boardDAO.deleteBoard(id)==0)
            System.out.println("데이터 삭제 실패");
        else
            System.out.println("데이터 삭제 성공");
        return "redirect:list";
    }
}
