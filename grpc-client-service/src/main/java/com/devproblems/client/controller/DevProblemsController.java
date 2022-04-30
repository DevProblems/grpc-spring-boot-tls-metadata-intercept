package com.devproblems.client.controller;

import com.devproblems.client.service.DevProblemsClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author A.Sarang Kumar Tak
 * @youtubechannelname Dev Problems
 */
@RestController
@AllArgsConstructor
public class DevProblemsController {

    final DevProblemsClientService devProblemsClientService;

    @GetMapping("/uppercase/{lowercase}")
    public ResponseEntity<String> getUpperCase(@PathVariable String lowercase) {
        return ResponseEntity.ok(devProblemsClientService.getUpperCase(lowercase));
    }

}
