package com.oro.codegen.service.imp;

import com.oro.codegen.dto.project.ProjectRequest;
import com.oro.codegen.dto.project.ProjectResponse;
import com.oro.codegen.dto.project.ProjectSummaryResponse;
import com.oro.codegen.entity.Project;
import com.oro.codegen.entity.User;
import com.oro.codegen.mapper.ProjectMapper;
import com.oro.codegen.repository.ProjectRepository;
import com.oro.codegen.repository.UserRepository;
import com.oro.codegen.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceimp implements ProjectService {
    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectsById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
       User owner = userRepository.findById(userId).orElseThrow();
         Project project = Project.builder().name(request.name()).owner(owner).isPublic(false).build();
         project = projectRepository.save(project);
         return projectMapper.toProjectResponse(project);
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
