package com.KKMalysa;

import com.KKMalysa.Claim.Claim;
import com.KKMalysa.Claim.ClaimStatus;
import com.KKMalysa.notification.Email;
import com.KKMalysa.notification.MobileApp;
import com.KKMalysa.notification.TextMessage;

public class Main {
    public static void main(String[] args) {

        Claim claim1 = new Claim(001L, ClaimStatus.SUBMITTED);

        TextMessage message = new TextMessage();
        MobileApp app = new MobileApp();
        Email email = new Email();

        System.out.println("-----------------------------------");
        claim1.registerObserver(message);
        claim1.registerObserver(app);
        claim1.registerObserver(email);

        claim1.notifyObservers();
        System.out.println("-----------------------------------");
        claim1.unregisterObserver(message);
        claim1.changeClaimStatus(ClaimStatus.ADDITIONAL_INFORMATION_REQUIRED);
        System.out.println("-----------------------------------");

    }
}