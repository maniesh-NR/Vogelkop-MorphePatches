package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class c0h implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0h(f0h f0hVar, h42 h42Var, h42 h42Var2, kze kzeVar, byte b) {
        this.a = b;
        this.b = h42Var;
        this.c = h42Var2;
        this.d = kzeVar;
    }

    public /* synthetic */ c0h(vvf vvfVar, t6g t6gVar, w3g w3gVar) {
        this.a = (byte) 2;
        this.b = vvfVar;
        this.c = t6gVar;
        this.d = w3gVar;
    }

    public final void d0(Object obj) {
        byte b = this.a;
        int i = 8;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                h42 h42Var = (h42) obj4;
                kze kzeVar = (kze) obj2;
                if (((o0h) ((h42) obj3).g()).b && wqm.D(Uri.parse((String) kzeVar.g()))) {
                    i = 0;
                }
                h42Var.r(Integer.valueOf(i));
                break;
            case 1:
                h42 h42Var2 = (h42) obj4;
                kze kzeVar2 = (kze) obj2;
                if (((o0h) ((h42) obj3).g()).b && wqm.D(Uri.parse((String) kzeVar2.g()))) {
                    i = 0;
                }
                h42Var2.r(Integer.valueOf(i));
                break;
            default:
                vvf vvfVar = (vvf) obj4;
                t6g t6gVar = (t6g) obj3;
                w3g w3gVar = (w3g) obj2;
                boolean z = ((pkj) obj) == pkj.a;
                vvfVar.invoke(Boolean.valueOf(z));
                if (z) {
                    t6gVar.e.k.remove(w3gVar);
                    break;
                }
                break;
        }
    }
}
