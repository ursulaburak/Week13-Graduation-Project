package com.burakavcilar.LibraryManagementProject.mapper;

import com.burakavcilar.LibraryManagementProject.dto.request.AuthorRequest;
import com.burakavcilar.LibraryManagementProject.dto.response.AuthorResponse;
import com.burakavcilar.LibraryManagementProject.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface AuthorMapper {
    Author asEntity(AuthorRequest authorRequest);

    AuthorResponse asOutput(Author author);

    List<AuthorResponse> asOutput(List<Author> author);

    void update(@MappingTarget Author entity, AuthorRequest request);
}
