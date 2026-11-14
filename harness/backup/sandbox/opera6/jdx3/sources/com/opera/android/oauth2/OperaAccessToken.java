package com.opera.android.oauth2;

import androidx.annotation.NonNull;
import java.util.Date;

/* loaded from: classes.dex */
public final class OperaAccessToken {
    public final String a;
    public final Date b;

    public OperaAccessToken(String str, Date date) {
        this.a = str;
        this.b = date;
    }

    @NonNull
    public static OperaAccessToken create(@NonNull String str, long j) {
        return new OperaAccessToken(str, new Date(j));
    }

    public final boolean a() {
        return this.b.before(new Date());
    }
}
