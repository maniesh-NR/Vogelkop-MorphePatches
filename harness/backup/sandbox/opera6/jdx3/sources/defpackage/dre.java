package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class dre extends msh {
    public final log D;

    /* JADX WARN: Illegal instructions before constructor call */
    public dre(String str, long j, long j2, log logVar, p12 p12Var, qre qreVar) {
        Uri uri = Uri.EMPTY;
        super("", str, null, uri, 4, uri, uri, null, null, j, j2, null, null, 0, 0, 0, null, null, p12Var, null, null, null, qreVar, null, null);
        this.D = logVar;
    }

    @Override // defpackage.msh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != dre.class) {
            return false;
        }
        return this.D.b.equals(((dre) obj).D.b);
    }

    @Override // defpackage.msh
    public final int hashCode() {
        return this.D.b.hashCode();
    }
}
