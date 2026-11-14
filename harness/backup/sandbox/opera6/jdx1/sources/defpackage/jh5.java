package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jh5 {
    public final vt9 a;
    public lr4 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final bg3 d = new bg3((byte) 2);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public jh5(vt9 vt9Var, lr4 lr4Var) {
        this.a = vt9Var;
        this.b = lr4Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            erf erfVar = this.b.l;
            erfVar.J0(arf.d);
            erfVar.k[erfVar.l - erfVar.i[erfVar.j - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        lr4 lr4Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        lr4Var.getClass();
        if (size != 0) {
            erf erfVar2 = lr4Var.l;
            erfVar2.J0(bqf.d);
            ui6.i0(erfVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                erf erfVar = this.b.l;
                erfVar.J0(qqf.d);
                int i3 = erfVar.l - erfVar.i[erfVar.j - 1].b;
                int[] iArr = erfVar.k;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                erf erfVar2 = this.b.l;
                erfVar2.J0(mqf.d);
                int i6 = erfVar2.l - erfVar2.i[erfVar2.j - 1].b;
                int[] iArr2 = erfVar2.k;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        hqj hqjVar = this.a.G;
        int i = z ? hqjVar.i : hqjVar.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            mh5.a("Tried to seek backward");
        }
        if (i2 > 0) {
            erf erfVar = this.b.l;
            erfVar.J0(upf.d);
            erfVar.k[erfVar.l - erfVar.i[erfVar.j - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                mh5.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
