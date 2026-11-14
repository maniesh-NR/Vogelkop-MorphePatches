package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class m4l {

    @NotNull
    public static final l4l Companion = new l4l();
    public static final List d = Arrays.asList(new k4l(new dxh(2130969125), new dxh(2130969145)), new k4l(new dxh(2130969184), new dxh(2130969162)), new k4l(new dxh(2130969194), new dxh(2130969172)), new k4l(new dxh(2130969202), new dxh(2130969180)), new k4l(new dxh(2130969192), new dxh(2130969170)), new k4l(new dxh(2130969127), new dxh(2130969147)), new k4l(new dxh(2130969131), new dxh(2130969151)), new k4l(new dxh(2130969188), new dxh(2130969166)), new k4l(new dxh(2130969182), new dxh(2130969160)), new k4l(new dxh(2130969135), new dxh(2130969155)));
    public final int a;
    public final String b;
    public final int c;

    public /* synthetic */ m4l(int i, int i2, int i3, String str) {
        if (5 != (i & 5)) {
            x7d.I(i, 5, j4l.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = i3;
    }

    public m4l(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public static m4l a(m4l m4lVar, String str, int i, int i2) {
        int i3 = m4lVar.a;
        if ((i2 & 4) != 0) {
            i = m4lVar.c;
        }
        return new m4l(i3, str, i);
    }

    public final k4l b() {
        List list = d;
        int size = list.size();
        int i = this.c % size;
        return (k4l) list.get(i + (size & (((i ^ size) & ((-i) | i)) >> 31)));
    }

    public final pxh c() {
        String str = this.b;
        return (str == null || str.length() == 0) ? u4l.f : new qxh(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4l)) {
            return false;
        }
        m4l m4lVar = (m4l) obj;
        return this.a == m4lVar.a && Intrinsics.a(this.b, m4lVar.b) && this.c == m4lVar.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
