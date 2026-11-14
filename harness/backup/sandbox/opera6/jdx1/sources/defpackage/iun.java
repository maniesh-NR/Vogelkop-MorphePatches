package defpackage;

import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class iun implements WebMessageBoundaryInterface {
    public static final String[] b = {WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER};
    public final jun a;

    public iun(jun junVar) {
        this.a = junVar;
    }

    public final String getData() {
        return this.a.b();
    }

    public final InvocationHandler getMessagePayload() {
        kun kunVar;
        jun junVar = this.a;
        boolean z = junVar.d;
        if (!z) {
            kunVar = new kun(junVar.b());
        } else {
            if (!z) {
                qp2.n(sko.i(z ? 1 : 0, "Unknown web message payload type: "));
                return null;
            }
            junVar.a(1);
            byte[] bArr = junVar.c;
            Objects.requireNonNull(bArr);
            kunVar = new kun(bArr);
        }
        return new er3(kunVar);
    }

    public final InvocationHandler[] getPorts() {
        lun[] lunVarArr = this.a.a;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[lunVarArr.length];
        for (int i = 0; i < lunVarArr.length; i++) {
            mun munVar = (mun) lunVarArr[i];
            WebMessagePortBoundaryInterface webMessagePortBoundaryInterface = munVar.b;
            if (webMessagePortBoundaryInterface == null) {
                u7k u7kVar = cxn.a;
                webMessagePortBoundaryInterface = (WebMessagePortBoundaryInterface) fr3.m(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) u7kVar.a).convertWebMessagePort(munVar.a));
                munVar.b = webMessagePortBoundaryInterface;
            }
            invocationHandlerArr[i] = Proxy.getInvocationHandler(webMessagePortBoundaryInterface);
        }
        return invocationHandlerArr;
    }

    public final String[] getSupportedFeatures() {
        return b;
    }
}
