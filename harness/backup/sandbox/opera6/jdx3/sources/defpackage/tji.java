package defpackage;

import J.N;
import android.speech.tts.TextToSpeech;
import android.view.View;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class tji implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tji(eoj eojVar, v4b v4bVar) {
        this.a = (byte) 20;
        this.b = eojVar;
    }

    public /* synthetic */ tji(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        gbc gbcVar;
        View view;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vji vjiVar = ((uji) obj2).c;
                return Boolean.valueOf(vjiVar != null ? vjiVar.c(obj) : true);
            case 1:
                ((wj9) obj2).b.c();
                return Unit.a;
            case 2:
                voi voiVar = (voi) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                q0g q0gVar = voiVar.a;
                float fH = q0gVar.h() + fFloatValue + voiVar.g;
                float fB = djh.b(fH, 0.0f, voiVar.f.h());
                z = fH == fB;
                float fH2 = fB - q0gVar.h();
                int iRound = Math.round(fH2);
                q0gVar.i(q0gVar.h() + iRound);
                voiVar.g = fH2 - iRound;
                if (!z) {
                    fFloatValue = fH2;
                }
                return Float.valueOf(fFloatValue);
            case 3:
                spi spiVar = (spi) obj2;
                return new y8f(spiVar.d(spiVar.k, ((y8f) obj).a, spiVar.j));
            case 4:
                gqi gqiVar = (gqi) obj2;
                jqi jqiVar = (jqi) obj;
                pqi pqiVar = gqiVar.d;
                jqi jqiVarB = pqiVar.b(jqiVar);
                ode odeVar = gqiVar.e;
                oqi oqiVar = pqiVar.a;
                if (!oqiVar.k) {
                    oqiVar.i();
                }
                boolean z = oqiVar.l;
                pne pneVar = gqiVar.b;
                odeVar.r(new fqi(z, gqi.f(pneVar.a, pqiVar.a(pneVar).a), gqi.f(jqiVar.b, jqiVarB.b), gqi.f(jqiVar.c, jqiVarB.c), gqi.f(jqiVar.d, jqiVarB.d), gqi.f(jqiVar.e, jqiVarB.e), gqi.f(jqiVar.f, jqiVarB.f), gqi.f(jqiVar.g, jqiVarB.g), gqi.f(jqiVar.h, jqiVarB.h), gqi.f(jqiVar.i, jqiVarB.i), gqi.f(jqiVar.j, jqiVarB.j), gqi.f(Integer.valueOf(jqiVar.m), Integer.valueOf(jqiVarB.m)), gqi.f(jqiVar.o, jqiVarB.o), gqi.f(jqiVar.p, jqiVarB.p), gqi.f(jqiVar.q, jqiVarB.q), gqi.f(jqiVar.r, jqiVarB.r), gqi.f(jqiVar.s, jqiVarB.s), gqi.f(jqiVar.t, jqiVarB.t), gqi.f(jqiVar.u, jqiVarB.u)));
                return Unit.a;
            case 5:
                ((oy) obj2).l();
                return Unit.a;
            case 6:
                nrl nrlVar = (nrl) obj2;
                if (Intrinsics.a((pg) obj, ng.a)) {
                    if (!(!wbc.g.c() ? false : N.MFTJCvBh()) || !N.M$PqApPr("IncognitoScreenshot")) {
                        z = true;
                    }
                }
                if (z != nrlVar.a) {
                    nrlVar.a = z;
                    ((gwi) nrlVar.b).b(z);
                }
                return Unit.a;
            case 7:
                eyi eyiVar = (eyi) obj2;
                lmg lmgVar = (lmg) obj;
                long j = lmgVar.c;
                dil dilVar = (dil) eyiVar.d;
                if (dilVar.i() && dilVar.l().a.b.length() != 0 && (gbcVar = dilVar.d) != null && gbcVar.d() != null) {
                    eyiVar.m(dilVar.l(), j, false, ujp.o);
                    z = true;
                }
                if (z) {
                    lmgVar.a();
                }
                return Unit.a;
            case 8:
                xbf xbfVar = (xbf) obj2;
                return new asi((ge) obj, (k6l) xbfVar.b, (u4l) xbfVar.c, (s9i) xbfVar.d, (p9l) xbfVar.e);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                tn tnVar = (tn) obj2;
                rjf rjfVar = (rjf) obj;
                if (rjfVar == rjf.d && (view = (View) ((c9l) tnVar.c).invoke()) != null) {
                    view.performClick();
                }
                if (rjfVar == rjf.c) {
                    tnVar.a = true;
                    ((c9l) tnVar.d).b.p.postOnAnimationDelayed(new mni(tnVar, (byte) 5), 1000L);
                } else {
                    ((wci) tnVar.b).o(rjfVar);
                }
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                o0j.h((q0j) obj, ((q5i) obj2).a);
                return Unit.a;
            case 11:
                ((List) obj).add((Float) ((d6c) obj2).invoke());
                return true;
            case 12:
                return ((lb) obj2).invoke();
            case 13:
                c9j c9jVar = (c9j) obj2;
                l6j l6jVar = (l6j) obj;
                xtb[] xtbVarArr = c9j.w;
                o9j o9jVar = (o9j) c9jVar.r.getValue();
                o9jVar.getClass();
                o9jVar.f(new g00(o9jVar, l6jVar.a, (byte) 7));
                oji ojiVar = o9jVar.d;
                x6j x6jVar = l6jVar.b;
                ojiVar.getClass();
                x6jVar.c.invoke(((wub) ojiVar.a).E(x6jVar.a), x6jVar.b);
                c9jVar.G0();
                return Unit.a;
            case 14:
                a21 a21Var = (a21) obj2;
                ((shf) a21Var.e).q();
                a21.s(a21Var, (List) obj, null, 2);
                return Unit.a;
            case 15:
                kaj kajVar = (kaj) obj2;
                m1i m1iVar = (m1i) obj;
                m1iVar.l(m1iVar.t.b() * kajVar.b);
                m1iVar.n(kajVar.c);
                m1iVar.f(kajVar.d);
                m1iVar.d(kajVar.e);
                m1iVar.p(kajVar.f);
                return Unit.a;
            case 16:
                ecj ecjVar = (ecj) obj2;
                Object obj3 = ((t0i) obj).a;
                ecjVar.invoke(obj3 instanceof q0i ? null : obj3);
                return Unit.a;
            case 17:
                wkj wkjVar = (wkj) obj2;
                m1i m1iVar2 = (m1i) obj;
                m1iVar2.g(wkjVar.o);
                m1iVar2.h(wkjVar.p);
                m1iVar2.c(wkjVar.q);
                float f = wkjVar.r;
                if (m1iVar2.e != f) {
                    m1iVar2.a |= 8;
                    m1iVar2.e = f;
                }
                m1iVar2.t(wkjVar.s);
                m1iVar2.l(wkjVar.t);
                float f2 = wkjVar.u;
                if (m1iVar2.j != f2) {
                    m1iVar2.a |= Constants.Crypt.KEY_LENGTH;
                    m1iVar2.j = f2;
                }
                float f3 = wkjVar.v;
                if (m1iVar2.k != f3) {
                    m1iVar2.a |= 512;
                    m1iVar2.k = f3;
                }
                float f4 = wkjVar.w;
                if (m1iVar2.l != f4) {
                    m1iVar2.a |= 1024;
                    m1iVar2.l = f4;
                }
                float f5 = wkjVar.x;
                if (m1iVar2.m != f5) {
                    m1iVar2.a |= 2048;
                    m1iVar2.m = f5;
                }
                m1iVar2.r(wkjVar.y);
                m1iVar2.n(wkjVar.z);
                m1iVar2.f(wkjVar.A);
                m1iVar2.d(wkjVar.B);
                m1iVar2.p(wkjVar.C);
                int i = wkjVar.D;
                if (m1iVar2.q != i) {
                    m1iVar2.a |= 32768;
                    m1iVar2.q = i;
                }
                int i2 = wkjVar.E;
                if (m1iVar2.w != i2) {
                    m1iVar2.a |= 524288;
                    m1iVar2.w = i2;
                }
                kh3 kh3Var = wkjVar.F;
                if (!Intrinsics.a(m1iVar2.v, kh3Var)) {
                    m1iVar2.a |= 262144;
                    m1iVar2.v = kh3Var;
                }
                v1c v1cVar = wkjVar.G;
                if (!Intrinsics.a(m1iVar2.s, v1cVar)) {
                    m1iVar2.a |= 1048576;
                    m1iVar2.s = v1cVar;
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((plj) obj2).t = null;
                return Unit.a;
            case 19:
                emj emjVar = (emj) obj2;
                or4 or4Var = emjVar.g;
                if (!Intrinsics.a(or4Var, or4Var)) {
                    bpg.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                tee teeVar = emjVar.f;
                Object obj4 = emjVar.d;
                if (teeVar != null) {
                    if (obj4 != null) {
                        bpg.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    teeVar.a(obj);
                } else if (obj4 == null) {
                    emjVar.d = obj;
                } else {
                    tee teeVar2 = jmi.a;
                    tee teeVar3 = new tee();
                    teeVar3.a(obj4);
                    teeVar3.a(obj);
                    emjVar.f = teeVar3;
                    emjVar.d = null;
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                ((eoj) obj2).d = new ioj((byte) 0);
                return Unit.a;
            case 21:
                vvf vvfVar = (vvf) obj2;
                Object obj5 = ((t0i) obj).a;
                vvfVar.invoke(obj5 instanceof q0i ? null : obj5);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                f9 f9Var = (f9) obj2;
                Object obj6 = ((t0i) obj).a;
                Long l = (Long) (obj6 instanceof q0i ? null : obj6);
                f9Var.invoke(Long.valueOf(l != null ? l.longValue() : 0L));
                return Unit.a;
            case 23:
                n6j n6jVar = (n6j) obj;
                Iterator it = ((xoj) obj2).i.iterator();
                while (it.hasNext()) {
                    n6jVar.a(((ex4) it.next()).a);
                }
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                return Boolean.valueOf(Intrinsics.a(((do8) obj).a, (nsj) obj2));
            case 25:
                gtj gtjVar = (gtj) obj2;
                ((na3) gtjVar.a).i.postOnAnimation(new etj(gtjVar, (byte) 0));
                return Unit.a;
            case 26:
                tuj tujVar = (tuj) obj2;
                synchronized (tujVar.i) {
                    suj sujVar = (suj) tujVar.k;
                    Object obj7 = sujVar.b;
                    int i3 = sujVar.d;
                    zde zdeVar = sujVar.c;
                    if (zdeVar == null) {
                        zdeVar = new zde();
                        sujVar.c = zdeVar;
                        sujVar.f.m(obj7, zdeVar);
                    }
                    sujVar.b(obj, i3, obj7, zdeVar);
                }
                return Unit.a;
            case 27:
                d22 d22Var = (d22) obj2;
                long jIntValue = ((Integer) obj).intValue();
                if (!d22Var.e && !d22Var.d) {
                    if (((c22) d22Var.c.g()).b && jIntValue >= r3.a.length()) {
                        d22Var.b.invoke(d22Var);
                        d22Var.e = true;
                    }
                }
                return Unit.a;
            case 28:
                uyj uyjVar = (uyj) obj2;
                if (!((bzj) obj).a()) {
                    pyl pylVar = uyjVar.h;
                    TextToSpeech textToSpeech = uyjVar.d;
                    pylVar.c = null;
                    pylVar.d = null;
                    pylVar.b = 0;
                    ((ArrayList) pylVar.e).clear();
                    textToSpeech.shutdown();
                    textToSpeech.setOnUtteranceProgressListener(null);
                    syj syjVar = uyjVar.i;
                    if (syjVar != null) {
                        synchronized (syjVar.f) {
                            vml.a(syjVar.j);
                            syjVar.g = null;
                        }
                    }
                    uyjVar.i = null;
                }
                return Unit.a;
            default:
                u8n.d(2132083610, ((c5k) obj2).c);
                return Unit.a;
        }
    }
}
