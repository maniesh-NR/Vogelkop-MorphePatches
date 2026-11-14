package com.opera.android.oauth2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class LoginResult {
    public final int a;
    public final String b;

    public LoginResult(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @NonNull
    public static LoginResult forError(int i) {
        return new LoginResult(i, null);
    }

    @NonNull
    public static LoginResult forUser(@Nullable String str) {
        return new LoginResult(0, str);
    }
}
