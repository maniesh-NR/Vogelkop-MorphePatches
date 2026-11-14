package defpackage;

/* loaded from: classes.dex */
public final class rvb {
    public static final rvb c = new rvb(0, 0, 127);
    public final int a;
    public final int b;

    public rvb(int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvb)) {
            return false;
        }
        rvb rvbVar = (rvb) obj;
        return this.a == rvbVar.a && this.b == rvbVar.b;
    }

    public final int hashCode() {
        return rfp.c(this.b, rfp.c(this.a, (-31) * 31, 31), 29791);
    }

    public final String toString() {
        return sko.l("KeyboardOptions(capitalization=Unspecified, autoCorrectEnabled=null, keyboardType=", wvb.a(this.a), ", imeAction=", h0b.a(this.b), ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }
}
