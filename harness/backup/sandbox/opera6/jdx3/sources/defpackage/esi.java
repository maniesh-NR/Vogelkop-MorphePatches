package defpackage;

import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import android.icu.text.StringSearch;
import java.text.StringCharacterIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class esi {
    public final String a;
    public final Locale b;
    public final zyk c = z4c.b(new j3i(this, 14));
    public final StringSearch d;

    public esi(String str, Locale locale) {
        StringSearch stringSearch;
        this.a = str;
        this.b = locale;
        try {
            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(" ");
            Collator collator = Collator.getInstance(locale);
            collator.setStrength(0);
            stringSearch = new StringSearch(str, stringCharacterIterator, (RuleBasedCollator) collator);
        } catch (IndexOutOfBoundsException unused) {
            stringSearch = null;
        }
        this.d = stringSearch;
    }

    public final int a(String str) {
        StringSearch stringSearch;
        if (str.length() == 0 || (stringSearch = this.d) == null) {
            return -1;
        }
        stringSearch.setTarget(new StringCharacterIterator(str));
        try {
            return stringSearch.next();
        } catch (IndexOutOfBoundsException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esi)) {
            return false;
        }
        esi esiVar = (esi) obj;
        return Intrinsics.a(this.a, esiVar.a) && Intrinsics.a(this.b, esiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
