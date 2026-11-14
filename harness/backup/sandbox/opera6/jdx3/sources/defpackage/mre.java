package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class mre extends msh {
    public final w9h D;

    /* JADX WARN: Illegal instructions before constructor call */
    public mre(String str, long j, long j2, w9h w9hVar, p12 p12Var, qre qreVar) {
        Uri uri = Uri.EMPTY;
        super("", str, null, uri, 4, uri, uri, null, null, j, j2, null, null, 0, 0, 0, null, "", p12Var, null, null, null, qreVar, null, null);
        this.D = w9hVar;
        w9hVar.j.b = qreVar.b == null ? 1 : 2;
    }

    @Override // defpackage.msh
    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != mre.class) {
            return false;
        }
        return this.D.equals(((mre) obj).D);
    }

    @Override // defpackage.msh
    public final int hashCode() {
        return this.D.a.hashCode();
    }
}
