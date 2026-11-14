package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class n00 implements wv8 {
    @Override // defpackage.wv8
    public final String a(yz yzVar) {
        String str = ((w10) yzVar).u.p;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.wv8
    public final double b(yz yzVar) {
        return 0.0d;
    }

    @Override // defpackage.wv8
    public String c(yz yzVar) {
        cie cieVar = ((w10) yzVar).u;
        String str = TextUtils.isEmpty(cieVar.O) ? "Promoted" : cieVar.O;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.wv8
    public final CharSequence e(yz yzVar) {
        cie cieVar = ((w10) yzVar).u;
        if (!cieVar.s) {
            return "";
        }
        String str = cieVar.t;
        String[] strArr = aik.a;
        return str != null ? str : "";
    }

    @Override // defpackage.wv8
    public CharSequence f(yz yzVar) {
        String str = ((w10) yzVar).u.r;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.wv8
    public CharSequence g(yz yzVar) {
        String str = ((w10) yzVar).u.q;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.wv8
    public CharSequence h(yz yzVar) {
        cie cieVar = ((w10) yzVar).u;
        return (TextUtils.isEmpty(cieVar.r0) || TextUtils.isEmpty(cieVar.s0)) ? "" : cieVar.r0;
    }
}
