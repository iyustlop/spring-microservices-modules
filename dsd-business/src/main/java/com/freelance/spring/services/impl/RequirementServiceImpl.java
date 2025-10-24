package com.freelance.spring.services.impl;

import com.freelance.spring.services.RequirementService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class RequirementServiceImpl implements RequirementService {

    @Override
    public String uploadRequirementAttachment(MultipartFile file) {
        return "uploadRequirementAttachment";
    }

    @Override
    public String uploadRequirementSpecificationAttachment(MultipartFile file) {
        return "uploadRequirementSpecificationAttachment";
    }

    @Override
    public String assignRequirements() {
        return "assignRequirements";
    }

}
