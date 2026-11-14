package defpackage;

import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class lv2 extends k56 {
    public final /* synthetic */ byte t;

    @Override // defpackage.k56, defpackage.xkj
    public final boolean k(i iVar) {
        switch (this.t) {
            case 1:
                if (iVar.itemView.isAttachedToWindow()) {
                    super.k(iVar);
                    return true;
                }
                c(iVar);
                return false;
            default:
                return super.k(iVar);
        }
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean l(i iVar, i iVar2, int i, int i2, int i3, int i4) {
        switch (this.t) {
            case 1:
                if (iVar2 == iVar) {
                    c(iVar2);
                } else {
                    c(iVar2);
                    c(iVar);
                }
                return false;
            case 2:
                if (iVar2 == iVar) {
                    c(iVar2);
                } else {
                    c(iVar2);
                    c(iVar);
                }
                return false;
            default:
                return super.l(iVar, iVar2, i, i2, i3, i4);
        }
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean m(i iVar, int i, int i2, int i3, int i4) {
        switch (this.t) {
            case 1:
                if (i != i3) {
                    if (!iVar.itemView.isAttachedToWindow()) {
                        o(iVar);
                        break;
                    } else {
                        break;
                    }
                } else {
                    o(iVar);
                    break;
                }
        }
        return super.m(iVar, i, i2, i3, i4);
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean n(i iVar) {
        switch (this.t) {
            case 0:
                c(iVar);
                return false;
            case 1:
                if (iVar.itemView.isAttachedToWindow()) {
                    super.n(iVar);
                    return true;
                }
                c(iVar);
                return false;
            default:
                return super.n(iVar);
        }
    }
}
