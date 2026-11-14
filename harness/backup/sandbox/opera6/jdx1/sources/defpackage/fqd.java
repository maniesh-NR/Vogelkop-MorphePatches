package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class fqd implements tqd, uqd, op5 {
    public final /* synthetic */ xqd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ fqd(xqd xqdVar, int i, int i2) {
        this.a = xqdVar;
        this.b = i;
        this.c = i2;
    }

    public final void a(xkg xkgVar, nod nodVar, List list) {
        xqd xqdVar = this.a;
        xkgVar.l(xqdVar.T0(nodVar, xkgVar, this.b), xqdVar.T0(nodVar, xkgVar, this.c), list);
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        xqd xqdVar = this.a;
        ((npd) xqdVar.a.get()).getClass();
        wqd wqdVar = xqdVar.f;
        if (wqdVar != null) {
            wqdVar.setFixedSize(this.b, this.c);
        }
    }

    public final void h(xkg xkgVar, nod nodVar) {
        xqd xqdVar = this.a;
        xkgVar.q(xqdVar.T0(nodVar, xkgVar, this.b), xqdVar.T0(nodVar, xkgVar, this.c));
    }
}
