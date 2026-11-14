package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.cs5;
import defpackage.mip;
import defpackage.r7p;
import defpackage.xzh;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class h9 implements r7p {
    public final String a;
    public final defpackage.r83 b;
    public final g9 c;
    public final mip d;

    public h9(String str, defpackage.r83 r83Var, g9 g9Var, mip mipVar) {
        this.a = str;
        this.b = r83Var;
        this.c = g9Var;
        this.d = mipVar;
    }

    @Override // defpackage.r7p
    public final Object a(n13 n13Var, a2 a2Var, xzh xzhVar, mt5 mt5Var) {
        String strM = this.b.m();
        this.d.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g9 g9Var = this.c;
        g9Var.getClass();
        pn7 pn7Var = (pn7) g9Var.c.get(this.a);
        if (pn7Var != null && strM != null) {
            ConcurrentHashMap concurrentHashMap = g9Var.d;
            on7 on7Var = pn7.b;
            concurrentHashMap.put(strM, new pn7(pn7.l(cs5.y0(jElapsedRealtime, un7.d), pn7Var.a)));
        }
        return Unit.a;
    }
}
