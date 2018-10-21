package com.company.app.api.file;

import com.company.domain.file.File;
import com.company.domain.user.User;

import java.util.List;

public interface NewFileRepo extends FileRepo {

    void update(File file);

    List<File> findUserFiles(User user);

}
