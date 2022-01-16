package com.vudang.user.shared.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SharedDepartment {
    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
