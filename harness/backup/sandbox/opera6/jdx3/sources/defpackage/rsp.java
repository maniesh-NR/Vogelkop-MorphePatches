package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class rsp {
    public final jup a;
    public final erp b;
    public final Context c;

    public rsp(jup jupVar, erp erpVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = jupVar;
        this.b = erpVar;
        this.c = context;
    }

    public final synchronized void a(e89 e89Var) {
        erp erpVar = this.b;
        synchronized (erpVar) {
            try {
                erpVar.a.f("registerListener", new Object[0]);
                erpVar.d.add(e89Var);
                erpVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
