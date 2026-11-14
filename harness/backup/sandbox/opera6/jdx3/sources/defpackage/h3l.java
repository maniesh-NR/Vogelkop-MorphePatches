package defpackage;

import android.view.View;
import com.opera.android.browser.chromium.ChromiumContainerView;

/* loaded from: classes.dex */
public final /* synthetic */ class h3l implements Runnable {
    public final /* synthetic */ xbf a;
    public final /* synthetic */ d7l b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ h3l(xbf xbfVar, d7l d7lVar, int i, int i2) {
        this.a = xbfVar;
        this.b = d7lVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xbf xbfVar = this.a;
        ((k6l) xbfVar.e).C(this.b, 3);
        fci fciVar = lf1.n;
        View view = (View) xbfVar.c;
        float f = this.d;
        view.setTranslationX(f);
        ChromiumContainerView chromiumContainerView = (ChromiumContainerView) xbfVar.d;
        chromiumContainerView.setTranslationX(f);
        ((View) xbfVar.f).animate().setDuration(400L).setInterpolator(fciVar).translationX(-r3);
        ((View) xbfVar.g).animate().setDuration(400L).setInterpolator(fciVar).translationX(this.c - r3);
        view.animate().setDuration(400L).setInterpolator(fciVar).translationX(0.0f);
        chromiumContainerView.animate().setDuration(400L).setInterpolator(fciVar).translationX(0.0f).withEndAction(new ssi(xbfVar, (byte) 9));
    }
}
