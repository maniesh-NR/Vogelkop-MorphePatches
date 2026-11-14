package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ydc {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, mdc mdcVar) {
        try {
            if (constructor.newInstance(mdcVar) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e) {
            rqd.p(e);
        } catch (InstantiationException e2) {
            rqd.p(e2);
        } catch (InvocationTargetException e3) {
            rqd.p(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydc.b(java.lang.Class):int");
    }
}
