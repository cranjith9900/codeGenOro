package com.oro.codegen.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    Long id;
    String name;
    String stripePriceId;
    Integer maxProjects;
    Integer maxTokenPerDay;
    Integer unlimtedAi;
    Boolean active;

}
