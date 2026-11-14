package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class vbg {
    public static final crb d = phj.o(rpb.d, new m3g(8));
    public final b59 a;
    public final x5f b;
    public final x5f c;

    public vbg(Context context, umi umiVar, x5f x5fVar, x5f x5fVar2) {
        this.a = w1h.l(context, umiVar, "personalization_onboarding_reporter", new bg1[0]);
        this.b = x5fVar;
        this.c = x5fVar2;
    }

    public final void a(xcg xcgVar, boolean z) {
        nm0 nm0Var;
        List list = xcgVar.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wcg) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((wcg) obj2).a);
        }
        this.c.T0(new l51(arrayList2, (byte) 4));
        List list2 = xcgVar.a;
        String str = xcgVar.b;
        List<wcg> list3 = list;
        int iA = qbd.a(k95.o(list3, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (wcg wcgVar : list3) {
            linkedHashMap.put(wcgVar.a, new pcg(wcgVar.b ? vd0.b : vd0.c, wcgVar.c ? op0.d : op0.b));
        }
        int iOrdinal = xcgVar.d.ordinal();
        if (iOrdinal == 0) {
            nm0Var = nm0.b;
        } else if (iOrdinal == 1) {
            nm0Var = nm0.c;
        } else {
            if (iOrdinal != 2) {
                h9o.p();
                return;
            }
            nm0Var = nm0.d;
        }
        nm0 nm0Var2 = nm0Var;
        x5f x5fVar = this.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).b(new n5f(list2, str, linkedHashMap, z, nm0Var2, (byte) 0));
            x5fVar.U0(x56VarF);
        }
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.a.get()).edit();
        editorEdit.remove("snapshot");
        editorEdit.apply();
    }
}
