package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.RootView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.favorites.FavoriteGridLinearLayout;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.security.cert.CertificateParsingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9(cf4 cf4Var, String str) {
        this.a = (byte) 22;
        this.b = cf4Var;
    }

    public /* synthetic */ k9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v45, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r1v71, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r1v73, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v31, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v42, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void d0(Object obj) throws JSONException, CertificateParsingException {
        j2g j2gVar;
        boolean z;
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 3;
        Object obj2 = null;
        int i = 0;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                p9 p9Var = (p9) obj3;
                r9 r9Var = (r9) obj;
                ndo ndoVar = r9Var.a;
                ixh ixhVar = p9.x;
                OperaListItem operaListItem = p9Var.H0().e;
                boolean z2 = ndoVar.a;
                operaListItem.t(z2);
                p9Var.H0().o.C0(ndoVar.b);
                yq1 yq1Var = p9Var.H0().i;
                int i2 = ndoVar.c;
                yq1Var.setText(i2 + "%");
                p9Var.H0().o.setContentDescription(p9Var.getString(2132022715, new Object[]{Integer.valueOf(i2)}));
                p9Var.H0().j.setTextSize(2, ndoVar.d);
                p9Var.H0().n.setTextSize(2, ndoVar.f);
                p9Var.H0().k.setTextSize(2, ndoVar.e);
                LinearLayout linearLayout = p9Var.H0().l;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
                if (z2) {
                    viewGroup.getLayoutParams().height = -2;
                    marginLayoutParams.width = -1;
                    linearLayout.setLayoutParams(marginLayoutParams);
                    viewGroup.setClipChildren(true);
                } else {
                    marginLayoutParams.width = -1;
                    viewGroup.getLayoutParams().height = -2;
                    linearLayout.setLayoutParams(marginLayoutParams);
                    int iK = ixhVar.k(viewGroup.getContext());
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                    int i3 = marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    viewGroup.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), 0);
                    viewGroup.getLayoutParams().height = Math.min(viewGroup.getMeasuredHeight(), iK - i3);
                    if (viewGroup.getWidth() > 0) {
                        marginLayoutParams.width = (int) (((r1 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) * 1.2f);
                        linearLayout.setLayoutParams(marginLayoutParams);
                    }
                    viewGroup.setClipChildren(false);
                }
                int iK2 = new ixh(ndoVar.g).k(p9Var.H0().a.getContext());
                ImageView imageView = p9Var.H0().m;
                ViewGroup.LayoutParams layoutParams = p9Var.H0().m.getLayoutParams();
                layoutParams.width = iK2;
                layoutParams.height = iK2;
                imageView.setLayoutParams(layoutParams);
                FrameLayout frameLayout = p9Var.H0().f;
                int width = frameLayout.getWidth();
                if (width > 0) {
                    frameLayout.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(ixhVar.k(frameLayout.getContext()), Integer.MIN_VALUE));
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    layoutParams2.height = frameLayout.getMeasuredHeight();
                    frameLayout.setLayoutParams(layoutParams2);
                }
                p9Var.H0().c.t(r9Var.b);
                u35.k(r9Var.c, p9Var.H0().b);
                break;
            case 1:
                ((xb) obj3).e.r(new dpf((ipf) obj));
                break;
            case 2:
                ss ssVar = (ss) obj3;
                ks ksVar = ssVar.t;
                xtb xtbVar = ss.v[0];
                ((es) ksVar.b(ssVar)).H((List) obj);
                break;
            case 3:
                ru ruVar = (ru) obj3;
                List list = (List) obj;
                tab tabVarH0 = ruVar.H0();
                tabVarH0.d = list;
                tabVarH0.e = list;
                if (!ruVar.C && (j2gVar = ((ku) ruVar.v.p()).a) != null) {
                    String str = j2gVar.a;
                    if (j2gVar.b) {
                        List list2 = (List) ruVar.J0().d.g();
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.a(((wt1) next).c, str)) {
                                        obj2 = next;
                                    }
                                }
                            }
                            wt1 wt1Var = (wt1) obj2;
                            if (wt1Var != null) {
                                xf8.E0(ruVar.J0().e, new wu(wt1Var, ruVar.H0().a(wt1Var)));
                                ((sab) ruVar.H0().f.getValue()).filter(wt1Var.b);
                                ruVar.C = true;
                                break;
                            }
                        }
                    } else {
                        ruVar.I0().b.setText(str);
                        ruVar.C = true;
                        break;
                    }
                }
                break;
            case 4:
                bv bvVar = (bv) obj3;
                if (!((nnh) obj).a) {
                    bvVar.l.Z(vr0.o);
                    break;
                }
                break;
            case 5:
                uw uwVar = (uw) obj3;
                zw zwVar = (zw) obj;
                uwVar.H0().d.t(zwVar.a);
                sfe sfeVar = zwVar.b;
                if (sfeVar.equals(jw.h)) {
                    uwVar.H0().b.setVisibility(8);
                    uwVar.H0().c.setVisibility(8);
                    break;
                } else if (sfeVar instanceof kw) {
                    uwVar.H0().b.setVisibility(0);
                    uwVar.H0().c.setVisibility(0);
                    yw ywVar = uwVar.w;
                    if (ywVar == null) {
                        ywVar = new yw(new wth((Object) uwVar, (byte) 6), i0l.g());
                        uwVar.w = ywVar;
                        uwVar.H0().c.y0(uwVar.w);
                        RecyclerView recyclerView = uwVar.H0().c;
                        uwVar.getContext();
                        recyclerView.C0(new LinearLayoutManager());
                    }
                    ywVar.K(((kw) sfeVar).h);
                    break;
                } else {
                    h9o.p();
                    break;
                }
            case 6:
                lx lxVar = (lx) obj3;
                tta ttaVar = (tta) obj;
                mq mqVar = (mq) lxVar.b;
                if (Intrinsics.a(lxVar.c.g(), ng.a) && mqVar != null) {
                    lxVar.V(mqVar, false);
                }
                FavoriteGridLinearLayout favoriteGridLinearLayout = lxVar.k;
                if (!Intrinsics.a(favoriteGridLinearLayout.a, ttaVar)) {
                    favoriteGridLinearLayout.a = ttaVar;
                    favoriteGridLinearLayout.requestLayout();
                    break;
                }
                break;
            case 7:
                ex0 ex0Var = (ex0) obj3;
                List list3 = (List) obj;
                xf8.F0(ex0Var.d, list3);
                pde pdeVar = ex0Var.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list3) {
                    if (!(((c52) obj4) instanceof d52)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    arrayList2.add(new pw0((c52) obj5));
                }
                xf8.F0(pdeVar, arrayList2);
                break;
            case 8:
                pu1 pu1Var = (pu1) obj3;
                tu1 tu1Var = (tu1) obj;
                fll fllVar = tu1Var.a;
                bv1 bv1Var = pu1Var.w;
                List list4 = fllVar.a;
                f7j f7jVar = fllVar.b;
                g7j g7jVar = fllVar.d;
                boolean z3 = fllVar.e;
                ArrayList arrayList3 = (ArrayList) bv1Var.d;
                Object[] objArr = (arrayList3.equals(list4) && ((g7j) bv1Var.f) == g7jVar) ? false : true;
                z = bv1Var.b != z3;
                bv1Var.b = z3;
                bv1Var.f = g7jVar;
                arrayList3.clear();
                arrayList3.addAll(list4);
                if (objArr == true) {
                    bv1Var.e = f7jVar;
                    bv1Var.notifyDataSetChanged();
                } else {
                    if (z) {
                        bv1Var.notifyItemChanged(arrayList3.indexOf(f7j.FOLLOW_SYSTEM));
                    }
                    f7j f7jVar2 = (f7j) bv1Var.e;
                    if (f7jVar2 != f7jVar) {
                        int iIndexOf = ((ArrayList) bv1Var.d).indexOf(f7jVar2);
                        bv1Var.e = f7jVar;
                        if (iIndexOf > -1) {
                            bv1Var.notifyItemChanged(iIndexOf);
                        }
                    }
                }
                dt1 dt1Var = pu1Var.x;
                List list5 = fllVar.c;
                ArrayList arrayList4 = (ArrayList) dt1Var.c;
                boolean zEquals = arrayList4.equals(list5);
                arrayList4.clear();
                arrayList4.addAll(list5);
                if (zEquals) {
                    dt1Var.M(g7jVar, false);
                } else {
                    dt1Var.d = g7jVar;
                    dt1Var.notifyDataSetChanged();
                }
                pxe pxeVar = tu1Var.b;
                pu1Var.H0().k.setVisibility(pxeVar.a ? 0 : 8);
                pu1Var.H0().j.t(pxeVar.b);
                v0g.m(pu1Var.H0().j, pxeVar.c);
                pu1Var.H0().g.t(tu1Var.c);
                p37 p37Var = tu1Var.d;
                if (p37Var.equals(b4c.i)) {
                    pu1Var.H0().i.setVisibility(8);
                } else if (!(p37Var instanceof c4c)) {
                    h9o.p();
                    break;
                } else {
                    pu1Var.H0().i.setVisibility(0);
                    c4c c4cVar = (c4c) p37Var;
                    pu1Var.H0().l.t(c4cVar.i);
                    u35.k(c4cVar.j, pu1Var.H0().c);
                    pu1Var.H0().o.C(new rxh(c4cVar.k));
                    pu1Var.H0().f.setVisibility(c4cVar.l ? 0 : 8);
                }
                pu1Var.H0().e.setVisibility(tu1Var.e ? 0 : 8);
                ns1 ns1Var = tu1Var.f;
                pu1Var.H0().d.setVisibility(ns1Var.a ? 0 : 8);
                pu1Var.H0().d.C(ns1Var.b);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ole oleVar = (ole) ((s62) obj3).w.e;
                oleVar.getClass();
                bi biVar = new bi(oleVar, (byte) 22);
                vpb vpbVar = new vpb();
                orb orbVar = new orb();
                vpbVar.a(orbVar);
                orbVar.p(((ela) obj).a(), Constants.Params.STATE);
                qq8 qq8Var = (qq8) oleVar.a;
                Object objH = qq8Var.h();
                orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "views.v1.notifyHostStateChanged");
                orbVarJ.p(vpbVar, Constants.Params.PARAMS);
                orbVarJ.p(objH, "id");
                qq8Var.l(orbVarJ, new t02(biVar, b2));
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((x03) obj3).a.invalidate();
                break;
            case 11:
                w43 w43Var = (w43) obj3;
                w43Var.W(((k6l) w43Var.b).o);
                break;
            case 12:
                ((xol) obj3).H((List) obj);
                break;
            case 13:
                v73 v73Var = (v73) obj3;
                v73Var.k.a.getClass();
                uaf uafVar = (uaf) v73Var.a.get(taf.g);
                Context context = v73Var.b;
                Drawable drawableF = sgb.F(2131232200, context);
                uafVar.i = 2130970454;
                uafVar.j = 0;
                uafVar.e = drawableF;
                uafVar.a(context);
                uafVar.c = 2132020980;
                uafVar.b = 2132020980;
                break;
            case 14:
                ((View) obj3).setEnabled(((Boolean) obj).booleanValue());
                break;
            case 15:
                ((d5o) obj3).N();
                break;
            case 16:
                l45 l45Var = (l45) obj3;
                ((Float) obj).getClass();
                float fFloatValue = ((Number) ((pde) l45Var.b).g()).floatValue();
                ebl eblVar = (ebl) l45Var.a;
                StylingImageButton stylingImageButton = fFloatValue > 0.5f ? eblVar.v : eblVar.e;
                for (AppCompatImageView appCompatImageView : (List) l45Var.c) {
                    appCompatImageView.setVisibility(Intrinsics.a(appCompatImageView, stylingImageButton) ? 0 : 8);
                }
                break;
            case 17:
                int i4 = BrowserActivity.E1;
                ((tt2) obj3).run((Boolean) obj);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ?? r13 = (BrowserActivity) obj3;
                ndc ndcVar = (ndc) obj;
                int i5 = BrowserActivity.E1;
                z = ndcVar != null;
                r13.P = z;
                if (r13.getWindow() != null) {
                    RootView rootView = r13.Q;
                    RootView rootView2 = rootView != null ? rootView : null;
                    if (z != rootView2.m) {
                        rootView2.m = z;
                        rootView2.f();
                        rootView2.requestLayout();
                        rootView2.requestApplyInsets();
                    }
                }
                r13.C1();
                break;
            case 19:
                gy3 gy3Var = (gy3) obj3;
                ky3 ky3Var = (ky3) obj;
                rm5 rm5Var = ky3Var.a;
                amf amfVar = amf.l;
                ?? r2 = gy3Var.H0().b;
                if (rm5Var.equals(nm6.m)) {
                    r2.setVisibility(8);
                } else if (rm5Var instanceof om6) {
                    r2.setVisibility(0);
                    r2.C(new rxh(2132018519));
                    r2.B(amfVar);
                } else if (!(rm5Var instanceof pm6)) {
                    h9o.p();
                    break;
                } else {
                    r2.setVisibility(0);
                    pm6 pm6Var = (pm6) rm5Var;
                    Drawable drawable = pm6Var.m;
                    v0g.m((OperaListItem) r2, pm6Var.n);
                    if (drawable != null) {
                        r2.B(new ylf());
                        r2.z(new mxh(drawable));
                    } else {
                        r2.B(amfVar);
                    }
                }
                int i6 = ky3Var.b;
                ?? r1 = gy3Var.H0().g;
                v0g.m((OperaListItem) r1, z9k.l0(i6, r1.getContext()));
                q7j q7jVar = ky3Var.c;
                ?? r12 = gy3Var.H0().e;
                v0g.m((OperaListItem) r12, r12.getResources().getString(q7jVar.a));
                iwk iwkVar = ky3Var.d;
                hwk hwkVar = hwk.a;
                if (iwkVar.equals(hwkVar)) {
                    gy3Var.H0().h.setVisibility(8);
                } else {
                    gy3Var.H0().h.setVisibility(0);
                    gy3Var.H0().h.t(iwkVar.a);
                }
                u35.k(ky3Var.e.a, gy3Var.H0().d);
                uup uupVar = ky3Var.f;
                ?? r22 = gy3Var.H0().c;
                if (uupVar instanceof oab) {
                    r22.setVisibility(8);
                } else if (!(uupVar instanceof pab)) {
                    h9o.p();
                    break;
                } else {
                    r22.setVisibility(0);
                    pab pabVar = (pab) uupVar;
                    rxh rxhVar = pabVar.i;
                    r22.C(pabVar.h);
                    r22.setEnabled(rxhVar != null);
                    if (rxhVar != null) {
                        r22.setOnClickListener(new nf(gy3Var, uupVar, (byte) 23));
                    }
                }
                cgh cghVar = ky3Var.g;
                if (cghVar.equals(hwkVar)) {
                    gy3Var.H0().f.setVisibility(8);
                    break;
                } else if (cghVar instanceof iwk) {
                    gy3Var.H0().f.setVisibility(0);
                    gy3Var.H0().f.t(((iwk) cghVar).a);
                    break;
                } else {
                    h9o.p();
                    break;
                }
            case SizeUtil.textSize0 /* 20 */:
                ((ny3) obj3).c();
                break;
            case 21:
                w04 w04Var = (w04) obj3;
                fv2 fv2Var = w04Var.d;
                int iOrdinal = ((ag2) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            h9o.p();
                            break;
                        }
                    } else if (!w04Var.c) {
                        w04Var.c = true;
                        vml.d(fv2Var, pn7.f(w04.e));
                        break;
                    }
                }
                w04Var.c = false;
                vml.a(fv2Var);
                x05 x05Var = w04Var.b;
                if (x05Var.d.isRunning()) {
                    x05Var.stop();
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                cf4 cf4Var = (cf4) obj3;
                um2 um2Var = (um2) obj;
                if (cf4Var.l.get() && um2Var.b != null) {
                    cf4Var.a.execute(new ye4(cf4Var, (byte) 0));
                    break;
                }
                break;
            case 23:
                zk4 zk4Var = (zk4) obj3;
                bl4 bl4Var = (bl4) obj;
                zk4Var.H0().c.t(bl4Var.a);
                na2 na2Var = bl4Var.b;
                if (na2Var.equals(kk4.o)) {
                    zk4Var.H0().e.setVisibility(8);
                    zk4Var.H0().b.setVisibility(8);
                    break;
                } else if (na2Var instanceof lk4) {
                    zk4Var.H0().e.setVisibility(0);
                    zk4Var.H0().b.setVisibility(0);
                    yw ywVar2 = zk4Var.x;
                    if (ywVar2 == null) {
                        ywVar2 = new yw(new ole(zk4Var));
                        zk4Var.x = ywVar2;
                        zk4Var.H0().b.y0(zk4Var.x);
                        RecyclerView recyclerView2 = zk4Var.H0().b;
                        zk4Var.getContext();
                        recyclerView2.C0(new LinearLayoutManager());
                    }
                    ywVar2.K(((lk4) na2Var).o);
                    break;
                } else {
                    h9o.p();
                    break;
                }
            case SizeUtil.textSize2 /* 24 */:
                nrl nrlVar = (nrl) obj3;
                lq4 lq4Var = (lq4) obj;
                if (lq4Var != null) {
                    List list6 = lq4Var.a;
                    AbstractList abstractListW = nb6.W(new b10(b3), list6);
                    oq4 oq4Var = (oq4) nrlVar.b;
                    ro9 ro9Var = new ro9(oq4Var.p, new xj(nrlVar, lq4Var, (byte) 28));
                    ((AutoCompleteTextView) ro9Var.d).setAdapter(new ei4(nrlVar, oq4Var.p.getContext(), abstractListW, ro9Var, (byte) 1));
                    ro9Var.a0(0, (CharSequence) abstractListW.get(0));
                    nrlVar.Q((kq4) list6.get(0));
                    break;
                }
                break;
            case 25:
                ((ex4) obj3).g((r6j) obj);
                break;
            case 26:
                Integer num = (Integer) obj;
                num.getClass();
                xf8.F0((pde) ((z8b) obj3).a, num);
                break;
            case 27:
                ((fe5) obj3).b();
                break;
            case 28:
                ((FrameLayout) ((kf) obj3).c).setVisibility(((Configuration) obj).screenHeightDp >= 600 ? 0 : 8);
                break;
            default:
                ((Boolean) obj).getClass();
                ((yk6) obj3).f(null);
                break;
        }
    }
}
