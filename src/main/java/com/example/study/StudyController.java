package com.example.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudyController {

    @Autowired
    StudyDAO studyDAO;

    @RequestMapping(value="/study/list", method= RequestMethod.GET)
    public String studylist(Model model){
        model.addAttribute("list",studyDAO.getStudyList());
        return "list";
    }
    @RequestMapping(value = "/study/add", method = RequestMethod.GET)
    public String addPost() {
        return "addpostform";
    }

    @RequestMapping(value = "/study/addok", method = RequestMethod.POST)
    public String addPostOK(StudyVO vo) {
        int i = studyDAO.insertStudy(vo);
        if (i == 0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/study/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model) {
        StudyVO studyVO = studyDAO.getStudy(id);
        model.addAttribute("studyVO", studyVO);
        return "editform";
    }
    @RequestMapping(value = "/study/editok", method = RequestMethod.POST)
    public String editPostOk(StudyVO vo) {
        int i = studyDAO.updateStudy(vo);
        if (i == 0)
            System.out.println("데이터 수정 실패");
        else
            System.out.println("데이터 수정 성공!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/study/deleteok/{id}", method = RequestMethod.GET)
    public String deletePostOk(@PathVariable("id") int id) {
        int i = studyDAO.deleteStudy(id);
        if (i == 0)
            System.out.println("데이터 삭제 실패");
        else
            System.out.println("데이터 삭제 성공!!");
        return "redirect:../list";
    }
}
