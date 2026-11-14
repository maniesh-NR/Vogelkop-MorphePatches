package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public final class wmk implements tdn, f7f {
    public static final Random f = new Random();
    public final ydn a;
    public final slk b;
    public final vmk c;
    public ck8 d;
    public String e;

    public wmk(ydn ydnVar, slk slkVar, umi umiVar) {
        avj avjVar = new avj((byte) 2);
        long jE = avj.e(3600000L) + 82800000;
        this.a = ydnVar;
        this.b = slkVar;
        this.c = new vmk(jE, avjVar, umiVar, new qlk(this, (byte) 3));
        slkVar.i.k(this);
        ydnVar.F(this);
    }

    @Override // defpackage.tdn
    public final void C() {
        a();
    }

    public final void a() {
        ck8 ck8Var;
        ydn ydnVar = this.a;
        boolean z = ydnVar.c.isEnabled() && ydnVar.d.a && (ck8Var = this.d) != null && this.e != null && ck8Var.e;
        ck8 ck8Var2 = this.d;
        long j = ck8Var2 != null ? ck8Var2.d : 0L;
        vmk vmkVar = this.c;
        if (vmkVar.f != j) {
            vmkVar.f = j;
            vmkVar.g = 0L;
            vmkVar.h = 0L;
            vmkVar.a();
        }
        ck8 ck8Var3 = this.d;
        long j2 = ck8Var3 != null ? ck8Var3.c : 0L;
        if (vmkVar.e != j2) {
            vmkVar.e = j2;
            vmkVar.a();
        }
        if (z == vmkVar.d) {
            return;
        }
        vmkVar.d = z;
        if (!z) {
            vmkVar.g = 0L;
            vmkVar.h = 0L;
        }
        vmkVar.a();
    }

    public final void d0(Object obj) {
        wvg wvgVar = (wvg) obj;
        if (wvgVar.e == 0) {
            return;
        }
        if (wvgVar.a()) {
            this.d = wvgVar.g;
            this.e = wvgVar.a;
        } else {
            this.d = null;
            this.e = null;
        }
        a();
    }

    @Override // defpackage.tdn
    public final void s() {
        a();
    }

    @Override // defpackage.tdn
    public final void t() {
    }
}
