package com.devproblems.client.service;

import com.devproblems.shared.DevProblemsServiceGrpc;
import com.devproblems.shared.Request;
import com.devproblems.shared.Response;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author A.Sarang Kumar Tak
 * @youtubechannelname Dev Problems
 */
@Service
public class DevProblemsClientService {
    @GrpcClient("devproblems-channel")
    DevProblemsServiceGrpc.DevProblemsServiceBlockingStub client;
    public String getUpperCase(String lowerCase) {
        Response response = client.getUpperCaseString(Request.newBuilder().setLowerCase(lowerCase).build());
        return response.getUpperCase();
    }
}
