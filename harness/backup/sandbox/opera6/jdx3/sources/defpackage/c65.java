package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class c65 implements dul {
    public final mw3 a;
    public final ddc b;
    public final dx5 c;

    public c65(mw3 mw3Var, ddc ddcVar, dx5 dx5Var) {
        this.a = mw3Var;
        this.b = ddcVar;
        this.c = dx5Var;
    }

    @Override // defpackage.dul
    public final Object a(jul julVar) {
        na2.B(this.b, (CoroutineContext) null, (rx5) null, new r3(this, new mr3(this), (mt5) null, (byte) 19), 3);
        return Unit.a;
    }

    @Override // defpackage.dul
    public final Unit b() {
        return Unit.a;
    }

    @Override // defpackage.dul
    public final Object c(Uri uri, cek cekVar) {
        na2.B(this.b, (CoroutineContext) null, (rx5) null, new r3(this, new tx0(this, wqm.m(uri, "s"), (byte) 11), (mt5) null, (byte) 19), 3);
        return Unit.a;
    }
}
