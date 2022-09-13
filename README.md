# grpc-trials
Collection of programs using gRPC

# First client/server implementation
gRPC service routine to check if client sent equal strings to server using Maven.
## Coding Steps:
1. Add dependencies and plugins in pom.xml (at projet root) file.
2. Add .proto file at (grpc-trials/src/main/resources/<filename>.proto) with service and message structures.
3. Maven [validate,install] to generate class files using the .proto file.
4. Create service logic (grpc-trials/src/main/java/service/CustomerServic.,java), i.e., Override service methods set by .proto file.
5. Create server (grpc-trials/src/main/java/server/GrpcServer.java) and specify port to await termination by user.
6. Create client (grpc-trials/src/main/java/client/GrpcClient.java) and specify same port as server and use ManagedChannelBuilder to connect to server. Create a blocking stub to call relevant service method.
## Instructions to run:
1. Run grpc-trials/src/main/java/server/GrpcServer.java
2. Run grpc-trials/src/main/java/client/GrpcClient.java

**Server logic: grpc-trials/src/main/java/service/CustomerService.java*
