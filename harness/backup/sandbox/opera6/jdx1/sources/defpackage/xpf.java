package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class xpf extends p10 {
    public static final xpf d = new xpf(0, 2, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        int i = ((dcb) r05Var.y(0)).a;
        List list = (List) r05Var.y(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            kw1Var.p(i3, obj);
            kw1Var.m(i3, obj);
        }
    }
}
