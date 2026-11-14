package ads_mobile_sdk;

import defpackage.aop;
import defpackage.cs5;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class pa3 implements aop {
    public final g9 a;
    public final String b;
    public final long c;

    public pa3(g9 g9Var, String str, long j) {
        this.a = g9Var;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.aop
    public final Object b(mt5 mt5Var) {
        g9 g9Var = this.a;
        g9Var.getClass();
        ConcurrentHashMap concurrentHashMap = g9Var.c;
        on7 on7Var = pn7.b;
        concurrentHashMap.put(this.b, new pn7(cs5.y0(this.c, un7.d)));
        return Unit.a;
    }
}
