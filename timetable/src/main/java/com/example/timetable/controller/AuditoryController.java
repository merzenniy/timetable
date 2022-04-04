package com.example.timetable.controller;

import com.example.timetable.dto.AuditoryEntity;
import com.example.timetable.service.AuditoryServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AuditoryController {
    private final AuditoryServiceImpl auditoryService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/auditory/{id}")
    public AuditoryEntity getAuditory(@PathVariable int id){
        return auditoryService.getAuditory(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/auditories")
    public List<AuditoryEntity> getAllAuditories() {
        return auditoryService.getAuditoriesList();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/auditory")
    public AuditoryEntity createAuditory(@RequestBody AuditoryEntity auditoryEntity) {
        return auditoryService.createAuditory(auditoryEntity);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/auditory/{id}")
    public AuditoryEntity updateAuditory(@PathVariable int id, @RequestBody AuditoryEntity auditoryEntity) {
        return auditoryService.updateAuditory(id, auditoryEntity);
    }

    @DeleteMapping(value = "/auditory/{id}")
    public ResponseEntity<Void> deleteAuditory(@PathVariable int id) {
        auditoryService.deleteAuditory(id);
        return ResponseEntity.noContent().build();
    }
}
