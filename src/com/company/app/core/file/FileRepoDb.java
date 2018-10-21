package com.company.app.core.file;

import com.company.app.api.file.FileRepo;
import com.company.domain.file.File;

import java.util.List;

public class FileRepoDb implements FileRepo {


    @Override
    public void save(File file) {

    }

    @Override
    public File findFileById(int id) {
        return null;
    }

    @Override
    public List<File> findAll() {
        return null;
    }
}
