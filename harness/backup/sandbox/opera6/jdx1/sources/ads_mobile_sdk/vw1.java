package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.pjp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vw1 extends ku0 {
    private static final vw1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int bitField0_;
    private boolean disableImageLoading_;
    private boolean isBannerAllowed_;
    private boolean isNativeAllowed_;
    private boolean multipleImages_;
    private String nativeMediaOrientation_ = "";
    private int preferredAdChoicesPosition_;
    private xw1 sdkCustomClickGesture_;
    private boolean useCustomMute_;
    private zw1 videoOptions_;

    static {
        vw1 vw1Var = new vw1();
        DEFAULT_INSTANCE = vw1Var;
        ku0.a(vw1.class, vw1Var);
    }

    public static pjp o() {
        return (pjp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဉ\b", new Object[]{"bitField0_", "videoOptions_", "multipleImages_", "useCustomMute_", "preferredAdChoicesPosition_", "disableImageLoading_", "nativeMediaOrientation_", "isBannerAllowed_", "isNativeAllowed_", "sdkCustomClickGesture_"});
        }
        if (iA == 3) {
            return new vw1();
        }
        if (iA == 4) {
            return new pjp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(vw1.class);
        }
        throw null;
    }

    public final void a(xw1 xw1Var) {
        this.sdkCustomClickGesture_ = xw1Var;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final void a(zw1 zw1Var) {
        this.videoOptions_ = zw1Var;
        this.bitField0_ |= 1;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.nativeMediaOrientation_ = str;
    }
}
