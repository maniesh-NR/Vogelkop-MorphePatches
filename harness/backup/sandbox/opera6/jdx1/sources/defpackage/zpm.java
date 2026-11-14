package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zpm extends oua {
    public final String b;
    public final String c;

    public zpm(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zpm.class != obj.getClass()) {
            return false;
        }
        zpm zpmVar = (zpm) obj;
        return this.a.equals(zpmVar.a) && Objects.equals(this.b, zpmVar.b) && this.c.equals(zpmVar.c);
    }

    public final int hashCode() {
        int iF = z1m.f(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iF + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.oua
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
