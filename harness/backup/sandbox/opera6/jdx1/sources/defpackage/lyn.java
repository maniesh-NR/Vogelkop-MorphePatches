package defpackage;

import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* loaded from: classes.dex */
public final class lyn implements WebViewStartUpCallbackBoundaryInterface {
    public final r2n a;

    public lyn(r2n r2nVar) {
        this.a = r2nVar;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public final void onSuccess(InvocationHandler invocationHandler) {
        ArrayList arrayList;
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) fr3.m(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Throwable> it = blockingStartUpLocations.iterator();
        while (it.hasNext()) {
            arrayList2.add(new kyn(it.next()));
        }
        if (axn.u.a()) {
            List<Throwable> asyncStartUpLocations = webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations();
            arrayList = new ArrayList();
            Iterator<Throwable> it2 = asyncStartUpLocations.iterator();
            while (it2.hasNext()) {
                arrayList.add(new kyn(it2.next()));
            }
        } else {
            arrayList = null;
        }
        this.a.onSuccess(new wtm(arrayList2, arrayList, webViewStartUpResultBoundaryInterface));
    }
}
