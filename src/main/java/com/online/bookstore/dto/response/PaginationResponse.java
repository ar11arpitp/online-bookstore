package com.online.bookstore.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Pagination Response")
public class PaginationResponse<T> extends GenericResponse {

    @Schema(description = "The total number of elements in the collection")
    private Long totalElements;

    @Schema(description = "The list of elements in the current page")
    private List<T> data;

    @Schema(description = "The total number of pages in the collection")
    private int numberOfPages;

    @Schema(description = "The maximum number of elements per page")
    private int pageSize;

    @Schema(description = "The current page number")
    private int pageNumber;

    @Override
    public Boolean isSuccess() {
        return Boolean.TRUE;
    }
}

