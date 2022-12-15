package com.example.study;

import java.util.List;

public interface StudyService {
    public int insertStudy(StudyVO vo);
    public int deleteStudy(int seq);
    public int updateStudy(StudyVO vo);
    public StudyVO getStudy(int seq);
    public List<StudyVO> getStudyList();
}
