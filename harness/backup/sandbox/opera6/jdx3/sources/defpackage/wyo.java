package defpackage;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class wyo {

    @NotNull
    public static final vyo Companion = new vyo();
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public final String k;

    public wyo(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2) {
        String str = Build.FINGERPRINT;
        this.a = "aaid";
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = j;
        this.j = j2;
        this.k = str;
    }

    public wyo(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, String str2) {
        if (2046 != (i & 2046)) {
            x7d.I(i, 2046, uyo.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = "aaid";
        } else {
            this.a = str;
        }
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = j;
        this.j = j2;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyo)) {
            return false;
        }
        wyo wyoVar = (wyo) obj;
        return Intrinsics.a(this.a, wyoVar.a) && this.b == wyoVar.b && this.c == wyoVar.c && this.d == wyoVar.d && this.e == wyoVar.e && this.f == wyoVar.f && this.g == wyoVar.g && this.h == wyoVar.h && this.i == wyoVar.i && this.j == wyoVar.j && Intrinsics.a(this.k, wyoVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + z1m.e(z1m.e(rfp.c(this.h, rfp.c(this.g, rfp.c(this.f, rfp.c(this.e, rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceExt(ifaType=");
        sb.append(this.a);
        sb.append(", osApiLevel=");
        sb.append(this.b);
        sb.append(", googleServiceAvailable=");
        sb.append(this.c);
        sb.append(", batteryLevel=");
        sb.append(this.d);
        sb.append(", batteryStatus=");
        sb.append(this.e);
        sb.append(", volumeLevel=");
        sb.append(this.f);
        sb.append(", mute=");
        sb.append(this.g);
        sb.append(", sdcardAvailable=");
        sb.append(this.h);
        sb.append(", systemBootedTime=");
        sb.append(this.i);
        sb.append(", systemBuildTime=");
        sb.append(this.j);
        sb.append(", romFingerprint=");
        return o18.p(sb, this.k, ')');
    }
}
