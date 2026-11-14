package defpackage;

/* loaded from: classes.dex */
public final class ntf extends w7d {
    public final h8i k;
    public final d91 l;

    public ntf(h8i h8iVar) {
        d91 d91VarA;
        this.k = h8iVar;
        if (ioh.s(h8iVar)) {
            d91VarA = null;
        } else {
            d91VarA = f91.a();
            d91.c(d91VarA, h8iVar);
        }
        this.l = d91VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ntf) {
            return this.k.equals(((ntf) obj).k);
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override // defpackage.w7d
    public final voh w() {
        h8i h8iVar = this.k;
        return new voh(h8iVar.a, h8iVar.b, h8iVar.c, h8iVar.d);
    }
}
