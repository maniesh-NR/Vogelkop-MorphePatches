package defpackage;

/* loaded from: classes.dex */
public final class ddg implements t7m {
    public final dx7 a;
    public final bq4 b = new bq4(new byte[10], 10);
    public byte c = 0;
    public int d;
    public pql e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public ddg(dx7 dx7Var) {
        this.a = dx7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // defpackage.t7m
    public final void a(int i, g1g g1gVar) {
        byte b;
        boolean z;
        long jB;
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        byte b2 = 2;
        dx7 dx7Var = this.a;
        byte b3 = 3;
        ?? r7 = 0;
        if (i2 != 0) {
            byte b4 = this.c;
            if (b4 != 0 && b4 != 1) {
                if (b4 == 2) {
                    w7d.K("Unexpected start indicator reading extended header");
                } else {
                    if (b4 != 3) {
                        h9o.e();
                        return;
                    }
                    if (this.j != -1) {
                        w7d.K("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    dx7Var.b(g1gVar.c == 0);
                }
            }
            this.c = (byte) 1;
            this.d = 0;
        }
        int i4 = i;
        while (g1gVar.a() > 0) {
            byte b5 = this.c;
            if (b5 != 0) {
                bq4 bq4Var = this.b;
                if (b5 != 1) {
                    if (b5 == b2) {
                        if (b(g1gVar, bq4Var.b, Math.min(10, this.i)) && b(g1gVar, null, this.i)) {
                            bq4Var.q(r7);
                            if (this.f) {
                                bq4Var.t(4);
                                bq4Var.t(1);
                                bq4Var.t(1);
                                long jI = (bq4Var.i(b3) << 30) | (bq4Var.i(15) << 15) | bq4Var.i(15);
                                bq4Var.t(1);
                                if (!this.h && this.g) {
                                    bq4Var.t(4);
                                    bq4Var.t(1);
                                    bq4Var.t(1);
                                    bq4Var.t(1);
                                    this.e.b((bq4Var.i(b3) << 30) | (bq4Var.i(15) << 15) | bq4Var.i(15));
                                    this.h = true;
                                }
                                jB = this.e.b(jI);
                            } else {
                                jB = -9223372036854775807L;
                            }
                            i4 |= this.k ? 4 : 0;
                            dx7Var.d(i4, jB);
                            b = 3;
                            this.c = (byte) 3;
                            z = false;
                            this.d = 0;
                        }
                    } else {
                        if (b5 != b3) {
                            h9o.e();
                            return;
                        }
                        int iA = g1gVar.a();
                        int i5 = this.j;
                        int i6 = i5 == i3 ? r7 : iA - i5;
                        if (i6 > 0) {
                            iA -= i6;
                            g1gVar.M(g1gVar.b + iA);
                        }
                        dx7Var.a(g1gVar);
                        int i7 = this.j;
                        if (i7 != i3) {
                            int i8 = i7 - iA;
                            this.j = i8;
                            if (i8 == 0) {
                                dx7Var.b(r7);
                                this.c = (byte) 1;
                                this.d = r7;
                            }
                        }
                    }
                    b = b3;
                    z = r7;
                } else {
                    b = b3;
                    if (b(g1gVar, bq4Var.b, 9)) {
                        this.c = c() ? (byte) 2 : (byte) 0;
                        z = false;
                        this.d = 0;
                    } else {
                        z = false;
                    }
                }
            } else {
                b = b3;
                z = r7;
                g1gVar.O(g1gVar.a());
            }
            r7 = z;
            b3 = b;
            i3 = -1;
            b2 = 2;
        }
    }

    public final boolean b(g1g g1gVar, byte[] bArr, int i) {
        int iMin = Math.min(g1gVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            g1gVar.O(iMin);
        } else {
            g1gVar.k(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean c() {
        bq4 bq4Var = this.b;
        bq4Var.q(0);
        int i = bq4Var.i(24);
        if (i != 1) {
            vep.y(i, "Unexpected start code prefix: ");
            this.j = -1;
            return false;
        }
        bq4Var.t(8);
        int i2 = bq4Var.i(16);
        bq4Var.t(5);
        this.k = bq4Var.h();
        bq4Var.t(2);
        this.f = bq4Var.h();
        this.g = bq4Var.h();
        bq4Var.t(6);
        int i3 = bq4Var.i(8);
        this.i = i3;
        if (i2 == 0) {
            this.j = -1;
            return true;
        }
        int i4 = (i2 - 3) - i3;
        this.j = i4;
        if (i4 < 0) {
            w7d.K("Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }

    @Override // defpackage.t7m
    public final void e(pql pqlVar, en8 en8Var, s7m s7mVar) {
        this.e = pqlVar;
        this.a.c(en8Var, s7mVar);
    }

    @Override // defpackage.t7m
    public final void seek() {
        this.c = (byte) 0;
        this.d = 0;
        this.h = false;
        this.a.seek();
    }
}
