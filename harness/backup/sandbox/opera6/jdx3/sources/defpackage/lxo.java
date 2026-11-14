package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class lxo extends k8 implements mro {
    public final bzo o;
    public final dcl p;
    public final w6j q;
    public y9p r;
    public final tmo s;

    public lxo(Context context, bzo bzoVar, w6j w6jVar, dn dnVar, bl blVar, fio fioVar) {
        super(dnVar);
        this.o = bzoVar;
        this.q = w6jVar;
        this.p = new dcl(context, new z4k((Object) this, (byte) 20), blVar, fioVar);
        tmo tmoVar = new tmo(this, (byte) 1);
        this.s = tmoVar;
        i7c.b(tmoVar, new ttn((Object) this, (byte) 15));
    }

    @Override // defpackage.mro
    public final void unregister() {
        y9p y9pVar = this.r;
        if (y9pVar != null) {
            y9pVar.unregister();
            upj.j(this.r);
        }
    }
}
