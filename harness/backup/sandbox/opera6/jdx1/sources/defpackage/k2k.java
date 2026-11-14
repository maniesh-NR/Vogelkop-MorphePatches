package defpackage;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class k2k {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public k2k(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        int i;
        try {
            i = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                u35.q("Ignoring unknown alignment: ", str);
                return -1;
        }
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            w7d.L("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            z4o.w(j <= 4294967295L);
            return Integer.valueOf(Color.argb(sgb.l(((j >> 24) & 255) ^ 255), sgb.l(j & 255), sgb.l((j >> 8) & 255), sgb.l((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            w7d.L("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
