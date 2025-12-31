package com.KKMalysa.Claim;

public class Claim {

    private Long claimID;
    private ClaimStatus claimStatus;

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


}
