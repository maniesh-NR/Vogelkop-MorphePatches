package com.opera.android.autofill;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class Address extends AutofillItem {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final boolean o;

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z) {
        super(str);
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = z;
    }

    @NonNull
    public static Address create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, @NonNull String str9, @NonNull String str10, @NonNull String str11, @NonNull String str12, @NonNull String str13, @NonNull String str14, boolean z) {
        return new Address(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z);
    }

    @NonNull
    public final String getCompanyName() {
        return this.c;
    }

    @NonNull
    public final String getCountryCode() {
        return this.j;
    }

    @NonNull
    public final String getDependentLocality() {
        return this.g;
    }

    @NonNull
    public final String getEmailAddress() {
        return this.l;
    }

    @NonNull
    public final String getFullName() {
        return this.b;
    }

    @NonNull
    public final String getLanguageCode() {
        return this.m;
    }

    @NonNull
    public final String getLocality() {
        return this.f;
    }

    @NonNull
    public final String getPhoneNumber() {
        return this.k;
    }

    @NonNull
    public final String getPostalCode() {
        return this.h;
    }

    @NonNull
    public final String getRegion() {
        return this.e;
    }

    @NonNull
    public final String getSortingCode() {
        return this.i;
    }

    @NonNull
    public final String getStreetAddress() {
        return this.d;
    }

    public final boolean isContactInfo() {
        return this.o;
    }
}
