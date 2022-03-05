package bw.project.smartfarming;

import java.io.IOException;

import bw.project.smartfarming.SmartAutoSystemGrpc.SmartAutoSystemImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartFarmingServer extends SmartAutoSystemImplBase{

	public static void main(String[] args) {
		
		SmartFarmingServer farmingservice = new SmartFarmingServer();
		
		int port = 50051;
		
		try {
			Server server = ServerBuilder.forPort(port)
					.addService(farmingservice)
					.build()
					.start();
			
			System.out.println("server is waiting for requests from the client");
			server.awaitTermination();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void tractorSensor(TractorRequest request, StreamObserver<TractorReply> responseObserver) {
		
		
		String name = request.getName();
		int number = request.getNumber();
		System.out.println("Client request accepted pass over the desired farming information"+ name +"," + number+"");
		
		String response_text= "If Sensor detects hazards don't use them for farming, if no problems arise keep working";
		TractorReply reply = TractorReply.newBuilder().setMessage(response_text);
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
	}
	
	public void irrigationSensor(IrrigationRequest request, StreamObserver<IrrigationReply> responseObserver) {
		
		String name = request.getName();
		int number = request.getNumber();
		
		String response_text= "If Sensor detects hazards don't use them for farming, if no problems arise keep working";
		TractorReply reply = IrrigationReply.newBuilder().setMessage(response_text);
		
		responseObserver.onCompleted();
	}
	
	public void livestockSensor(LivestockRequest request, StreamObserver<LivestockReply> responseObserver) {
		
		String name = request.getName();
		int number = request.getNumber();
		
		String response_text= "If Sensor detects hazards don't use them for farming, if no problems arise keep working";
		TractorReply reply = LivestockReply.newBuilder().setMessage(response_text);
		
		responseObserver.onCompleted();
	}

}
