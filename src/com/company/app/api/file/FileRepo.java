package com.company.app.api.file;

import com.company.domain.file.File;

import java.util.List;

public interface FileRepo {

    void save(File file);

    File findFileById(int id);

    List<File> findAll();

}
