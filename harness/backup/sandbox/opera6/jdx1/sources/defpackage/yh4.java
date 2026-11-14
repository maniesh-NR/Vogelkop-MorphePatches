package defpackage;

import android.view.accessibility.CaptioningManager;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.IllformedLocaleException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class yh4 extends CaptioningManager.CaptioningChangeListener {
    public static yh4 c;
    public final bp3 a = new bp3();
    public final CaptioningManager b = (CaptioningManager) t8.a.getSystemService("captioning");

    public final void a() {
        CaptioningManager captioningManager = this.b;
        boolean zIsEnabled = captioningManager.isEnabled();
        bp3 bp3Var = this.a;
        bp3Var.b = zIsEnabled;
        bp3Var.e();
        bp3Var.i = new DecimalFormat("#%", new DecimalFormatSymbols(Locale.US)).format(captioningManager.getFontScale());
        bp3Var.e();
        try {
            captioningManager.getLocale();
        } catch (IllformedLocaleException unused) {
        }
        bp3Var.f(wjh.h(captioningManager.getUserStyle()));
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        bp3 bp3Var = this.a;
        bp3Var.b = z;
        bp3Var.e();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onFontScaleChanged(float f) {
        bp3 bp3Var = this.a;
        bp3Var.getClass();
        bp3Var.i = new DecimalFormat("#%", new DecimalFormatSymbols(Locale.US)).format(f);
        bp3Var.e();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onLocaleChanged(Locale locale) {
        this.a.getClass();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        this.a.f(wjh.h(captionStyle));
    }
}
