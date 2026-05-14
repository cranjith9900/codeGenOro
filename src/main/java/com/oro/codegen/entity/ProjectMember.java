package com.oro.codegen.entity;

import com.oro.codegen.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;
    Project project;
    User user;
    ProjectRole projectrole;
    Instant invitedAt;
    Instant acceptedAt;

}
