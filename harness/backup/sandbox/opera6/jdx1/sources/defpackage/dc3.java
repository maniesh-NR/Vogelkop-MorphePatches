package defpackage;

/* loaded from: classes.dex */
public final class dc3 implements sic {
    public final sic a;
    public byte b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public dc3(sic sicVar) {
        this.a = sicVar;
    }

    @Override // defpackage.sic
    public final void I(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = (byte) 3;
    }

    @Override // defpackage.sic
    public final void S(int i, int i2) {
        a();
        this.a.S(i, i2);
    }

    public final void a() {
        byte b = this.b;
        if (b == 0) {
            return;
        }
        sic sicVar = this.a;
        if (b == 1) {
            sicVar.t(this.c, this.d);
        } else if (b == 2) {
            sicVar.f(this.c, this.d);
        } else if (b == 3) {
            sicVar.I(this.c, this.d, this.e);
        }
        this.e = null;
        this.b = (byte) 0;
    }

    @Override // defpackage.sic
    public final void f(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            a();
            this.c = i;
            this.d = i2;
            this.b = (byte) 2;
        }
    }

    @Override // defpackage.sic
    public final void t(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = (byte) 1;
    }
}
