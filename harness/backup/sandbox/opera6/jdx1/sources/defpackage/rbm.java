package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class rbm {

    @NotNull
    public static final pbm Companion = new pbm();
    public final Context a;
    public final ufm b;
    public final Integer c;
    public final obm d;
    public final boolean e;
    public final zyk f = z4c.b(new qbm(this, (byte) 0));
    public final zyk g = z4c.b(new qbm(this, (byte) 1));

    public rbm(Context context, ufm ufmVar, Integer num, obm obmVar, boolean z) {
        this.a = context;
        this.b = ufmVar;
        this.c = num;
        this.d = obmVar;
        this.e = z;
    }

    public final void a(x23 x23Var, m53 m53Var) {
        byte b = x23Var.b;
        xpj xpjVar = new xpj();
        xpjVar.H = xpj.K;
        xpjVar.v = new qs7((byte) 11);
        xpjVar.c = 300L;
        obm obmVar = this.d;
        xpjVar.c(obmVar);
        h3m.a(obmVar, xpjVar);
        obmVar.setVisibility(b);
        bo8 bo8Var = new bo8(x23Var.a);
        bo8Var.c = 300L;
        zyk zykVar = this.f;
        bo8Var.c((FrameLayout) zykVar.getValue());
        if (m53Var != null) {
            bo8Var.b(new kn9(m53Var, (byte) 1));
        }
        h3m.a((FrameLayout) zykVar.getValue(), bo8Var);
        ((FrameLayout) zykVar.getValue()).setVisibility(b);
    }
}
