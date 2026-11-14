package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class m9d {
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final p4j c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;
    public final LinkedHashSet f;

    public m9d(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, p4j p4jVar, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, LinkedHashSet linkedHashSet5) {
        this.a = linkedHashSet;
        this.b = linkedHashSet2;
        this.c = p4jVar;
        this.d = linkedHashSet3;
        this.e = linkedHashSet4;
        this.f = linkedHashSet5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9d)) {
            return false;
        }
        m9d m9dVar = (m9d) obj;
        return this.a.equals(m9dVar.a) && this.b.equals(m9dVar.b) && this.c.equals(m9dVar.c) && this.d.equals(m9dVar.d) && this.e.equals(m9dVar.e) && this.f.equals(m9dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
