package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class fzc extends czc {
    public final fc5 a = new fc5();

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    @Override // defpackage.czc
    public final void a(eaj eajVar, String str, String str2, Throwable th) throws oye {
        fc5 fc5Var = this.a;
        try {
            if (th == null) {
                int iOrdinal = eajVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                    return;
                }
                if (iOrdinal != 5) {
                    throw new oye();
                }
                Log.println(7, str2, str);
                return;
            }
            int iOrdinal2 = eajVar.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 3 || iOrdinal2 == 4) {
                return;
            }
            if (iOrdinal2 != 5) {
                throw new oye();
            }
            Log.println(7, str2, str + '\n' + Log.getStackTraceString(th));
        } catch (RuntimeException unused) {
            fc5Var.a(eajVar, str, str2, th);
        } catch (UnsatisfiedLinkError unused2) {
            fc5Var.a(eajVar, str, str2, th);
        }
    }
}
