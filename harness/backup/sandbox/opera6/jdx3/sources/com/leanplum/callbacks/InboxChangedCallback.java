package com.leanplum.callbacks;

/* loaded from: classes.dex */
public abstract class InboxChangedCallback implements Runnable {
    public abstract void inboxChanged();

    @Override // java.lang.Runnable
    public void run() {
        inboxChanged();
    }
}
