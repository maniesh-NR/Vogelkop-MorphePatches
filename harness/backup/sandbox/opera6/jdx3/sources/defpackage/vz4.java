package defpackage;

import com.opera.android.browser.Referrer$Policy;

/* loaded from: classes.dex */
public abstract /* synthetic */ class vz4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Referrer$Policy.values().length];
        a = iArr;
        try {
            iArr[Referrer$Policy.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Referrer$Policy.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Referrer$Policy.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Referrer$Policy.ORIGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[Referrer$Policy.NO_REFERRER_WHEN_DOWNGRADE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[Referrer$Policy.ORIGIN_WHEN_CROSSORIGIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[Referrer$Policy.STRICT_ORIGIN_WHEN_CROSSORIGIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[Referrer$Policy.SAME_ORIGIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[Referrer$Policy.STRICT_ORIGIN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
