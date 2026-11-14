package defpackage;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class se4 {
    public static final bf2 a = c26.j(0);

    public static final qe4 a(me4 me4Var) {
        try {
            Trace.beginSection("CameraPipe");
            ia6 ia6Var = new ia6(new ole(me4Var), new mhk(me4Var.b));
            Trace.endSection();
            return new qe4(ia6Var);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
