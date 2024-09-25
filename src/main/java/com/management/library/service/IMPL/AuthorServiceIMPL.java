package com.management.library.service.IMPL;

import com.management.library.dto.AuthorDTO;
import com.management.library.dto.AuthorSaveDTO;
import com.management.library.entity.Author;
import com.management.library.repository.AuthorRepository;
import com.management.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceIMPL implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public String addAuthor(AuthorSaveDTO authorSaveDTO) {

        Author author = new Author(
                authorSaveDTO.getName()
        );
        authorRepository.save(author);
        return author.getName();
    }

    @Override
    public List<AuthorDTO> getAllAuthor() {
        List<Author> getAuthors = authorRepository.findAll();
        List<AuthorDTO> authorDTOList = new ArrayList<>();

        for (Author author : getAuthors) {
            AuthorDTO authorDTO = new AuthorDTO(
                    author.getAuthorId(),
                    author.getName()
            );
            authorDTOList.add(authorDTO);
        }
        return authorDTOList;
    }
}
