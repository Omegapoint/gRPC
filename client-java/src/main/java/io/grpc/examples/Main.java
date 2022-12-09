package io.grpc.examples;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main {
    public static void main(String[] args){
        //Skapa en channel mot en server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("grpc.larssonoliver.com", 2337).usePlaintext().build();
        //skapa en stub mot server
        WorkshopServiceGrpc.WorkshopServiceBlockingStub x = WorkshopServiceGrpc.newBlockingStub(channel);
        //nå servern via stubben och hämta svaren
        System.out.println(x.getCurrentTime(new Workshop.TimeRequest()).getCurrentTime());
    }
}
