package defpackage;

import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class owj implements Comparable {
    public final String a;
    public final String b;
    public final Object[] c;
    public int d;
    public int e;

    public owj(String str, String str2, CharacterStyle characterStyle) {
        this.a = str;
        this.b = str2;
        this.c = new Object[]{characterStyle};
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.d;
        int i2 = ((owj) obj).d;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        return (obj instanceof owj) && (i = this.d) >= (i2 = ((owj) obj).d) && i == i2;
    }

    public final int hashCode() {
        return 0;
    }
}
