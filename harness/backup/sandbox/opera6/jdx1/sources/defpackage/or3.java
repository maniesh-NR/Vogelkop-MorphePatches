package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class or3 implements Function1 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vfd d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ or3(ifg ifgVar, pfd pfdVar, vfd vfdVar, int i, int i2, qr3 qr3Var) {
        this.e = ifgVar;
        this.f = pfdVar;
        this.d = vfdVar;
        this.b = i;
        this.c = i2;
        this.g = qr3Var;
    }

    public /* synthetic */ or3(ifg[] ifgVarArr, db5 db5Var, int i, int i2, vfd vfdVar, int[] iArr) {
        this.e = ifgVarArr;
        this.f = db5Var;
        this.b = i;
        this.c = i2;
        this.d = vfdVar;
        this.g = iArr;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.g;
        vfd vfdVar = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                nr3.d((p1d) obj, (ifg) obj4, (pfd) obj3, vfdVar.getLayoutDirection(), this.b, this.c, ((qr3) obj2).a);
                break;
            default:
                ifg[] ifgVarArr = (ifg[]) obj4;
                db5 db5Var = (db5) obj3;
                int[] iArr = (int[]) obj2;
                p1d p1dVar = (p1d) obj;
                int length = ifgVarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    ifg ifgVar = ifgVarArr[i];
                    int i3 = i2 + 1;
                    Object objP = ifgVar.p();
                    l9i l9iVar = objP instanceof l9i ? (l9i) objP : null;
                    d2c layoutDirection = vfdVar.getLayoutDirection();
                    wxe wxeVar = l9iVar != null ? l9iVar.c : null;
                    int i4 = this.b;
                    p1d.f(p1dVar, ifgVar, wxeVar != null ? wxeVar.g(i4, ifgVar.a, layoutDirection, ifgVar, this.c) : db5Var.b.a(ifgVar.a, i4, layoutDirection), iArr[i2]);
                    i++;
                    i2 = i3;
                }
                break;
        }
        return Unit.a;
    }
}
