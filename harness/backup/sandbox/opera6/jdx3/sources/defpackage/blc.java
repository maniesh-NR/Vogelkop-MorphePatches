package defpackage;

/* loaded from: classes.dex */
public final class blc extends llc {
    public final clc a;
    public final long b;

    public blc(clc clcVar) {
        this.a = clcVar;
        ykc[] ykcVarArr = ykc.b;
        this.b = 216172782113783808L | clcVar.a.a.a;
    }

    @Override // defpackage.llc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.llc
    public final boolean b(llc llcVar) {
        if (llcVar instanceof blc) {
            return this.a.equals(((blc) llcVar).a);
        }
        return false;
    }
}
