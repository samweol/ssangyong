package com.test.spring;

public interface BoardDAO {

	int add(String title);

	int getSeq();

	void addFile(FileDTO fdto);
	
}
