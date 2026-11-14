package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class d39 extends alo {
    public final vu2 l;

    public d39(vu2 vu2Var) {
        super((byte) 18);
        this.l = vu2Var;
    }

    public final List a0(List list, j2g j2gVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f39 f39Var = (f39) it.next();
            vz8 vz8VarA = f39Var.b != null ? f39.a(f39Var, null, 31) : null;
            if (vz8VarA != null) {
                arrayList.add(vz8VarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nf2 nf2Var = ((vz8) obj).c;
            Object arrayList2 = linkedHashMap.get(nf2Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(nf2Var, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ehc ehcVarB = a.b();
        List list2 = (List) linkedHashMap.get(nf2.ADDRESS);
        vu2 vu2Var = this.l;
        if (list2 != null) {
            String str = j2gVar.a;
            if (list2.size() <= 20) {
                ehcVarB.add(new rw((vz8[]) list2.toArray(new vz8[0]), j2gVar));
            } else {
                vu2Var.a.R(14, sko.j("Too many fields in domain ", str));
            }
        }
        l08 l08Var = (List) linkedHashMap.get(nf2.NAME);
        if (l08Var == null) {
            l08Var = l08.a;
        }
        List list3 = (Collection) l08Var;
        l08 l08Var2 = (List) linkedHashMap.get(nf2.PHONE);
        if (l08Var2 == null) {
            l08Var2 = l08.a;
        }
        ArrayList arrayListV = CollectionsKt.V((Iterable) l08Var2, list3);
        if (arrayListV.isEmpty()) {
            arrayListV = null;
        }
        if (arrayListV != null) {
            String str2 = j2gVar.a;
            if (arrayListV.size() <= 20) {
                ehcVarB.add(new sp5((vz8[]) arrayListV.toArray(new vz8[0]), j2gVar));
            } else {
                vu2Var.a.R(14, sko.j("Too many fields in domain ", str2));
            }
        }
        l08 l08Var3 = (List) linkedHashMap.get(nf2.BIRTHDAY);
        if (l08Var3 == null) {
            l08Var3 = l08.a;
        }
        List list4 = (Collection) l08Var3;
        l08 l08Var4 = (List) linkedHashMap.get(nf2.GENDER);
        if (l08Var4 == null) {
            l08Var4 = l08.a;
        }
        ArrayList arrayListV2 = CollectionsKt.V((Iterable) l08Var4, list4);
        l08 l08Var5 = (List) linkedHashMap.get(nf2.IMPP);
        if (l08Var5 == null) {
            l08Var5 = l08.a;
        }
        ArrayList arrayListV3 = CollectionsKt.V((Iterable) l08Var5, arrayListV2);
        l08 l08Var6 = (List) linkedHashMap.get(nf2.OTHER);
        if (l08Var6 == null) {
            l08Var6 = l08.a;
        }
        ArrayList arrayListV4 = CollectionsKt.V((Iterable) l08Var6, arrayListV3);
        if (arrayListV4.isEmpty()) {
            arrayListV4 = null;
        }
        if (arrayListV4 != null) {
            String str3 = j2gVar.a;
            if (arrayListV4.size() <= 20) {
                ehcVarB.add(new etf((vz8[]) arrayListV4.toArray(new vz8[0]), j2gVar));
            } else {
                vu2Var.a.R(14, sko.j("Too many fields in domain ", str3));
            }
        }
        List list5 = (List) linkedHashMap.get(nf2.CREDIT_CARD);
        if (list5 != null) {
            String str4 = j2gVar.a;
            if (list5.size() <= 20) {
                ehcVarB.add(new m16((vz8[]) list5.toArray(new vz8[0]), j2gVar));
            } else {
                vu2Var.a.R(14, sko.j("Too many fields in domain ", str4));
            }
        }
        l08 l08Var7 = (List) linkedHashMap.get(nf2.SIGNUP_USERNAME);
        if (l08Var7 == null) {
            l08Var7 = l08.a;
        }
        List list6 = (Collection) l08Var7;
        l08 l08Var8 = (List) linkedHashMap.get(nf2.SIGNUP_PASSWORD);
        if (l08Var8 == null) {
            l08Var8 = l08.a;
        }
        ArrayList arrayListV5 = CollectionsKt.V((Iterable) l08Var8, list6);
        l08 l08Var9 = (List) linkedHashMap.get(nf2.USERNAME);
        if (l08Var9 == null) {
            l08Var9 = l08.a;
        }
        ArrayList arrayListV6 = CollectionsKt.V((Iterable) l08Var9, arrayListV5);
        l08 l08Var10 = (List) linkedHashMap.get(nf2.PASSWORD);
        if (l08Var10 == null) {
            l08Var10 = l08.a;
        }
        ArrayList arrayListV7 = CollectionsKt.V((Iterable) l08Var10, arrayListV6);
        l08 l08Var11 = (List) linkedHashMap.get(nf2.EMAIL_ADDRESS);
        if (l08Var11 == null) {
            l08Var11 = l08.a;
        }
        ArrayList arrayListV8 = CollectionsKt.V((Iterable) l08Var11, arrayListV7);
        ArrayList arrayList3 = arrayListV8.isEmpty() ? null : arrayListV8;
        if (arrayList3 != null) {
            String str5 = j2gVar.a;
            if (arrayList3.size() <= 20) {
                ehcVarB.add(new d16((vz8[]) arrayList3.toArray(new vz8[0]), j2gVar));
            } else {
                vu2Var.a.R(14, sko.j("Too many fields in domain ", str5));
            }
        }
        return a.a(ehcVarB);
    }
}
