package defpackage;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class tni implements w6f {
    public static final tni c = new tni();
    public final i7f a = new i7f();
    public boolean b = true;

    @Override // defpackage.w6f
    public final void F(Object obj) {
        a((sni) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        c((sni) obj);
    }

    public final void a(sni sniVar) {
        this.a.b(sniVar);
    }

    public final void b(Configuration configuration) {
        boolean z = true;
        if (this != c && configuration.orientation != 1) {
            z = false;
        }
        if (this.b != z) {
            this.b = z;
            g7f g7fVar = new g7f(this.a);
            while (g7fVar.hasNext()) {
                ((sni) g7fVar.next()).Y(z);
            }
        }
    }

    public final void c(sni sniVar) {
        this.a.c(sniVar);
    }
}
