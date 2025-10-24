package com.freelance.spring.services.impl;

import com.freelance.spring.services.ExecutionService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ExecutionServiceImpl implements ExecutionService {

    @Override
    public String deleteExecution(String executionId) {
        return "deleteExecution";
    }

    @Override
    public String uploadExecutionAttachment(MultipartFile file) {
        return "uploadExecutionAttachment";
    }

}
