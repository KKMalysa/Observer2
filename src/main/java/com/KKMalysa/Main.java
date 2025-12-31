package com.KKMalysa;

import com.KKMalysa.Claim.Claim;
import com.KKMalysa.Claim.ClaimStatus;
import com.KKMalysa.notification.Email;
import com.KKMalysa.notification.MobileApp;
import com.KKMalysa.notification.TextMessage;

public class Main {
    public static void main(String[] args) {

        Claim claim1 = new Claim(1003040L, ClaimStatus.SUBMITTED);

        TextMessage message = new TextMessage();
        MobileApp app = new MobileApp();
        Email email = new Email();

        System.out.println("-----------------------------------");
        message.updateClaimStatus(claim1);
        app.updateClaimStatus(claim1);
        email.updateClaimStatus(claim1);
        System.out.println("-----------------------------------");

    }
}