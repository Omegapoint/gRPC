package io.grpc.examples;

import Omegapoint.OmegapointServerGrpc;
import Omegapoint.Workshop;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class Main {
    public static void main(String[] args){
        //ManagedChannel channel = ManagedChannelBuilder.forAddress("ADDRESS", "PORTNR").usePlaintext().build();
        //OmegapointServerGrpc.OmegapointServerBlockingStub x = OmegapointServerGrpc.newBlockingStub(channel);
        //System.out.println(x.getTime(Workshop.TimeRequest.newBuilder().build()));
    }
}