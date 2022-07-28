package com.test.spring;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	private SqlSessionTemplate template;
	
	@Autowired
	public BoardDAOImpl(SqlSessionTemplate template) {
		this.template = template;
	}
	
	@Override
	public int add(String title) {
		
		return this.template.insert("file.add", title);
	}
	
	@Override
	public int getSeq() {
		
		return this.template.selectOne("file.getSeq");
	}
	
	@Override
	public void addFile(FileDTO fdto) {
		this.template.insert("file.addFile", fdto);
	}
}
