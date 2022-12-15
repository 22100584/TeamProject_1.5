package com.example.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyServiceImpl implements StudyService {

    @Autowired
    StudyDAO studyDAO;

    @Override
    public int insertStudy(StudyVO vo){
        return studyDAO.insertStudy(vo);
    }

    @Override
    public int deleteStudy(int seq){
        return studyDAO.deleteStudy(seq);
    }

    @Override
    public int updateStudy(StudyVO vo){
        return studyDAO.updateStudy(vo);
    }

    @Override
    public StudyVO getStudy(int seq){
        return studyDAO.getStudy(seq);
    }

    @Override
    public List<StudyVO> getStudyList(){
        return studyDAO.getStudyList();
    }

}
