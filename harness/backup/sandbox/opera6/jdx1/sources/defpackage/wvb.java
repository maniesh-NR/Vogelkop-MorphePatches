package defpackage;

/* loaded from: classes.dex */
public final class wvb {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : i == 10 ? "PasswordVisible" : i == 11 ? "PostalAddress" : i == 12 ? "PersonName" : i == 13 ? "EmailSubject" : i == 14 ? "ShortMessage" : i == 15 ? "LongMessage" : i == 16 ? "Filter" : i == 17 ? "Phonetic" : i == 18 ? "DateTime" : i == 19 ? "Date" : i == 20 ? "Time" : i == 21 ? "NumberSigned" : i == 22 ? "DecimalSigned" : i == 23 ? "DecimalPassword" : i == 24 ? "NumberPasswordSigned" : i == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wvb) {
            return this.a == ((wvb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
