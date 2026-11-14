package defpackage;

/* loaded from: classes.dex */
public final class dlc extends llc {
    public final elc a;
    public final long b;

    public dlc(elc elcVar) {
        this.a = elcVar;
        ykc[] ykcVarArr = ykc.b;
        this.b = 144115188075855872L | elcVar.a.a.a;
    }

    @Override // defpackage.llc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.llc
    public final boolean b(llc llcVar) {
        if (llcVar instanceof dlc) {
            return this.a.equals(((dlc) llcVar).a);
        }
        return false;
    }
}
