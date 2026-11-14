package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class od6 {
    public static final String a;

    static {
        try {
            try {
                String str = (String) pd6.a.get();
                pd6.a = null;
                a = str;
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            pd6.a = null;
            throw th;
        }
    }
}
