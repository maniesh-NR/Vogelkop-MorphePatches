package defpackage;

import androidx.recyclerview.widget.d;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class ygc extends d {
    public final xd2 a;

    public ygc(gyg gygVar) {
        ExecutorService executorServiceNewFixedThreadPool;
        xgc xgcVar = new xgc(this);
        eme emeVar = new eme(this);
        synchronized (x7d.b) {
            executorServiceNewFixedThreadPool = x7d.c;
            if (executorServiceNewFixedThreadPool == null) {
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                x7d.c = executorServiceNewFixedThreadPool;
            }
        }
        xd2 xd2Var = new xd2(emeVar, new c37(executorServiceNewFixedThreadPool, gygVar));
        this.a = xd2Var;
        xd2Var.d.add(xgcVar);
    }

    public final Object G(int i) {
        return this.a.f.get(i);
    }

    public final void H(List list) {
        this.a.b(list, null);
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemCount() {
        return this.a.f.size();
    }
}
