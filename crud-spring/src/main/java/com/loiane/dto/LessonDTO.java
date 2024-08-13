package com.loiane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public record LessonDTO(
                Long id,
                @NotNull @NotBlank @Length(min = 5, max = 100) String name,
                @NotNull @NotBlank @Length(min = 10, max = 11) String youtubeUrl) {

}
