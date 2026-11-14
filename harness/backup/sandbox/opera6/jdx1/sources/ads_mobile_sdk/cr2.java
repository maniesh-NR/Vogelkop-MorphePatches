package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.admob.AdMobAdapter;
import defpackage.ic4;
import defpackage.prb;
import defpackage.w0g;
import defpackage.x0g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class cr2 extends f2 {
    public String l;
    public final dr2 m;

    public cr2(kh3 kh3Var, defpackage.r83 r83Var, av2 av2Var, long j, int i, a2 a2Var, xv xvVar, n13 n13Var, String str, ve2 ve2Var) {
        super(kh3Var, r83Var, av2Var, j, i, a2Var, xvVar, n13Var, str, ve2Var);
        this.m = new dr2();
    }

    public final defpackage.hp a(Bundle bundle, LinkedHashMap linkedHashMap) {
        String str = this.l;
        if (str == null) {
            str = null;
        }
        String str2 = str;
        defpackage.r83 r83Var = this.b;
        return new defpackage.hp(str2, r83Var.a, r83Var.b, r83Var.c, bundle, r83Var.e, r83Var.f, linkedHashMap, r83Var.h);
    }

    @Override // defpackage.yno
    public final boolean b() {
        String strN;
        prb prbVar = this.f.c;
        if (prbVar != null) {
            try {
                strN = prbVar.u("pubid").n();
            } catch (Exception unused) {
            }
        } else {
            strN = "";
        }
        return strN.length() > 0;
    }

    public final Bundle g() {
        AdMobAdapter adMobAdapter = new AdMobAdapter();
        defpackage.r83 r83Var = this.b;
        r83Var.getClass();
        return adMobAdapter.buildExtrasBundle(AdMobAdapter.class.equals(AdMobAdapter.class) ? r83Var.d : (Bundle) r83Var.g.get(AdMobAdapter.class.getName()), bw2.b(this.f.c));
    }

    public final void h() {
        String str = this.l;
        if (str == null) {
            str = null;
        }
        String str2 = str;
        a2 a2Var = this.f;
        String str3 = a2Var.h;
        ArrayList arrayList = a2Var.v;
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((Uri) obj).toString());
        }
        ArrayList arrayList3 = a2Var.H;
        ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            arrayList4.add(((Uri) obj2).toString());
        }
        ArrayList arrayList5 = a2Var.Q;
        ArrayList arrayList6 = new ArrayList(k95.o(arrayList5, 10));
        int size3 = arrayList5.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            arrayList6.add(((Uri) obj3).toString());
        }
        ArrayList arrayList7 = a2Var.D;
        ArrayList arrayList8 = new ArrayList(k95.o(arrayList7, 10));
        int size4 = arrayList7.size();
        int i4 = 0;
        while (i4 < size4) {
            Object obj4 = arrayList7.get(i4);
            i4++;
            arrayList8.add(((Uri) obj4).toString());
        }
        ArrayList arrayList9 = a2Var.j0;
        ArrayList arrayList10 = new ArrayList(k95.o(arrayList9, 10));
        int size5 = arrayList9.size();
        int i5 = 0;
        while (i5 < size5) {
            Object obj5 = arrayList9.get(i5);
            i5++;
            arrayList10.add(((Uri) obj5).toString());
        }
        ArrayList arrayList11 = a2Var.f0;
        ArrayList arrayList12 = new ArrayList(k95.o(arrayList11, 10));
        int size6 = arrayList11.size();
        int i6 = 0;
        while (i6 < size6) {
            Object obj6 = arrayList11.get(i6);
            i6++;
            arrayList12.add(((Uri) obj6).toString());
        }
        ArrayList arrayList13 = a2Var.i0;
        ArrayList arrayList14 = new ArrayList(k95.o(arrayList13, 10));
        int size7 = arrayList13.size();
        int i7 = 0;
        while (i7 < size7) {
            Object obj7 = arrayList13.get(i7);
            i7++;
            arrayList14.add(((Uri) obj7).toString());
        }
        w0g w0gVar = new w0g(str2, str3, arrayList2, arrayList4, arrayList6, arrayList8, arrayList10, arrayList12, arrayList14, a2Var.L, a2Var.Y, a2Var.o0, l08.a, a2Var.Z);
        cw2 cw2Var = a2Var.k0;
        if (cw2Var != null) {
            w0gVar.rewardsBundles = Collections.singletonList(ic4.m(new Pair("rb_amount", Integer.valueOf(cw2Var.a)), new Pair("rb_type", cw2Var.b)));
        }
        dr2 dr2Var = this.m;
        dr2Var.a = w0gVar;
        xv xvVar = this.g;
        ArrayList arrayList15 = xvVar.m;
        ArrayList arrayList16 = new ArrayList(k95.o(arrayList15, 10));
        int size8 = arrayList15.size();
        int i8 = 0;
        while (i8 < size8) {
            Object obj8 = arrayList15.get(i8);
            i8++;
            arrayList16.add(((Uri) obj8).toString());
        }
        long j = xvVar.n;
        on7 on7Var = pn7.b;
        dr2Var.b = new x0g(arrayList16, pn7.p(j, un7.e), xvVar.h, xvVar.q);
    }
}
