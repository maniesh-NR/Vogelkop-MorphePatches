package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class uah {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final h1b e;
    public final boolean f;
    public final long g;

    public uah(String str, String str2, String str3, String str4, h1b h1bVar, boolean z, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h1bVar;
        this.f = z;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uah.class != obj.getClass()) {
            return false;
        }
        uah uahVar = (uah) obj;
        if (this.a.equals(uahVar.a) && Objects.equals(this.b, uahVar.b) && this.c.equals(uahVar.c) && this.d.equals(uahVar.d) && this.f == uahVar.f && this.g == uahVar.g) {
            return this.e.equals(uahVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
