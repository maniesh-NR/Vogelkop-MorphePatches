package defpackage;

import com.opera.android.BrowserActivity;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class xg implements w6f {
    public final /* synthetic */ byte a;
    public final Iterable b;
    public Object c;

    public xg() {
        this.a = (byte) 2;
        this.c = new LinkedHashSet();
        this.b = new i7f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xg(BrowserActivity browserActivity, k6l k6lVar) {
        this.a = (byte) 1;
        this.c = new gj9(false);
        this.b = new h7f();
        List list = fj9.a;
        if (browserActivity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            k6lVar.a(new qz(this, (byte) 7));
        }
    }

    public xg(k6l k6lVar) {
        this.a = (byte) 0;
        this.c = k6lVar;
        this.b = new h7f();
        k6lVar.F(new wg(this));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        byte b = this.a;
        Iterable iterable = this.b;
        switch (b) {
            case 0:
                a((a2l) obj);
                break;
            case 1:
                ((h7f) iterable).b((pbf) obj);
                break;
            default:
                fj3 fj3Var = (fj3) obj;
                ((i7f) iterable).b(fj3Var);
                Iterator it = ((LinkedHashSet) this.c).iterator();
                while (it.hasNext()) {
                    fj3Var.a((tch) it.next());
                }
                break;
        }
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        byte b = this.a;
        Iterable iterable = this.b;
        switch (b) {
            case 0:
                b((a2l) obj);
                break;
            case 1:
                ((h7f) iterable).c((pbf) obj);
                break;
            default:
                ((i7f) iterable).c((fj3) obj);
                break;
        }
    }

    public final void a(a2l a2lVar) {
        ((h7f) this.b).b(a2lVar);
        b2l b2lVar = ((k6l) this.c).o;
        if (b2lVar != null) {
            ((d7l) b2lVar).F(a2lVar);
        }
    }

    public final void b(a2l a2lVar) {
        ((h7f) this.b).c(a2lVar);
        b2l b2lVar = ((k6l) this.c).o;
        if (b2lVar != null) {
            ((d7l) b2lVar).H(a2lVar);
        }
    }

    public final void c(boolean z) {
        if (z != ((gj9) this.c).a) {
            gj9 gj9Var = new gj9(z);
            this.c = gj9Var;
            h7f h7fVar = (h7f) this.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                vbf vbfVar = ((pbf) g7fVarH.next()).a;
                vbfVar.q();
                vbfVar.r(16384L, gj9Var.a);
                vbfVar.u();
            }
        }
    }
}
