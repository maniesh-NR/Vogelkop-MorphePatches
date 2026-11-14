package ads_mobile_sdk;

import defpackage.xgp;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ru0 {
    public static final /* synthetic */ ru0 a = new ru0();
    public static final e7 b = new e7((byte) 13, false);
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static xgp a() {
        return (xgp) b.a("MobileAds.initialize must be called before using the Google Mobile Ads SDK.");
    }
}
