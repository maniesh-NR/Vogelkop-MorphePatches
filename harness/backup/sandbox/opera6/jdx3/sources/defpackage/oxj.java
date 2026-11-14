package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class oxj {
    public final sxj a;
    public final sxj b;
    public final sxj c;
    public final sxj d;
    public final Size e;
    public final Size f;
    public final Size g;

    public oxj(sxj sxjVar, sxj sxjVar2, sxj sxjVar3, sxj sxjVar4, Size size, Size size2, Size size3) {
        this.a = sxjVar;
        this.b = sxjVar2;
        this.c = sxjVar3;
        this.d = sxjVar4;
        this.e = size;
        this.f = size2;
        this.g = size3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxj)) {
            return false;
        }
        oxj oxjVar = (oxj) obj;
        return this.a.equals(oxjVar.a) && this.b.equals(oxjVar.b) && this.c.equals(oxjVar.c) && this.d.equals(oxjVar.d) && this.e.equals(oxjVar.e) && this.f.equals(oxjVar.f) && this.g.equals(oxjVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 29791)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
