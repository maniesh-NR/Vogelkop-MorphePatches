package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import defpackage.bwg;
import defpackage.dbh;
import defpackage.ia6;
import defpackage.k3p;
import defpackage.tso;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ca1 {
    public final Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public ca1(ia6 ia6Var, n3 n3Var) {
        this.a = ia6Var;
        this.c = n3Var;
    }

    public ca1(tso tsoVar, ob1 ob1Var, tso tsoVar2, tso tsoVar3, ah0 ah0Var, tso tsoVar4, ah0 ah0Var2, tso tsoVar5, tso tsoVar6) {
        this.a = tsoVar;
        this.b = ob1Var;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = ah0Var;
        this.f = tsoVar4;
        this.g = ah0Var2;
        this.h = tsoVar5;
        this.i = tsoVar6;
    }

    public final s90 a() {
        bwg.f((Context) this.d, Context.class);
        bwg.f((HashMap) this.b, Map.class);
        bwg.f((k3p) this.e, k3p.class);
        bwg.f((ga3) this.g, ga3.class);
        ia6 ia6Var = (ia6) this.a;
        n3 n3Var = (n3) this.c;
        Context context = (Context) this.d;
        View view = (View) this.f;
        Activity activity = (Activity) this.h;
        String str = (String) this.i;
        HashMap map = (HashMap) this.b;
        k3p k3pVar = (k3p) this.e;
        ga3 ga3Var = (ga3) this.g;
        s90 s90Var = new s90();
        s90Var.c = ob1.a(ga3Var);
        ob1 ob1Var = ob1.b;
        s90Var.d = str == null ? ob1Var : new ob1(str);
        ob1 ob1VarA = ob1.a(k3pVar);
        s90Var.e = ob1VarA;
        tso tsoVar = (tso) n3Var.c;
        ob1 ob1Var2 = (ob1) ia6Var.b;
        tso tsoVar2 = (tso) ia6Var.o;
        s90Var.f = new vp1(ob1VarA, tsoVar, ob1Var2, tsoVar2);
        s90Var.g = new az1(ob1VarA, tsoVar, tsoVar2, (byte) 2);
        ob1 ob1VarA2 = ob1.a(map);
        s90Var.h = ob1VarA2;
        ob1 ob1Var3 = s90Var.e;
        tso tsoVar3 = (tso) n3Var.c;
        tso tsoVar4 = (tso) ia6Var.o;
        s90Var.i = new z0((tso) ob1Var3, tsoVar3, ob1VarA2, tsoVar4, (byte) 1);
        s90Var.j = new z0((tso) ob1Var3, tsoVar3, (ob1) ia6Var.j, tsoVar4, (byte) 2);
        s90Var.k = new r((tso) ob1Var3, tsoVar3, (tso) s90Var.c, ob1VarA2, tsoVar4, (byte) 6);
        s90Var.l = new p3(ob1Var3, tsoVar3, tsoVar4, (byte) 1);
        ob1 ob1VarA3 = ob1.a(context);
        s90Var.m = ob1VarA3;
        ob1 ob1Var4 = s90Var.e;
        tso tsoVar5 = (tso) n3Var.c;
        ob1 ob1Var5 = s90Var.c;
        ob1 ob1Var6 = s90Var.h;
        tso tsoVar6 = (tso) ia6Var.o;
        s90Var.n = new am1(ob1Var4, tsoVar5, ob1Var5, ob1VarA3, ob1Var6, tsoVar6);
        ob1 ob1Var7 = (ob1) ia6Var.b;
        ob1 ob1Var8 = (ob1) ia6Var.j;
        s90Var.o = new pg((tso) ob1Var4, tsoVar5, (tso) ob1Var6, ob1Var7, (tso) ob1Var5, ob1Var8, tsoVar6);
        s90Var.p = new z0((tso) ob1Var4, tsoVar5, ob1Var7, tsoVar6, (byte) 7);
        s90Var.q = new r((tso) ob1Var4, tsoVar5, (tso) ob1Var6, ob1Var7, tsoVar6, (byte) 1);
        s90Var.r = new z0((tso) ob1Var4, (tso) ob1Var6, ob1Var8, tsoVar6, (byte) 0);
        int i = b23.c;
        List listF = dbh.f(11);
        List listF2 = dbh.f(0);
        listF.add(s90Var.f);
        listF.add(s90Var.g);
        listF.add(s90Var.i);
        listF.add(s90Var.j);
        listF.add(s90Var.k);
        listF.add(s90Var.l);
        listF.add(s90Var.n);
        listF.add(s90Var.o);
        listF.add(s90Var.p);
        listF.add(s90Var.q);
        listF.add(s90Var.r);
        s90Var.s = new b23(listF, listF2);
        ob1 ob1Var9 = view == null ? ob1Var : new ob1(view);
        if (activity != null) {
            ob1Var = new ob1(activity);
        }
        ob1 ob1Var10 = ob1Var;
        ob1 ob1Var11 = s90Var.e;
        tso tsoVar7 = (tso) n3Var.c;
        tso tsoVar8 = (tso) ia6Var.o;
        s90Var.u = new r((tso) ob1Var11, tsoVar7, (tso) ob1Var9, ob1Var10, tsoVar8, (byte) 0);
        ob1 ob1Var12 = ob1Var9;
        nj0 nj0Var = new nj0(new mw(s90Var.m, (byte) 15));
        s90Var.v = nj0Var;
        s90Var.w = new gq1(ob1Var11, tsoVar7, nj0Var, ob1Var12, tsoVar8, (byte) 2);
        s90Var.x = new i9(ob1Var11, tsoVar7, s90Var.h, tsoVar8, (byte) 6);
        List listF3 = dbh.f(12);
        List listF4 = dbh.f(0);
        listF3.add(s90Var.f);
        listF3.add(s90Var.g);
        listF3.add(s90Var.j);
        listF3.add(s90Var.u);
        listF3.add(s90Var.w);
        listF3.add(s90Var.k);
        listF3.add(s90Var.l);
        listF3.add(s90Var.n);
        listF3.add(s90Var.o);
        listF3.add(s90Var.p);
        listF3.add(s90Var.q);
        listF3.add(s90Var.x);
        s90Var.y = new b23(listF3, listF4);
        ob1 ob1Var13 = s90Var.e;
        tso tsoVar9 = (tso) n3Var.c;
        ob1 ob1Var14 = s90Var.h;
        tso tsoVar10 = s90Var.v;
        tso tsoVar11 = (tso) ia6Var.o;
        s90Var.z = new gq1(ob1Var13, tsoVar9, ob1Var14, tsoVar10, tsoVar11, (byte) 4);
        s90Var.A = new xs(ob1Var13, tsoVar9, ob1Var14, s90Var.m, tsoVar11);
        List listF5 = dbh.f(13);
        List listF6 = dbh.f(0);
        listF5.add(s90Var.f);
        listF5.add(s90Var.g);
        listF5.add(s90Var.j);
        listF5.add(s90Var.u);
        listF5.add(s90Var.w);
        listF5.add(s90Var.k);
        listF5.add(s90Var.l);
        listF5.add(s90Var.n);
        listF5.add(s90Var.o);
        listF5.add(s90Var.p);
        listF5.add(s90Var.q);
        listF5.add(s90Var.z);
        listF5.add(s90Var.A);
        s90Var.B = new nj0(new fa((tso) ia6Var.q, (tso) ia6Var.x, (tso) n3Var.c, s90Var.c, s90Var.d, s90Var.e, s90Var.s, s90Var.y, new b23(listF5, listF6), (tso) ia6Var.o));
        return s90Var;
    }
}
