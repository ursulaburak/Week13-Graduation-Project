package com.burakavcilar.LibraryManagementProject.mapper;

import com.burakavcilar.LibraryManagementProject.dto.request.BookForBorrowingRequest;
import com.burakavcilar.LibraryManagementProject.entity.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookForBorrowingMapper {

    Book asEntity(BookForBorrowingRequest bookForBorrowingRequest);
}
