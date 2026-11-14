package defpackage;

import android.net.Uri;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class z8p {

    @NotNull
    public static final d8p Companion = new d8p();
    public static final KSerializer[] L;
    public final boolean A;
    public final boolean B;
    public final long C;
    public final long D;
    public final int E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final Set J;
    public final String K;
    public final int a;
    public final int b;
    public final int c;
    public final double d;
    public final List e;
    public final Set f;
    public final Set g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final Set m;
    public final boolean n;
    public final Set o;
    public final Set p;
    public final double q;
    public final boolean r;
    public final int s;
    public final int t;
    public final Set u;
    public final Set v;
    public final String w;
    public final String x;
    public final String y;
    public final c z;

    static {
        xhk xhkVar = xhk.a;
        KSerializer k72Var = new k72(xhkVar, (byte) 0);
        KSerializer k72Var2 = new k72(xhkVar, (byte) 2);
        KSerializer k72Var3 = new k72(xhkVar, (byte) 2);
        KSerializer k72Var4 = new k72(xhkVar, (byte) 2);
        KSerializer k72Var5 = new k72(xhkVar, (byte) 2);
        ecb ecbVar = ecb.a;
        L = new KSerializer[]{null, null, null, null, k72Var, k72Var2, k72Var3, null, null, null, null, k72Var4, k72Var5, null, new k72(ecbVar, (byte) 2), new k72(ecbVar, (byte) 2), null, null, null, null, new k72(xhkVar, (byte) 2), new k72(xhkVar, (byte) 2), null, null, null, null, null, null};
    }

    public z8p() {
        Set setN0;
        on7 on7Var = pn7.b;
        un7 un7Var = un7.h;
        long jX0 = cs5.x0(1, un7Var);
        un7 un7Var2 = un7.g;
        int iP = (int) pn7.p(jX0, un7Var2);
        double dP = pn7.p(cs5.x0(15, un7Var), un7Var2);
        Set setSingleton = Collections.singleton("cdn.rtbai.com");
        Set setSingleton2 = Collections.singleton("adx.opera.com");
        this.a = iP;
        this.b = 30;
        this.c = 50;
        this.d = dP;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 60;
        this.i = 1000;
        this.j = false;
        this.k = true;
        this.l = null;
        this.m = null;
        this.n = true;
        this.o = null;
        this.p = null;
        this.q = 12.0d;
        this.r = false;
        this.s = 30;
        this.t = 30;
        this.u = setSingleton;
        this.v = setSingleton2;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = false;
        this.B = false;
        int iP2 = (int) pn7.p(cs5.x0(7, un7Var), un7Var2);
        zyk zykVar = aap.a;
        this.C = pn7.f(cs5.x0(nb6.j(iP, 1, iP2), un7Var2));
        int iJ = nb6.j(30, 3, 60);
        un7 un7Var3 = un7.e;
        this.D = cs5.x0(iJ, un7Var3);
        this.E = nb6.j(50, 1, 500);
        double dP2 = pn7.p(cs5.x0(365, un7Var), un7Var2);
        if (dP < 0.016666666666666666d) {
            dP = 0.016666666666666666d;
        } else if (dP > dP2) {
            dP = dP2;
        }
        this.F = pn7.f(cs5.w0(dP, un7Var2));
        this.G = pn7.f(cs5.x0(nb6.j(60, 30, 120), un7Var3));
        this.H = nb6.j(1000, MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, 2000);
        this.I = pn7.f(cs5.w0(12.0d, un7Var2));
        if (setSingleton != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = setSingleton.iterator();
            while (it.hasNext()) {
                String string = StringsKt.l0((String) it.next()).toString();
                string = string.length() <= 0 ? null : string;
                if (string != null) {
                    arrayList.add(string);
                }
            }
            setN0 = CollectionsKt.n0(arrayList);
        } else {
            setN0 = null;
        }
        this.J = setN0;
        String str = this.x;
        this.K = (str == null || StringsKt.N(str)) ? null : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0207 A[PHI: r1
      0x0207: PHI (r1v18 double) = (r1v17 double), (r1v26 double) binds: [B:128:0x01ff, B:130:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z8p(int r18, int r19, int r20, int r21, double r22, java.util.List r24, java.util.Set r25, java.util.Set r26, int r27, int r28, boolean r29, boolean r30, java.util.Set r31, java.util.Set r32, boolean r33, java.util.Set r34, java.util.Set r35, double r36, boolean r38, int r39, int r40, java.util.Set r41, java.util.Set r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, kotlinx.serialization.json.c r46, boolean r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8p.<init>(int, int, int, int, double, java.util.List, java.util.Set, java.util.Set, int, int, boolean, boolean, java.util.Set, java.util.Set, boolean, java.util.Set, java.util.Set, double, boolean, int, int, java.util.Set, java.util.Set, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.c, boolean, boolean):void");
    }

    public final boolean a(String str) {
        Uri uri;
        String host;
        Set set;
        if (str != null && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            if (StringsKt.N(host)) {
                host = null;
            }
            if (host != null && (set = this.v) != null && !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String string = StringsKt.l0((String) it.next()).toString();
                    if (host.equals(string)) {
                        return true;
                    }
                    if (kotlin.text.c.l(host, "." + StringsKt.T(string, "."), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
