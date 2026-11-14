package defpackage;

import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class h18 extends zrj {
    public boolean a;
    public final /* synthetic */ e18 b;
    public final /* synthetic */ i18 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ GURL e;

    public h18(e18 e18Var, i18 i18Var, boolean z, GURL gurl) {
        this.b = e18Var;
        this.c = i18Var;
        this.d = z;
        this.e = gurl;
    }

    public final void a(na3 na3Var, int i) {
        e18 e18Var = this.b;
        if (i == 4) {
            e18Var.b(true);
        }
        e18Var.a();
        if (this.a) {
            return;
        }
        this.a = true;
        i18 i18Var = this.c;
        x5f x5fVar = i18Var.b;
        if (i != 1) {
            x5fVar.U(fq0.c);
            return;
        }
        x5fVar.U(fq0.b);
        if (this.d) {
            hd hdVar = i18Var.c;
            String str = this.e.a;
            if (hdVar.b) {
                hdVar.t(new u5f(str, (byte) 6));
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(asj asjVar) {
        boolean zBooleanValue = ((Boolean) this.c.e.invoke(((na3) asjVar).i)).booleanValue();
        e18 e18Var = this.b;
        e18Var.d = true;
        e18Var.b(!zBooleanValue);
        if (e18Var.g) {
            e18Var.a();
        }
    }
}
