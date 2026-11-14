package defpackage;

import android.view.View;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g2p implements ooo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aoo b;

    public /* synthetic */ g2p(aoo aooVar, byte b) {
        this.a = b;
        this.b = aooVar;
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((u2p) this.b).w = true;
                break;
        }
    }

    public final void b() {
        byte b = this.a;
    }

    public final void c() throws IllegalStateException {
        switch (this.a) {
            case 0:
                break;
            default:
                euo euoVar = ((t8p) this.b).u;
                if (euoVar.a == 3) {
                    euoVar.a();
                    break;
                }
                break;
        }
    }

    public final Integer d() {
        byte b = this.a;
        return null;
    }

    public final int e() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return 30;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return ((u2p) this.b).w;
            default:
                return false;
        }
    }

    public final int g() {
        switch (this.a) {
            case 0:
                return 1000;
            default:
                return 0;
        }
    }

    public final int h() {
        switch (this.a) {
            case 0:
                return 50;
            default:
                return 30;
        }
    }

    public final void i(View view) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        xho xhoVar;
        byte b = this.a;
        aoo aooVar = this.b;
        switch (b) {
            case 0:
                u2p u2pVar = (u2p) aooVar;
                u2pVar.u(2);
                u2pVar.c.a(view);
                sc scVar = u2pVar.o;
                if (scVar != null) {
                    scVar.h();
                    break;
                }
                break;
            default:
                t8p t8pVar = (t8p) aooVar;
                euo euoVar = t8pVar.u;
                int i = euoVar.a;
                if (i == 4 && !euoVar.B) {
                    euoVar.b();
                    t8pVar.x.a(22);
                    t8pVar.D = false;
                    t8p.J = true;
                    break;
                } else if (i != 3 && i != -1 && i != 7 && (xhoVar = t8pVar.z) != null && xhoVar.a()) {
                    int i2 = h8p.b[vep.A(t8pVar.B)];
                    if (i2 == 1 || (i2 == 2 && t8pVar.C == 1)) {
                        euo euoVar2 = t8pVar.u;
                        euoVar2.r = t8pVar.z.s;
                        euoVar2.c();
                        t8pVar.H = true;
                        t8p.J = true;
                    }
                    t8pVar.D = false;
                    break;
                }
                break;
        }
    }
}
