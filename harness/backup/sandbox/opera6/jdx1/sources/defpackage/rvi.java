package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class rvi implements t7m {
    public final qvi a;
    public final g1g b = new g1g(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public rvi(qvi qviVar) {
        this.a = qviVar;
    }

    @Override // defpackage.t7m
    public final void a(int i, g1g g1gVar) {
        boolean z = (i & 1) != 0;
        int iA = z ? g1gVar.b + g1gVar.A() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            g1gVar.N(iA);
            this.d = 0;
        }
        while (g1gVar.a() > 0) {
            int i2 = this.d;
            g1g g1gVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iA2 = g1gVar.A();
                    g1gVar.N(g1gVar.b - 1);
                    if (iA2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(g1gVar.a(), 3 - this.d);
                g1gVar.k(g1gVar2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    g1gVar2.N(0);
                    g1gVar2.M(3);
                    g1gVar2.O(1);
                    int iA3 = g1gVar2.A();
                    int iA4 = g1gVar2.A();
                    this.e = (iA3 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
                    int i4 = (((iA3 & 15) << 8) | iA4) + 3;
                    this.c = i4;
                    byte[] bArr = g1gVar2.a;
                    if (bArr.length < i4) {
                        g1gVar2.c(Math.min(4098, Math.max(i4, bArr.length << 1)));
                    }
                }
            } else {
                int iMin2 = Math.min(g1gVar.a(), this.c - this.d);
                g1gVar.k(g1gVar2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        g1gVar2.M(i6);
                    } else {
                        if (tym.o(0, i6, -1, g1gVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        g1gVar2.M(this.c - 4);
                    }
                    g1gVar2.N(0);
                    this.a.a(g1gVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.t7m
    public final void e(pql pqlVar, en8 en8Var, s7m s7mVar) {
        this.a.e(pqlVar, en8Var, s7mVar);
        this.f = true;
    }

    @Override // defpackage.t7m
    public final void seek() {
        this.f = true;
    }
}
