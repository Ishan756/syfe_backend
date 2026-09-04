package com.financemanager.dto.response;

import com.financemanager.entity.Category.CategoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CategoryResponse {
    private Long id;
    private String name;
    private CategoryType type;
    private boolean isCustom;

    @JsonProperty("isCustom")
    public boolean isCustom() {
        return isCustom;
    }
}
