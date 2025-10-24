package com.freelance.spring.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface RequirementService {

    String uploadRequirementAttachment(MultipartFile file);
    String uploadRequirementSpecificationAttachment(MultipartFile file);
    String assignRequirements();

}
