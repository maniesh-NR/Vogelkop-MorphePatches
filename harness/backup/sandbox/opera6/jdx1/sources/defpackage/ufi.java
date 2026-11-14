package defpackage;

/* loaded from: classes.dex */
public abstract class ufi extends efi {
    @Override // defpackage.efi, defpackage.ffi
    public final void f(jfi jfiVar) throws jgi {
        if (jfiVar instanceof tfi) {
            this.i.add(jfiVar);
            return;
        }
        throw new jgi("Text content elements cannot contain " + jfiVar + " elements.");
    }
}
