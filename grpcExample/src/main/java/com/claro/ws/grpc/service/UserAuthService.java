package com.claro.ws.grpc.service;

import com.claro.ws.grpc.impl.GrpcExample.ApiResponse;
import com.claro.ws.grpc.impl.GrpcExample.Empty;
import com.claro.ws.grpc.impl.GrpcExample.LoginRequest;
import com.claro.ws.grpc.impl.UserAuthGrpc.UserAuthImplBase;

import io.grpc.stub.StreamObserver;

public class UserAuthService extends UserAuthImplBase {

	@Override
	public void logIn(LoginRequest request, StreamObserver<ApiResponse> responseObserver) {

		String userName = request.getUsername();
		String passWord = request.getPassword();
		ApiResponse.Builder response = ApiResponse.newBuilder();

		if (userName.equals(passWord)) {
			response.setCode(200).setMessage("User LogIn");
		} else {
			response.setCode(401).setMessage("User credentias wrong");
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	@Override
	public void logOut(Empty request, StreamObserver<ApiResponse> responseObserver) {
		ApiResponse.Builder response = ApiResponse.newBuilder();
		response.setCode(200).setMessage("User LogOut");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}
