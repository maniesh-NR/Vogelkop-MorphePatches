package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c32 implements d12 {
    public final Function1 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public c32(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.d12
    public final void a(ArrayList arrayList, vr9 vr9Var) {
        int size = arrayList.size();
        int i = 0;
        while (true) {
            LinkedHashMap linkedHashMap = this.b;
            if (i >= size) {
                this.a.invoke(rbd.i(linkedHashMap));
                vr9Var.run();
                return;
            } else {
                Object obj = arrayList.get(i);
                i++;
                Pair pair = (Pair) obj;
                linkedHashMap.put(pair.a, pair.b);
            }
        }
    }

    @Override // defpackage.d12
    public final void b(String str, Runnable runnable) {
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.remove(str);
        this.a.invoke(rbd.i(linkedHashMap));
        runnable.run();
    }

    @Override // defpackage.d12
    public final void c(ra raVar) {
        raVar.invoke(CollectionsKt.n0(this.b.keySet()));
    }

    @Override // defpackage.d12
    public final void d() {
    }

    @Override // defpackage.d12
    public final void e(String str, Function1 function1) {
        function1.invoke(this.b.get(str));
    }

    @Override // defpackage.d12
    public final void f(ArrayList arrayList, ra raVar) {
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add((String) this.b.get((String) obj));
        }
        raVar.invoke(arrayList2);
    }

    @Override // defpackage.d12
    public final void g(String str, String str2, Runnable runnable) {
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(str, str2);
        this.a.invoke(rbd.i(linkedHashMap));
        runnable.run();
    }

    @Override // defpackage.d12
    public final void h() {
    }
}
