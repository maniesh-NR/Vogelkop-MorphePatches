package org.chromium.content_public.browser;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import defpackage.oji;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public interface WebContents extends Parcelable {
    void E1(boolean z);

    Rect F0();

    boolean G1();

    void H(int i, int i2, int i3, int i4);

    RenderFrameHost I();

    ViewAndroidDelegate J0();

    boolean K0();

    int P(GURL gurl, ImageDownloadCallback imageDownloadCallback);

    void Q(Rect rect);

    int T();

    void U0(String str);

    void V();

    void W0(String str, ViewAndroidDelegate viewAndroidDelegate, xr5 xr5Var, qi qiVar, oji ojiVar);

    ytm X(Class cls, ktn ktnVar);

    float d0();

    EventForwarder d1();

    boolean f0();

    int getVisibility();

    boolean isAudioMuted();

    boolean isDestroyed();

    WindowAndroid k0();

    boolean m();

    String n();

    int n0();

    GURL p();

    void p0();

    NavigationController q();

    RenderWidgetHostViewImpl r();

    GURL s();

    void setAudioMuted(boolean z);

    void setSmartClipResultHandler(Handler handler);

    void stop();

    boolean t1();

    void v0(cy3 cy3Var);

    void v1(int i);

    int x0();

    void y0(int i, int i2);

    void y1(int i);

    void z1();
}
