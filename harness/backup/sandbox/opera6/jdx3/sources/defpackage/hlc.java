package defpackage;

/* loaded from: classes.dex */
public final class hlc extends llc {
    public final ilc a;
    public final long b;

    public hlc(ilc ilcVar) {
        this.a = ilcVar;
        ykc[] ykcVarArr = ykc.b;
        this.b = 72057594037927936L | ilcVar.a.a.a;
    }

    @Override // defpackage.llc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.llc
    public final boolean b(llc llcVar) {
        if (llcVar instanceof hlc) {
            return this.a.equals(((hlc) llcVar).a);
        }
        return false;
    }
}
