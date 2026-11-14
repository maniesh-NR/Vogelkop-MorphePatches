package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o3g extends z4 {
    public final List b;
    public final int c;

    public o3g(List list) {
        this.b = list;
        this.c = list.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof n3g) {
            return super/*a4*/.contains((n3g) obj);
        }
        return false;
    }

    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3g) && Intrinsics.a(this.b, ((o3g) obj).b);
    }

    public final Object get(int i) {
        return (n3g) this.b.get(i);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof n3g) {
            return super.indexOf((n3g) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof n3g) {
            return super.lastIndexOf((n3g) obj);
        }
        return -1;
    }

    public final String toString() {
        return "";
    }
}
