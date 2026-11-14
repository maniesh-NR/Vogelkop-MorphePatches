package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class iz1 implements d12 {
    public final u9d a;

    public iz1(u9d u9dVar) {
        this.a = u9dVar;
    }

    public final void a(ArrayList arrayList, vr9 vr9Var) {
        throw new UnsupportedOperationException();
    }

    public final void b(String str, Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    public final void c(ra raVar) {
        raVar.invoke(CollectionsKt.n0(this.a.keySet()));
    }

    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final void e(String str, Function1 function1) {
        function1.invoke(this.a.get(str));
    }

    public final void f(ArrayList arrayList, ra raVar) {
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add((String) this.a.get((String) obj));
        }
        raVar.invoke(arrayList2);
    }

    public final void g(String str, String str2, Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    public final void h() {
        throw new UnsupportedOperationException();
    }
}
