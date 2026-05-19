package com.oro.codegen.dto.member;

import com.oro.codegen.enums.ProjectRole;

public record UpdateRoleRequest(
        ProjectRole role
) {
}
