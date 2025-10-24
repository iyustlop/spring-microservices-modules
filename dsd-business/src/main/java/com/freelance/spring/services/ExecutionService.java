package com.freelance.spring.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface ExecutionService {

    String deleteExecution(String executionId);
    String uploadExecutionAttachment(MultipartFile file);

}
