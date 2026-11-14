package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class rme {

    @NotNull
    public static final qme Companion = new qme();
    public final int a;
    public final int b;

    public rme() {
        this.a = 0;
        this.b = 0;
    }

    public /* synthetic */ rme(int i, int i2, int i3) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rme)) {
            return false;
        }
        rme rmeVar = (rme) obj;
        return this.a == rmeVar.a && this.b == rmeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
