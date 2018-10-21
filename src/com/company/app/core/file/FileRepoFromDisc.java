package com.company.app.core.file;

import com.company.app.api.file.FileRepo;
import com.company.domain.file.File;

import java.util.ArrayList;
import java.util.List;

public class FileRepoFromDisc implements FileRepo {

    List<File> fileList = new ArrayList<>();


    @Override
    public void save(File file) {
       fileList.add(file);
    }

    @Override
    public File findFileById(int id) {
        File file = null;
        for (int i = 0; i < fileList.size(); i = i+1){
            if(fileList.get(i).getId() == id){
               file = fileList.get(i);
            }
        }
        return file;
    }

    @Override
    public List<File> findAll() {
        return fileList;
    }
}
