package defpackage;

import android.content.SharedPreferences;
import android.graphics.PointF;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.emoji2.emojipicker.EmojiView;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.UrlMangler;
import com.opera.android.settings.SettingsManager;
import com.opera.hype.image.editor.EditImage;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class jf7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jf7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iIndexOf;
        byte b = this.a;
        ijm ijmVar = ijm.b;
        hjm hjmVar = hjm.a;
        int i = 2;
        byte b2 = 1;
        byte b3 = 0;
        Object[] objArr = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((BrowserActivity) obj2).u1((re7) obj, 4099);
                break;
            case 1:
                EditImage editImage = (EditImage) obj2;
                ba3 ba3Var = (ba3) obj;
                if (CollectionsKt.E(editImage.d, ba3Var)) {
                    editImage.d.c(ba3Var);
                } else {
                    editImage.h(ba3Var);
                }
                ywl ywlVar = editImage.e;
                ywlVar.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                ywlVar.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                break;
            case 2:
                wt7 wt7Var = (wt7) obj;
                ((q2) obj2).invoke();
                if (!z5i.r0(view.getContext())) {
                    new xw((byte) 6, view, wt7Var, objArr == true ? 1 : 0).p(view);
                    break;
                } else {
                    z5i.v0(view.getContext());
                    break;
                }
            case 3:
                ((x77) obj2).m(((eu7) obj).k);
                break;
            case 4:
                ((ju7) obj2).c.m(((fu7) obj).k);
                break;
            case 5:
                ((ua7) obj2).L(((mu7) obj).a);
                break;
            case 6:
                m0a m0aVar = (m0a) ((g77) obj2).a;
                LinkedHashSet linkedHashSetM0 = CollectionsKt.m0(m0aVar.d);
                if (linkedHashSetM0.remove((o0a) obj)) {
                    m0aVar.d = linkedHashSetM0;
                    if (linkedHashSetM0.isEmpty()) {
                        m0aVar.a.k();
                    }
                    m0aVar.b();
                    break;
                }
                break;
            case 7:
                ly7 ly7Var = (ly7) obj2;
                ly7Var.h = !ly7Var.h;
                ly7Var.H0();
                ly7Var.f.removeViews(1, ly7Var.n0() - 1);
                ly7Var.K();
                ((AppCompatImageView) obj).announceForAccessibility(ly7Var.c.getString(2132018807));
                break;
            case 8:
                mz7 mz7Var = (mz7) obj2;
                View view2 = (View) obj;
                String strValueOf = String.valueOf(((EmojiView) view).d);
                mz7Var.d.invoke(mz7Var, strValueOf);
                mz7Var.c.invoke(mz7Var, mz7.U(strValueOf));
                d7h d7hVar = mz7Var.b;
                nz7 nz7Var = mz7Var.g;
                if (nz7Var == null) {
                    nz7Var = null;
                }
                String str = (String) nz7Var.b.get(0);
                Map map = (Map) ((zyk) d7hVar.c).getValue();
                if (Intrinsics.a(str, strValueOf)) {
                    map.remove(str);
                } else {
                    map.put(str, strValueOf);
                }
                ((SharedPreferences) d7hVar.b).edit().putString("pref_key_sticky_variant", CollectionsKt.P(map.entrySet(), "|", (CharSequence) null, (String) null, 0, (Function1) null, 62)).commit();
                ua7 ua7Var = mz7Var.h;
                PopupWindow popupWindow = (PopupWindow) (ua7Var != null ? ua7Var : null).d;
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                view2.sendAccessibilityEvent(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                hy7 hy7Var = (hy7) obj;
                String str2 = ((pz7) obj2).c;
                if (str2 != null && hy7Var.a != null) {
                    hy7Var.dismiss();
                    ywa ywaVar = hy7Var.a;
                    EditImage editImage2 = ywaVar.h0().e;
                    PointF pointF = ywaVar.b;
                    if (pointF == null) {
                        ba3.i.getClass();
                        pointF = new PointF(0.5f, 0.5f);
                    }
                    ox7 ox7Var = new ox7(str2, pointF, 1.0f, 0.0f);
                    editImage2.d.b(ox7Var);
                    bfl bflVarE = editImage2.e(ox7Var);
                    if (bflVarE != null) {
                        editImage2.a(bflVarE, false);
                        break;
                    }
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                fge fgeVar = ((qb9) obj2).m;
                qim qimVar = fgeVar.r.o;
                Objects.requireNonNull(qimVar);
                nej nejVar = qimVar.d;
                zfe zfeVar = new zfe(fgeVar, (ib9) obj, b3);
                nejVar.getClass();
                nejVar.b(zfeVar, ijmVar);
                break;
            case 11:
                sba sbaVar = (sba) obj2;
                sbaVar.g = true;
                sbaVar.b(hjmVar);
                ((qba) obj).h.b.onClick(view);
                break;
            case 12:
                nsl nslVar = (nsl) obj;
                xtb[] xtbVarArr = ywa.g;
                lxa lxaVarG0 = ((ywa) obj2).g0();
                if (lxaVarG0.n.getValue() == nslVar) {
                    nslVar = null;
                }
                lxaVarG0.n.j(nslVar);
                int i2 = nslVar != null ? jxa.a[nslVar.ordinal()] : -1;
                if (i2 == 1) {
                    lxaVarG0.f(new dxa((PointF) null, 3));
                    break;
                } else if (i2 == 2) {
                    lxaVarG0.f(new hxa(null));
                    break;
                }
                break;
            case 13:
                f1c f1cVar = ((b1c) obj2).e;
                i0c i0cVar = ((a1c) obj).a;
                z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                d1c d1cVar = new d1c(i0cVar.a.g(f1cVar.requireContext()), i0cVar.b, new z0c(f1cVar, i0cVar, (byte) 0));
                z77VarU.getClass();
                z77VarU.b(d1cVar, ijmVar);
                break;
            case 14:
                bg7 bg7Var = (bg7) obj2;
                z4m z4mVar = (z4m) obj;
                if (((bz0) bg7Var.e) != null) {
                    ge5 ge5Var = (ge5) bg7Var.d;
                    f1c f1cVar2 = (f1c) ge5Var.b;
                    if (z4mVar != ((z4m) ge5Var.c)) {
                        SettingsManager settingsManager = f1cVar2.x;
                        settingsManager.getClass();
                        settingsManager.V(z4mVar.ordinal(), "translation_source");
                    }
                    ((bz0) bg7Var.e).dismiss();
                    break;
                }
                break;
            case 15:
                ((qkc) obj2).b.b((zmc) obj);
                break;
            case 16:
                ((ci7) obj2).invoke((String) obj);
                break;
            case 17:
                lrc lrcVar = (lrc) obj;
                if (((s6h) obj2).I()) {
                    vl6 vl6Var = lrcVar.C;
                    (vl6Var != null ? vl6Var : null).S();
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                gvc gvcVar = (gvc) obj2;
                bre breVar = ((fvc) obj).c;
                if (breVar != null) {
                    dvc dvcVar = gvcVar.a.a;
                    yqa yqaVar = dvcVar.s;
                    x77 x77Var = (x77) yqaVar.b;
                    if (x77Var != null && !breVar.equals((bre) x77Var.d)) {
                        ((x77) yqaVar.b).d = breVar;
                        ivc ivcVar = (ivc) yqaVar.c;
                        if (ivcVar != null) {
                            ivcVar.b(breVar);
                        }
                    }
                    dvcVar.g0();
                    break;
                }
                break;
            case 19:
                qjd qjdVar = ((cmd) obj2).e;
                zld zldVar = (zld) ((yzb) obj).b;
                ode odeVar = (ode) zldVar.b.c;
                if (!qjdVar.equals(((gig) odeVar.g()).g())) {
                    if (!((gig) odeVar.g()).isPlayingAd() && (iIndexOf = zldVar.g.indexOf(qjdVar)) != -1) {
                        ((gig) odeVar.g()).seekToDefaultPosition(iIndexOf);
                        break;
                    }
                } else {
                    zldVar.e.e();
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                gnd gndVar = (gnd) obj2;
                cod codVar = (cod) obj;
                ((hnd) gndVar.f.h).o = codVar;
                codVar.l(true);
                gndVar.c.setVisibility(4);
                gndVar.d.setVisibility(0);
                break;
            case 21:
                ((gtd) obj2).c.onClick(view);
                ((exd) obj).b(hjmVar);
                break;
            case SizeUtil.textSize1 /* 22 */:
                dwd dwdVar = (dwd) ((ua7) obj2).d;
                ((cwd) obj).c.run();
                dwdVar.b();
                break;
            case 23:
                d0e d0eVar = (d0e) obj2;
                s2 s2Var = (s2) obj;
                yzd yzdVar = d0eVar.l;
                if (yzdVar != null) {
                    s2Var.invoke(yzdVar, d0eVar);
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                e0e e0eVar = (e0e) obj2;
                s2 s2Var2 = (s2) obj;
                zzd zzdVar = e0eVar.m;
                if (zzdVar != null) {
                    s2Var2.invoke(zzdVar, e0eVar);
                    break;
                }
                break;
            case 25:
                jve jveVar = (jve) obj2;
                nb8 nb8Var = (nb8) obj;
                uqe uqeVar = jveVar.h;
                String str3 = nb8Var.i;
                String str4 = nb8Var.h;
                uy8 uy8Var = uqeVar.h;
                if (uy8Var.F.add(str3)) {
                    x5f x5fVar = uy8Var.K.a;
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        new ck0(zpaVar, x56VarF).j(new j5f(str3, od0.b, i));
                        x5fVar.U0(x56VarF);
                    }
                }
                boolean zV = wqm.v(str4);
                lqm lqmVar = lqm.C;
                if (!zV) {
                    UrlMangler.Builder builder = new UrlMangler.Builder("newsevent", str4);
                    builder.displayString(jveVar.g0().c.b);
                    vx3 vx3VarA = ay3.a(builder.build(), lqmVar, false);
                    vx3VarA.a(true);
                    am2.v(vx3VarA);
                    break;
                } else {
                    lk6.a(Uri.parse(str4), lqmVar, 1, jveVar.l);
                    break;
                }
            case 26:
                ((hv3) obj2).m();
                ((bbf) obj).a.dismiss();
                break;
            case 27:
                dnf dnfVar = (dnf) obj2;
                gtj gtjVar = (gtj) obj;
                if (!dnfVar.f.a()) {
                    dnfVar.g();
                    gtjVar.a();
                    break;
                }
                break;
            case 28:
                lrf lrfVar = (lrf) obj;
                yrf yrfVar = (yrf) ((tn) obj2).d;
                if (!yrfVar.e(lrfVar)) {
                    yrfVar.f(lrfVar);
                }
                yrfVar.b();
                break;
            default:
                kwf kwfVar = (kwf) obj2;
                kwfVar.b();
                nwf nwfVar = kwfVar.l;
                nwfVar.getClass();
                new wp3(nwfVar, (wcj) obj, b2);
                break;
        }
    }
}
