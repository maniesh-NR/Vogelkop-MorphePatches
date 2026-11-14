package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class z65 {
    public final String a;
    public final Callback b;
    public final Runnable c;
    public final yqd d;
    public final boolean e;
    public final kl0 f;
    public final pn g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ byte j;
    public final Object k;

    public z65(Context context, hu5 hu5Var, hpd hpdVar) throws Resources.NotFoundException {
        this.j = (byte) 1;
        String string = context.getString(2132017591);
        bxc bxcVar = (bxc) cxc.t(context).i();
        String string2 = context.getString(2132018516, string);
        String strA = bxcVar.a(20, context);
        strA = strA == null ? context.getString(2132020186) : strA;
        String strA2 = bxcVar.a(21, context);
        strA2 = strA2 == null ? context.getString(2132020184, string) : strA2;
        String strA3 = bxcVar.a(22, context);
        strA3 = strA3 == null ? context.getString(2132020185, string) : strA3;
        dm6 dm6Var = new dm6(string2, strA, strA2, strA3);
        this(strA3, hu5Var, hpdVar, kl0.d);
        this.k = dm6Var;
    }

    public z65(Context context, p10 p10Var, hu5 hu5Var, jbd jbdVar, yqd yqdVar, pn pnVar) {
        this.j = (byte) 0;
        String string = context.getString(p10Var.b);
        String string2 = context.getString(p10Var.c);
        String string3 = context.getString(2132020022);
        y65 y65Var = new y65(string, string2, string3);
        this(string3, hu5Var, jbdVar, yqdVar, p10Var.c(), kl0.g, pnVar);
        this.k = y65Var;
    }

    public z65(Context context, xx1 xx1Var, yqd yqdVar) {
        this.j = (byte) 2;
        String string = context.getString(2132017591);
        String string2 = context.getString(2132020189);
        String string3 = context.getString(2132020187, string);
        String string4 = context.getString(2132020188);
        t2f t2fVar = new t2f(string2, string3, string4);
        this(string4, xx1Var, yqdVar, kl0.f);
        this.k = t2fVar;
    }

    public /* synthetic */ z65(String str, Callback callback, Runnable runnable, kl0 kl0Var) {
        this(str, callback, runnable, null, true, kl0Var, null);
    }

    public z65(String str, Callback callback, Runnable runnable, yqd yqdVar, boolean z, kl0 kl0Var, pn pnVar) {
        this.a = str;
        this.b = callback;
        this.c = runnable;
        this.d = yqdVar;
        this.e = z;
        this.f = kl0Var;
        this.g = pnVar;
    }
}
