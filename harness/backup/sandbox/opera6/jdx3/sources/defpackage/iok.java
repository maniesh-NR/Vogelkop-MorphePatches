package defpackage;

/* loaded from: classes.dex */
public final class iok implements f7f {
    public final xok a;
    public final w6j b;
    public ode c;
    public boolean d;
    public boolean e = true;

    public iok(xok xokVar, w6j w6jVar) {
        this.a = xokVar;
        this.b = w6jVar;
    }

    public final void d0(Object obj) {
        upk upkVar = (upk) obj;
        if (!this.d) {
            this.e = true;
            return;
        }
        if (this.a.D(upkVar.a) != null) {
            int i = upkVar.b;
            w6j w6jVar = this.b;
            if (i == 1) {
                w6jVar.o(-1, hr0.f);
                w6jVar.p();
            } else {
                if (i != 2) {
                    return;
                }
                w6jVar.o(-1, hr0.g);
                w6jVar.p();
            }
        }
    }
}
