package defpackage;

import android.util.Range;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ctk {
    public final int a;
    public final byte b;
    public final boolean c;
    public final t4n d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public ctk(int i, int i2, boolean z, t4n t4nVar, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = t4nVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = range;
        this.j = z6;
    }

    public static ctk a(ctk ctkVar, boolean z, Range range, int i) {
        int i2 = ctkVar.a;
        byte b = ctkVar.b;
        boolean z2 = ctkVar.c;
        t4n t4nVar = ctkVar.d;
        boolean z3 = ctkVar.e;
        boolean z4 = ctkVar.f;
        boolean z5 = ctkVar.g;
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            range = ctkVar.i;
        }
        return new ctk(i2, b, z2, t4nVar, z3, z4, z5, z, range, ctkVar.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctk)) {
            return false;
        }
        ctk ctkVar = (ctk) obj;
        return this.a == ctkVar.a && this.b == ctkVar.b && this.c == ctkVar.c && this.d == ctkVar.d && this.e == ctkVar.e && this.f == ctkVar.f && this.g == ctkVar.g && this.h == ctkVar.h && Intrinsics.a(this.i, ctkVar.i) && this.j == ctkVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + fki.k(fki.k(fki.k(fki.k((this.d.hashCode() + fki.k(rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        return "FeatureSettings(cameraMode=" + this.a + ", requiredMaxBitDepth=" + ((int) this.b) + ", hasVideoCapture=" + this.c + ", videoStabilization=" + this.d + ", isUltraHdrOn=" + this.e + ", isHighSpeedOn=" + this.f + ", isFeatureComboInvocation=" + this.g + ", requiresFeatureComboQuery=" + this.h + ", targetFpsRange=" + this.i + ", isStrictFpsRequired=" + this.j + ')';
    }
}
