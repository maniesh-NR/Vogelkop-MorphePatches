package defpackage;

import android.net.Uri;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class lz1 implements dul {
    public final /* synthetic */ tz1 a;

    public lz1(tz1 tz1Var) {
        this.a = tz1Var;
    }

    @Override // defpackage.dul
    public final Object a(jul julVar) {
        Object objA = this.a.a(julVar);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.dul
    public final Unit b() {
        return Unit.a;
    }

    @Override // defpackage.dul
    public final Object c(Uri uri, cek cekVar) {
        Object objB;
        String strM = wqm.m(uri, "s");
        return (strM == null || (objB = this.a.b(strM, cekVar)) != px5.a) ? Unit.a : objB;
    }
}
