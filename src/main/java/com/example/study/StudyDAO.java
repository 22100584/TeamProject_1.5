package com.example.study;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudyDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertStudy(StudyVO vo) {
        int result = sqlSession.insert("Study.insertStudy", vo);
        return result;
    }

    public int updateStudy(StudyVO vo) {
        int result = sqlSession.insert("Study.updateStudy", vo);
        return result;
    }

    public int deleteStudy(int id) {
        int result = sqlSession.insert("Study.deleteStudy", id);
        return result;
    }

    public StudyVO getStudy(int seq) {
        StudyVO one = sqlSession.selectOne("Study.getStudy", seq);
        return one;
    }

    public List<StudyVO> getStudyList() {
        List<StudyVO> list = sqlSession.selectList("Study.getStudyList");
        return list;
    }
}
