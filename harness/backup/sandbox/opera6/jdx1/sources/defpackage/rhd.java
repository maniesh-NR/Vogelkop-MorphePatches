package defpackage;

import android.view.Surface;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class rhd implements did, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rhd(Object obj, Object obj2, int i, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        xqd xqdVar = (xqd) this.b;
        Surface surface = (Surface) this.e;
        xkg xkgVar = (xkg) obj;
        ((npd) xqdVar.a.get()).getClass();
        if (surface == null) {
            xkgVar.setVideoSurfaceHolder(null);
            xqdVar.f = null;
        } else {
            wqd wqdVar = new wqd(surface, this.c, this.d);
            xqdVar.f = wqdVar;
            xkgVar.setVideoSurfaceHolder(wqdVar);
        }
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                int i2 = this.d;
                ssaVar.Q(((gid) obj2).c, i, (Surface) obj, this.c, i2);
                break;
            default:
                gid gidVar = (gid) obj2;
                List list = (List) obj;
                gidVar.getClass();
                z0b z0bVarP = h1b.p();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    z0bVarP.c(((qjd) list.get(i3)).c(true));
                }
                k14 k14Var = new k14(z0bVarP.g());
                m4j m4jVar = gidVar.n;
                m4jVar.getClass();
                int i4 = m4jVar.a.c;
                lid lidVar = gidVar.c;
                int i5 = this.c;
                int i6 = this.d;
                if (i4 >= 2) {
                    ssaVar.o0(lidVar, i, i5, i6, k14Var);
                    break;
                } else {
                    ssaVar.v0(lidVar, i, i6, k14Var);
                    ssaVar.u(gidVar.c, i, i5, i6);
                    break;
                }
        }
    }
}
