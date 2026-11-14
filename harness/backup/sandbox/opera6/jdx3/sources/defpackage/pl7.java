package defpackage;

import android.graphics.PorterDuff;

/* loaded from: classes.dex */
public abstract /* synthetic */ class pl7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PorterDuff.Mode.values().length];
        try {
            iArr[PorterDuff.Mode.MULTIPLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PorterDuff.Mode.LIGHTEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PorterDuff.Mode.CLEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PorterDuff.Mode.SRC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PorterDuff.Mode.DST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PorterDuff.Mode.SRC_OVER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PorterDuff.Mode.DST_OVER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PorterDuff.Mode.SRC_IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PorterDuff.Mode.DST_IN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PorterDuff.Mode.SRC_OUT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PorterDuff.Mode.DST_OUT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PorterDuff.Mode.SRC_ATOP.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PorterDuff.Mode.DST_ATOP.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PorterDuff.Mode.XOR.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[PorterDuff.Mode.DARKEN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[PorterDuff.Mode.SCREEN.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[PorterDuff.Mode.ADD.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[PorterDuff.Mode.OVERLAY.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        a = iArr;
    }
}
