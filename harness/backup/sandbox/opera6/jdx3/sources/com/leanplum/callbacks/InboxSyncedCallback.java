package com.leanplum.callbacks;

/* loaded from: classes.dex */
public abstract class InboxSyncedCallback implements Runnable {
    private boolean success;

    public abstract void onForceContentUpdate(boolean z);

    @Override // java.lang.Runnable
    public void run() {
        onForceContentUpdate(this.success);
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
