package defpackage;

import J.N;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.WebContentsWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class leg extends ptn {
    public final /* synthetic */ byte b = 2;
    public final Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leg(WebContentsWrapper webContentsWrapper, WebContents webContents, WebContents webContents2) {
        super(webContents);
        this.c = webContents2;
        this.d = webContentsWrapper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leg(koi koiVar, WebContents webContents, WebContentsWrapper webContentsWrapper) {
        super(webContents);
        this.c = webContentsWrapper;
        Objects.requireNonNull(koiVar);
        this.d = koiVar;
    }

    public leg(meg megVar, BrowserActivity browserActivity) {
        this.d = megVar;
        this.c = browserActivity;
    }

    public final void didFinishNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        boolean z;
        boolean z2;
        switch (this.b) {
            case 2:
                WebContentsWrapper webContentsWrapper = (WebContentsWrapper) this.d;
                webContentsWrapper.j = navigationHandle.j;
                String str = ((WebContents) this.c).s().a;
                boolean z3 = true;
                boolean z4 = UrlMangler.c(str) || UrlMangler.d(str);
                boolean z5 = webContentsWrapper.g;
                if (z5 == z4) {
                    z4 = z5;
                    z = false;
                } else {
                    webContentsWrapper.g = z4;
                    z = true;
                }
                boolean z6 = z4 || z5i.a0(str);
                if (webContentsWrapper.f == z6) {
                    z2 = false;
                } else {
                    webContentsWrapper.f = z6;
                    z2 = true;
                }
                boolean z7 = z | z2;
                int iMjn2DHEV = N.Mjn2DHEV(str);
                if (webContentsWrapper.e == iMjn2DHEV) {
                    z3 = false;
                } else {
                    webContentsWrapper.e = iMjn2DHEV;
                }
                if (!z7 && !z3) {
                    if (webContentsWrapper.g) {
                        long j = webContentsWrapper.a;
                        if (j != 0) {
                            N.MlSk$KdJ(j);
                            break;
                        }
                    }
                } else {
                    webContentsWrapper.i();
                    long j2 = webContentsWrapper.a;
                    if (j2 != 0) {
                        N.MlSk$KdJ(j2);
                        break;
                    }
                }
                break;
        }
    }

    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        switch (this.b) {
            case 2:
                ((WebContentsWrapper) this.d).j = false;
                break;
        }
    }

    public final void g() {
        WebContentsWrapper webContentsWrapper = (WebContentsWrapper) this.c;
        koi koiVar = (koi) this.d;
        boolean z = koiVar.g;
        HashMap map = koiVar.f;
        foi foiVar = koiVar.b;
        if (z || !((Boolean) map.get(webContentsWrapper)).booleanValue()) {
            return;
        }
        map.put(webContentsWrapper, Boolean.FALSE);
        if (webContentsWrapper == koiVar.c) {
            ViewGroup viewGroup = koiVar.d;
            if (viewGroup != null) {
                foiVar.getClass();
                foi.b(viewGroup, (ioi) null);
                koiVar.d = null;
            }
            ((ioi) foiVar.a).a.b = null;
            WebContentsWrapper webContentsWrapperB = koiVar.b();
            koiVar.c = webContentsWrapperB;
            if (webContentsWrapperB == null || webContentsWrapperB.j) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) webContentsWrapperB.getView();
            koiVar.d = viewGroup2;
            if (viewGroup2 != null) {
                foi.b(viewGroup2, (ioi) foiVar.a);
            }
            ((ioi) foiVar.a).a.b = koiVar.c;
        }
    }

    public final void hasEffectivelyFullscreenVideoChange(boolean z) {
        switch (this.b) {
            case 0:
                if (!z) {
                    meg megVar = (meg) this.d;
                    ((BrowserActivity) this.c).moveTaskToBack(true);
                    megVar.a();
                    break;
                }
                break;
        }
    }

    public final void onVisibilityChanged(int i) {
        switch (this.b) {
            case 1:
                if (i == 0) {
                    g();
                    break;
                } else if (i == 2) {
                    WebContentsWrapper webContentsWrapper = (WebContentsWrapper) this.c;
                    koi koiVar = (koi) this.d;
                    boolean z = koiVar.g;
                    foi foiVar = koiVar.b;
                    ArrayList arrayList = koiVar.e;
                    HashMap map = koiVar.f;
                    if (!z && !((Boolean) map.get(webContentsWrapper)).booleanValue()) {
                        map.put(webContentsWrapper, Boolean.TRUE);
                        if (arrayList.indexOf(webContentsWrapper) >= arrayList.indexOf(koiVar.c)) {
                            ViewGroup viewGroup = koiVar.d;
                            if (viewGroup != null) {
                                foiVar.getClass();
                                foi.b(viewGroup, (ioi) null);
                                koiVar.d = null;
                            }
                            ((ioi) foiVar.a).a.b = null;
                            koiVar.c = webContentsWrapper;
                            if (!webContentsWrapper.j) {
                                View view = webContentsWrapper.getView();
                                koiVar.d = (ViewGroup) view;
                                if (view != null) {
                                    foi.b((ViewGroup) view, (ioi) foiVar.a);
                                }
                                ((ioi) foiVar.a).a.b = webContentsWrapper;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public final void webContentsDestroyed() {
        switch (this.b) {
            case 1:
                g();
                koi koiVar = (koi) this.d;
                ArrayList arrayList = koiVar.e;
                WebContentsWrapper webContentsWrapper = (WebContentsWrapper) this.c;
                arrayList.remove(webContentsWrapper);
                koiVar.f.remove(webContentsWrapper);
                break;
        }
    }
}
