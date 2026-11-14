package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ns {
    public final umi a;
    public int b;
    public boolean c;
    public final Function1 d;
    public Set e = v08.a;
    public boolean f;
    public Object g;

    public ns(umi umiVar, int i, boolean z, Function1 function1) {
        this.a = umiVar;
        this.b = i;
        this.c = z;
        this.d = function1;
    }

    public static void e(ns nsVar, Set set, int i, int i2) {
        if ((i2 & 1) != 0) {
            set = nsVar.e;
        }
        if ((i2 & 2) != 0) {
            i = nsVar.b;
        }
        if (Intrinsics.a(nsVar.e, set) && nsVar.b == i && !nsVar.c) {
            return;
        }
        nsVar.c = false;
        nsVar.e = set;
        nsVar.b = i;
        Object obj = nsVar.g;
        if (obj != null) {
            nsVar.c(obj);
        } else {
            nsVar.f = true;
        }
    }

    public Object a(Object obj, Set set, int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        if (set.isEmpty()) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (!set.contains(((st) obj2).b)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap2.put(entry.getKey(), arrayList);
            }
        }
        return linkedHashMap2;
    }

    public Object b(Object obj) {
        List list;
        List listK0;
        jq8 jq8Var = (jq8) obj;
        HashMap map = new HashMap();
        for (lq8 lq8Var : jq8Var.a) {
            st stVar = new st(new qxh(lq8Var.b), lq8Var.d, lq8Var.c, (Integer) null, ht.b, lq8Var.f, lq8Var.e, (String) null, 392);
            for (kq8 kq8Var : lq8Var.f) {
                Object orDefault = map.getOrDefault(kq8Var, new ArrayList());
                ((List) orDefault).add(stVar);
                map.put(kq8Var, orDefault);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kq8 kq8Var2 : jq8Var.b) {
            if (kq8Var2.d && (list = (List) map.get(kq8Var2)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null && (listK0 = CollectionsKt.k0(list)) != null) {
                    linkedHashMap.put(new ts(kq8Var2), listK0);
                }
            }
        }
        return linkedHashMap;
    }

    public final void c(Object obj) {
        if (this.c) {
            return;
        }
        oml omlVarC = this.a.e(new ls(this, (byte) 2)).c(new ls(this, (byte) 3));
        ms msVar = new ms(obj, this.e, this.b);
        pn7.b.getClass();
        coh.k(omlVarC, msVar, 0L);
    }

    public final void d(Object obj) {
        oml omlVarC = this.a.e(new ls(this, (byte) 0)).c(new ls(this, (byte) 1));
        pn7.b.getClass();
        coh.k(omlVarC, obj, 0L);
    }
}
