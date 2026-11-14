package defpackage;

import com.usercentrics.sdk.UsercentricsUserInteraction;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a75 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UsercentricsUserInteraction.values().length];
        try {
            iArr[UsercentricsUserInteraction.ACCEPT_ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UsercentricsUserInteraction.DENY_ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UsercentricsUserInteraction.GRANULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
