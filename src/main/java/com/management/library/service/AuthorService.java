package com.management.library.service;

import com.management.library.dto.AuthorDTO;
import com.management.library.dto.AuthorSaveDTO;

import java.util.List;

public interface AuthorService {
    String addAuthor(AuthorSaveDTO authorSaveDTO);

    List<AuthorDTO> getAllAuthor();
}
