package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xza {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final wza j;
    public boolean k;

    public xza(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? u95.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        wza wzaVar = new wza(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = wzaVar;
        arrayList.add(wzaVar);
    }

    public static void b(xza xzaVar, String str, List list) {
        xzaVar.a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list);
    }

    public static void d(xza xzaVar, ArrayList arrayList, nvj nvjVar) {
        xzaVar.c(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, nvjVar, null, "", arrayList);
    }

    public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        if (this.k) {
            a8b.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.i.add(new wza(str, f, f2, f3, f4, f5, f6, f7, list, NotificationCompat.FLAG_GROUP_SUMMARY));
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, dz3 dz3Var, dz3 dz3Var2, String str, List list) {
        if (this.k) {
            a8b.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((wza) am2.k(1, this.i)).j.add(new x0n(f, f2, f3, f4, f5, f6, f7, i, i2, i3, dz3Var, dz3Var2, str, list));
    }

    public final yza e() {
        if (this.k) {
            a8b.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.i.size() > 1) {
            f();
        }
        wza wzaVar = this.j;
        yza yzaVar = new yza(this.a, this.b, this.c, this.d, this.e, new t0n(wzaVar.a, wzaVar.b, wzaVar.c, wzaVar.d, wzaVar.e, wzaVar.f, wzaVar.g, wzaVar.h, wzaVar.i, wzaVar.j), this.f, this.g, this.h);
        this.k = true;
        return yzaVar;
    }

    public final void f() {
        if (this.k) {
            a8b.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.i;
        wza wzaVar = (wza) vep.r(1, arrayList);
        ((wza) am2.k(1, arrayList)).j.add(new t0n(wzaVar.a, wzaVar.b, wzaVar.c, wzaVar.d, wzaVar.e, wzaVar.f, wzaVar.g, wzaVar.h, wzaVar.i, wzaVar.j));
    }
}
