package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class f12 implements d12 {
    public d12 a;
    public ArrayList b = new ArrayList();

    @Override // defpackage.d12
    public final void a(ArrayList arrayList, vr9 vr9Var) {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.a(arrayList, vr9Var);
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList2.add(new k3(this, arrayList, vr9Var, (byte) 10));
        }
    }

    @Override // defpackage.d12
    public final void b(String str, Runnable runnable) {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.b(str, runnable);
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.add(new k3(this, str, runnable, (byte) 11));
        }
    }

    @Override // defpackage.d12
    public final void c(ra raVar) {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.c(raVar);
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.add(new xa(this, raVar, (byte) 19));
        }
    }

    @Override // defpackage.d12
    public final void d() {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.d();
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.add(new e12(this, (byte) 1));
        }
    }

    @Override // defpackage.d12
    public final void e(String str, Function1 function1) {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.e(str, function1);
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.add(new k3(this, str, function1, (byte) 9));
        }
    }

    @Override // defpackage.d12
    public final void f(ArrayList arrayList, ra raVar) {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.f(arrayList, raVar);
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList2.add(new k3(this, arrayList, raVar, (byte) 8));
        }
    }

    @Override // defpackage.d12
    public final void g(String str, String str2, Runnable runnable) {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.g(str, str2, runnable);
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.add(new qn(this, str, str2, runnable, (byte) 3));
        }
    }

    @Override // defpackage.d12
    public final void h() {
        d12 d12Var = this.a;
        if (d12Var != null) {
            d12Var.h();
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.add(new e12(this, (byte) 0));
        }
    }

    public final void i(d12 d12Var) {
        this.a = d12Var;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.b = null;
    }
}
