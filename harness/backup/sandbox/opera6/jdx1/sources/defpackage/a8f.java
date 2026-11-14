package defpackage;

import com.appsflyer.deeplink.DeepLinkResult;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a8f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeepLinkResult.Status.values().length];
        a = iArr;
        try {
            iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[DeepLinkResult.Status.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
