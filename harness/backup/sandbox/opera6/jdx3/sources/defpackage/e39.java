package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e39 extends alo {
    public static final e39 m = new e39(0);
    public static final e39 n = new e39(1);
    public static final e39 o = new e39(2);
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e39(byte b) {
        super((byte) 18);
        this.l = b;
    }

    public final List a0(List list, j2g j2gVar) {
        switch (this.l) {
            case 0:
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((f39) it.next()).b != null) {
                            return null;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    String[] autofillHints = ((f39) obj).a.getAutofillHints();
                    if (autofillHints != null && e82.u("on", autofillHints) >= 0) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == 2) {
                    return Collections.singletonList(new d16(new vz8[]{f39.a((f39) arrayList.get(0), nf2.USERNAME, 27), f39.a((f39) arrayList.get(1), nf2.PASSWORD, 27)}, j2gVar));
                }
                return null;
            case 1:
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (((f39) it2.next()).b != null) {
                            return null;
                        }
                    }
                }
                if (!(j2gVar instanceof i2g)) {
                    return null;
                }
                i2g i2gVar = (i2g) j2gVar;
                if (!Intrinsics.a(i2gVar.d, "ru.rostel") || !Intrinsics.a(i2gVar.c, "esia.gosuslugi.ru") || list.size() != 2) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    String[] autofillHints2 = ((f39) obj2).a.getAutofillHints();
                    if (autofillHints2 != null && e82.u("on", autofillHints2) >= 0) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return Collections.singletonList(new d16(new vz8[]{f39.a((f39) list.get(0), nf2.USERNAME, 27), f39.a((f39) list.get(1), nf2.PASSWORD, 27)}, j2gVar));
            default:
                if (list.size() != 2) {
                    return null;
                }
                List<f39> list4 = list;
                boolean z = list4 instanceof Collection;
                if (z && list4.isEmpty()) {
                    return null;
                }
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    if (((f39) it3.next()).b == nf2.PASSWORD) {
                        if (z && list4.isEmpty()) {
                            return null;
                        }
                        for (f39 f39Var : list4) {
                            if (f39Var.b == null && f39Var.c == p09.c) {
                                ArrayList arrayList3 = new ArrayList(k95.o(list4, 10));
                                for (f39 f39Var2 : list4) {
                                    nf2 nf2Var = f39Var2.b;
                                    if (nf2Var == null) {
                                        nf2Var = nf2.USERNAME;
                                    }
                                    arrayList3.add(f39.a(f39Var2, nf2Var, 27));
                                }
                                return Collections.singletonList(new d16((vz8[]) arrayList3.toArray(new vz8[0]), j2gVar));
                            }
                        }
                        return null;
                    }
                }
                return null;
        }
    }
}
