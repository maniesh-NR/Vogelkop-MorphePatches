package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class f10 extends n00 {
    public final View a;

    public f10(View view) {
        this.a = view;
    }

    @Override // defpackage.n00, defpackage.wv8
    public final String c(yz yzVar) {
        String str = ((w10) yzVar).u.q;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.n00, defpackage.wv8
    public final CharSequence f(yz yzVar) {
        return "";
    }

    @Override // defpackage.n00, defpackage.wv8
    public final CharSequence g(yz yzVar) {
        String str = ((w10) yzVar).u.r;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.n00, defpackage.wv8
    public final CharSequence h(yz yzVar) {
        cie cieVar = ((w10) yzVar).u;
        return cieVar.d == w06.f ? "" : g10.o0(cieVar, this.a);
    }
}
