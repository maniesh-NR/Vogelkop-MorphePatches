package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public class btc extends l7n {
    public static final z51 d = new z51((byte) 2);
    public final fxj b = new fxj(0);
    public boolean c = false;

    @Override // defpackage.l7n
    public final void e() {
        fxj fxjVar = this.b;
        int i = fxjVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            atc atcVar = (atc) fxjVar.f(i2);
            wsc wscVar = atcVar.l;
            if (ctc.c(3)) {
                atcVar.toString();
            }
            wscVar.cancelLoad();
            wscVar.abandon();
            q59 q59Var = atcVar.n;
            if (q59Var != null) {
                atcVar.p(q59Var);
                wsc wscVar2 = (wsc) q59Var.c;
                if (q59Var.b) {
                    if (ctc.c(2)) {
                        Objects.toString(wscVar2);
                    }
                    ((ysc) q59Var.d).onLoaderReset(wscVar2);
                }
            }
            wscVar.unregisterListener(atcVar);
            wscVar.reset();
        }
        int i3 = fxjVar.c;
        Object[] objArr = fxjVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        fxjVar.c = 0;
    }
}
