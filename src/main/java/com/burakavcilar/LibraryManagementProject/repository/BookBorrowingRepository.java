package com.burakavcilar.LibraryManagementProject.repository;

import com.burakavcilar.LibraryManagementProject.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BookBorrowingRepository extends JpaRepository<BookBorrowing,Long> {
}
