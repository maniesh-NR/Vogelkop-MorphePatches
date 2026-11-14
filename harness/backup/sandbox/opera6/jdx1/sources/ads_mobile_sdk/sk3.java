package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd$Image;
import defpackage.yip;

/* loaded from: classes.dex */
public final class sk3 implements yip {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;

    public sk3(NativeAd$Image nativeAd$Image) {
        this.a = nativeAd$Image.getDrawable();
        this.b = nativeAd$Image.getUri();
        this.c = nativeAd$Image.getScale();
        this.d = nativeAd$Image.getWidth();
        this.e = nativeAd$Image.getHeight();
    }

    @Override // defpackage.yip
    public final double a() {
        return this.c;
    }

    @Override // defpackage.yip
    public final int b() {
        return this.d;
    }

    @Override // defpackage.yip
    public final int c() {
        return this.e;
    }

    @Override // defpackage.yip
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.yip
    public final Drawable e() {
        return this.a;
    }
}
