package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.CustomerService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String args[]) throws IOException, InterruptedException {
        // Create server on port 9091
        Server server = ServerBuilder.forPort(9091).addService(new CustomerService()).build();
        server.start();

        System.out.println("Server started on port: "+server.getPort());

        server.awaitTermination();
    }
}
