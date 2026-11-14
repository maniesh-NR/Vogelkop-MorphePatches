package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bwc {
    public static final bwc b = new bwc(new cwc(new LocaleList(new Locale[0])));
    public final cwc a;

    public bwc(cwc cwcVar) {
        this.a = cwcVar;
    }

    public static bwc a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new bwc(new cwc(new LocaleList(localeArr)));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final int c() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bwc) {
            return this.a.equals(((bwc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
