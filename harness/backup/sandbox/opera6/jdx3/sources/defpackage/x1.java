package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class x1 {
    public static final x1 a = new x1();

    public static String a(String str, y1... y1VarArr) {
        List listB = e82.B(y1VarArr);
        ArrayList arrayList = new ArrayList(k95.o(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((y1) it.next()).a);
        }
        j2 j2Var = new j2(arrayList);
        ArrayList arrayList2 = new ArrayList(k95.o(listB, 10));
        Iterator it2 = listB.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((y1) it2.next()).b);
        }
        if (!j2Var.c.e(arrayList2)) {
            qp2.o("Failed requirement.");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(k95.o(listB, 10));
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((y1) it3.next()).a);
        }
        uqh.a(List.class);
        if (!arrayList3.isEmpty()) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                if (((l2) obj).a()) {
                    break;
                }
            }
        }
        String strConcat = str.concat("(" + CollectionsKt.P(arrayList3, ",", (CharSequence) null, (String) null, 0, i2.b, 30) + ")");
        int i2 = gaj.a;
        return pik.D(8, naa.g(aib.J(strConcat.getBytes(Charsets.UTF_8)))).concat(j2Var.e(arrayList2));
    }

    public static String b(String str) {
        if (str.length() <= 64) {
            return StringsKt.S(64, str);
        }
        bxl.d(sko.k("Can't pad '", str, "' as it's longer than 64 already."));
        return null;
    }
}
