package com.KKMalysa.Claim;

import com.KKMalysa.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Claim implements Observable {

    private Long claimID;
    private ClaimStatus claimStatus;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public Claim(Long claimID, ClaimStatus claimStatus) {
        this.claimID = claimID;
        this.claimStatus = claimStatus;
    }

    public Long getClaimID() {
        return claimID;
    }

    public void setClaimID(Long claimID) {
        this.claimID = claimID;
    }

    public ClaimStatus getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(ClaimStatus claimStatus) {
        this.claimStatus = claimStatus;
    }


    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.update(this);
        }
    }

    public void changeClaimStatus(ClaimStatus newClaimStatus) {
        setClaimStatus(newClaimStatus);
        notifyObservers();
    }
}
