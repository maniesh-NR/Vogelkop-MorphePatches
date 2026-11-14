package defpackage;

import J.N;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.appbar.AppBarLayout;
import com.jensdriller.libs.undobar.MaxWidthLinearLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.OperaRadioGroup;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.b;
import com.opera.android.favorites.e;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final /* synthetic */ class qzg implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qzg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r1v38, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void d0(Object obj) {
        byte b = this.a;
        byte b2 = 22;
        mt5 mt5Var = null;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xzg xzgVar = (xzg) obj2;
                xzgVar.k0(((StylingTextView) xzgVar.h.d).getText().toString(), ((qwi) obj).a);
                break;
            case 1:
                ghf ghfVar = (ghf) obj2;
                z5n z5nVar = ((FadingScrollView) ghfVar.d).c;
                View view = (View) ghfVar.b;
                View view2 = (View) ghfVar.c;
                int iOrdinal = ((vzg) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            view2.setVisibility(8);
                            view.setVisibility(8);
                            if (!z5nVar.n) {
                                z5nVar.n = true;
                                z5nVar.a.invalidate();
                                break;
                            }
                        }
                    } else {
                        view2.setVisibility(8);
                        view.setVisibility(0);
                        if (z5nVar.n) {
                            z5nVar.n = false;
                            z5nVar.a.invalidate();
                            break;
                        }
                    }
                } else {
                    view2.setVisibility(0);
                    view.setVisibility(8);
                    if (z5nVar.n) {
                        z5nVar.n = false;
                        z5nVar.a.invalidate();
                        break;
                    }
                }
                break;
            case 2:
                ((OperaListItem) obj2).setVisibility(((Integer) obj).intValue());
                break;
            case 3:
                i0h i0hVar = (i0h) obj2;
                h1b h1bVar = (h1b) obj;
                i0hVar.d.H(h1bVar);
                boolean zIsEmpty = h1bVar.isEmpty();
                q5g q5gVar = i0hVar.e;
                if (zIsEmpty) {
                    ((RecyclerView) q5gVar.d).setVisibility(8);
                    break;
                } else {
                    ((RecyclerView) q5gVar.d).setVisibility(0);
                    break;
                }
            case 4:
                shf shfVar = (shf) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                d3k d3kVar = (d3k) shfVar.c;
                if (zBooleanValue) {
                    if (d3kVar == null || !d3kVar.isActive()) {
                        shfVar.c = na2.B((ddc) shfVar.b, (CoroutineContext) null, (rx5) null, new agb(b2, mt5Var, shfVar), 3);
                        break;
                    }
                } else if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                    shfVar.c = null;
                    break;
                }
                break;
            case 5:
                dqi dqiVar = (dqi) obj2;
                fqi fqiVar = (fqi) obj;
                ((TextView) dqiVar.r.n).setText(fqiVar.a ? "Until reset" : "This session");
                dqiVar.G0((vs) dqiVar.r.f, fqiVar.b);
                dqiVar.G0((vs) dqiVar.r.j, fqiVar.c);
                dqiVar.G0((vs) dqiVar.r.l, fqiVar.d);
                dqiVar.G0((vs) dqiVar.r.o, fqiVar.e);
                dqiVar.G0((vs) dqiVar.r.m, fqiVar.f);
                dqiVar.G0((vs) dqiVar.r.g, fqiVar.g);
                dqiVar.G0((vs) dqiVar.r.d, fqiVar.h);
                dqiVar.G0((vs) dqiVar.r.k, fqiVar.i);
                dqiVar.G0((vs) dqiVar.r.t, fqiVar.j);
                dqiVar.G0((vs) dqiVar.r.r, fqiVar.k);
                dqiVar.G0((vs) dqiVar.r.v, fqiVar.l);
                dqiVar.G0((vs) dqiVar.r.h, fqiVar.m);
                dqiVar.G0((vs) dqiVar.r.q, fqiVar.n);
                dqiVar.G0((vs) dqiVar.r.e, fqiVar.o);
                dqiVar.G0((vs) dqiVar.r.p, fqiVar.p);
                dqiVar.G0((vs) dqiVar.r.u, fqiVar.q);
                dqiVar.G0((vs) dqiVar.r.c, fqiVar.r);
                dqiVar.G0((vs) dqiVar.r.i, fqiVar.s);
                break;
            case 6:
                rn9 rn9Var = (rn9) obj2;
                if (rn9Var.b) {
                    x5f x5fVar = (x5f) rn9Var.d;
                    String strL = ((eri) ((pde) rn9Var.c).g()).l();
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        new ck0(zpaVar, x56VarF).d().e(strL, new zbe(b2));
                        x5fVar.U0(x56VarF);
                        break;
                    }
                }
                break;
            case 7:
                awi awiVar = (awi) obj2;
                bwi bwiVar = (bwi) obj;
                if (bwiVar != null) {
                    l7j l7jVar = bwiVar.d;
                    boolean z = bwiVar.c;
                    CharSequence charSequence = bwiVar.e;
                    awiVar.L0(bwiVar);
                    ((OperaListItem) awiVar.u.i).t(z);
                    u35.k(2132022085, (OperaListItem) awiVar.u.i);
                    ((OperaRadioGroup) awiVar.u.f).setVisibility(z ? 0 : 8);
                    OperaRadioGroup operaRadioGroup = (OperaRadioGroup) awiVar.u.f;
                    int i2 = operaRadioGroup.a;
                    SparseArray sparseArray = awi.y;
                    int iKeyAt = sparseArray.keyAt(sparseArray.indexOfValue(l7jVar));
                    yvi yviVar = operaRadioGroup.c;
                    operaRadioGroup.c = null;
                    if (iKeyAt == -1 || iKeyAt != operaRadioGroup.a) {
                        int i3 = operaRadioGroup.a;
                        if (i3 != -1) {
                            operaRadioGroup.c(i3, false);
                        }
                        if (iKeyAt != -1) {
                            operaRadioGroup.c(iKeyAt, true);
                        }
                        operaRadioGroup.b(iKeyAt);
                    }
                    operaRadioGroup.c = yviVar;
                    if (i2 == -1) {
                        ((OperaRadioGroup) awiVar.u.f).jumpDrawablesToCurrentState();
                    }
                    awiVar.u.e.setVisibility(l7jVar == l7j.CUSTOM ? 0 : 8);
                    if (!TextUtils.equals(charSequence, ((OperaTextInputEditText) awiVar.u.d).getText())) {
                        ((OperaTextInputEditText) awiVar.u.d).setText(charSequence);
                        awiVar.I0(charSequence);
                    }
                    LayoutTransition layoutTransition = ((LinearLayout) awiVar.u.b).getLayoutTransition();
                    layoutTransition.enableTransitionType(2);
                    layoutTransition.enableTransitionType(3);
                    LayoutTransition layoutTransition2 = ((OperaRadioGroup) awiVar.u.f).getLayoutTransition();
                    layoutTransition2.enableTransitionType(2);
                    layoutTransition2.enableTransitionType(3);
                    break;
                }
                break;
            case 8:
                k6j k6jVar = (k6j) obj2;
                t9j t9jVar = (t9j) obj;
                xtb[] xtbVarArr = k6j.x;
                g52 g52Var = t9jVar.b;
                ?? r1 = k6jVar.H0().g;
                boolean z2 = g52Var.a;
                r1.setVisibility(z2 ? 0 : 8);
                if (z2) {
                    r1.t(g52Var.b);
                    u35.k(g52Var.c, (OperaListItem) r1);
                }
                jgn jgnVar = t9jVar.c;
                boolean z3 = jgnVar.a;
                ?? r2 = k6jVar.H0().t;
                r2.setVisibility(z3 ? 0 : 8);
                if (z3) {
                    r2.t(jgnVar.b);
                    r2.E(new rxh(jgnVar.c));
                    u35.k(jgnVar.d, (OperaListItem) r2);
                    r2.D(new dxh(jgnVar.e));
                }
                yc6 yc6Var = t9jVar.d;
                ?? r12 = k6jVar.H0().i;
                r12.t(yc6Var.a);
                r12.C(new sxh(yc6Var.c, new Object[]{aik.h(yc6Var.b, r12.getContext())}));
                r12.D(new dxh(yc6Var.d));
                tj tjVar = t9jVar.e;
                ?? r13 = k6jVar.H0().e;
                boolean z4 = tjVar.a;
                int i4 = tjVar.b;
                r13.t(z4);
                r13.C(tjVar.c ? new qxh(r13.getResources().getQuantityString(2131886080, i4, NumberFormat.getNumberInstance().format(Integer.valueOf(i4)))) : new rxh(tjVar.d));
                uyl uylVar = t9jVar.f;
                ?? r14 = k6jVar.H0().s;
                boolean z5 = uylVar.a;
                int i5 = uylVar.b;
                r14.t(z5);
                r14.C(uylVar.c ? new qxh(r14.getResources().getQuantityString(2131886189, i5, NumberFormat.getNumberInstance().format(Integer.valueOf(i5)))) : new rxh(uylVar.d));
                rxe rxeVar = t9jVar.g;
                OperaListItem operaListItem = k6jVar.H0().m;
                operaListItem.t(rxeVar.a);
                v0g.m(operaListItem, rxeVar.b);
                ((StylingTextView) k6jVar.H0().h.b.b).setText(t9jVar.a);
                boolean z6 = t9jVar.h.a;
                k6jVar.H0().b.setVisibility(z6 ? 0 : 8);
                if (z6) {
                    ru9 ru9Var = k6jVar.I0().i;
                    int i6 = ru9Var.a.getInt("make_default_banner.show_count", 0);
                    nv6 nv6VarB = ru9Var.b();
                    ((SharedPreferences.Editor) nv6VarB.a).putInt("make_default_banner.show_count", i6 + 1);
                    nv6VarB.w();
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((Boolean) obj).getClass();
                ((daj) obj2).g();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((ooj) obj2).w.m.setVisibility(((yoj) obj).a ? 0 : 8);
                break;
            case 11:
                ((fsj) obj2).b();
                break;
            case 12:
                ((mwj) obj2).a();
                break;
            case 13:
                r5k r5kVar = (r5k) obj2;
                f6k f6kVar = (f6k) obj;
                if (f6kVar != null) {
                    zch zchVar = f6kVar.a;
                    if (zchVar instanceof g6k) {
                        p37.l0(((g6k) zchVar).a, ((i) r5kVar).itemView);
                        break;
                    } else if (!zchVar.equals(h6k.a)) {
                        h9o.p();
                        break;
                    }
                }
                break;
            case 14:
                cu5 cu5Var = (cu5) obj2;
                l5k l5kVar = (l5k) obj;
                q5g q5gVar2 = cu5Var.d;
                RecyclerView recyclerView = (SpotlightCarouselRecyclerView) q5gVar2.d;
                int i7 = l5kVar.a;
                int i8 = cu5Var.g;
                recyclerView.setPadding(i7, i8, i7, i8);
                FrameLayout frameLayout = (FrameLayout) q5gVar2.c;
                int i9 = l5kVar.a;
                frameLayout.setPadding(i9, frameLayout.getPaddingTop(), i9, frameLayout.getPaddingBottom());
                break;
            case 15:
                p37.t0(((l5k) obj).b, (MaxWidthLinearLayout) obj2);
                break;
            case 16:
                ((Boolean) obj).getClass();
                ((ne5) obj2).V();
                break;
            case 17:
                ((a7k) obj2).A();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                shf shfVar2 = (shf) obj2;
                xf8.F0((pde) shfVar2.c, Integer.valueOf(shfVar2.k()));
                break;
            case 19:
                kak kakVar = (kak) obj2;
                Object objG = kakVar.b.g();
                if (objG != null) {
                    kakVar.c.y(objG);
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                AppBarLayout appBarLayout = (StatusBarDrawerAppBarLayout) obj2;
                g3o g3oVar = (g3o) obj;
                int i10 = StatusBarDrawerAppBarLayout.H;
                if (pjm.a) {
                    appBarLayout.setPadding(0, g3oVar.a.i(519).b, 0, 0);
                    break;
                }
                break;
            case 21:
                ghf ghfVar2 = (ghf) obj2;
                llk llkVar = (llk) obj;
                mlk mlkVar = llkVar.a;
                if (!mlkVar.a || mlkVar.b || llkVar.b) {
                    gkj gkjVar = (gkj) ghfVar2.d;
                    if (gkjVar != null) {
                        gkjVar.finish(hjm.b);
                        break;
                    }
                } else if (llkVar.c && ((gkj) ghfVar2.d) == null) {
                    rxh rxhVar = new rxh(2132022211);
                    txi txiVar = new txi(ghfVar2, (byte) 20);
                    gkj gkjVar2 = new gkj(false, false);
                    gkjVar2.a = null;
                    gkjVar2.b = null;
                    gkjVar2.c = null;
                    gkjVar2.d = null;
                    gkjVar2.e = null;
                    gkjVar2.f = txiVar;
                    gkjVar2.g = null;
                    gkjVar2.h = null;
                    gkjVar2.i = null;
                    gkjVar2.j = null;
                    gkjVar2.k = 2132020155;
                    gkjVar2.l = 0;
                    gkjVar2.m = 2132022236;
                    gkjVar2.n = true;
                    gkjVar2.o = rxhVar;
                    ghfVar2.d = gkjVar2;
                    z77 z77Var = (z77) ghfVar2.c;
                    z77Var.getClass();
                    z77Var.b(gkjVar2, ijm.b);
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((gmk) obj2).a.r(uvg.d((wvg) obj));
                break;
            case 23:
                q59 q59Var = (q59) obj2;
                uvg uvgVar = (uvg) obj;
                if (uvgVar != uvg.LOADING) {
                    Boolean boolValueOf = Boolean.valueOf(uvgVar == uvg.ACTIVE);
                    q59Var.d = boolValueOf;
                    ydn ydnVar = (ydn) q59Var.c;
                    if (boolValueOf.booleanValue()) {
                        if (q59Var.b) {
                            ydnVar.E(true);
                            break;
                        }
                    } else {
                        ydnVar.E(false);
                        break;
                    }
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                vr8 vr8Var = (vr8) obj;
                TextView textView = (TextView) ((bok) obj2).h.c;
                vr8Var.b.a(textView);
                textView.setTextColor(vr8Var.f.a(textView.getContext()));
                break;
            case 25:
                lpk lpkVar = (lpk) obj;
                ((hqk) obj2).B = (lpkVar == null || lpkVar.c.isEmpty()) ? false : true;
                break;
            case 26:
                uxk uxkVar = (uxk) obj2;
                vxk vxkVar = (vxk) obj;
                xtb[] xtbVarArr2 = uxk.w;
                boolean z7 = vxkVar.a;
                boolean z8 = vxkVar.d;
                uxkVar.H0().i.b.setVisibility(z7 ? 0 : 8);
                uxkVar.H0().e.b.setVisibility(vxkVar.c ? 0 : 8);
                uxkVar.H0().g.b.setVisibility(vxkVar.b ? 0 : 8);
                uxkVar.H0().h.t(z8);
                boolean z9 = vxkVar.f;
                boolean z10 = vxkVar.e;
                uxkVar.H0().c.setEnabled(z9);
                uxkVar.H0().c.t(z10);
                List<oe6> list = vxkVar.h;
                ViewGroup viewGroup = uxkVar.H0().d;
                for (oe6 oe6Var : list) {
                    pqh pqhVar = new pqh();
                    ne6 ne6Var = oe6Var.a;
                    View viewFindViewWithTag = viewGroup.findViewWithTag(Integer.valueOf(ne6Var.a));
                    pqhVar.a = viewFindViewWithTag;
                    if (viewFindViewWithTag == null) {
                        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131559399, viewGroup, false);
                        viewGroup.addView(viewInflate);
                        if (viewInflate == 0) {
                            t3p.q("rootView");
                            break;
                        } else {
                            OperaListItem operaListItem2 = (OperaListItem) viewInflate;
                            pqhVar.a = operaListItem2;
                            operaListItem2.setId(oe6Var.c);
                            ((OperaListItem) pqhVar.a).setTag(Integer.valueOf(ne6Var.a));
                            ((OperaListItem) pqhVar.a).u = new vdi(uxkVar, oe6Var, pqhVar, (byte) 6);
                        }
                    }
                    OperaListItem operaListItem3 = (OperaListItem) pqhVar.a;
                    Context context = viewGroup.getContext();
                    int i11 = oe6Var.d;
                    operaListItem3.E(new qxh(i11 != 0 ? context.getString(i11) : ne6Var.b));
                    ((OperaListItem) pqhVar.a).t(oe6Var.b);
                    ((OperaListItem) pqhVar.a).setEnabled(z8);
                }
                uxkVar.H0().b.setEnabled(vxkVar.g);
                break;
            case 27:
                syk sykVar = (syk) obj2;
                if (((pkj) obj) == pkj.a) {
                    Context contextRequireContext = sykVar.requireContext();
                    String[] strArr = OperaApplication.K;
                    nr8 nr8VarO = ((OperaApplication) contextRequireContext.getApplicationContext()).o();
                    b bVar = ((e) nr8VarO).f;
                    b bVar2 = ((e) nr8VarO).g;
                    ArrayList arrayList = new ArrayList();
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(2, -6);
                    Date time = calendar.getTime();
                    for (int i12 = 0; i12 < bVar2.e.size(); i12++) {
                        tq8 tq8Var = (tq8) bVar2.u(i12);
                        if (tq8Var != bVar && tq8Var.z().before(time)) {
                            arrayList.add(tq8Var);
                        }
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        long jE = ((tq8) obj3).e();
                        i7f i7fVar = FavoritesBridge.a;
                        N.Mw8yLl_M(jE);
                    }
                    sykVar.n.f(new glj(new rxh(2132020158), 2500));
                    break;
                }
                break;
            case 28:
                ((x2l) obj2).m.f();
                break;
            default:
                ((Float) obj).getClass();
                ((plk) obj2).u();
                break;
        }
    }
}
