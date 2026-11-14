package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pvj implements Comparable {
    public boolean a;
    public float e;
    public int l;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public s72[] i = new s72[16];
    public int j = 0;
    public int k = 0;

    public pvj(int i) {
        this.l = i;
    }

    public final void a(s72 s72Var) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            s72[] s72VarArr = this.i;
            if (i >= i2) {
                if (i2 >= s72VarArr.length) {
                    s72VarArr = (s72[]) Arrays.copyOf(s72VarArr, s72VarArr.length << 1);
                    this.i = s72VarArr;
                }
                int i3 = this.j;
                s72VarArr[i3] = s72Var;
                this.j = i3 + 1;
                return;
            }
            if (s72VarArr[i] == s72Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(s72 s72Var) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == s72Var) {
                while (i2 < i - 1) {
                    s72[] s72VarArr = this.i;
                    int i3 = i2 + 1;
                    s72VarArr[i2] = s72VarArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((pvj) obj).b;
    }

    public final void d(jfc jfcVar, float f) {
        this.e = f;
        this.f = true;
        int i = this.j;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(jfcVar, this, false);
        }
        this.j = 0;
    }

    public final void e(jfc jfcVar, s72 s72Var) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(jfcVar, s72Var, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
