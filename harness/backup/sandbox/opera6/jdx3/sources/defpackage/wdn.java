package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wdn {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String[] f;

    public wdn(ydn ydnVar) {
        tfn tfnVar = (tfn) ydnVar.o.i();
        this.a = (tfnVar.a & 1) != 0;
        jtg jtgVar = ydnVar.q;
        this.b = jtgVar.b();
        this.c = ru9.c(ydnVar.l).a.getBoolean("vpn_pro.kill_switch.on", false);
        this.d = tfnVar.b;
        this.e = jtgVar.d();
        String[] strArr = tfnVar.c;
        this.f = strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : null;
    }

    public final boolean a() {
        return this.a && this.b && !this.c;
    }
}
