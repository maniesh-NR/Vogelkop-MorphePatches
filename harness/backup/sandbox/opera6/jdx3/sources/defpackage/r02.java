package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r02 implements d12 {
    public final umi a;
    public final LinkedHashMap b = new LinkedHashMap();
    public oml c;

    public r02(umi umiVar) {
        this.a = umiVar;
    }

    @Override // defpackage.d12
    public final void a(ArrayList arrayList, vr9 vr9Var) {
        i();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            this.b.put((String) pair.a, (String) pair.b);
        }
        vr9Var.run();
    }

    @Override // defpackage.d12
    public final void b(String str, Runnable runnable) {
        i();
        this.b.remove(str);
        runnable.run();
    }

    @Override // defpackage.d12
    public final void c(ra raVar) {
        i();
        raVar.invoke(this.b.keySet());
    }

    @Override // defpackage.d12
    public final void d() {
        if (this.c == null) {
            oml omlVar = new oml(this.a.d(new q02(this, (byte) 0)));
            this.c = omlVar;
            on7 on7Var = pn7.b;
            coh.k(omlVar, (Object) null, cs5.x0(5, un7.f));
        }
    }

    @Override // defpackage.d12
    public final void e(String str, Function1 function1) {
        i();
        function1.invoke(this.b.get(str));
    }

    @Override // defpackage.d12
    public final void f(ArrayList arrayList, ra raVar) {
        i();
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
        i();
        this.b.put(str, str2);
        runnable.run();
    }

    @Override // defpackage.d12
    public final void h() {
        i();
    }

    public final void i() {
        oml omlVar = this.c;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.c = null;
        }
    }
}
