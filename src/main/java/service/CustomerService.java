package service;

import io.grpc.stub.StreamObserver;
import org.first.User;
import org.first.customerGrpc;

public class CustomerService extends customerGrpc.customerImplBase {
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {

        String username = request.getUsername();
        String msg = request.getMsg();

        User.APIResponse.Builder response = User.APIResponse.newBuilder();

        if (username.equals(msg)){
            // success
            response.setResponseCode(1).setResponseMessage("Username and Msg match");
        } else {
            // fail
            response.setResponseCode(0).setResponseMessage("Not the same strings");
        }
        // Extract response
        responseObserver.onNext(response.build());
        // Disconnect terminal and API connection
        responseObserver.onCompleted();

    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {

    }
}
