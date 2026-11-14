package defpackage;

import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class p7n {
    public static final urj a = new urj((byte) 3);

    public static final f65 a(l7n l7nVar) {
        f65 f65Var;
        d7a d7aVar;
        synchronized (a) {
            f65Var = (f65) l7nVar.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (f65Var == null) {
                try {
                    cv6 cv6Var = bb7.a;
                    d7aVar = s6d.a.e;
                } catch (g0f unused) {
                    d7aVar = h.a;
                } catch (IllegalStateException unused2) {
                    d7aVar = h.a;
                }
                f65 f65Var2 = new f65(d7aVar.plus(zch.a()));
                l7nVar.b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", f65Var2);
                f65Var = f65Var2;
            }
        }
        return f65Var;
    }
}
