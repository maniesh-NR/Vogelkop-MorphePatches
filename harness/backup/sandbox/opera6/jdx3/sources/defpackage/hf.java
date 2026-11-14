package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class hf extends o93 {
    public final txh c;
    public final rxh d;
    public final eek e;
    public boolean f;

    public hf(txh txhVar, rxh rxhVar, eek eekVar) {
        this.c = txhVar;
        this.d = rxhVar;
        this.e = eekVar;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        gtj gtjVarD = gtj.d(view, this.c, 5000, null);
        gtjVarD.g(this.d.a(view.getResources()), new gf((Object) this, (byte) 0));
        return gtjVarD;
    }
}
