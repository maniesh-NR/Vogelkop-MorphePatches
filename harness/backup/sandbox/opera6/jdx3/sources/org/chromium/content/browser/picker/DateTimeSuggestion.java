package org.chromium.content.browser.picker;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class DateTimeSuggestion {
    public final double a;
    public final String b;
    public final String c;

    public DateTimeSuggestion(String str, double d, String str2) {
        this.a = d;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DateTimeSuggestion)) {
            return false;
        }
        DateTimeSuggestion dateTimeSuggestion = (DateTimeSuggestion) obj;
        return this.a == dateTimeSuggestion.a && TextUtils.equals(this.b, dateTimeSuggestion.b) && TextUtils.equals(this.c, dateTimeSuggestion.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f((1147 + ((int) this.a)) * 37, 37, this.b);
    }
}
