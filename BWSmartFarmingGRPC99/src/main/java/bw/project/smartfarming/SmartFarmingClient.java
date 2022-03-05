package bw.project.smartfarming;

import bw.project.smartfarming.SmartAutoSystemGrpc.SmartAutoSystemBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartFarmingClient {

	public static void main(String[] args) {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();
		
		TractorRequest request = TractorRequest.newBuilder()
				.setName("Everything is working well")
				.setNumber(123)
				.build();
		
		SmartAutoSystemBlockingStub stub = SmartAutoSystemGrpc.newBlockingStub(channel);
		
		TractorReply reply = stub.tractorSensor(request);
		
		System.out.println("Message has been received"+ reply.getMessage());

	}

}
