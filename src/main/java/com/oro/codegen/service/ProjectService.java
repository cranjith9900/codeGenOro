package com.oro.codegen.service;

import com.oro.codegen.dto.project.ProjectRequest;
import com.oro.codegen.dto.project.ProjectResponse;
import com.oro.codegen.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
     List<ProjectSummaryResponse> getUserProjects(Long userId);

     ProjectResponse getUserProjectsById(Long id, Long userId);

     ProjectResponse createProject(ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);

     ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);
}
