package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hu extends ft {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu(umi umiVar, Function1 function1, int i, byte b) {
        super(umiVar, function1, i);
        this.h = b;
    }

    @Override // defpackage.ns
    public final Object b(Object obj) {
        switch (this.h) {
            case 0:
                return y1j.g(new m2m(new ec7(new d82((List) obj, (byte) 1), new yg9((byte) 9), (byte) 2), new y2((byte) 12)));
            case 1:
                return y1j.g(new m2m(y1j.c(new d82((List) obj, (byte) 1), new y2(this)), new y2((byte) 14)));
            default:
                List<lq8> list = (List) obj;
                ArrayList arrayList = new ArrayList(k95.o(list, 10));
                for (lq8 lq8Var : list) {
                    arrayList.add(new st(new qxh(lq8Var.b), lq8Var.d, lq8Var.c, (Integer) null, ht.b, lq8Var.f, lq8Var.e, (String) null, 392));
                }
                return arrayList;
        }
    }
}
