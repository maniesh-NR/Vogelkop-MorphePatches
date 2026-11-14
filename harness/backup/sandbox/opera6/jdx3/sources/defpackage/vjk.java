package defpackage;

import org.chromium.gfx.mojom.Rect;

/* loaded from: classes.dex */
public final class vjk extends uik {
    public static final bc6 i = new bc6[]{new bc6(56, 0)}[0];
    public byte b;
    public boolean c;
    public Rect d;
    public Rect e;
    public bhk f;
    public bhk g;
    public boolean h;

    public vjk() {
        super(56);
    }

    public final void a(bp bpVar) {
        bp bpVarQ = bpVar.Q(i);
        bpVarQ.y(this.b, 8);
        bpVarQ.y(this.c ? 1 : 0, 12);
        bpVarQ.J(this.d, 16, false);
        bpVarQ.J(this.e, 24, true);
        bpVarQ.J(this.f, 32, false);
        bpVarQ.J(this.g, 40, true);
        bpVarQ.A(48, 0, this.h);
    }
}
