package com.opera.android.autofill;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class CreditCard extends AutofillItem {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;

    public CreditCard(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(str);
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    @NonNull
    public static CreditCard create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, int i, @Nullable String str7, @NonNull String str8, @NonNull String str9) {
        return new CreditCard(str, str2, i, str3, str4, str5, str7, str8, str9);
    }

    public final String a() {
        String strSubstring = this.e;
        if (strSubstring.isEmpty()) {
            return null;
        }
        StringBuilder sbH = u35.h(this.d, "/");
        if (strSubstring.length() == 4) {
            strSubstring = strSubstring.substring(2, 4);
        }
        sbH.append(strSubstring);
        return sbH.toString();
    }

    @Nullable
    public final String getBillingAddressId() {
        return this.g;
    }

    @NonNull
    public final String getCardNickname() {
        return this.h;
    }

    @NonNull
    public final String getCvc() {
        return this.i;
    }

    @NonNull
    public final String getMonth() {
        return this.d;
    }

    @NonNull
    public final String getName() {
        return this.b;
    }

    @NonNull
    public final String getYear() {
        return this.e;
    }
}
