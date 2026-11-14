package defpackage;

import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class jid implements kid, mpd {
    public final /* synthetic */ cig a;

    public /* synthetic */ jid(cig cigVar) {
        this.a = cigVar;
    }

    @Override // defpackage.mpd
    public final void c(mod modVar, int i) {
        modVar.i(i, this.a);
    }

    public final void f(gid gidVar) {
        boolean z;
        boolean z2;
        ghd ghdVar = gidVar.a;
        if (gidVar.r()) {
            cig cigVar = gidVar.x;
            cig cigVar2 = this.a;
            if (Objects.equals(cigVar, cigVar2)) {
                return;
            }
            gidVar.x = cigVar2;
            cig cigVar3 = gidVar.y;
            cig cigVarD = gid.d(gidVar.w, cigVar2);
            gidVar.y = cigVarD;
            boolean zEquals = cigVarD.equals(cigVar3);
            char c = 1;
            if (zEquals) {
                z = false;
                z2 = false;
            } else {
                csh cshVar = gidVar.t;
                csh cshVar2 = gidVar.u;
                csh cshVarH = gid.H(gidVar.s, gidVar.r, gidVar.v, gidVar.y, gidVar.I);
                gidVar.t = cshVarH;
                gidVar.u = gid.G(cshVarH, gidVar.r, gidVar.I, gidVar.v, gidVar.y);
                z = !gidVar.t.equals(cshVar);
                z2 = !gidVar.u.equals(cshVar2);
                gidVar.i.i(13, new phd(gidVar, c == true ? 1 : 0));
            }
            if (z2) {
                ghdVar.getClass();
                z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                ghdVar.e.getClass();
            }
            if (z) {
                ghdVar.getClass();
                z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                ghdVar.e.getClass();
            }
        }
    }
}
