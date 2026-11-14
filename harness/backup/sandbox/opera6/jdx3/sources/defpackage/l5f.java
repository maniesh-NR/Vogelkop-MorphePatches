package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class l5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ km0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ xc0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ Long k;

    public /* synthetic */ l5f(dd0 dd0Var, String str, String str2, ArrayList arrayList, km0 km0Var, boolean z, xc0 xc0Var, String str3, Long l, Long l2, byte b) {
        this.a = b;
        this.b = dd0Var;
        this.c = str;
        this.d = str2;
        this.e = arrayList;
        this.f = km0Var;
        this.g = z;
        this.h = xc0Var;
        this.i = str3;
        this.j = l;
        this.k = l2;
    }

    public final Object invoke(Object obj) {
        hf0 hf0Var;
        hf0 hf0Var2;
        switch (this.a) {
            case 0:
                nd0 nd0Var = (nd0) obj;
                l5f l5fVar = new l5f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (byte) 1);
                nd0Var.a.getClass();
                bd0 bd0Var = new bd0(2443, -1, 10);
                md0 md0Var = nd0Var.b;
                List list = (List) md0Var.n(1);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    md0Var.q(1, 1, arrayList);
                    hf0Var = new hf0(md0Var, 1, arrayList);
                } else {
                    hf0Var = new hf0(md0Var, 1, list);
                }
                hf0Var.add(bd0Var);
                l5fVar.invoke(new cd0(bd0Var));
                break;
            default:
                bd0 bd0Var2 = ((cd0) obj).a;
                bd0Var2.q(0, 1, this.b);
                String str = this.c;
                if (str != null) {
                    bd0Var2.q(1, 1, str);
                }
                String str2 = this.d;
                if (str2 != null) {
                    bd0Var2.q(2, 1, str2);
                }
                List list2 = (List) bd0Var2.n(3);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    bd0Var2.q(3, 1, arrayList2);
                    hf0Var2 = new hf0(bd0Var2, 3, arrayList2);
                } else {
                    hf0Var2 = new hf0(bd0Var2, 3, list2);
                }
                hf0Var2.addAll(this.e);
                km0 km0Var = this.f;
                if (km0Var != null) {
                    bd0Var2.q(4, 1, km0Var);
                }
                bd0Var2.r(5, 1, this.g);
                xc0 xc0Var = this.h;
                if (xc0Var != null) {
                    bd0Var2.q(6, 1, xc0Var);
                }
                String str3 = this.i;
                if (str3 != null) {
                    bd0Var2.q(7, str3 != null ? 1 : 0, str3);
                }
                Long l = this.j;
                if (l != null) {
                    bd0Var2.p(8, 1, l.longValue());
                }
                Long l2 = this.k;
                if (l2 != null) {
                    bd0Var2.p(9, 1, l2.longValue());
                }
                break;
        }
        return Unit.a;
    }
}
