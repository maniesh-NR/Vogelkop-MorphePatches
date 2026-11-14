package defpackage;

import J.N;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class r25 {
    public final String a;
    public final rxh b;
    public final rxh c;
    public final int d;
    public final a35 e;

    public r25(String str, rxh rxhVar, rxh rxhVar2, int i, a35 a35Var) {
        this.a = str;
        this.b = rxhVar;
        this.c = rxhVar2;
        this.d = i;
        this.e = a35Var;
    }

    public void a(s25 s25Var, Runnable runnable) {
        z zVar = new z(runnable);
        yqd yqdVarB = zVar.b();
        i7f i7fVar = lx3.a;
        N.MZpN8dyq(yqdVarB);
        a74 a74Var = ((t9f) xne.b.get()).k;
        if (a74Var != null) {
            try {
                a74Var.a.evictAll();
            } catch (IOException unused) {
            }
        }
        N.MFg$8iJw();
        fp1 fp1Var = s25Var.a;
        String[] strArr = OperaApplication.K;
        wun wunVar = (wun) ((OperaApplication) fp1Var.getApplicationContext()).r.o1.get();
        wunVar.g.i();
        wunVar.c.clear();
        wunVar.d.clear();
        wunVar.d();
        eoj eojVar = (eoj) ((OperaApplication) s25Var.a.getApplicationContext()).r.S0.get();
        eojVar.c.removeAll();
        eojVar.d.removeAll();
        zVar.e();
    }

    public int b() {
        return 0;
    }

    public abstract void c(s25 s25Var, Callback callback);

    public boolean d(s25 s25Var) {
        return true;
    }
}
