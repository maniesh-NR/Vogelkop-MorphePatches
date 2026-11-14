package com.leanplum.callbacks;

/* loaded from: classes.dex */
public abstract class StartCallback implements Runnable {
    private boolean success;

    public abstract void onResponse(boolean z);

    @Override // java.lang.Runnable
    public void run() {
        onResponse(this.success);
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
