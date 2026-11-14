package com.leanplum.callbacks;

import com.leanplum.Var;

/* loaded from: classes.dex */
public abstract class VariableCallback<T> implements Runnable {
    private Var<T> variable;

    public abstract void handle(Var<T> var);

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.variable) {
            handle(this.variable);
        }
    }

    public void setVariable(Var<T> var) {
        this.variable = var;
    }
}
