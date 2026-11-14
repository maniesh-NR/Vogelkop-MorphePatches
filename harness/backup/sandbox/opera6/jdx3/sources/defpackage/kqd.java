package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.browser.SimpleUrlLoader;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.custom_views.OperaIntroView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.notifications.NotificationBridge;
import com.opera.android.readlater.MigrationWorker;
import com.opera.android.settings.SettingsManager;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class kqd implements tqd, tya, m94, OnSuccessListener, nbd, g94, wqe, n5o, i82, NotificationBridge.Callback, m9n, ekj, o9n, jz3, ykj, hxj, vlf, ii2, SimpleUrlLoader.MimeTypeFilter, b27 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kqd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ kqd(vhe vheVar, pqo pqoVar) {
        this.a = (byte) 7;
        this.b = pqoVar;
    }

    @Override // defpackage.jz3
    public final BubbleView a(lz3 lz3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Drawable drawableF;
        tjf tjfVar = (tjf) this.b;
        lz3Var.a(tjfVar.e);
        View viewInflate = layoutInflater.inflate(2131559179, viewGroup, false);
        int i = 2131361862;
        MaterialButton materialButtonJ = w1h.j(2131361862, viewInflate);
        if (materialButtonJ != null) {
            i = 2131362353;
            AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131362353, viewInflate);
            if (appCompatImageView != null) {
                i = 2131362414;
                if (w1h.j(2131362414, viewInflate) != null) {
                    i = 2131363086;
                    if (w1h.j(2131363086, viewInflate) != null) {
                        i = 2131363509;
                        TextView textView = (TextView) w1h.j(2131363509, viewInflate);
                        if (textView != null) {
                            i = 2131364572;
                            TextView textView2 = (TextView) w1h.j(2131364572, viewInflate);
                            if (textView2 != null) {
                                i = 2131363525;
                                TextView textView3 = (TextView) w1h.j(2131363525, viewInflate);
                                if (textView3 != null) {
                                    BubbleView bubbleView = (BubbleView) viewInflate;
                                    x1p x1pVar = tjfVar.c;
                                    Context context = bubbleView.getContext();
                                    CharSequence charSequenceA = x1pVar.A(context);
                                    if (charSequenceA != null) {
                                        textView2.setText(charSequenceA);
                                        textView2.setVisibility(0);
                                    }
                                    CharSequence charSequenceB = x1pVar.B(context);
                                    if (charSequenceB != null) {
                                        textView3.setText(charSequenceB);
                                        textView3.setVisibility(0);
                                    }
                                    CharSequence charSequenceZ = x1pVar.z(context);
                                    if (charSequenceZ != null) {
                                        textView.setText(charSequenceZ);
                                        textView.setVisibility(0);
                                    }
                                    CharSequence charSequenceV = x1pVar.v(context);
                                    if (charSequenceV != null) {
                                        materialButtonJ.setText(charSequenceV);
                                        materialButtonJ.setVisibility(0);
                                        Integer numU = x1pVar.u();
                                        if (numU != null && (drawableF = sgb.F(numU.intValue(), context)) != null) {
                                            materialButtonJ.D(drawableF);
                                            if (!x1pVar.o() && materialButtonJ.i != null) {
                                                materialButtonJ.i = null;
                                                materialButtonJ.K(false);
                                            }
                                        }
                                    }
                                    if (!x1pVar.x()) {
                                        appCompatImageView.setVisibility(8);
                                    }
                                    return bubbleView;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final Object attachCompleter(l94 l94Var) {
        MigrationWorker migrationWorker = (MigrationWorker) this.b;
        syd sydVar = (syd) migrationWorker.f.get();
        wyd wydVar = new wyd(sydVar.a, sydVar.b, sydVar.d, (glh) migrationWorker.e.get(), new pad((byte) 23, sydVar, new esg((byte) 24, migrationWorker, l94Var, false), false));
        bpd bpdVar = sydVar.e;
        ((ArrayDeque) bpdVar.c).offer(wydVar);
        if (((wyd) bpdVar.b) == null) {
            wyd wydVar2 = (wyd) ((ArrayDeque) bpdVar.c).poll();
            bpdVar.b = wydVar2;
            if (wydVar2 != null) {
                wydVar2.run();
            }
        }
        l94Var.a(new uyd(wydVar, (byte) 1), migrationWorker.g);
        return Unit.a;
    }

    @Override // defpackage.ekj
    public final void b(hjm hjmVar) {
        pgf pgfVar = (pgf) this.b;
        if (hjmVar == hjm.b) {
            pgfVar.c(nl0.d);
        }
    }

    @Override // defpackage.hxj
    public final ixj c() {
        Rect rect;
        q2f q2fVar = (q2f) this.b;
        int width = q2fVar.f.getRootView().getWidth();
        Rect rect2 = new Rect();
        OmniButtonView omniButtonView = q2fVar.f;
        if (omniButtonView == null || !omniButtonView.getGlobalVisibleRect(rect2)) {
            rect = null;
        } else {
            int i = rect2.left;
            int i2 = q2fVar.c;
            rect = new Rect(i + i2, rect2.top + i2, rect2.right - i2, rect2.bottom - i2);
        }
        return new ixj(width, rect, 0, 0, cs5.W(q2fVar.f), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK);
    }

    @Override // defpackage.i82
    public final j82 d(oqe oqeVar) {
        vue vueVar = (vue) this.b;
        if ((oqeVar instanceof ere) || vue.t(oqeVar, true) != 0) {
            return pue.e(oqeVar, vueVar.f, false);
        }
        return null;
    }

    public final Object e(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 4:
                return ((b10) obj3).apply(obj2);
            default:
                return nb6.W(new oce((pce) obj3, obj, (byte) 0), (List) ((Collection) obj2));
        }
    }

    @Override // defpackage.ii2
    public final void f(int i) {
        myf myfVar = (myf) this.b;
        myfVar.d();
        myfVar.f = null;
        if (i != 1) {
            if (i == 2 || i == 3) {
                myfVar.b(0);
                return;
            }
            return;
        }
        myfVar.a();
        jxl jxlVar = myfVar.a;
        if (jxlVar == null) {
            return;
        }
        jxlVar.a(myfVar, true, 1);
        myfVar.a = null;
    }

    public final Object g(Object obj) {
        Object q0iVar;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return hd.j((Context) ((hd) obj2).f).getString("npt_unsent_fcm_token", null);
            case 12:
                Pair pair = (Pair) obj;
                ((h6f) obj2).d(((Boolean) pair.first).booleanValue(), ((Boolean) pair.second).booleanValue());
                return null;
            case 14:
                x77 x77Var = (x77) obj2;
                x77Var.getClass();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                View view = (View) x77Var.c;
                if (zBooleanValue) {
                    q9n.H(view);
                } else {
                    q9n.u(view);
                }
                return null;
            default:
                ktf ktfVar = (ktf) obj2;
                try {
                    t9f t9fVar = (t9f) ktfVar.b.getValue();
                    fvh fvhVar = new fvh();
                    fvhVar.a = ktf.g;
                    fvhVar.d("User-Agent", cqp.i0());
                    q0iVar = ((t0i) vtp.R(t9fVar.c(new kvh(fvhVar)), new s2e(1, ktfVar, ktf.class, "processResponse", "processResponse-IoAF18A(Lokhttp3/Response;)Ljava/lang/Object;", 0, (byte) 25), new w5f((byte) 12), 1, 0L, 112)).a;
                } catch (InterruptedException e) {
                    p0i p0iVar = t0i.b;
                    q0iVar = new q0i(new Exception("Cancelled", e));
                }
                return new t0i(q0iVar);
        }
    }

    @Override // defpackage.tqd
    public final void h(xkg xkgVar, nod nodVar) {
        ((op5) this.b).accept(xkgVar);
    }

    @Override // com.opera.android.browser.SimpleUrlLoader.MimeTypeFilter
    public final boolean i(String str) {
        t2g t2gVar = (t2g) this.b;
        boolean zEquals = str.equals("application/octet-stream");
        if (!zEquals) {
            x79 x79Var = (x79) ((v2g) t2gVar).b.b;
            x79Var.c = null;
            x79Var.T(false);
        }
        return zEquals;
    }

    @Override // defpackage.m9n
    public final void j() {
        ((gbf) this.b).n();
    }

    public final Object k(g3d g3dVar) {
        OperaIntroView operaIntroView = (OperaIntroView) this.b;
        int i = OperaIntroView.F;
        nli nliVar = operaIntroView.y;
        nliVar.a = operaIntroView.B();
        nliVar.b = 1.0f;
        return nliVar;
    }

    @Override // defpackage.g94
    public final void l(Object obj) {
        byte b = this.a;
        bm bmVarD = null;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                cie cieVar = (cie) obj2;
                qio qioVar = (qio) obj;
                qioVar.getClass();
                if (!(qioVar instanceof lio)) {
                    vho vhoVar = (vho) ((mio) qioVar).a;
                    if (vhoVar == null || vhoVar.b.isEmpty() || !cieVar.f(null, vhoVar.a, vhoVar.a(), null)) {
                        cieVar.b.m(bm.PERSISTENT_STORAGE_INITIALIZATION_ERROR);
                    } else {
                        cieVar.b.i();
                    }
                    cieVar.i();
                }
                if (qioVar instanceof lio) {
                    bm bmVar = ((zno) ((lio) qioVar).a).a;
                    int i = aie.c[bmVar.ordinal()];
                    if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                        cieVar.b.m(bmVar);
                        cieVar.i();
                        break;
                    }
                }
                break;
            default:
                pqo pqoVar = (pqo) obj2;
                uuj uujVarA = poo.a((String) obj, pqoVar);
                if (uujVarA != null) {
                    int i2 = uujVarA.a;
                    ArrayList arrayList = (ArrayList) uujVarA.b;
                    bm bmVar2 = bm.d;
                    if (i2 != 0) {
                        bmVarD = bm.d(i2);
                    } else if (arrayList == null || arrayList.isEmpty()) {
                        bmVarD = bmVar2;
                    }
                    if (bmVarD != bmVar2) {
                        if (bmVarD == null) {
                            vho vhoVar2 = (vho) arrayList.get(0);
                            w06 w06Var = vhoVar2.a;
                            w06Var.getClass();
                            if (w06Var instanceof n06) {
                                Integer numB = vhoVar2.b();
                                String str = vhoVar2.e.a;
                                String strR = vtp.r(str);
                                List list = sjo.a;
                                x79 x79Var = phf.a;
                                int i3 = ((Context) x79Var.a).getSharedPreferences("ad_config", 0).getInt(strR, 0);
                                long j = ((Context) x79Var.a).getSharedPreferences("ad_config", 0).getLong(vtp.k(str), 0L);
                                if (numB == null || numB.intValue() != i3 || j != vhoVar2.d) {
                                    vtp.s(vhoVar2);
                                    break;
                                }
                            }
                        }
                    } else {
                        gxo.a(new et2(pqoVar.a, (byte) 6));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.o9n
    public final g3o m(View view, g3o g3oVar, sv2 sv2Var) {
        OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) this.b;
        operaBottomSheetBehavior.i = g3oVar.a.k().d;
        operaBottomSheetBehavior.O();
        return g3oVar;
    }

    @Override // defpackage.wqe
    public final boolean n(String str) {
        Set setO = w1h.o(((ta7) this.b).s(), "blacklisted_news_domains", (Set) null);
        if (setO == null) {
            setO = Collections.EMPTY_SET;
        }
        return setO.contains(str);
    }

    public final void o(uya uyaVar) {
        txd txdVar = (txd) this.b;
        synchronized (txdVar.a) {
            txdVar.c++;
        }
        txdVar.d(uyaVar);
    }

    @Override // com.opera.android.notifications.NotificationBridge.Callback
    public final void onDone() {
        ((NotificationBridge.TrampolineActivity) this.b).finish();
    }

    public final void onSuccess(Object obj) {
        ((u85) this.b).h((qop) obj);
    }

    @Override // defpackage.b27
    public final void p(boolean z) {
        q4g q4gVar = (q4g) this.b;
        w3g w3gVar = q4gVar.v;
        if (z) {
            a4g a4gVar = q4gVar.u;
            List list = a4gVar.a;
            int iA = w3g.a(list, w3gVar);
            N.MvKxovNE(a4gVar.b, iA);
            list.remove(iA);
            p4g p4gVar = q4gVar.C;
            if (p4gVar != null) {
                p4gVar.s(w3gVar);
            }
            q4gVar.g0();
            q4gVar.C = null;
        }
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ywf ywfVar = (ywf) this.b;
        SettingsManager settingsManager = ywfVar.d;
        if (z != settingsManager.i("text_wrap")) {
            if (ywfVar.g()) {
                settingsManager.V(z ? 1 : 0, "reader_mode_text_wrap");
            } else {
                String strE = ywfVar.e();
                if (strE != null) {
                    N.MeievuP3(strE, z);
                }
            }
        } else if (ywfVar.g()) {
            settingsManager.V(-1, "reader_mode_text_wrap");
        } else {
            String strE2 = ywfVar.e();
            if (strE2 != null) {
                N.M3MkeCX1(strE2);
            }
        }
        ywfVar.h();
        y83 y83Var = ywfVar.f;
        if (y83Var == null) {
            y83Var = null;
        }
        ywfVar.j((int) ((Slider) y83Var.g).z0());
    }
}
