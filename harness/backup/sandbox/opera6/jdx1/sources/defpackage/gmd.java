package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gmd extends snd {
    public final String a;
    public final fmd b;

    public gmd(String str, fmd fmdVar) {
        this.a = str;
        this.b = fmdVar;
    }

    @Override // defpackage.snd
    public final void f(int i) throws RemoteException {
        fmd fmdVar;
        String str = this.a;
        if (str == null || (fmdVar = this.b) == null) {
            return;
        }
        fmdVar.q(i, str);
    }

    @Override // defpackage.snd
    public final void i(int i) throws RemoteException {
        fmd fmdVar;
        String str = this.a;
        if (str == null || (fmdVar = this.b) == null) {
            return;
        }
        fmdVar.r(i, str);
    }
}
