package ads_mobile_sdk;

import defpackage.ocp;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class qm3 extends ocp {
    public static final Method a;

    static {
        Method method;
        try {
            method = String.class.getMethod("encodedLength", Charset.class);
        } catch (ReflectiveOperationException unused) {
            method = null;
        }
        a = method;
    }

    @Override // defpackage.ocp
    public final int a(String str) {
        try {
            return ((Integer) a.invoke(str, StandardCharsets.UTF_8)).intValue();
        } catch (ReflectiveOperationException e) {
            h9o.o(e);
            return 0;
        }
    }
}
