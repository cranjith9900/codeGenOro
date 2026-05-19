package com.oro.codegen.service;

import com.oro.codegen.dto.project.FileContentResponse;
import com.oro.codegen.dto.project.FileTreeResponse;

import java.util.List;

public interface FileService {

     List<FileTreeResponse> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
