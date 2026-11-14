package defpackage;

import androidx.fragment.app.c0;
import androidx.fragment.app.h;

/* loaded from: classes.dex */
public final /* synthetic */ class vv6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h b;
    public final /* synthetic */ c0 c;

    public /* synthetic */ vv6(h hVar, c0 c0Var, byte b) {
        this.a = b;
        this.b = hVar;
        this.c = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c0 c0Var = this.c;
        h hVar = this.b;
        switch (b) {
            case 0:
                hVar.a(c0Var);
                break;
            default:
                hVar.b.remove(c0Var);
                hVar.c.remove(c0Var);
                break;
        }
    }
}
