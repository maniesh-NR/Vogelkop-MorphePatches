package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rq1 extends dbh {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ wq1 d;

    public rq1(wq1 wq1Var, int i, int i2, WeakReference weakReference) {
        this.d = wq1Var;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.dbh
    public final void E(Typeface typeface) {
        byte b = 0;
        int i = this.a;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        wq1 wq1Var = this.d;
        if (wq1Var.m) {
            wq1Var.k = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = wq1Var.i;
                if (zIsAttachedToWindow) {
                    textView.post(new sq1(textView, typeface, i2, b));
                    return;
                }
                y3d y3dVar = uq1.a;
                String fontVariationSettings = textView.getFontVariationSettings();
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    uq1.a(textView, null);
                }
                textView.setTypeface(typeface, i2);
                if (TextUtils.isEmpty(fontVariationSettings)) {
                    return;
                }
                uq1.a(textView, fontVariationSettings);
            }
        }
    }
}
