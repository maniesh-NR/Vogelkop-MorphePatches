package defpackage;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hyn extends fyn {
    public static final WeakHashMap a = new WeakHashMap();

    public static hyn a(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = a;
        hyn hynVar = (hyn) weakHashMap.get(webViewRenderProcess);
        if (hynVar != null) {
            return hynVar;
        }
        hyn hynVar2 = new hyn();
        new WeakReference(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, hynVar2);
        return hynVar2;
    }
}
