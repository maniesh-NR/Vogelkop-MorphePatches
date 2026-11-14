package defpackage;

/* loaded from: classes.dex */
public final class jlc extends llc {
    public final klc a;
    public final long b;

    public jlc(klc klcVar) {
        this.a = klcVar;
        ykc[] ykcVarArr = ykc.b;
        this.b = klcVar.a.a.a;
    }

    @Override // defpackage.llc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.llc
    public final boolean b(llc llcVar) {
        if (llcVar instanceof jlc) {
            return this.a.equals(((jlc) llcVar).a);
        }
        return false;
    }
}
