package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class n9i implements Function1 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n9i(u7o u7oVar, int i, ifg ifgVar, int i2, vfd vfdVar) {
        this.d = u7oVar;
        this.b = i;
        this.e = ifgVar;
        this.c = i2;
        this.f = vfdVar;
    }

    public /* synthetic */ n9i(ifg[] ifgVarArr, o9i o9iVar, int i, int i2, int[] iArr) {
        this.d = ifgVarArr;
        this.e = o9iVar;
        this.b = i;
        this.c = i2;
        this.f = iArr;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ifg[] ifgVarArr = (ifg[]) obj4;
                o9i o9iVar = (o9i) obj3;
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
                    wxe wxeVar = l9iVar != null ? l9iVar.c : null;
                    int i4 = this.b;
                    p1d.f(p1dVar, ifgVar, iArr[i2], wxeVar != null ? wxeVar.g(i4, ifgVar.b, d2c.a, ifgVar, this.c) : o9iVar.b.a(ifgVar.b, i4));
                    i++;
                    i2 = i3;
                }
                break;
            default:
                p1d.g((p1d) obj, (ifg) obj3, ((ybb) ((u7o) obj4).q.invoke(new gcb(((this.b - r2.a) << 32) | ((this.c - r2.b) & 4294967295L)), ((vfd) obj2).getLayoutDirection())).a);
                break;
        }
        return Unit.a;
    }
}
