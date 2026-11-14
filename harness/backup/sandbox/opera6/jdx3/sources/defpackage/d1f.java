package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class d1f {
    public final Bundle a;
    public IconCompat b;
    public final ith[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final PendingIntent l;
    public final boolean m;

    public d1f(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ith[] ithVarArr, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, boolean z4) {
        this(i != 0 ? IconCompat.d((Resources) null, "", i) : null, charSequence, pendingIntent, bundle, ithVarArr, z, i2, z2, z3, i3, i4, z4);
    }

    public d1f(int i, String str, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.d((Resources) null, "", i) : null, (CharSequence) str, pendingIntent, new Bundle(), (ith[]) null, true, 0, true, false, 0, 0, false);
    }

    public d1f(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ith[] ithVarArr, boolean z, int i, boolean z2, boolean z3, int i2, int i3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i4 = iconCompat.a;
            if ((i4 == -1 ? ((Icon) iconCompat.b).getType() : i4) == 2) {
                this.j = iconCompat.e();
            }
        }
        this.k = l1f.c(charSequence);
        this.l = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = ithVarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
        this.g = z3;
        this.h = i2;
        this.i = i3;
        this.m = z4;
    }
}
