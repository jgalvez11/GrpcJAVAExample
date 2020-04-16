package com.claro.ws.grpc.impl;

import java.io.IOException;

import com.claro.ws.grpc.service.UserAuthService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {

	public static void main(String[] args) {

		Server server = ServerBuilder.forPort(9091).addService(new UserAuthService()).build();

		try {
			server.start();
			System.out.println("Server started at --> " + server.getPort());
			server.awaitTermination();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
