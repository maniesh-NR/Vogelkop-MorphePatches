package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class sff extends g3k {
    public final rff f;
    public boolean g;
    public final boolean h;
    public final z7 i;

    public sff(z7 z7Var, t9f t9fVar) {
        super(z7Var.a, t9fVar, 1);
        this.f = new rff();
        this.i = z7Var;
        this.h = z7Var.f;
    }

    @Override // defpackage.g3k
    public final void c(String str) {
        if (this.g) {
            return;
        }
        this.g = true;
        h(str, true);
    }

    @Override // defpackage.g3k
    public final void d(pzh pzhVar, byte[] bArr) {
        if (this.g) {
            return;
        }
        boolean z = true;
        this.g = true;
        int i = pzhVar.d;
        rff rffVar = this.f;
        if (i == 200) {
            try {
                rffVar.e(pzhVar, bArr);
                return;
            } catch (IOException e) {
                h(e.getMessage(), true);
                return;
            }
        }
        if (i == 202) {
            rffVar.a(pzhVar, bArr);
            return;
        }
        if ((i == 412 && rffVar.f(pzhVar, bArr)) || rffVar.d(pzhVar, bArr)) {
            return;
        }
        int i2 = pzhVar.d;
        if (i2 >= 400 && i2 < 500) {
            z = false;
        }
        h("Bad response", z);
    }

    @Override // defpackage.g3k
    public void e(fvh fvhVar) {
        this.i.c(fvhVar);
    }

    @Override // defpackage.g3k
    public final byte[] f(vzh vzhVar, pzh pzhVar) {
        byte[] bArrBytes = vzhVar.bytes();
        this.f.b(pzhVar, bArrBytes);
        return bArrBytes;
    }

    public void h(String str, boolean z) {
        String[] strArr = aik.a;
        if (str == null) {
            str = "";
        }
        this.f.c(str, z);
    }
}
