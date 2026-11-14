package defpackage;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class om7 implements x63 {
    public final x63 a;
    public final ka5 b;
    public final t89 c;
    public final t89 d;
    public final t89 e;
    public final t89 f;
    public boolean g = true;

    public om7(x63 x63Var, c73 c73Var, wjh wjhVar) {
        this.a = x63Var;
        a73 a73VarD = ((dd1) wjhVar.b).D();
        this.b = (ka5) a73VarD;
        a73VarD.a(this);
        c73Var.g(a73VarD);
        a73 a73VarD2 = ((ed1) wjhVar.c).D();
        this.c = (t89) a73VarD2;
        a73VarD2.a(this);
        c73Var.g(a73VarD2);
        a73 a73VarD3 = ((ed1) wjhVar.d).D();
        this.d = (t89) a73VarD3;
        a73VarD3.a(this);
        c73Var.g(a73VarD3);
        a73 a73VarD4 = ((ed1) wjhVar.e).D();
        this.e = (t89) a73VarD4;
        a73VarD4.a(this);
        c73Var.g(a73VarD4);
        a73 a73VarD5 = ((ed1) wjhVar.f).D();
        this.f = (t89) a73VarD5;
        a73VarD5.a(this);
        c73Var.g(a73VarD5);
    }

    @Override // defpackage.x63
    public final void a() {
        this.g = true;
        this.a.a();
    }

    public final void b(ezb ezbVar) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((Float) this.d.e()).floatValue() * 0.017453292519943295d;
            float fFloatValue = ((Float) this.e.e()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.b.e()).intValue();
            ezbVar.setShadowLayer(((Float) this.f.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void c(ua7 ua7Var) {
        t89 t89Var = this.c;
        if (ua7Var == null) {
            t89Var.j(null);
        } else {
            t89Var.j(new i2d(ua7Var, (byte) 2));
        }
    }
}
