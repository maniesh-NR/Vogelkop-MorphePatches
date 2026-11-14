package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.assetlinks.db.AssetLinksDataBase;
import com.opera.android.requests.OspExtension;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import kotlin.coroutines.h;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final /* synthetic */ class hv1 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv1 b;

    public /* synthetic */ hv1(xv1 xv1Var, byte b) {
        this.a = b;
        this.b = xv1Var;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [z3i] */
    public final Object get() {
        z4k z4kVar;
        byte b = this.a;
        byte b2 = 11;
        byte b3 = 4;
        byte b4 = 10;
        byte b5 = 7;
        byte b6 = 2;
        byte b7 = 5;
        byte b8 = 1;
        xv1 xv1Var = this.b;
        switch (b) {
            case 0:
                OperaApplication operaApplication = xv1Var.a;
                return new db(operaApplication, vml.d, operaApplication.N());
            case 1:
                return new v3e(xv1Var.a);
            case 2:
                return new x3i(xv1Var.a, xv1Var.P0, xv1Var.E0, new hv1(xv1Var, (byte) 28));
            case 3:
                final OperaApplication operaApplication2 = xv1Var.a;
                final wjh wjhVar = vml.e;
                final dj9 dj9VarT = dj9.t(operaApplication2);
                final e3j e3jVarT = e3j.t(operaApplication2);
                final j4c j4cVar = xv1Var.F0;
                jv1 jv1Var = new jv1(xv1Var, (byte) 3);
                final v1a v1aVar = (v1a) xv1Var.Q.get();
                final j4c j4cVar2 = xv1Var.K;
                final j4c j4cVar3 = xv1Var.J0;
                final j4c j4cVar4 = xv1Var.I0;
                final j4c j4cVar5 = xv1Var.i1;
                return i0l.g() ? new eye() : new av6(new esk() { // from class: z3i
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() {
                        /*
                            r21 = this;
                            r0 = r21
                            j4c r1 = r1
                            java.lang.Object r1 = r1.get()
                            r8 = r1
                            v3e r8 = (defpackage.v3e) r8
                            ha6 r2 = new ha6
                            w3e r3 = new w3e
                            wjh r1 = r2
                            r3.<init>(r1)
                            java.lang.Object r1 = r1.d
                            jg8 r1 = (jg8) r1
                            ii r4 = defpackage.xne.b
                            java.lang.Object r4 = r4.get()
                            t9f r4 = (t9f) r4
                            e3j r5 = r3
                            java.lang.Object r5 = r5.i()
                            d3j r5 = (defpackage.d3j) r5
                            r6 = 32
                            r7 = 0
                            c3j r5 = r5.d(r6, r7)
                            r6 = 0
                            if (r5 == 0) goto L46
                            java.lang.Comparable r7 = r5.d
                            java.lang.String r7 = (java.lang.String) r7
                            int r9 = r7.length()
                            if (r9 != 0) goto L3e
                            r7 = r6
                            goto L44
                        L3e:
                            java.lang.String r9 = "https://"
                            java.lang.String r7 = r9.concat(r7)
                        L44:
                            if (r7 != 0) goto L48
                        L46:
                            java.lang.String r7 = "https://missions.opera-api.com"
                        L48:
                            if (r5 == 0) goto L4f
                            java.lang.Object r5 = r5.b
                            r6 = r5
                            java.lang.String r6 = (java.lang.String) r6
                        L4f:
                            if (r6 != 0) goto L53
                            java.lang.String r6 = ""
                        L53:
                            il5 r5 = new il5
                            r5.<init>(r7, r6)
                            u3e r6 = new u3e
                            android.content.Context r7 = r4
                            r6.<init>(r7)
                            x3e r10 = new x3e
                            j4c r9 = r5
                            r10.<init>(r9)
                            a4e r11 = new a4e
                            r11.<init>(r7)
                            p5e r12 = new p5e
                            r12.<init>(r7)
                            w5e r13 = new w5e
                            j3i r9 = new j3i
                            r14 = 1
                            r9.<init>(r8, r14)
                            r13.<init>(r9)
                            a6e r14 = new a6e
                            dj9 r9 = r6
                            r14.<init>(r1, r9, r7)
                            u4i r15 = new u4i
                            j4c r9 = r7
                            r15.<init>(r7, r9)
                            l8e r16 = new l8e
                            r16.<init>()
                            b6e r9 = new b6e
                            r17 = r2
                            v1a r2 = r8
                            r9.<init>(r2)
                            j4c r2 = r9
                            java.lang.Object r2 = r2.get()
                            r18 = r2
                            y5e r18 = (defpackage.y5e) r18
                            v5e r2 = new v5e
                            r2.<init>(r7, r1)
                            m3i r1 = new m3i
                            j4c r0 = r10
                            r1.<init>(r7, r0)
                            r19 = r2
                            r2 = r17
                            r17 = r9
                            r9 = r8
                            r20 = r1
                            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3i.get():java.lang.Object");
                    }
                }, jv1Var);
            case 4:
                return new nzl(xv1Var.H0, xf8.t(((k3i) xv1Var.E0.get()).a()), (nx5) xv1Var.i.get());
            case 5:
                OperaApplication operaApplication3 = xv1Var.a;
                j4c j4cVar6 = xv1Var.E0;
                umi umiVar = vml.d;
                x5f x5fVar = operaApplication3.L().c;
                x5f x5fVar2 = operaApplication3.L().d;
                x79 x79Var = new x79();
                x79Var.a = j4cVar6;
                x79Var.b = umiVar;
                x79Var.c = x5fVar;
                x79Var.d = x5fVar2;
                x79Var.e = operaApplication3.getApplicationContext();
                return new y5e(x79Var, (x3i) xv1Var.G0.get());
            case 6:
                return new pqi(xv1Var.a, vml.d);
            case 7:
                OperaApplication operaApplication4 = xv1Var.a;
                return new sqi(new lld(dj9.t(operaApplication4), b5), new hga(operaApplication4, b8), new uu1(b6), new jv1(xv1Var, b5), new jv1(xv1Var, (byte) 8), (esk) xv1Var.f.get(), new uu1(b3), (ndh) xv1Var.z0.get(), new tvk(operaApplication4.o()), new jv1(xv1Var, (byte) 9), new jv1(xv1Var, b4), new jv1(xv1Var, b2), new jv1(xv1Var, (byte) 12), new lv1(xv1Var, b8), new jv1(xv1Var, (byte) 14), new uu1((byte) 3), new jv1(xv1Var, (byte) 6));
            case 8:
                return new uqi(xv1Var.a, vml.d);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                pqi pqiVar = (pqi) xv1Var.K0.get();
                nx5 nx5Var = (nx5) xv1Var.i.get();
                br6 br6Var = new br6((br6) xv1Var.h0.get(), pqiVar);
                shf shfVar = new shf();
                shfVar.a = nx5Var;
                shfVar.b = br6Var;
                shfVar.c = z4c.b(new j3i(shfVar, b2));
                return new vqi(shfVar, (sqi) xv1Var.L0.get(), pqiVar, new ghf(new File(xv1Var.a.getFilesDir(), "sdx"), vml.d), (uqi) xv1Var.M0.get());
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                umi umiVar2 = vml.d;
                OperaApplication operaApplication5 = xv1Var.a;
                PackageManager packageManager = operaApplication5.getPackageManager();
                i16 i16Var = new i16(xne.b);
                u5i u5iVarF = xih.f(operaApplication5.getApplicationContext(), AssetLinksDataBase.class, "asset_links");
                u5iVarF.a(new ryd[]{AssetLinksDataBase.l});
                return new ub2(umiVar2, packageManager, i16Var, ((AssetLinksDataBase) u5iVarF.b()).x());
            case 11:
                OperaApplication operaApplication6 = xv1Var.a;
                return new v3m(operaApplication6, operaApplication6.J(), xv1Var.O0, vml.d);
            case 12:
                OperaApplication operaApplication7 = xv1Var.a;
                umi umiVar3 = vml.d;
                nx5 nx5Var2 = (nx5) xv1Var.i.get();
                wjh wjhVar2 = vml.e;
                uu1 uu1Var = new uu1(b7);
                j4c j4cVar7 = xv1Var.i0;
                cq5 cq5Var = ((lpe) j4cVar7.get()).c;
                plh plhVar = ((lpe) j4cVar7.get()).s;
                plh plhVar2 = ((lpe) j4cVar7.get()).w;
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication8 = (OperaApplication) operaApplication7.getApplicationContext();
                q6e q6eVar = new q6e(operaApplication7, umiVar3, nx5Var2, wjhVar2, jbf.t(operaApplication7.getApplicationContext()), plhVar2, new iri(operaApplication7), uu1Var, ((yk6) operaApplication8.e().get()).j, ((h0a) operaApplication8.x.get()).d, i0l.h(operaApplication7), operaApplication8.L().c, new k6e(cq5Var, plhVar));
                eti.a = q6eVar;
                return q6eVar;
            case 13:
                OperaApplication operaApplication9 = xv1Var.a;
                CommandLine commandLine = operaApplication9.n;
                CommandLine commandLine2 = commandLine != null ? commandLine : null;
                umi umiVar4 = vml.d;
                f94 wf2Var = new wf2(operaApplication9);
                if (ocp.k()) {
                    wf2Var = new s14((Context) operaApplication9, (wf2) wf2Var);
                }
                return new SettingsManager(wf2Var, operaApplication9, commandLine2, umiVar4);
            case 14:
                return new zcj(xv1Var.a, vml.d);
            case 15:
                return new vnj(xv1Var.a, vml.d);
            case 16:
                return new eoj(vml.d, (a5l) xv1Var.d1.get());
            case 17:
                return new lzj(xv1Var.a, (SettingsManager) xv1Var.P0.get());
            case SizeUtil.textSize0_1 /* 18 */:
                return new zzj((vnj) xv1Var.R0.get());
            case 19:
                Context context = xv1Var.a;
                synchronized (uup.class) {
                    z4kVar = uup.a;
                    if (z4kVar == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        z4k z4kVar2 = new z4k(new h61(context, false));
                        uup.a = z4kVar2;
                        z4kVar = z4kVar2;
                    }
                }
                return (r0k) ((jrp) z4kVar.b).mo1zza();
            case SizeUtil.textSize0 /* 20 */:
                SettingsManager settingsManager = (SettingsManager) xv1Var.P0.get();
                OperaApplication operaApplication10 = xv1Var.a;
                ru9.c(operaApplication10);
                return new u8k(settingsManager, (k7k) no7.n(operaApplication10, k7k.l, k7k.n), v1.u(operaApplication10));
            case 21:
                OperaApplication operaApplication11 = xv1Var.a;
                umi umiVar5 = vml.d;
                ocp.k();
                b59 b59VarL = w1h.l(operaApplication11, umiVar5, "opera_osp_local_attributes", new bg1[0]);
                h11 h11Var = h11.j;
                x5f x5fVar3 = new x5f(operaApplication11, b59VarL, umiVar5);
                axh axhVar = axh.j;
                hd hdVar = new hd(operaApplication11, umiVar5, (byte) 7);
                String[] strArr2 = OperaApplication.K;
                new OspExtension(hdVar, ((OperaApplication) operaApplication11.getApplicationContext()).R());
                tc3 tc3Var = tc3.j;
                osf osfVar = new osf(operaApplication11, umiVar5);
                cef cefVar = cef.j;
                wsf wsfVar = new wsf(operaApplication11, umiVar5);
                be7 be7Var = be7.j;
                hd hdVar2 = new hd(operaApplication11, umiVar5, (byte) 6);
                return new d6j(((OperaApplication) operaApplication11.getApplicationContext()).J(), new qfb((Object) new ubk[]{x5fVar3, hdVar, osfVar, wsfVar, hdVar2}, (byte) 13), x5fVar3, x5fVar3, hdVar, osfVar, wsfVar, hdVar2);
            case SizeUtil.textSize1 /* 22 */:
                return new vu2(xv1Var.a.L().c);
            case 23:
                return new sv1(xv1Var);
            case SizeUtil.textSize2 /* 24 */:
                return (h1a) scd.g0(h.a, new yf((byte) 2, (mt5) null, xv1Var));
            case 25:
                c3j c3jVarD = ((d3j) e3j.t(xv1Var.a).i()).d(10, true);
                return new dnk(Uri.parse("https://" + (c3jVarD != null ? (String) c3jVarD.d : "subscriptions.opera.com") + "/"), c3jVarD != null ? (String) c3jVarD.b : "");
            case 26:
                OperaApplication operaApplication12 = xv1Var.a;
                return r9n.u(operaApplication12, operaApplication12.getPackageName(), 0L).versionName;
            case 27:
                return xv1Var.a.getPackageName();
            case 28:
                return ((y3i) xv1Var.H0.get()).l();
            default:
                mgh mghVar = new mgh(new hv1(xv1Var, (byte) 25), xne.b, (byte) 5);
                OperaApplication operaApplication13 = xv1Var.a;
                return new ydn(operaApplication13, operaApplication13.J(), vml.d, mghVar, operaApplication13.b(), (zv9) operaApplication13.r.O.get(), ufn.t(operaApplication13), tvg.t(operaApplication13), (jtg) xv1Var.t0.get(), new wv1(new li(operaApplication13, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 8), (byte) 0), (jg8) vml.e.d);
        }
    }
}
