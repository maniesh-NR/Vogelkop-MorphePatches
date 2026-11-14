package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class okc {
    public final /* synthetic */ qkc a;

    public okc(qkc qkcVar) {
        this.a = qkcVar;
    }

    public final void a(View view, zmc zmcVar) {
        qkc qkcVar = this.a;
        wub wubVar = qkcVar.f;
        ((oz3) ((tkc) wubVar.a).g.invoke()).b(new ioc(view, new gv8(qkcVar, zmcVar, (byte) 20)), ijm.a);
    }

    public final void b(zmc zmcVar) {
        qkc qkcVar = this.a;
        js6 js6Var = qkcVar.b;
        boolean z = qkcVar.l;
        yzb yzbVar = qkcVar.h;
        js6Var.b = true;
        ((SharedPreferences) ((rs6) js6Var.h).a.get()).edit().putBoolean("notification_interacted", true).apply();
        is6 is6Var = new is6((Object) js6Var, (Object) yzbVar, z, (Object) zmcVar, (byte) 0);
        vs6 vs6Var = (vs6) ((j4c) js6Var.f).get();
        long j = zmcVar.a().a;
        zmcVar.a().getClass();
        joc jocVar = new joc(j, apc.c);
        e2f e2fVar = vs6Var.f;
        na2.B(e2fVar.a, (CoroutineContext) null, (rx5) null, new jj4(e2fVar, jocVar, is6Var, (mt5) null, (byte) 12), 3);
    }
}
