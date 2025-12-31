package com.KKMalysa.notification;

import com.KKMalysa.Claim.Claim;

public class Email {
    public void updateClaimStatus(Claim claim) {
        System.out.println("E-MAIL: Szkoda o numerze: " + claim.getClaimID() + " zmieniła status na: " + claim.getClaimStatus());
    }
}
