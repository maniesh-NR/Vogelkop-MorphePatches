package com.opera.android.favorites;

import J.N;
import androidx.annotation.NonNull;
import defpackage.h42;
import defpackage.p6l;
import java.util.List;

/* loaded from: classes.dex */
public final class PushedSpeedDialSuggestionProvider extends lt8 {
    public final h42 c;

    public PushedSpeedDialSuggestionProvider(h42 h42Var, int i, int i2, int i3, int i4) {
        super((byte) 1);
        this.c = h42Var;
        e(N.MGWi5Jme(this, 20, i, i2, i3, i4));
    }

    @NonNull
    public static String getEntryTitle(@NonNull PushedSpeedDialFavorite pushedSpeedDialFavorite) {
        return pushedSpeedDialFavorite.e.d;
    }

    @NonNull
    public static String getEntryUrl(@NonNull PushedSpeedDialFavorite pushedSpeedDialFavorite) {
        return pushedSpeedDialFavorite.i(p6l.a);
    }

    @NonNull
    public final PushedSpeedDialFavorite[] getEntries() {
        List list = (List) this.c.g();
        return list == null ? new PushedSpeedDialFavorite[0] : (PushedSpeedDialFavorite[]) list.toArray(new PushedSpeedDialFavorite[0]);
    }
}
