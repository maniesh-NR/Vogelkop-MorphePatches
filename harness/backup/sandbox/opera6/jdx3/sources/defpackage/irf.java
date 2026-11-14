package defpackage;

import android.util.SparseArray;
import java.util.Objects;

/* loaded from: classes.dex */
public final class irf {
    public final oyg a;
    public final az b;
    public final SparseArray c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ bp j;

    public irf(bp bpVar, oyg oygVar, az azVar) {
        Objects.requireNonNull(bpVar);
        this.j = bpVar;
        this.c = new SparseArray();
        this.a = oygVar;
        this.b = azVar;
        c();
    }

    public final boolean a(d50 d50Var) {
        int i = 0;
        if (!this.d) {
            int i2 = this.e;
            int i3 = this.g;
            if (i2 >= i3) {
                if (this.h) {
                    d();
                    return false;
                }
                int i4 = this.f + i3;
                if (i4 >= ((dz[]) this.j.b).length) {
                    while (true) {
                        SparseArray sparseArray = this.c;
                        if (i >= sparseArray.size()) {
                            break;
                        }
                        i++;
                    }
                    d();
                    if (d50Var != null) {
                        d50Var.run();
                    }
                    this.a.getClass();
                    return true;
                }
                if (!this.i) {
                    this.e = 0;
                    this.f = i4;
                    if (d50Var != null) {
                        d50Var.run();
                    }
                    c();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(int i, String str) {
        if (this.d) {
            return;
        }
        this.e++;
        String[] strArr = aik.a;
        this.c.put(i, str == null ? "" : str);
        d50 d50Var = new d50(this, i, str, (byte) 8);
        if (a(d50Var)) {
            return;
        }
        d50Var.run();
    }

    public final void c() {
        int i = this.f;
        bp bpVar = this.j;
        dz[] dzVarArr = (dz[]) bpVar.b;
        dz[] dzVarArr2 = (dz[]) bpVar.b;
        int length = dzVarArr.length;
        int i2 = bpVar.a;
        this.g = Math.min(length, i + i2) - i;
        this.i = true;
        int i3 = -1;
        for (int i4 = 0; !this.d && i4 < this.g; i4++) {
            int i5 = this.f + i4;
            if (dzVarArr2[i5].a()) {
                i3 = (i3 >= 0 || !dzVarArr2[i5].f() || i2 >= Integer.MAX_VALUE) ? 1 : i2;
                dzVarArr2[i5].h(new hrf(this, i5), this.b, i3);
            } else {
                b(i5, "ads provider not available");
                int i6 = this.f;
                int i7 = this.g;
                if (i6 + i7 < dzVarArr2.length) {
                    this.g = i7 + 1;
                }
            }
        }
        this.i = false;
        a(null);
    }

    public final void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        zy zyVar = this.a.a;
        if (zyVar != null) {
            zyVar.c();
        }
    }
}
