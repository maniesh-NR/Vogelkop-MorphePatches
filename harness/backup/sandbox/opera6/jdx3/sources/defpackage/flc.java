package defpackage;

/* loaded from: classes.dex */
public final class flc extends llc {
    public final glc a;
    public final long b;

    public flc(glc glcVar) {
        this.a = glcVar;
        ykc[] ykcVarArr = ykc.b;
        this.b = 288230376151711744L | glcVar.a.a.a;
    }

    @Override // defpackage.llc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.llc
    public final boolean b(llc llcVar) {
        if (llcVar instanceof flc) {
            return this.a.equals(((flc) llcVar).a);
        }
        return false;
    }
}
