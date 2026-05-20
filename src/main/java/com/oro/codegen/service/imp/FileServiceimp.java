package com.oro.codegen.service.imp;

import com.oro.codegen.dto.project.FileContentResponse;
import com.oro.codegen.dto.project.FileTreeResponse;
import com.oro.codegen.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceimp implements FileService {
    @Override
    public List<FileTreeResponse> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
