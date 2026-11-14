package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class cwo implements hko {
    public final /* synthetic */ pxo a;

    public cwo(pxo pxoVar) {
        this.a = pxoVar;
    }

    public final int a() {
        return 50;
    }

    public final int b() {
        return 1000;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m8b() {
        this.a.e.e();
        p7p p7pVar = this.a.i;
        if (p7pVar != null) {
            voo vooVar = p7pVar.a;
            p7p.e(new tep(vooVar.c, vooVar.b.a, vooVar.j, vooVar.l, Double.valueOf(vooVar.k)), vooVar.c(), p7pVar.b);
        }
        pxo pxoVar = this.a;
        ViewGroup viewGroup = pxoVar.f;
        if (viewGroup != null) {
            viewGroup.post(new ttn((Object) pxoVar, (byte) 16));
        }
    }
}
