package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class wp3 extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ t0h c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wp3(t0h t0hVar, Object obj, byte b) {
        this.b = b;
        this.c = t0hVar;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.Context, com.opera.android.BrowserActivity, java.lang.Object] */
    public final void g() {
        byte b = this.b;
        Object obj = this.d;
        t0h t0hVar = this.c;
        switch (b) {
            case 0:
                ((bq3) t0hVar).a.b((hbf) obj);
                break;
            default:
                wcj wcjVar = (wcj) obj;
                ?? r5 = ((nwf) t0hVar).b.a;
                int i = BrowserActivity.E1;
                b2l b2lVarW0 = r5.w0();
                if (b2lVarW0 != null) {
                    if (!z5i.a0(((d7l) b2lVarW0).j.getUrl())) {
                        wcjVar.a(r5);
                        break;
                    } else {
                        x22 x22Var = ((y22) r5.y.u0.get()).a;
                        if (x22Var != null) {
                            x22Var.b(b2lVarW0, new q3(r5, wcjVar, (byte) 20));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final void o() {
        byte b = this.b;
        t0h t0hVar = this.c;
        switch (b) {
            case 0:
                ((bq3) t0hVar).u(ph0.k);
                break;
            default:
                ((nwf) t0hVar).w(xl0.n);
                break;
        }
    }
}
