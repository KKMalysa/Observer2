package com.KKMalysa.notification;

import com.KKMalysa.Claim.Claim;

public class Email implements Observer {

    @Override
    public void update(Claim claim) {
        System.out.println("E-MAIL: Szkoda o numerze: " + claim.getClaimID() + " zmieniła status na: " + claim.getClaimStatus());
    }
}
