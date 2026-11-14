package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class dxn {
    public static final dyn a;

    static {
        dyn w4bVar;
        try {
            w4bVar = new eyn((WebViewProviderFactoryBoundaryInterface) fr3.m(WebViewProviderFactoryBoundaryInterface.class, exg.o()));
        } catch (ClassNotFoundException unused) {
            w4bVar = new w4b();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            rqd.p(e);
            return;
        }
        a = w4bVar;
    }
}
