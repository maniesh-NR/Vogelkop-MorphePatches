package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ki9 implements Comparable {
    public static final ki9 b;
    public static final ki9 c;
    public static final ki9 d;
    public static final ki9 e;
    public static final ki9 f;
    public static final ki9 g;
    public static final ki9 h;
    public static final ki9 i;
    public static final List j;
    public final int a;

    static {
        ki9 ki9Var = new ki9(100);
        ki9 ki9Var2 = new ki9(200);
        ki9 ki9Var3 = new ki9(300);
        ki9 ki9Var4 = new ki9(400);
        b = ki9Var4;
        ki9 ki9Var5 = new ki9(500);
        c = ki9Var5;
        ki9 ki9Var6 = new ki9(600);
        d = ki9Var6;
        ki9 ki9Var7 = new ki9(700);
        ki9 ki9Var8 = new ki9(800);
        ki9 ki9Var9 = new ki9(900);
        e = ki9Var4;
        f = ki9Var5;
        g = ki9Var6;
        h = ki9Var7;
        i = ki9Var8;
        j = Arrays.asList(ki9Var, ki9Var2, ki9Var3, ki9Var4, ki9Var5, ki9Var6, ki9Var7, ki9Var8, ki9Var9);
    }

    public ki9(int i2) {
        this.a = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        b8b.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ki9 ki9Var) {
        return Intrinsics.b(this.a, ki9Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ki9) {
            return this.a == ((ki9) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return p3p.i(this.a, "FontWeight(weight=", ")");
    }
}
