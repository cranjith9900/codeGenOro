package com.oro.codegen.dto.member;

import com.oro.codegen.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {

}
