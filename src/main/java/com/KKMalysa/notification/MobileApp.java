package com.KKMalysa.notification;

import com.KKMalysa.Claim.Claim;

public class MobileApp {
    public void updateClaimStatus(Claim claim) {
        System.out.println("APP: Szkoda o numerze: " + claim.getClaimID() + " zmieniła status na: " + claim.getClaimStatus());
    }
}
