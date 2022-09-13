package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.first.User;
import org.first.customerGrpc;

public class GrpcClient {

    public static void main(String[] args){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("Localhost", 9091).usePlaintext().build();

        // stub from proto file
        customerGrpc.customerBlockingStub stub = customerGrpc.newBlockingStub(channel);
        // Login request
        User.LoginRequest request = User.LoginRequest.newBuilder().setUsername("Hello gRPC").setMsg("Hello gRPC").build();

        User.APIResponse response = stub.login(request);

        System.out.println("Response: "+response.getResponseMessage());

    }
}
