package ads_mobile_sdk;

import defpackage.t3p;

/* loaded from: classes.dex */
public final class wx2 extends omm {
    public final yx2 a;
    public yq b;

    public wx2(zx2 zx2Var) {
        super((byte) 2);
        yx2 yx2Var = new yx2(zx2Var);
        this.a = yx2Var;
        this.b = yx2Var.hasNext() ? new yq(yx2Var.next()) : null;
    }

    public final byte a() {
        yq yqVar = this.b;
        if (yqVar == null) {
            t3p.y();
            return (byte) 0;
        }
        byte bA = yqVar.a();
        if (!this.b.hasNext()) {
            yx2 yx2Var = this.a;
            this.b = yx2Var.hasNext() ? new yq(yx2Var.next()) : null;
        }
        return bA;
    }

    public final boolean hasNext() {
        return this.b != null;
    }
}
