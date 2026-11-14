package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final class fnf extends NativeAd.Image {
    public final /* synthetic */ qhe a;

    public fnf(qhe qheVar) {
        this.a = qheVar;
    }

    public final Drawable getDrawable() {
        return this.a.b;
    }

    public final double getScale() {
        return 1.0d;
    }

    public final Uri getUri() {
        return this.a.a;
    }
}
