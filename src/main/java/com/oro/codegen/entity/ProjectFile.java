package com.oro.codegen.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {
    Long id;
    Project project;
    String path;
    String miniObjectKey;
    Instant createAt;
    Instant updatedAy;
    User createdBy;
    User updatedBy;
}
