package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zkd extends lim {
    public final x5f a;
    public final mv1 b;
    public tjg c;
    public final xkd d;
    public final we7 e;
    public ykd f;
    public x79 g;
    public long h;
    public int i;
    public boolean j;
    public String k;

    public zkd(x5f x5fVar, mv1 mv1Var) {
        ve7 ve7Var = new ve7(this, (byte) 1);
        this.d = new xkd(this);
        this.e = new we7(this, ve7Var, (byte) 1);
        this.a = x5fVar;
        this.b = mv1Var;
    }

    public static rh0 R(tjg tjgVar, qjd qjdVar) {
        tjgVar.getClass();
        Uri uriD0 = sfe.d0(qjdVar.e);
        if (uriD0 == null) {
            mjd mjdVar = qjdVar.b;
            uriD0 = mjdVar != null ? mjdVar.a : Uri.parse("");
        }
        return wqm.D(uriD0) ? rh0.c : rh0.b;
    }

    public final void S(ykd ykdVar, x79 x79Var) {
        long j;
        hf0 hf0Var;
        ykd ykdVar2 = this.f;
        if (ykdVar2 == null || !ykdVar2.equals(ykdVar)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ykd ykdVar3 = this.f;
            if (ykdVar3 != null) {
                long j2 = jUptimeMillis - this.h;
                uh0 uh0Var = ykdVar3.a;
                rh0 rh0Var = ykdVar3.b;
                sh0 sh0Var = ykdVar3.c;
                qh0 qh0Var = ykdVar3.d;
                boolean z = ykdVar3.e;
                x5f x5fVar = this.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    j = jUptimeMillis;
                    th0 th0Var = new th0(2443, -1, 4);
                    vh0 vh0Var = (vh0) th0Var.n(1);
                    if (vh0Var == null) {
                        th0Var.q(1, 1, zpa.A());
                        vh0Var = (vh0) th0Var.n(1);
                    }
                    vh0Var.q(1, 1, rh0Var);
                    vh0Var.q(0, 1, sh0Var);
                    vh0Var.q(2, qh0Var == null ? 0 : 1, qh0Var);
                    th0Var.q(2, 1, uh0Var);
                    th0Var.p(0, 1, j2);
                    th0Var.r(3, 1, z);
                    x56 x56VarF = zpa.F();
                    uc0 uc0VarA = x56VarF.A(zpaVar);
                    List list = (List) uc0VarA.n(5);
                    if (list == null || list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        uc0VarA.q(5, 1, arrayList);
                        hf0Var = new hf0(uc0VarA, 5, arrayList);
                    } else {
                        hf0Var = new hf0(uc0VarA, 5, list);
                    }
                    hf0Var.add(th0Var);
                    x5fVar.U0(x56VarF);
                } else {
                    j = jUptimeMillis;
                }
                x79 x79Var2 = this.g;
                if (x79Var2 != null) {
                    long j3 = this.h;
                    long j4 = j - j3;
                    on7 on7Var = pn7.b;
                    un7 un7Var = un7.d;
                    long jY0 = cs5.y0(j3, un7Var);
                    long jY02 = cs5.y0(j4, un7Var);
                    uy8 uy8Var = (uy8) x79Var2.a;
                    long jF = pn7.f(jY0);
                    long jF2 = pn7.f(jY02);
                    String str = (String) x79Var2.b;
                    String str2 = (String) x79Var2.d;
                    uy8Var.getClass();
                    uy8Var.c(new ky8(jF, jF2, str, str2));
                }
            } else {
                j = jUptimeMillis;
            }
            this.f = ykdVar;
            this.h = j;
            this.g = x79Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkd.T():void");
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.i--;
        T();
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.i++;
        T();
    }
}
