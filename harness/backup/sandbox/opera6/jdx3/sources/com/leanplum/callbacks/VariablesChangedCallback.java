package com.leanplum.callbacks;

/* loaded from: classes.dex */
public abstract class VariablesChangedCallback implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        variablesChanged();
    }

    public abstract void variablesChanged();
}
