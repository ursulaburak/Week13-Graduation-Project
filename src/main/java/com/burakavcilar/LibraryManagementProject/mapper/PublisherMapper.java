package com.burakavcilar.LibraryManagementProject.mapper;

import com.burakavcilar.LibraryManagementProject.dto.response.PublisherResponse;
import com.burakavcilar.LibraryManagementProject.entity.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);

    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
