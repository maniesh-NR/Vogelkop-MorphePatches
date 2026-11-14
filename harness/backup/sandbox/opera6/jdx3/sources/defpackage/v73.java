package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.settings.SettingsManager;
import java.util.EnumMap;

/* loaded from: classes.dex */
public abstract class v73 {
    public static final nrl A;
    public static final nrl B;
    public static final nrl C;
    public static final nrl D;
    public static final nrl E;
    public static final nrl F;
    public static final nrl G;
    public static final nrl H;
    public static final nrl I;
    public static final nrl J;
    public static final nrl l = o(taf.f);
    public static final nrl m = o(taf.O);
    public static final nrl n = o(taf.i);
    public static final nrl o;
    public static final nrl p;
    public static final nrl q;
    public static final nrl r;
    public static final nrl s;
    public static final nrl t;
    public static final nrl u;
    public static final nrl v;
    public static final nrl w;
    public static final nrl x;
    public static final nrl y;
    public static final nrl z;
    public final EnumMap a = new EnumMap(taf.class);
    public final Context b;
    public final ydn c;
    public final lg d;
    public final SettingsManager e;
    public final wth f;
    public final Drawable g;
    public final ocn h;
    public final in3 i;
    public final k5o j;
    public final u0a k;

    static {
        taf tafVar = taf.e;
        o = o(tafVar);
        p = o(taf.g);
        q = o(taf.d);
        r = e(taf.B);
        s = e(taf.C);
        t = e(taf.E);
        u = e(taf.D);
        v = e(taf.A);
        w = e(taf.z);
        x = e(taf.y);
        y = e(taf.w);
        z = e(taf.k);
        A = e(taf.j);
        B = e(tafVar);
        C = e(taf.x);
        D = e(taf.I);
        E = e(taf.u);
        F = e(taf.v);
        G = e(taf.J);
        H = e(taf.K);
        I = e(taf.L);
        J = e(taf.N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v75, types: [android.graphics.drawable.Drawable, ncn] */
    public v73(OmniBoxRoot omniBoxRoot, ydn ydnVar, BrowserActivity browserActivity, lg lgVar, SettingsManager settingsManager, wth wthVar, in3 in3Var, k5o k5oVar, ikc ikcVar, u0a u0aVar) {
        Context context = omniBoxRoot.getContext();
        this.b = context;
        this.c = ydnVar;
        this.d = lgVar;
        this.e = settingsManager;
        this.f = wthVar;
        this.i = in3Var;
        this.j = k5oVar;
        Drawable drawableF = sgb.F(2131231865, context);
        this.g = drawableF;
        sgb.F(2131231865, context);
        ocn ocnVar = new ocn(omniBoxRoot, browserActivity.getLifecycle(), ydnVar);
        this.h = ocnVar;
        Drawable mkcVar = new mkc(browserActivity, ikcVar);
        this.k = u0aVar;
        uaf uafVar = new uaf(taf.a);
        eri eriVarB = lgVar.b();
        uafVar.b(eti.c(eriVarB, context, fan.a(eriVarB instanceof f1a ? 32.0f : 28.0f, context.getResources())));
        uafVar.c = 2132021947;
        uafVar.b = 2132021947;
        a(uafVar);
        uaf uafVar2 = new uaf(taf.F);
        uafVar2.b(drawableF);
        a(uafVar2);
        uaf uafVar3 = new uaf(taf.b);
        uafVar3.b(sgb.F(2131232230, context));
        uafVar3.c = 2132021946;
        uafVar3.b = 2132021946;
        uafVar3.k = true;
        uafVar3.l = 0;
        a(uafVar3);
        uaf uafVar4 = new uaf(taf.c);
        uafVar4.b(sgb.F(2131231991, context));
        uafVar4.c = 2132021918;
        uafVar4.b = 2132021918;
        uafVar4.k = true;
        uafVar4.l = 0;
        a(uafVar4);
        uaf uafVar5 = new uaf(taf.d);
        uafVar5.b(sgb.F(2131232034, context));
        uafVar5.i = 2130970454;
        uafVar5.c = 2132021951;
        uafVar5.b = 2132021951;
        a(uafVar5);
        uaf uafVar6 = new uaf(taf.e);
        uafVar6.b(sgb.F(2131232212, context));
        uafVar6.i = 2130970454;
        uafVar6.c = 2132021945;
        uafVar6.b = 2132021945;
        uafVar6.d = 2131363287;
        a(uafVar6);
        uaf uafVar7 = new uaf(taf.f);
        uafVar7.b(sgb.F(2131232137, context));
        uafVar7.c = 2132020470;
        uafVar7.b = 2132020470;
        uafVar7.i = 2130970454;
        a(uafVar7);
        uaf uafVar8 = new uaf(taf.g);
        uafVar8.b(sgb.F(2131232200, context));
        uafVar8.c = 2132020980;
        uafVar8.b = 2132020980;
        uafVar8.i = 2130970454;
        a(uafVar8);
        uaf uafVar9 = new uaf(taf.h);
        uafVar9.b(sgb.F(2131232034, context));
        uafVar9.c = 2132018230;
        uafVar9.b = 2132018230;
        uafVar9.i = 2130970454;
        a(uafVar9);
        uaf uafVar10 = new uaf(taf.i);
        uafVar10.b(sgb.F(2131232143, context));
        uafVar10.c = 2132020278;
        uafVar10.b = 2132020278;
        uafVar10.d = 2131363285;
        uafVar10.i = 2130970454;
        a(uafVar10);
        uaf uafVar11 = new uaf(taf.j);
        uafVar11.b(sgb.F(2131232210, context));
        uafVar11.c = 2132020639;
        uafVar11.b = 2132020639;
        uafVar11.i = 2130969091;
        a(uafVar11);
        uaf uafVar12 = new uaf(taf.k);
        uafVar12.b(sgb.F(2131232211, context));
        uafVar12.c = 2132020639;
        uafVar12.b = 2132020639;
        uafVar12.i = 2130970454;
        a(uafVar12);
        uaf uafVar13 = new uaf(taf.l);
        uafVar13.b(sgb.F(2131232194, context));
        uafVar13.c = 2132021536;
        uafVar13.b = 2132021536;
        uafVar13.i = 2130969323;
        a(uafVar13);
        uaf uafVar14 = new uaf(taf.m);
        uafVar14.b(sgb.F(2131232119, context));
        uafVar14.c = 2132021536;
        uafVar14.b = 2132021536;
        uafVar14.i = 2130970454;
        a(uafVar14);
        uaf uafVar15 = new uaf(taf.n);
        uafVar15.b(sgb.F(2131232191, context));
        uafVar15.c = 2132021536;
        uafVar15.b = 2132021536;
        uafVar15.i = 2130969119;
        a(uafVar15);
        uaf uafVar16 = new uaf(taf.o);
        ?? r6 = ocnVar.a;
        uafVar16.h = r6;
        uafVar16.b(r6);
        uafVar16.m = true;
        uafVar16.c = 2132022139;
        uafVar16.b = 2132022139;
        a(uafVar16);
        uaf uafVar17 = new uaf(taf.p);
        uafVar17.b(sgb.F(2131232301, context));
        uafVar17.i = 2130970454;
        uafVar17.m = true;
        uafVar17.c = 2132022132;
        uafVar17.b = 2132022132;
        a(uafVar17);
        uaf uafVar18 = new uaf(taf.q);
        uafVar18.b(sgb.F(2131232311, context));
        uafVar18.c = 2132022140;
        uafVar18.b = 2132022140;
        uafVar18.i = 2130969366;
        uafVar18.m = true;
        a(uafVar18);
        uaf uafVar19 = new uaf(taf.r);
        uafVar19.b(sgb.F(2131232301, context));
        uafVar19.i = 2130970454;
        uafVar19.m = true;
        uafVar19.c = 2132022125;
        uafVar19.b = 2132022125;
        a(uafVar19);
        uaf uafVar20 = new uaf(taf.s);
        uafVar20.b(sgb.F(2131232162, context));
        uafVar20.c = 2132021536;
        uafVar20.b = 2132021536;
        a(uafVar20);
        uaf uafVar21 = new uaf(taf.t);
        uafVar21.b(sgb.F(2131232063, context));
        uafVar21.m = true;
        uafVar21.k = true;
        uafVar21.l = 2130969111;
        uafVar21.i = 2130969262;
        uafVar21.c = 2132018494;
        uafVar21.b = 2132018494;
        a(uafVar21);
        uaf uafVar22 = new uaf(taf.u);
        uafVar22.b(sgb.F(2131232244, context));
        uafVar22.c = 2132021949;
        uafVar22.b = 2132021949;
        uafVar22.i = 2130970454;
        a(uafVar22);
        uaf uafVar23 = new uaf(taf.v);
        uafVar23.b(sgb.F(2131232283, context));
        uafVar23.c = 2132019772;
        uafVar23.b = 2132019772;
        uafVar23.i = 2130970454;
        a(uafVar23);
        uaf uafVar24 = new uaf(taf.w);
        uafVar24.b(sgb.F(2131232084, context));
        uafVar24.c = 2132019756;
        uafVar24.b = 2132019756;
        uafVar24.d = 2131363275;
        uafVar24.i = 2130970454;
        a(uafVar24);
        uaf uafVar25 = new uaf(taf.x);
        uafVar25.b(sgb.F(2131232067, context));
        uafVar25.c = 2132019770;
        uafVar25.b = 2132019770;
        uafVar25.i = 2130970454;
        a(uafVar25);
        uaf uafVar26 = new uaf(taf.y);
        uafVar26.b(sgb.F(2131232065, context));
        uafVar26.c = 2132018546;
        uafVar26.b = 2132018546;
        uafVar26.j = 2131100356;
        a(uafVar26);
        uaf uafVar27 = new uaf(taf.z);
        uafVar27.b(sgb.F(2131232065, context));
        uafVar27.c = 2132018546;
        uafVar27.b = 2132018546;
        uafVar27.i = 2130970454;
        a(uafVar27);
        uaf uafVar28 = new uaf(taf.A);
        uafVar28.b(sgb.F(2131232250, context));
        uafVar28.c = 2132017383;
        uafVar28.b = 2132017383;
        uafVar28.i = 2130970454;
        a(uafVar28);
        uaf uafVar29 = new uaf(taf.B);
        uafVar29.b(sgb.F(2131231970, context));
        uafVar29.c = 2132017378;
        uafVar29.b = 2132017378;
        uafVar29.d = 2131363272;
        uafVar29.i = 2130970454;
        a(uafVar29);
        uaf uafVar30 = new uaf(taf.C);
        uafVar30.b(sgb.F(2131232073, context));
        uafVar30.c = 2132018739;
        uafVar30.b = 2132018739;
        uafVar30.d = 2131363272;
        uafVar30.i = 2130970454;
        a(uafVar30);
        uaf uafVar31 = new uaf(taf.D);
        uafVar31.b(sgb.F(2131232164, context));
        uafVar31.c = 2132017382;
        uafVar31.b = 2132017382;
        uafVar31.d = 2131363273;
        uafVar31.i = 2130970454;
        a(uafVar31);
        uaf uafVar32 = new uaf(taf.E);
        uafVar32.b(sgb.F(2131231977, context));
        uafVar32.c = 2132017381;
        uafVar32.b = 2132017381;
        uafVar32.i = 2130970454;
        a(uafVar32);
        uaf uafVar33 = new uaf(taf.G);
        uafVar33.b(sgb.F(2131232197, context));
        uafVar33.i = 2130970454;
        a(uafVar33);
        uaf uafVar34 = new uaf(taf.H);
        uafVar34.b(sgb.F(2131232596, context));
        uafVar34.c = 2132022707;
        uafVar34.b = 2132022707;
        a(uafVar34);
        uaf uafVar35 = new uaf(taf.I);
        uafVar35.b(sgb.F(2131232088, context));
        uafVar35.c = 2132021043;
        uafVar35.b = 2132021043;
        uafVar35.i = 2130970454;
        a(uafVar35);
        uaf uafVar36 = new uaf(taf.J);
        uafVar36.b(sgb.F(2131232313, context));
        uafVar36.c = 2132021846;
        uafVar36.b = 2132021846;
        uafVar36.i = 2130970454;
        a(uafVar36);
        uaf uafVar37 = new uaf(taf.L);
        uafVar37.b(sgb.F(2131231724, context));
        uafVar37.c = 2132017493;
        uafVar37.b = 2132017493;
        uafVar37.i = 2130970454;
        a(uafVar37);
        uaf uafVar38 = new uaf(taf.K);
        uafVar38.b(sgb.F(2131231724, context));
        uafVar38.c = 2132017628;
        uafVar38.b = 2132017628;
        uafVar38.i = 2130970454;
        a(uafVar38);
        uaf uafVar39 = new uaf(taf.M);
        uafVar39.b(mkcVar);
        uafVar39.o = weg.d.k(context);
        a(uafVar39);
        uaf uafVar40 = new uaf(taf.N);
        uafVar40.b(sgb.F(2131232181, context));
        uafVar40.c = 2132020487;
        uafVar40.b = 2132020487;
        uafVar40.i = 2130970454;
        a(uafVar40);
        uaf uafVar41 = new uaf(taf.O);
        uafVar41.b(sgb.F(2131231865, context));
        a(uafVar41);
        u0aVar.a.j(browserActivity, new k9((Object) this, (byte) 13));
    }

    public static nrl e(taf tafVar) {
        return new nrl((Object) tafVar, true);
    }

    public static taf l(tbf tbfVar) {
        if (!tbfVar.b.h) {
            int iOrdinal = tbfVar.a().a.ordinal();
            if (iOrdinal == 0) {
                return taf.m;
            }
            if (iOrdinal == 1) {
                return taf.l;
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                return taf.n;
            }
        }
        return taf.O;
    }

    public static nrl o(taf tafVar) {
        return new nrl((Object) tafVar, false);
    }

    public final void a(uaf uafVar) {
        uafVar.a(this.b);
        this.a.put((EnumMap) uafVar.a, (taf) uafVar);
    }

    public final taf b(tbf tbfVar) {
        boolean z2 = tbfVar.b.j;
        ydn ydnVar = this.c;
        int iQ = z2 ? ydnVar.q() : ydnVar.r();
        boolean z3 = tbfVar.b.j;
        ocn ocnVar = this.h;
        if (z3 != ocnVar.i) {
            ocnVar.i = z3;
            ocnVar.T();
        }
        if (iQ != 1 && tbfVar.b(128L)) {
            return taf.r;
        }
        int iA = vep.A(iQ);
        if (iA != 0) {
            if (iA == 1 || iA == 2) {
                return taf.o;
            }
            if (iA == 3) {
                return taf.q;
            }
        }
        return taf.p;
    }

    public final boolean c() {
        Context context = this.b;
        return r9n.A(context) && wxe.J(context);
    }

    public final boolean d(tbf tbfVar) {
        ypm ypmVar = tbfVar.b;
        if (ypmVar.h) {
            return false;
        }
        boolean z2 = ypmVar.j;
        ydn ydnVar = this.c;
        if (z2) {
            if (ydnVar.d.a) {
                return true;
            }
            return ydnVar.p().a && ydnVar.f.g();
        }
        if (ydnVar.d.a()) {
            return true;
        }
        return ydnVar.p().a && ydnVar.f.g();
    }

    public final bp f(tbf tbfVar, taf tafVar, int i) {
        return new bp((uaf) this.a.get(tafVar), (tafVar != taf.M ? (tafVar == taf.a && tbfVar.b(64L)) ? 2 : 0 : 2) | i);
    }

    public nrl g(tbf tbfVar) {
        return tbfVar.b(1024L) ? o : (tbfVar.b(2L) || tbfVar.b(16384L) || !tbfVar.b(32L) || !tbfVar.b(16L)) ? tbfVar.b(64L) ? (c() && tbfVar.b(256L)) ? p : m : k(tbfVar) : q;
    }

    public abstract nrl h(tbf tbfVar, ro9 ro9Var);

    public abstract taf i(tbf tbfVar, ro9 ro9Var);

    public taf j(tbf tbfVar) {
        if (d(tbfVar)) {
            return b(tbfVar);
        }
        if (!tbfVar.b.h && this.e.i("compression")) {
            return taf.t;
        }
        ypm ypmVar = tbfVar.b;
        return ypmVar.g != null ? taf.a : ypmVar.i ? taf.s : !tbfVar.f.isEmpty() ? taf.M : l(tbfVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0104, code lost:
    
        if (r7.b(16384) != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nrl k(defpackage.tbf r7) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v73.k(tbf):nrl");
    }

    public nrl m(tbf tbfVar, ro9 ro9Var) {
        if (!tbfVar.b(1024L) && ((!tbfVar.b(32L) || !tbfVar.b(16L)) && tbfVar.b(64L) && !c())) {
            Context context = this.b;
            if (wxe.J(context)) {
                return l;
            }
            if (r9n.A(context)) {
                return p;
            }
        }
        return m;
    }

    public taf n(tbf tbfVar) {
        return taf.O;
    }

    public final void p(Drawable drawable) {
        uaf uafVar = (uaf) this.a.get(taf.F);
        if (drawable == null) {
            drawable = this.g;
        }
        uafVar.e = drawable;
        uafVar.f.setDrawableByLayerId(1, drawable);
        drawable.setVisible(uafVar.f.isVisible(), false);
        uafVar.f.invalidateSelf();
    }
}
