package com.opera.android.browser;

import J.N;
import androidx.annotation.NonNull;
import defpackage.vgi;
import defpackage.wgi;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class SafeBrowsingBridge {
    public static vgi a;
    public static ArrayDeque b = new ArrayDeque();

    public static void checkUrl(@NonNull String str, long j) {
        ArrayDeque arrayDeque = b;
        if (arrayDeque != null) {
            arrayDeque.add(new wgi(str, j));
            return;
        }
        vgi vgiVar = a;
        if (vgiVar == null || vgiVar.g) {
            N.MY0CkqZH(j, false, 0);
        } else {
            vgiVar.e.lookupUri(str, vgiVar.f, new int[]{4, 5, 15}).addOnSuccessListener(new rh2(j)).addOnFailureListener(new rh2(j));
        }
    }

    public static void init() {
    }

    public static void shutdown() {
    }
}
