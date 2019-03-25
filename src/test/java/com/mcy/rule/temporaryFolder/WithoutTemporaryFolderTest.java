package com.mcy.rule.temporaryFolder;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WithoutTemporaryFolderTest {

	File folder=null;
	
	@Before
	public void setUp() throws Exception {
		// folder degiskenine gecici folder yarat
	}

	@Test
	public void test() throws IOException {
		File file = new File(folder, "deneme.txt");
		assertThat(file).isFile();
	}
	
	@After
	public void tearDown() throws Exception{
		// folder degiskenine yarattigin tum folderlari ve filelari geri temizle
	}
}
