package com.claro.ws.grpc.impl;

import com.claro.ws.grpc.impl.GrpcExample.ApiResponse;
import com.claro.ws.grpc.impl.GrpcExample.LoginRequest;
import com.claro.ws.grpc.impl.UserAuthGrpc.UserAuthBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();

		UserAuthBlockingStub userAuthStub = UserAuthGrpc.newBlockingStub(channel);

		LoginRequest logInReq = LoginRequest.newBuilder().setUsername("Client").setPassword("Client").build();
		ApiResponse response = userAuthStub.logIn(logInReq);

		System.out.println(response.getCode() + " " + response.getMessage());

	}

}
