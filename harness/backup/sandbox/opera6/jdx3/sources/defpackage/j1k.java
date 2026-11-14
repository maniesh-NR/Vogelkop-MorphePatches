package defpackage;

import J.N;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.leanplum.utils.SizeUtil;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j1k extends nr9 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1k(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() {
        Object value;
        Context context;
        bz0 bz0Var;
        Context context2;
        bz0 bz0Var2;
        switch (this.a) {
            case 0:
                nak nakVar = ((b1k) ((z84) this).receiver).i;
                do {
                    value = nakVar.getValue();
                } while (!nakVar.h(value, (Object) null));
                return Unit.a;
            case 1:
                g1k g1kVar = (b1k) ((z84) this).receiver;
                g1kVar.h.j((Object) null);
                g1kVar.c.a.invoke();
                return Unit.a;
            case 2:
                ((b1k) ((z84) this).receiver).h.j((Object) null);
                return Unit.a;
            case 3:
                ((fbf) ((z84) this).receiver).a.t.y().h();
                return Unit.a;
            case 4:
                return Boolean.valueOf(((mrk) ((z84) this).receiver).d());
            case 5:
                qwk qwkVar = (qwk) ((z84) this).receiver;
                xih.x(qwkVar.m.b.c, qwkVar.k.b.b(), qwkVar.i, null, null);
                return Unit.a;
            case 6:
                ((qwk) ((z84) this).receiver).E();
                return Unit.a;
            case 7:
                qwk qwkVar2 = (qwk) ((z84) this).receiver;
                xih.x(qwkVar2.m.b.c, qwkVar2.k.b.b(), qwkVar2.i, null, null);
                return Unit.a;
            case 8:
                ((qwk) ((z84) this).receiver).E();
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                qwk qwkVar3 = (qwk) ((z84) this).receiver;
                ft3 ft3Var = qwkVar3.m;
                qwkVar3.i.getClass();
                avj avjVar = cak.d;
                if ((!avj.b(1) ? 0 : N.MhJnoDjg()) != 6) {
                    qwkVar3.D(true);
                } else {
                    boolean zH = zwk.h();
                    ijm ijmVar = ijm.b;
                    if (zH) {
                        z77 z77Var = ft3Var.b.c;
                        t48 t48Var = new t48(new w48(), new pwk(qwkVar3, (byte) 0), (byte) 0);
                        z77Var.getClass();
                        z77Var.b(t48Var, ijmVar);
                    } else if (qwkVar3.k.b.b().b() == jh0.d || zwk.g()) {
                        z77 z77Var2 = ft3Var.b.c;
                        tu tuVar = new tu(qwkVar3, (byte) 10);
                        l18 l18Var = new l18();
                        k18 k18Var = new k18(l18Var, tuVar, l18Var);
                        z77Var2.getClass();
                        z77Var2.b(k18Var, ijmVar);
                    } else {
                        a06 a06Var = new a06();
                        a06Var.u = new pwk(qwkVar3, (byte) 1);
                        zhj.a(a06Var, 4099).c(qwkVar3.f);
                    }
                }
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                qwk qwkVar4 = (qwk) ((z84) this).receiver;
                SharedPreferences.Editor editorEdit = qwkVar4.j.a().edit();
                editorEdit.putBoolean("password.promote", false);
                editorEdit.apply();
                qwkVar4.A();
                return Unit.a;
            case 11:
                nv6 nv6VarB = ru9.c(((c4l) ((z84) this).receiver).a.b).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("tab_gallery.tabui2_bubble_tour_shown", true);
                nv6VarB.w();
                return Unit.a;
            case 12:
                g4l g4lVar = (g4l) ((z84) this).receiver;
                if (!Intrinsics.a((qyi) g4lVar.a.g(), oyi.a)) {
                    if (g4lVar.j.contains(f4l.c)) {
                        g4lVar.p = true;
                    } else {
                        g4lVar.h.C();
                    }
                }
                return Unit.a;
            case 13:
                z5l z5lVar = (z5l) ((z84) this).receiver;
                z5lVar.B.j();
                z5lVar.m.invoke();
                return Unit.a;
            case 14:
                z5l z5lVar2 = (z5l) ((z84) this).receiver;
                z5lVar2.B.j();
                z5lVar2.m.invoke();
                return Unit.a;
            case 15:
                z5l z5lVar3 = (z5l) ((z84) this).receiver;
                z5lVar3.B.j();
                z5lVar3.m.invoke();
                return Unit.a;
            case 16:
                z5l z5lVar4 = (z5l) ((z84) this).receiver;
                z5lVar4.B.j();
                z5lVar4.m.invoke();
                return Unit.a;
            case 17:
                zc3 zc3Var = ((z5l) ((z84) this).receiver).z;
                View viewY = zc3Var.y();
                if (viewY != null) {
                    zc3Var.z(viewY, true);
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                tn tnVar = ((g4l) ((z84) this).receiver).h;
                if (tnVar.a) {
                    tnVar.a = false;
                    ((wci) tnVar.b).o(rjf.b);
                }
                return Unit.a;
            case 19:
                r9l r9lVar = (r9l) ((z84) this).receiver;
                r9lVar.i.invoke();
                r9lVar.q.a.postOnAnimationDelayed(new qlk(r9lVar, (byte) 28), 500L);
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                r9l r9lVar2 = (r9l) ((z84) this).receiver;
                boolean zK = r9lVar2.k();
                ebl eblVar = r9lVar2.q;
                return zK ? eblVar.g.getContext() : eblVar.j.getContext();
            case 21:
                r9l r9lVar3 = (r9l) ((z84) this).receiver;
                r9lVar3.getClass();
                r9lVar3.o = j9l.d;
                r9lVar3.e.removeView(r9lVar3.p);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                r9l r9lVar4 = (r9l) ((z84) this).receiver;
                r9lVar4.getClass();
                LinkedHashMap linkedHashMap = r9l.F;
                r9l.F.put(p6l.b, new k9l(null, r9lVar4.c.y));
                r9lVar4.w.h0();
                return Unit.a;
            case 23:
                r9l r9lVar5 = (r9l) ((z84) this).receiver;
                boolean zK2 = r9lVar5.k();
                ebl eblVar2 = r9lVar5.q;
                return zK2 ? eblVar2.g.getContext() : eblVar2.j.getContext();
            case SizeUtil.textSize2 /* 24 */:
                v9l v9lVar = (v9l) ((z84) this).receiver;
                if (v9lVar.v != null) {
                    x77 x77Var = v9lVar.t;
                    ((gm8) x77Var.c).e();
                    eq6 eq6Var = (eq6) x77Var.d;
                    if (eq6Var != null) {
                        eq6Var.K();
                    }
                    x77Var.d = null;
                }
                v9lVar.v = null;
                return Unit.a;
            case 25:
                fdm fdmVar = (fdm) ((z84) this).receiver;
                bz0 bz0Var3 = fdmVar.a;
                if (bz0Var3 != null && (context = bz0Var3.getContext()) != null && !cs5.Q(context) && (bz0Var = fdmVar.a) != null) {
                    bz0Var.dismiss();
                }
                fdmVar.a = null;
                return Unit.a;
            case 26:
                pem pemVar = (pem) ((z84) this).receiver;
                bz0 bz0Var4 = pemVar.a;
                if (bz0Var4 != null && (context2 = bz0Var4.getContext()) != null && !cs5.Q(context2) && (bz0Var2 = pemVar.a) != null) {
                    bz0Var2.dismiss();
                }
                pemVar.a = null;
                return Unit.a;
            case 27:
                ((AppBarLayout) ((ifm) ((z84) this).receiver).u.getValue()).k(false, true, true);
                return Unit.a;
            case 28:
                kfm kfmVar = (kfm) ((z84) this).receiver;
                try {
                    ((ClipboardManager) kfmVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((String) ((ne5) kfmVar.j.a).a, kfmVar.f));
                } catch (Throwable unused) {
                }
                return Unit.a;
            default:
                return Boolean.valueOf(((njm) ((z84) this).receiver).a());
        }
    }
}
