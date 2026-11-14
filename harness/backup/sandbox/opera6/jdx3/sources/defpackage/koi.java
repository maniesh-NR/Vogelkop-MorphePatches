package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.opera.android.browser.WebContentsWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final class koi implements Callback {
    public final b7f a;
    public final foi b;
    public WebContentsWrapper c;
    public ViewGroup d;
    public final ArrayList e;
    public final HashMap f;
    public boolean g;

    public koi(b7f b7fVar) {
        foi foiVar = new foi((byte) 1);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new HashMap();
        this.a = b7fVar;
        this.b = foiVar;
        b7fVar.getClass();
        b7fVar.c(this);
        arrayList.add(null);
    }

    public final WebContentsWrapper b() {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            WebContentsWrapper webContentsWrapper = (WebContentsWrapper) arrayList.get(size);
            if (((Boolean) this.f.get(webContentsWrapper)).booleanValue()) {
                return webContentsWrapper;
            }
        }
        return (WebContentsWrapper) arrayList.get(0);
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        WebContentsWrapper webContentsWrapper = (WebContentsWrapper) obj;
        this.e.set(0, webContentsWrapper);
        if (webContentsWrapper == b()) {
            this.c = webContentsWrapper;
            foi foiVar = this.b;
            ((ioi) foiVar.a).a.b = webContentsWrapper;
            if (webContentsWrapper == null || this.g) {
                return;
            }
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                foiVar.getClass();
                foi.b(viewGroup, (ioi) null);
                this.d = null;
            }
            if (webContentsWrapper.j) {
                return;
            }
            View view = webContentsWrapper.getView();
            this.d = (ViewGroup) view;
            if (view != null) {
                foi.b((ViewGroup) view, (ioi) foiVar.a);
            }
        }
    }
}
