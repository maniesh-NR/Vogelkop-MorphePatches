package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class j2 implements l2 {
    public final List b;
    public final s15 c = uqh.a(List.class);
    public final boolean d;
    public final String e;

    public j2(List list) {
        this.b = list;
        List list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l2) it.next()).a()) {
                    z = true;
                    break;
                }
            }
        }
        this.d = z;
        this.e = sko.k("(", CollectionsKt.P(this.b, ",", (CharSequence) null, (String) null, 0, i2.b, 30), ")");
    }

    @Override // defpackage.l2
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.l2
    public final z1 b(String str) {
        ArrayList arrayList = new ArrayList();
        int iMax = 0;
        int i = 0;
        for (l2 l2Var : this.b) {
            String strSubstring = str.substring(i);
            if (l2Var.a()) {
                l2.a.getClass();
                z1 z1VarB = f2.b.b(strSubstring);
                int iIntValue = ((BigInteger) z1VarB.a).intValue() << 1;
                z1 z1VarB2 = l2Var.b(str.substring(iIntValue));
                i += z1VarB.b;
                iMax = Math.max(iMax, iIntValue + z1VarB2.b);
                arrayList.add(z1VarB2.a);
            } else {
                z1 z1VarB3 = l2Var.b(strSubstring);
                i += z1VarB3.b;
                iMax = Math.max(iMax, i);
                arrayList.add(z1VarB3.a);
            }
        }
        return new z1(arrayList, iMax);
    }

    @Override // defpackage.l2
    public final String c(Object obj) {
        return e((List) obj);
    }

    @Override // defpackage.l2
    public final s15 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && Intrinsics.a(this.b, ((j2) obj).b);
    }

    @Override // defpackage.l2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String e(List list) {
        List list2 = this.b;
        if (list2.size() != list.size()) {
            qp2.o("Failed requirement.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListO0 = CollectionsKt.o0(list2, list);
        int size = arrayListO0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListO0.get(i2);
            i2++;
            Pair pair = (Pair) obj;
            l2 l2Var = (l2) pair.a;
            Object obj2 = pair.b;
            if (obj2 == null) {
                qp2.o("Required value was null.");
                return null;
            }
            String strC = l2Var.c(obj2);
            if (l2Var.a()) {
                arrayList.add(StringsKt.S(64, ""));
                Integer numValueOf = Integer.valueOf(arrayList.size() - 1);
                int size2 = arrayList2.size();
                int length = 0;
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    length += ((String) obj3).length();
                }
                arrayList3.add(new Pair(numValueOf, Integer.valueOf(length)));
                arrayList2.add(strC);
            } else {
                arrayList.add(strC);
            }
        }
        int size3 = arrayList.size();
        int length2 = 0;
        int i4 = 0;
        while (i4 < size3) {
            Object obj4 = arrayList.get(i4);
            i4++;
            length2 += ((String) obj4).length();
        }
        int size4 = arrayList3.size();
        while (i < size4) {
            Object obj5 = arrayList3.get(i);
            i++;
            Pair pair2 = (Pair) obj5;
            int iIntValue = ((Number) pair2.a).intValue();
            int iIntValue2 = (((Number) pair2.b).intValue() + length2) / 2;
            l2.a.getClass();
            arrayList.set(iIntValue, f2.b.e(mkh.D(iIntValue2)));
        }
        return CollectionsKt.P(arrayList, "", (CharSequence) null, (String) null, 0, (Function1) null, 62).concat(CollectionsKt.P(arrayList2, "", (CharSequence) null, (String) null, 0, (Function1) null, 62));
    }

    @Override // defpackage.l2
    public final String getName() {
        return this.e;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return sko.m("Tuple(itemTypes=", ")", this.b);
    }
}
