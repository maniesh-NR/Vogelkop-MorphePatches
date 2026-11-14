package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class ea6 implements m7h {
    public final /* synthetic */ byte a;
    public final byte b;
    public Object c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public ea6(int i, int i2) {
        this.a = (byte) 3;
        this.b = i;
    }

    public ea6(Context context, l1a l1aVar) {
        byte b = 4;
        this.a = (byte) 4;
        int iNextInt = new Random().nextInt(3);
        if (iNextInt == 0) {
            b = 1;
        } else if (iNextInt == 1) {
            b = 2;
        } else if (iNextInt != 2) {
            h9o.e();
            throw null;
        }
        this.b = b;
        this.c = w1h.l(context, vml.d, "google_promo_policy", new sz5((byte) 1));
        this.d = l1aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ea6(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public static ea6 a() {
        return new ea6(2, 0);
    }

    public static ea6 b() {
        return new ea6(3, 0);
    }

    public final Object get() {
        Object be4Var;
        Object ysmVar;
        Object e3aVar;
        Object eo9Var;
        int i = 2;
        boolean z = false;
        z = false;
        byte b = 1;
        switch (this.a) {
            case 0:
                da6 da6Var = (da6) this.c;
                fa6 fa6Var = (fa6) this.d;
                byte b2 = this.b;
                switch (b2) {
                    case 0:
                        m20 m20Var = fa6Var.a;
                        m20Var.getClass();
                        be4Var = new be4(m20Var, (ysm) fa6Var.G.get(), (xd4) fa6Var.E.get(), (mc4) fa6Var.H.get(), (ctm) fa6Var.j.get(), (mf4) fa6Var.x.get());
                        return be4Var;
                    case 1:
                        igi igiVar = da6Var.a;
                        igi igiVar2 = da6Var.a;
                        qe4 qe4Var = (qe4) igiVar.d;
                        alo.l(qe4Var);
                        tc4 tc4Var = (tc4) igiVar2.f;
                        alo.l(tc4Var);
                        c37 c37Var = new c37(da6Var, fa6Var);
                        pdo pdoVar = (pdo) fa6Var.e.get();
                        t3d t3dVar = (t3d) fa6Var.m.get();
                        fv1 fv1Var = new fv1((byte) 2);
                        fv1Var.b(fa6Var.o.get());
                        fv1Var.b(fa6Var.q.get());
                        fv1Var.b(fa6Var.r.get());
                        fv1Var.b(fa6Var.k.get());
                        fv1Var.b(fa6Var.s.get());
                        fv1Var.b(fa6Var.p.get());
                        fv1Var.b(fa6Var.m.get());
                        fv1Var.b(fa6Var.t.get());
                        fv1Var.b(fa6Var.u.get());
                        ArrayList arrayList = fv1Var.a;
                        Set setSingleton = arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
                        y94 y94Var = (y94) fa6Var.w.get();
                        mf4 mf4Var = (mf4) fa6Var.x.get();
                        nv6 nv6Var = fa6Var.y;
                        m7h m7hVar = fa6Var.E;
                        h28 h28Var = (h28) fa6Var.C.get();
                        pe4 pe4Var = (pe4) fa6Var.d.get();
                        yg4 yg4Var = (yg4) igiVar2.g;
                        alo.l(yg4Var);
                        kd4 kd4Var = (kd4) fa6Var.F.get();
                        Context context = (Context) igiVar2.b;
                        alo.l(context);
                        Context context2 = (Context) igiVar2.b;
                        alo.l(context2);
                        ysmVar = new ysm(qe4Var, tc4Var, c37Var, pdoVar, t3dVar, setSingleton, y94Var, mf4Var, nv6Var, m7hVar, h28Var, pe4Var, yg4Var, kd4Var, context, kb7.g.m(context2));
                        return ysmVar;
                    case 2:
                        return new qdo((pe4) fa6Var.d.get());
                    case 3:
                        m20 m20Var2 = fa6Var.a;
                        m20Var2.getClass();
                        return new pe4(m20Var2, (ge4) fa6Var.c.get());
                    case 4:
                        qe4 qe4Var2 = (qe4) da6Var.a.d;
                        alo.l(qe4Var2);
                        m20 m20Var3 = fa6Var.a;
                        m20Var3.getClass();
                        return xc4.b(qe4Var2.b(), m20Var3.b);
                    case 5:
                        return new t3d((ge4) fa6Var.c.get(), (hak) fa6Var.k.get(), (ctm) fa6Var.j.get(), (tb5) fa6Var.l.get());
                    case 6:
                        return new hak((pe4) fa6Var.d.get(), (d77.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null || ((gf4) fa6Var.i.get()).a().a(ImageCaptureFailWithAutoFlashQuirk.class)) ? ydp.b : zpa.g, (ctm) fa6Var.j.get());
                    case 7:
                        return new gf4((ge4) fa6Var.c.get(), (pfk) fa6Var.h.get());
                    case 8:
                        return new pfk((StreamConfigurationMap) fa6Var.f.get(), (nuf) fa6Var.g.get());
                    case 9:
                        ge4 ge4Var = (ge4) fa6Var.c.get();
                        if (ge4Var != null) {
                            return (StreamConfigurationMap) ((ma4) ge4Var).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        }
                        return null;
                    case 10:
                        ge4 ge4Var2 = (ge4) fa6Var.c.get();
                        return new nuf(ge4Var2);
                    case 11:
                        m20 m20Var4 = fa6Var.a;
                        m20Var4.getClass();
                        wm2 wm2Var = (wm2) da6Var.a.c;
                        alo.l(wm2Var);
                        Executor executor = wm2Var.a;
                        return new ctm(sgb.b(e.a(zch.a(), fr3.I(executor)).plus(new jx5("CXCP-UseCase-" + m20Var4.b))), executor);
                    case 12:
                        return new tb5();
                    case 13:
                        return new na8((pa8) fa6Var.n.get());
                    case 14:
                        return new pa8((pe4) fa6Var.d.get(), (ctm) fa6Var.j.get(), (tb5) fa6Var.l.get());
                    case 15:
                        be4Var = new n79((pe4) fa6Var.d.get(), (hak) fa6Var.k.get(), (ctm) fa6Var.j.get(), (kwl) fa6Var.p.get(), ((gf4) fa6Var.i.get()).a().a(TorchFlashRequiredFor3aUpdateQuirk.class) ? ujp.t : ulp.j);
                        return be4Var;
                    case 16:
                        pe4 pe4Var2 = (pe4) fa6Var.d.get();
                        hak hakVar = (hak) fa6Var.k.get();
                        return new kwl(pe4Var2, hakVar);
                    case 17:
                        ysmVar = new dg9((pe4) fa6Var.d.get(), ((gf4) fa6Var.i.get()).a().a(AfRegionFlipHorizontallyQuirk.class) ? ydp.g : qii.f, (hak) fa6Var.k.get(), (ctm) fa6Var.j.get(), fa6Var.b());
                        return ysmVar;
                    case 18:
                        return new cdk((n79) fa6Var.q.get(), (ctm) fa6Var.j.get());
                    case 19:
                        return new x4n();
                    case 20:
                        return new edo(fa6Var.b());
                    case 21:
                        ysmVar = new y94((z94) fa6Var.v.get(), (ctm) fa6Var.j.get(), (tb5) fa6Var.l.get());
                        return ysmVar;
                    case 22:
                        return new z94();
                    case 23:
                        return new mf4();
                    case 24:
                        pe4 pe4Var3 = (pe4) fa6Var.d.get();
                        m20 m20Var5 = fa6Var.a;
                        m20Var5.getClass();
                        mf4 mf4Var2 = (mf4) fa6Var.x.get();
                        nc4 nc4Var = (nc4) fa6Var.z.get();
                        qb4 qb4Var = (qb4) fa6Var.A.get();
                        gf4 gf4Var = (gf4) fa6Var.i.get();
                        h28 h28Var2 = (h28) fa6Var.C.get();
                        pfk pfkVar = (pfk) fa6Var.h.get();
                        be4Var = new wd4(pe4Var3, m20Var5, mf4Var2, nc4Var, qb4Var, gf4Var, h28Var2, pfkVar);
                        return be4Var;
                    case 25:
                        edo edoVar = (edo) fa6Var.u.get();
                        kwl kwlVar = (kwl) fa6Var.p.get();
                        return new nc4(edoVar, kwlVar);
                    case 26:
                        return new qb4();
                    case 27:
                        return new i28((String) fa6Var.B.get(), ((gf4) fa6Var.i.get()).a());
                    case 28:
                        m20 m20Var6 = fa6Var.a;
                        m20Var6.getClass();
                        String str = m20Var6.b;
                        alo.l(str);
                        return str;
                    case 29:
                        return new zhb(da6Var.a());
                    case 30:
                        qb4 qb4Var2 = (qb4) fa6Var.A.get();
                        tb5 tb5Var = (tb5) fa6Var.l.get();
                        m20 m20Var7 = fa6Var.a;
                        m20Var7.getClass();
                        gf4 gf4Var2 = (gf4) fa6Var.i.get();
                        pdo pdoVar2 = (pdo) fa6Var.e.get();
                        fel felVarA = fa6Var.a();
                        ge4 ge4Var3 = (ge4) fa6Var.c.get();
                        yg4 yg4Var2 = (yg4) da6Var.a.g;
                        alo.l(yg4Var2);
                        ysmVar = new kd4(qb4Var2, tb5Var, m20Var7, gf4Var2, pdoVar2, felVarA, ge4Var3, yg4Var2, (i16) da6Var.a.e);
                        return ysmVar;
                    case 31:
                        pe4 pe4Var4 = (pe4) fa6Var.d.get();
                        return new jc4(pe4Var4, (n79) fa6Var.q.get(), (dg9) fa6Var.r.get(), (cdk) fa6Var.s.get(), (kwl) fa6Var.p.get(), (t3d) fa6Var.m.get(), (edo) fa6Var.u.get(), (pdo) fa6Var.e.get(), (y94) fa6Var.w.get(), (ysm) fa6Var.G.get(), (ctm) fa6Var.j.get(), (x4n) fa6Var.t.get());
                    default:
                        throw new AssertionError((int) b2);
                }
            case 1:
                ia6 ia6Var = (ia6) this.c;
                p12 p12Var = (p12) this.d;
                igi igiVar3 = (igi) p12Var.a;
                byte b3 = this.b;
                switch (b3) {
                    case 0:
                        nx5 nx5Var = (nx5) ((m7h) p12Var.c).get();
                        hnl hnlVar = (hnl) ((m7h) ia6Var.f).get();
                        sgk sgkVar = (sgk) ((m7h) ia6Var.o).get();
                        fd4 fd4Var = (fd4) igiVar3.c;
                        alo.l(fd4Var);
                        e3a e3aVar2 = (e3a) igiVar3.d;
                        alo.l(e3aVar2);
                        otk otkVar = (otk) igiVar3.f;
                        alo.l(otkVar);
                        oa4 oa4Var = (oa4) ((m7h) p12Var.d).get();
                        xj4 xj4Var = (xj4) ((m7h) p12Var.g).get();
                        ia6 ia6Var2 = (ia6) p12Var.b;
                        hnl hnlVar2 = (hnl) ((m7h) ia6Var2.f).get();
                        fd4 fd4Var2 = (fd4) igiVar3.c;
                        alo.l(fd4Var2);
                        xfk xfkVar = (xfk) igiVar3.e;
                        alo.l(xfkVar);
                        w6j w6jVar = new w6j(hnlVar2, fd4Var2, xfkVar, (hb4) ((m7h) ia6Var2.p).get(), (sgk) ((m7h) ia6Var2.o).get());
                        q8h q8hVar = (q8h) ((m7h) ia6Var.u).get();
                        gg4 gg4Var = (gg4) ((m7h) ia6Var.y).get();
                        hb4 hb4Var = (hb4) ((m7h) ia6Var.p).get();
                        h0l h0lVar = (h0l) ((m7h) ia6Var.m).get();
                        ld4 ld4Var = (ld4) igiVar3.b;
                        t94 t94Var = (t94) igiVar3.g;
                        xfk xfkVar2 = (xfk) igiVar3.e;
                        alo.l(xfkVar2);
                        return new fa4(nx5Var, hnlVar, sgkVar, fd4Var, e3aVar2, otkVar, oa4Var, xj4Var, w6jVar, q8hVar, gg4Var, hb4Var, h0lVar, ld4Var, t94Var, xfkVar2, (qj5) ((m7h) ia6Var.z).get());
                    case 1:
                        return sgb.b(e.a(new csk((unb) ((m7h) ia6Var.d).get()), e.a(((hnl) ((m7h) ia6Var.f).get()).h, new jx5("CXCP-Camera2Controller"))));
                    case 2:
                        m7h m7hVar2 = (m7h) ia6Var.g;
                        hnl hnlVar3 = (hnl) ((m7h) ia6Var.f).get();
                        fd4 fd4Var3 = (fd4) igiVar3.c;
                        alo.l(fd4Var3);
                        return new oa4(m7hVar2, hnlVar3, fd4Var3.a, (unb) ((m7h) ia6Var.d).get());
                    case 3:
                        ea6 ea6Var = (ea6) p12Var.e;
                        ea6 ea6Var2 = (ea6) p12Var.f;
                        fd4 fd4Var4 = (fd4) igiVar3.c;
                        alo.l(fd4Var4);
                        if (fd4Var4.h != 2) {
                            return (xj4) ea6Var.get();
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            return (xj4) ea6Var2.get();
                        }
                        qp2.n("Cannot use Extension sessions below Android S");
                        return null;
                    case 4:
                        xfk xfkVar3 = (xfk) igiVar3.e;
                        alo.l(xfkVar3);
                        fd4 fd4Var5 = (fd4) igiVar3.c;
                        alo.l(fd4Var5);
                        return new y71(xfkVar3, fd4Var5, z ? (byte) 1 : (byte) 0);
                    case 5:
                        xfk xfkVar4 = (xfk) igiVar3.e;
                        alo.l(xfkVar4);
                        return new x71(xfkVar4);
                    case 6:
                        xfk xfkVar5 = (xfk) igiVar3.e;
                        alo.l(xfkVar5);
                        fd4 fd4Var6 = (fd4) igiVar3.c;
                        alo.l(fd4Var6);
                        return new y71(xfkVar5, fd4Var6, b);
                    case 7:
                        hnl hnlVar4 = (hnl) ((m7h) ia6Var.f).get();
                        fd4 fd4Var7 = (fd4) igiVar3.c;
                        alo.l(fd4Var7);
                        xfk xfkVar6 = (xfk) igiVar3.e;
                        alo.l(xfkVar6);
                        return new w81(hnlVar4, fd4Var7, xfkVar6);
                    case 8:
                        hnl hnlVar5 = (hnl) ((m7h) ia6Var.f).get();
                        fd4 fd4Var8 = (fd4) igiVar3.c;
                        alo.l(fd4Var8);
                        xfk xfkVar7 = (xfk) igiVar3.e;
                        alo.l(xfkVar7);
                        return new a61(hnlVar5, fd4Var8, xfkVar7, (gb4) ((m7h) ia6Var.n).get(), (sgk) ((m7h) ia6Var.o).get());
                    default:
                        throw new AssertionError((int) b3);
                }
            default:
                byte b4 = this.b;
                int i2 = 3;
                switch (b4) {
                    case 0:
                        fd4 fd4Var9 = (fd4) ((k5o) ((ha6) this.d).a).b;
                        alo.l(fd4Var9);
                        ge4 ge4Var4 = (ge4) ((m7h) ((ha6) this.d).c).get();
                        e3a e3aVar3 = (e3a) ((nv6) ((ha6) this.d).q).get();
                        e3a e3aVar4 = (e3a) ((nv6) ((ha6) this.d).q).get();
                        xfk xfkVar8 = (xfk) ((nv6) ((ha6) this.d).r).get();
                        otk otkVar2 = (otk) ((m7h) ((ha6) this.d).e).get();
                        fa4 fa4Var = (fa4) ((nv6) ((ha6) this.d).s).get();
                        eo9 eo9Var2 = (eo9) ((m7h) ((ha6) this.d).h).get();
                        do9 do9Var = (do9) ((m7h) ((ha6) this.d).f).get();
                        hh2 hh2Var = (hh2) ((m7h) ((ia6) this.c).r).get();
                        ha6 ha6Var = (ha6) this.d;
                        return new nd4(fd4Var9, ge4Var4, e3aVar3, e3aVar4, xfkVar8, otkVar2, fa4Var, eo9Var2, do9Var, hh2Var, (ld4) ((k5o) ha6Var.a).c, (od4) ((m7h) ha6Var.l).get(), (pd4) ((m7h) ((ha6) this.d).m).get(), (h3a) ((m7h) ((ha6) this.d).j).get(), (nx5) ((m7h) ((ha6) this.d).k).get(), (qu5) ((m7h) ((ha6) this.d).o).get());
                    case 1:
                        fd4 fd4Var10 = (fd4) ((k5o) ((ha6) this.d).a).b;
                        alo.l(fd4Var10);
                        return ((t94) ((m7h) ((ha6) this.d).b).get()).c.a(fd4Var10.a);
                    case 2:
                        mb4 mb4Var = (mb4) ((m7h) ((ia6) this.c).v).get();
                        alo.l((fd4) ((k5o) ((ha6) this.d).a).b);
                        t94 t94Var2 = mb4Var.e;
                        alo.l(t94Var2);
                        return t94Var2;
                    case 3:
                        hnl hnlVar6 = (hnl) ((m7h) ((ia6) this.c).f).get();
                        k5o k5oVar = (k5o) ((ha6) this.d).a;
                        ld4 ld4Var2 = (ld4) k5oVar.c;
                        fd4 fd4Var11 = (fd4) k5oVar.b;
                        alo.l(fd4Var11);
                        e3aVar = new e3a(hnlVar6, ld4Var2, fd4Var11, (djc) ((m7h) ((ha6) this.d).d).get(), (List) ((m7h) ((ha6) this.d).i).get(), (hb4) ((m7h) ((ia6) this.c).p).get());
                        return e3aVar;
                    case 4:
                        return new djc();
                    case 5:
                        fd4 fd4Var12 = (fd4) ((k5o) ((ha6) this.d).a).b;
                        alo.l(fd4Var12);
                        djc djcVar = (djc) ((m7h) ((ha6) this.d).d).get();
                        eo9 eo9Var3 = (eo9) ((m7h) ((ha6) this.d).h).get();
                        ArrayList arrayListJ = j95.j(new ivh[]{djcVar});
                        arrayListJ.add(djcVar);
                        arrayListJ.add(eo9Var3);
                        arrayListJ.addAll(fd4Var12.j);
                        eo9Var = arrayListJ;
                        return eo9Var;
                    case 6:
                        xfk xfkVar9 = (xfk) ((nv6) ((ha6) this.d).r).get();
                        do9 do9Var2 = (do9) ((m7h) ((ha6) this.d).f).get();
                        ge4 ge4Var5 = (ge4) ((m7h) ((ha6) this.d).c).get();
                        lzk lzkVar = (lzk) ((m7h) ((ha6) this.d).g).get();
                        Integer num = (Integer) ((ma4) ge4Var5).c(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
                        if (num != null && num.intValue() == 1) {
                            z = true;
                        }
                        long j = lzkVar.a;
                        eo9Var = new eo9(xfkVar9, do9Var2, z);
                        return eo9Var;
                    case 7:
                        ge4 ge4Var6 = (ge4) ((m7h) ((ha6) this.d).c).get();
                        fd4 fd4Var13 = (fd4) ((k5o) ((ha6) this.d).a).b;
                        alo.l(fd4Var13);
                        r16 r16Var = new r16();
                        Object obj = ((ha6) this.d).s;
                        e3aVar = new xfk(ge4Var6, fd4Var13, r16Var);
                        return e3aVar;
                    case 8:
                        k5o k5oVar2 = (k5o) ((ha6) this.d).a;
                        ld4 ld4Var3 = (ld4) k5oVar2.c;
                        fd4 fd4Var14 = (fd4) k5oVar2.b;
                        alo.l(fd4Var14);
                        t94 t94Var3 = (t94) ((m7h) ((ha6) this.d).b).get();
                        e3a e3aVar5 = (e3a) ((nv6) ((ha6) this.d).q).get();
                        xfk xfkVar10 = (xfk) ((nv6) ((ha6) this.d).r).get();
                        otk otkVar3 = (otk) ((m7h) ((ha6) this.d).e).get();
                        ga6 ga6Var = t94Var3.e;
                        igi igiVar4 = new igi(ld4Var3, fd4Var14, e3aVar5, xfkVar10, otkVar3, t94Var3, (byte) 11);
                        ia6 ia6Var3 = (ia6) ga6Var.b;
                        p12 p12Var2 = new p12();
                        p12Var2.b = ia6Var3;
                        p12Var2.a = igiVar4;
                        p12Var2.c = ie7.a(new ea6(ia6Var3, p12Var2, b, b));
                        p12Var2.d = ie7.a(new ea6(ia6Var3, p12Var2, i, b));
                        new ea6(ia6Var3, p12Var2, 4, b);
                        new ea6(ia6Var3, p12Var2, 5, b);
                        new ea6(ia6Var3, p12Var2, 6, b);
                        p12Var2.e = new ea6(ia6Var3, p12Var2, 7, b);
                        p12Var2.f = new ea6(ia6Var3, p12Var2, 8, b);
                        p12Var2.g = ie7.a(new ea6(ia6Var3, p12Var2, i2, b));
                        p12Var2.h = ie7.a(new ea6(ia6Var3, p12Var2, z ? 1 : 0, b));
                        fa4 fa4Var2 = (fa4) ((m7h) p12Var2.h).get();
                        synchronized (t94Var3.g) {
                            t94Var3.h.add(fa4Var2);
                        }
                        alo.l(fa4Var2);
                        return fa4Var2;
                    case 9:
                        xfk xfkVar11 = (xfk) ((nv6) ((ha6) this.d).r).get();
                        eo9Var = new otk(xfkVar11, (nv6) ((ha6) this.d).s, (gg4) ((m7h) ((ia6) this.c).y).get(), xfkVar11.e);
                        return eo9Var;
                    case 10:
                        return new do9();
                    case 11:
                        long j2 = Long.MAX_VALUE;
                        long j3 = Long.MAX_VALUE;
                        for (int i3 = 0; i3 < 3; i3++) {
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            System.currentTimeMillis();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            if (jElapsedRealtimeNanos2 < j3) {
                                j3 = jElapsedRealtimeNanos2;
                            }
                        }
                        long j4 = 0;
                        for (int i4 = 0; i4 < 3; i4++) {
                            long jNanoTime = System.nanoTime();
                            long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                            long jNanoTime2 = System.nanoTime();
                            long j5 = jNanoTime2 - jNanoTime;
                            if (j5 < j2) {
                                j4 = jElapsedRealtimeNanos3 - ((jNanoTime + jNanoTime2) / 2);
                                j2 = j5;
                            }
                        }
                        return new lzk(j4);
                    case 12:
                        e3a e3aVar6 = (e3a) ((nv6) ((ha6) this.d).q).get();
                        e3aVar = new od4(e3aVar6);
                        return e3aVar;
                    case 13:
                        return new h3a();
                    case 14:
                        return sgb.b(e.a(new csk((unb) ((m7h) ((ia6) this.c).d).get()), e.a(((hnl) ((m7h) ((ia6) this.c).f).get()).h, new jx5("CXCP-Graph"))));
                    case 15:
                        e3aVar = new pd4();
                        return e3aVar;
                    case 16:
                        e3aVar = new qu5((e3a) ((nv6) ((ha6) this.d).q).get(), (ge4) ((m7h) ((ha6) this.d).c).get(), (m3a) ((m7h) ((ha6) this.d).n).get(), (djc) ((m7h) ((ha6) this.d).d).get());
                        return e3aVar;
                    case 17:
                        return new m3a();
                    default:
                        throw new AssertionError((int) b4);
                }
        }
    }
}
