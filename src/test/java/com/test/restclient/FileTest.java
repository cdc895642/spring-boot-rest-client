package com.test.restclient;

import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class FileTest {

  @Rule
  public TemporaryFolder temporaryFolder = new TemporaryFolder();

  @Test
  public void tempfiles() throws IOException {
  File rootFolder=temporaryFolder.newFolder("root");
  File childFolder=temporaryFolder.newFolder("root","child");
  File file=temporaryFolder.newFile("file");
    File childFile=new File(childFolder,"childFile");
  System.out.println(rootFolder.getAbsolutePath());
    System.out.println(childFolder.getAbsolutePath());
    System.out.println(childFolder.getParent());
    System.out.println(file.getAbsolutePath());
    System.out.println(childFile.getAbsolutePath());

  childFolder.getParent();
  }
}
