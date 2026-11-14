package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jn9 extends e3m {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ln9 e;

    public jn9(ln9 ln9Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = ln9Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void e(y2m y2mVar) {
        y2mVar.C(this);
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void f(y2m y2mVar) {
        ln9 ln9Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            ln9Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            ln9Var.z(obj2, this.d, null);
        }
    }
}
