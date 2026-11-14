package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class pf2 {
    public static final pf2 i = new pf2(0, 0, 1, false, true, 1, 0);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public AudioAttributes h;

    static {
        String str = tym.a;
        j = "0";
        k = "1";
        l = "2";
        m = "3";
        n = "4";
        o = "5";
        p = "6";
    }

    public pf2(int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
        this.g = z2;
    }

    public static pf2 a(Bundle bundle) {
        String str = j;
        int i2 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = k;
        int i3 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = l;
        int i4 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = m;
        int i5 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = n;
        int i6 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = o;
        boolean z = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = p;
        return new pf2(i2, i3, i4, z, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true, i5, i6);
    }

    public final AudioAttributes b() {
        AudioAttributes audioAttributes = this.h;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
        usage.setAllowedCapturePolicy(this.d);
        usage.setHapticChannelsMuted(this.g);
        if (Build.VERSION.SDK_INT >= 32) {
            of2.b(usage, this.e);
            of2.a(usage, this.f);
        }
        AudioAttributes audioAttributesBuild = usage.build();
        this.h = audioAttributesBuild;
        return audioAttributesBuild;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        int i2 = this.a;
        if (i2 != 0) {
            bundle.putInt(j, i2);
        }
        int i3 = this.b;
        if (i3 != 0) {
            bundle.putInt(k, i3);
        }
        int i4 = this.c;
        if (i4 != 1) {
            bundle.putInt(l, i4);
        }
        int i5 = this.d;
        if (i5 != 1) {
            bundle.putInt(m, i5);
        }
        int i6 = this.e;
        if (i6 != 0) {
            bundle.putInt(n, i6);
        }
        boolean z = this.f;
        if (z) {
            bundle.putBoolean(o, z);
        }
        boolean z2 = this.g;
        if (!z2) {
            bundle.putBoolean(p, z2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pf2.class == obj.getClass()) {
            pf2 pf2Var = (pf2) obj;
            if (this.a == pf2Var.a && this.b == pf2Var.b && this.c == pf2Var.c && this.d == pf2Var.d && this.e == pf2Var.e && this.f == pf2Var.f && this.g == pf2Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
