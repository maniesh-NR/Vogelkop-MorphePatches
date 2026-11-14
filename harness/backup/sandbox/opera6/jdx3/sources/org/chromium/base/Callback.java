package org.chromium.base;

import defpackage.bi2;

/* loaded from: classes.dex */
public interface Callback {

    public static abstract class Helper {
        public static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.c(Boolean.valueOf(z));
        }

        public static void onIntResultFromNative(Callback callback, int i) {
            callback.c(Integer.valueOf(i));
        }

        public static void onLongResultFromNative(Callback callback, long j) {
            callback.c(Long.valueOf(j));
        }

        public static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.c(obj);
        }
    }

    default bi2 a(Object obj) {
        return new bi2(this, obj, (byte) 22);
    }

    /* renamed from: onResult, reason: merged with bridge method [inline-methods] */
    void c(Object obj);
}
