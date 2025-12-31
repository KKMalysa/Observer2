package com.KKMalysa.notification;

import com.KKMalysa.Claim.Claim;

public class TextMessage {
    public void updateClaimStatus(Claim claim) {
        System.out.println("SMS: Szkoda o numerze: " + claim.getClaimID() + " zmieniła status na: " + claim.getClaimStatus());
    }
}
