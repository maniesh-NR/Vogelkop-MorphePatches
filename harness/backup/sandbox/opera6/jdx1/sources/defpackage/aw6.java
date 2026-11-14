package defpackage;

import androidx.fragment.app.c0;
import androidx.fragment.app.g;
import androidx.fragment.app.w;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class aw6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ g c;

    public /* synthetic */ aw6(c0 c0Var, g gVar, byte b) {
        this.a = b;
        this.b = c0Var;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g gVar = this.c;
        c0 c0Var = this.b;
        switch (b) {
            case 0:
                if (w.N(2)) {
                    Objects.toString(c0Var);
                }
                c0Var.c(gVar);
                break;
            default:
                if (w.N(2)) {
                    Objects.toString(c0Var);
                }
                c0Var.c(gVar);
                break;
        }
    }
}
