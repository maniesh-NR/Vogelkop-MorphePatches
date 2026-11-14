package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class tte implements xxf {
    public final /* synthetic */ wte a;

    @Override // defpackage.xxf
    public final void f() {
        wte wteVar = this.a;
        List listE = wteVar.f.e();
        if (listE.size() <= 1 || !wteVar.a()) {
            wteVar.q = true;
            wteVar.b();
            return;
        }
        HashSet hashSetI0 = CollectionsKt.i0(wteVar.g.e());
        List<bwf> list = listE;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        for (bwf bwfVar : list) {
            arrayList.add(new cwf(bwfVar, hashSetI0.contains(bwfVar)));
        }
        wteVar.n = arrayList;
        wteVar.q = false;
        wteVar.b();
    }
}
