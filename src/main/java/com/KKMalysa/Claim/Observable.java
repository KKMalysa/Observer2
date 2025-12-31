package com.KKMalysa.Claim;

import com.KKMalysa.notification.Observer;

public interface Observable {

    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObservers();

}
