package defpackage;

/* loaded from: classes.dex */
public final class tga extends f1o {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    @Override // defpackage.z27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.z27 r24) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tga.a(z27):void");
    }

    @Override // defpackage.f1o
    public final void e() {
        e37 e37Var = this.h;
        if (e37Var.j) {
            this.b.X = e37Var.g;
        }
    }

    @Override // defpackage.f1o
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.f1o
    public final boolean k() {
        return this.d != 3 || this.b.q == 0;
    }

    public final void n() {
        this.g = false;
        e37 e37Var = this.h;
        e37Var.c();
        e37Var.j = false;
        e37 e37Var2 = this.i;
        e37Var2.c();
        e37Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
