package com.KKMalysa.notification;

import com.KKMalysa.Claim.Claim;

public class TextMessage implements Observer {

    @Override
    public void update(Claim claim) {
        System.out.println("SMS: Szkoda o numerze: " + claim.getClaimID() + " zmieniła status na: " + claim.getClaimStatus());
    }
}
