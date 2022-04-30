package com.devproblems.server.service;

import com.devproblems.shared.DevProblemsServiceGrpc;
import com.devproblems.shared.Request;
import com.devproblems.shared.Response;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author A.Sarang Kumar Tak
 * @youtubechannelname Dev Problems
 */
@GrpcService
@Slf4j
public class DevProblemsServerService extends DevProblemsServiceGrpc.DevProblemsServiceImplBase {

    public void getUpperCaseString(Request request, StreamObserver<Response> responseObserver) {
        log.info("getUpperCaseString {}", request);
        responseObserver.onNext(
                Response.newBuilder().setUpperCase(request.getLowerCase().toUpperCase()).build());
        responseObserver.onCompleted();
    }
}
