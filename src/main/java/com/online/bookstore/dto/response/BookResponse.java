package com.online.bookstore.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Book response")
public class BookResponse extends BaseResponse<Long> {

    @Schema(description = "Book name")
    private String name;

    @Schema(description = "Book description")
    private String description;

    @Schema(description = "Author name")
    private String author;

    @Schema(description = "Book type")
    private String type;

    @Schema(description = "Book price")
    private Double price;

    @Schema(description = "ISBN number")
    private String isbn;
}
