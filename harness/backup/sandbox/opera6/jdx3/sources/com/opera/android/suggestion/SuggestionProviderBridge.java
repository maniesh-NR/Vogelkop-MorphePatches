package com.opera.android.suggestion;

import J.N;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.aik;
import java.util.List;

/* loaded from: classes.dex */
public abstract class SuggestionProviderBridge extends lt8 {
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public SuggestionProviderBridge(int i) {
        super((byte) 1);
        e(N.M8wB29Rt(this));
        this.c = i;
    }

    @Nullable
    public static Object getDataObj(@NonNull Suggestion suggestion) {
        return suggestion.k;
    }

    public static int getRelevance(@NonNull Suggestion suggestion) {
        return suggestion.g;
    }

    public static int getSize(@NonNull List<Suggestion> list) {
        return list.size();
    }

    @NonNull
    public static Suggestion getSuggestion(@NonNull List<Suggestion> list, int i) {
        return list.get(i);
    }

    @NonNull
    public static String getTitle(@NonNull Suggestion suggestion) {
        return suggestion.b;
    }

    public static int getType(@NonNull Suggestion suggestion) {
        return suggestion.a;
    }

    @NonNull
    public static String getUrl(@NonNull Suggestion suggestion) {
        String str = suggestion.d;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    public abstract void cancel();

    public final void clearCache() {
    }

    public final Object d() {
        return this;
    }

    public abstract void g(String str, boolean z, boolean z2, yv4 yv4Var);

    public final void query(@NonNull String str, boolean z, boolean z2, long j) {
        g(str, z, z2, new yv4(this, j, (byte) 8));
    }
}
