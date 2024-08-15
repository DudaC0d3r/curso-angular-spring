package com.loiane.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.loiane.enums.Category;
import com.loiane.enums.validation.ValueOfEnum;

public record CourseDTO(
        @JsonProperty("_id") Long id,
        @NotBlank @NotNull @Length(min = 5, max = 100) String name,
        @NotNull @Length(max = 10) @ValueOfEnum(enumClass = Category.class) String category,
        @NotNull @NotEmpty @Valid List<LessonDTO> lessons) {
        }
