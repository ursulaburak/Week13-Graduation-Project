package com.burakavcilar.LibraryManagementProject.mapper;

import com.burakavcilar.LibraryManagementProject.dto.request.BookBorrowingRequest;
import com.burakavcilar.LibraryManagementProject.dto.request.BookBorrowingUpdateRequest;
import com.burakavcilar.LibraryManagementProject.entity.BookBorrowing;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BookBorrowingMapper {

    BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest);

    BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest);

    void update(@MappingTarget BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest);
}
