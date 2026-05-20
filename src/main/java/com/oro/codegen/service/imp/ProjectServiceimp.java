package com.oro.codegen.service.imp;

import com.oro.codegen.dto.project.ProjectRequest;
import com.oro.codegen.dto.project.ProjectResponse;
import com.oro.codegen.dto.project.ProjectSummaryResponse;
import com.oro.codegen.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceimp implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectsById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }
}
