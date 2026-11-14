package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.downloads.DownloadFilterChip;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class pb implements f7f, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final br9 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
        }
        return (bo3) obj;
    }

    public final void d0(Object obj) {
        SeparatorView separatorView;
        zt1 zt1Var;
        int i;
        int i2;
        w3g w3gVarB;
        View viewFindViewById;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((z3) obj2).invoke(obj);
                break;
            case 1:
                xj7 xj7Var = (xj7) obj;
                tf tfVar = (tf) obj2;
                if (!Intrinsics.a(xj7Var, tfVar.g)) {
                    tfVar.g = xj7Var;
                    tfVar.U();
                    break;
                }
                break;
            case 2:
                ((z3) obj2).invoke(obj);
                break;
            case 3:
                ((z3) obj2).invoke(obj);
                break;
            case 4:
                vt vtVar = (vt) obj;
                ct ctVar = (ct) obj2;
                ks ksVar = ctVar.u;
                wk9 wk9Var = ctVar.s;
                if (wk9Var == null) {
                    wk9Var = null;
                }
                ((SwipeRefreshLayout) wk9Var.v).n(false, false);
                if (vtVar != null) {
                    if (vtVar instanceof tt) {
                        wk9 wk9Var2 = ctVar.s;
                        if (wk9Var2 == null) {
                            wk9Var2 = null;
                        }
                        ((LinearLayout) wk9Var2.l).setVisibility(0);
                        wk9 wk9Var3 = ctVar.s;
                        if (wk9Var3 == null) {
                            wk9Var3 = null;
                        }
                        ((RecyclerView) wk9Var3.g).setVisibility(8);
                        tt ttVar = (tt) vtVar;
                        wk9 wk9Var4 = ctVar.s;
                        if (wk9Var4 == null) {
                            wk9Var4 = null;
                        }
                        ((SwipeRefreshLayout) wk9Var4.v).setEnabled(ttVar.a);
                        wk9 wk9Var5 = ctVar.s;
                        if (wk9Var5 == null) {
                            wk9Var5 = null;
                        }
                        ((StylingTextView) wk9Var5.u).setVisibility(ttVar.b ? 0 : 8);
                        ArrayList arrayList = ttVar.c;
                        ks ksVar2 = ctVar.v;
                        xtb[] xtbVarArr = ct.C;
                        xtb xtbVar = xtbVarArr[1];
                        es esVar = (es) ksVar2.b(ctVar);
                        wk9 wk9Var6 = ctVar.s;
                        LinearLayout linearLayout = (LinearLayout) (wk9Var6 == null ? null : wk9Var6).m;
                        if (wk9Var6 == null) {
                            wk9Var6 = null;
                        }
                        if (ct.H0(esVar, linearLayout, (SeparatorView) wk9Var6.q, arrayList)) {
                            wk9 wk9Var7 = ctVar.s;
                            if (wk9Var7 == null) {
                                wk9Var7 = null;
                            }
                            separatorView = (SeparatorView) wk9Var7.q;
                        } else {
                            separatorView = null;
                        }
                        List list = ttVar.d;
                        ps psVar = ctVar.w;
                        byte b2 = 2;
                        xtb xtbVar2 = xtbVarArr[2];
                        os osVar = (os) psVar.b(ctVar);
                        wk9 wk9Var8 = ctVar.s;
                        LinearLayout linearLayout2 = (LinearLayout) (wk9Var8 == null ? null : wk9Var8).j;
                        if (wk9Var8 == null) {
                            wk9Var8 = null;
                        }
                        if (ct.H0(osVar, linearLayout2, (SeparatorView) wk9Var8.o, list)) {
                            wk9 wk9Var9 = ctVar.s;
                            if (wk9Var9 == null) {
                                wk9Var9 = null;
                            }
                            separatorView = (SeparatorView) wk9Var9.o;
                        }
                        ArrayList arrayList2 = ttVar.e;
                        ks ksVar3 = ctVar.x;
                        xtb xtbVar3 = xtbVarArr[3];
                        es esVar2 = (es) ksVar3.b(ctVar);
                        wk9 wk9Var10 = ctVar.s;
                        LinearLayout linearLayout3 = (LinearLayout) (wk9Var10 == null ? null : wk9Var10).k;
                        if (wk9Var10 == null) {
                            wk9Var10 = null;
                        }
                        if (ct.H0(esVar2, linearLayout3, (SeparatorView) wk9Var10.p, arrayList2)) {
                            wk9 wk9Var11 = ctVar.s;
                            if (wk9Var11 == null) {
                                wk9Var11 = null;
                            }
                            separatorView = (SeparatorView) wk9Var11.p;
                        }
                        ArrayList arrayList3 = ttVar.f;
                        ks ksVar4 = ctVar.y;
                        xtb xtbVar4 = xtbVarArr[4];
                        es esVar3 = (es) ksVar4.b(ctVar);
                        wk9 wk9Var12 = ctVar.s;
                        LinearLayout linearLayout4 = (LinearLayout) (wk9Var12 == null ? null : wk9Var12).n;
                        if (wk9Var12 == null) {
                            wk9Var12 = null;
                        }
                        if (ct.H0(esVar3, linearLayout4, (SeparatorView) wk9Var12.r, CollectionsKt.c0(new jk(ctVar, b2), arrayList3))) {
                            wk9 wk9Var13 = ctVar.s;
                            if (wk9Var13 == null) {
                                wk9Var13 = null;
                            }
                            separatorView = (SeparatorView) wk9Var13.r;
                        }
                        if (separatorView != null) {
                            ArrayList arrayList4 = ttVar.g;
                            ks ksVar5 = ctVar.z;
                            xtb xtbVar5 = xtbVarArr[5];
                            es esVar4 = (es) ksVar5.b(ctVar);
                            wk9 wk9Var14 = ctVar.s;
                            if (wk9Var14 == null) {
                                wk9Var14 = null;
                            }
                            separatorView.setVisibility(ct.H0(esVar4, wk9Var14.b, null, arrayList4) ? 0 : 8);
                        }
                        xtb xtbVar6 = xtbVarArr[0];
                        ((es) ksVar.b(ctVar)).H(l08.a);
                        break;
                    } else if (vtVar instanceof ut) {
                        wk9 wk9Var15 = ctVar.s;
                        if (wk9Var15 == null) {
                            wk9Var15 = null;
                        }
                        ((LinearLayout) wk9Var15.l).setVisibility(8);
                        wk9 wk9Var16 = ctVar.s;
                        if (wk9Var16 == null) {
                            wk9Var16 = null;
                        }
                        ((SwipeRefreshLayout) wk9Var16.v).setEnabled(false);
                        wk9 wk9Var17 = ctVar.s;
                        ((RecyclerView) (wk9Var17 == null ? null : wk9Var17).g).setVisibility(0);
                        xtb xtbVar7 = ct.C[0];
                        ((es) ksVar.b(ctVar)).H(((ut) vtVar).a);
                        break;
                    }
                }
                h9o.p();
                break;
            case 5:
                ((bt) obj2).invoke(obj);
                break;
            case 6:
                ((z3) obj2).invoke(obj);
                break;
            case 7:
                wu wuVar = (wu) obj;
                ru ruVar = (ru) obj2;
                ruVar.I0().c.b.b(wuVar != null ? wuVar.b : null);
                MaterialAutoCompleteTextView materialAutoCompleteTextView = ruVar.I0().b;
                pu puVar = ruVar.z;
                if (puVar == null) {
                    puVar = null;
                }
                materialAutoCompleteTextView.removeTextChangedListener(puVar);
                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = ruVar.I0().b;
                String name = (wuVar == null || (zt1Var = wuVar.a) == null) ? null : zt1Var.getName();
                if (!Intrinsics.a(materialAutoCompleteTextView2.getText().toString(), name == null ? "" : name)) {
                    int length = name != null ? name.length() : 0;
                    boolean z = materialAutoCompleteTextView2.getSelectionStart() > length;
                    if (name == null) {
                        name = "";
                    }
                    materialAutoCompleteTextView2.setText(name);
                    if (z) {
                        materialAutoCompleteTextView2.setSelection(length, length);
                    }
                }
                MaterialAutoCompleteTextView materialAutoCompleteTextView3 = ruVar.I0().b;
                pu puVar2 = ruVar.z;
                materialAutoCompleteTextView3.addTextChangedListener(puVar2 == null ? null : puVar2);
                if (ruVar.I0().j.k.q) {
                    ruVar.I0().j.q(false);
                }
                ruVar.M0(false);
                break;
            case 8:
                ((z3) obj2).invoke(obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                us1 us1Var = (us1) obj;
                ss1 ss1Var = ((ts1) obj2).u;
                if (!Intrinsics.a(us1Var, us1.e)) {
                    ss1Var.c = us1Var.d;
                    qs1 qs1Var = us1Var.b;
                    if (qs1Var != null && (i = ss1Var.b) != (i2 = qs1Var.a)) {
                        ss1Var.notifyItemChanged(i);
                        ss1Var.notifyItemChanged(i2);
                        ss1Var.b = i2;
                    }
                    if (us1Var.c) {
                        for (qs1 qs1Var2 : ss1Var.a) {
                            if (qs1Var2.c) {
                                ss1Var.notifyItemChanged(qs1Var2.a);
                            }
                        }
                    }
                    ss1Var.a = us1Var.a;
                    ss1Var.notifyDataSetChanged();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((q3) obj2).invoke(obj);
                break;
            case 11:
                ((y12) obj2).invoke(obj);
                break;
            case 12:
                nc2 nc2Var = (nc2) obj;
                kc2 kc2Var = (kc2) obj2;
                OperaListItem operaListItem = kc2Var.H0().g;
                boolean z2 = nc2Var.b;
                boolean z3 = nc2Var.c;
                operaListItem.t(z2);
                boolean z4 = nc2Var.b;
                kc2Var.H0().g.B.V(new rxh(z4 ? 2132017616 : 2132017615));
                kc2Var.H0().d.setVisibility(z4 ? 0 : 8);
                if (z4) {
                    kc2Var.H0().b.setVisibility(z3 ? 0 : 8);
                    kc2Var.H0().c.setVisibility(z3 ? 0 : 8);
                    kc2Var.H0().f.setVisibility(nc2Var.d ? 0 : 8);
                    kc2Var.H0().f.t(nc2Var.e);
                }
                kc2Var.H0().i.setVisibility(8);
                kc2Var.H0().s.setVisibility(8);
                kc2Var.H0().s.C(nc2Var.f);
                kc2Var.H0().p.setVisibility(8);
                kc2Var.H0().m.setVisibility(8);
                kc2Var.H0().q.setVisibility(8);
                kc2Var.H0().r.setVisibility(8);
                kc2Var.H0().k.setVisibility(8);
                kc2Var.H0().l.setVisibility(8);
                kc2Var.H0().o.setVisibility(8);
                kc2Var.H0().n.setVisibility(8);
                break;
            case 13:
                ((t02) obj2).invoke(obj);
                break;
            case 14:
                ar2 ar2Var = (ar2) obj;
                xq2 xq2Var = (xq2) obj2;
                wq2 wq2Var = xq2Var.w;
                AppCompatImageView appCompatImageView = xq2Var.H0().e;
                int i3 = ar2Var.a;
                String str = ar2Var.h;
                String str2 = ar2Var.g;
                wq2Var.b = i3;
                wq2Var.a(appCompatImageView);
                na2.S(xq2Var.H0().h, ar2Var.b);
                ConstraintLayout constraintLayout = xq2Var.H0().f.c;
                String str3 = ar2Var.c;
                constraintLayout.setVisibility((str3 == null || str3.length() == 0) ? 8 : 0);
                ((StylingTextView) xq2Var.H0().f.b).setText(str3);
                ((StylingTextView) xq2Var.H0().c.b).setText(ar2Var.d);
                yq1 yq1Var = (StylingTextView) xq2Var.H0().d.b;
                CharSequence charSequence = ar2Var.e;
                if (charSequence == null) {
                    charSequence = "--/--";
                }
                yq1Var.setText(charSequence);
                xq2Var.H0().g.c.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
                ((StylingTextView) xq2Var.H0().g.b).setText(str2);
                xq2Var.H0().b.c.setVisibility((str == null || str.length() == 0) ? 8 : 0);
                ((StylingTextView) xq2Var.H0().b.b).setText(str);
                if (ar2Var.f) {
                    int iT = f03.t(2130969119, xq2Var.requireContext(), 2131102430);
                    ((StylingTextView) xq2Var.H0().d.f).setTextColor(iT);
                    ((StylingTextView) xq2Var.H0().d.b).setTextColor(iT);
                    ((StylingImageButton) xq2Var.H0().d.d).setVisibility(8);
                    ((StylingImageView) xq2Var.H0().d.e).setVisibility(0);
                    break;
                } else {
                    int iT2 = f03.t(2130971076, xq2Var.requireContext(), 2131101872);
                    int iT3 = f03.t(2130971073, xq2Var.requireContext(), 2131102471);
                    ((StylingTextView) xq2Var.H0().d.f).setTextColor(iT2);
                    ((StylingTextView) xq2Var.H0().d.b).setTextColor(iT3);
                    ((StylingImageButton) xq2Var.H0().d.d).setVisibility(0);
                    ((StylingImageView) xq2Var.H0().d.e).setVisibility(8);
                    break;
                }
                break;
            case 15:
                ((t02) obj2).invoke(obj);
                break;
            case 16:
                a4g a4gVar = (a4g) obj;
                qt2 qt2Var = (qt2) obj2;
                zyk zykVar = qt2Var.w;
                if (a4gVar != null && (w3gVarB = a4gVar.b(((zv7) qt2Var.x.p()).a)) != null) {
                    String str4 = w3gVarB.f;
                    qt2Var.z = w3gVarB;
                    qt2Var.H0().f.setText(w3gVarB.c);
                    ((StylingTextView) qt2Var.H0().e.b).setText(cqp.W(w3gVarB));
                    Class<qt2> cls = qt2.class;
                    qt2Var.H0().g.addTextChangedListener(new b5g(qt2Var.H0().h, w3gVarB.g, str4, new q2(0, qt2Var, cls, "updateSaveButtonStatus", "updateSaveButtonStatus()V", 0, (byte) 8)));
                    TextInputEditText textInputEditText = qt2Var.H0().c;
                    TextInputLayout textInputLayout = qt2Var.H0().d;
                    w3g w3gVar = qt2Var.z;
                    if (w3gVar == null) {
                        w3gVar = null;
                    }
                    textInputEditText.addTextChangedListener(new z4g(textInputLayout, cqp.W(w3gVar), new q2(0, qt2Var, cls, "updateSaveButtonStatus", "updateSaveButtonStatus()V", 0, (byte) 9)));
                    qt2Var.H0().g.setText(str4);
                    TextInputEditText textInputEditText2 = qt2Var.H0().c;
                    st2 st2Var = (st2) zykVar.getValue();
                    w3g w3gVar2 = qt2Var.z;
                    if (w3gVar2 == null) {
                        w3gVar2 = null;
                    }
                    a4g a4gVar2 = st2Var.e;
                    textInputEditText2.setText(a4gVar2 != null ? a4gVar2.c(w3gVar2) : null);
                    new i4g(((st2) zykVar.getValue()).c.d, w3gVarB, qt2Var.v, qt2Var);
                    c5g.a(qt2Var.H0().c, false);
                    break;
                }
                break;
            case 17:
                eu2 eu2Var = (eu2) obj2;
                ((au2) eu2Var.u.getValue()).H(((fu2) obj).a);
                rf2 rf2Var = eu2Var.v;
                rf2 rf2Var2 = rf2Var == null ? null : rf2Var;
                Chip chip = (DownloadFilterChip) rf2Var2.e;
                Chip chip2 = (DownloadFilterChip) rf2Var2.g;
                Chip chip3 = (DownloadFilterChip) rf2Var2.k;
                chip.setVisibility(!chip.isChecked() ? 8 : 0);
                chip3.setVisibility(!chip3.isChecked() ? 8 : 0);
                chip2.setVisibility(!chip2.isChecked() ? 8 : 0);
                ((LinearLayout) rf2Var2.d).setVisibility((((DownloadFilterChip) rf2Var2.e).getVisibility() == 0 || chip3.getVisibility() == 0 || chip2.getVisibility() == 0) ? 0 : 8);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                lu2 lu2Var = (lu2) obj2;
                w3g w3gVarB2 = ((a4g) obj).b(((j8n) lu2Var.x.p()).a);
                if (w3gVarB2 == null) {
                    lu2Var.g0();
                    break;
                } else {
                    String str5 = w3gVarB2.f;
                    lu2Var.z = w3gVarB2;
                    lu2Var.H0().g.setText(w3gVarB2.c);
                    ((StylingTextView) lu2Var.H0().f.b).setText(cqp.W(w3gVarB2));
                    lu2Var.H0().h.c.setVisibility(str5.length() != 0 ? 0 : 8);
                    ((StylingTextView) lu2Var.H0().h.b).setText(str5);
                    lu2Var.H0().c.setText("fakepass");
                    new i4g(lu2Var.I0().d.d, w3gVarB2, lu2Var.v, lu2Var);
                    lu2Var.J0();
                    break;
                }
            case 19:
                ((t02) obj2).invoke(obj);
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((q3) obj2).invoke(obj);
                break;
            case 21:
                ((t02) obj2).invoke(obj);
                break;
            case SizeUtil.textSize1 /* 22 */:
                xo3 xo3Var = (xo3) obj;
                wo3 wo3Var = (wo3) obj2;
                wo3Var.F.P(xo3Var.a);
                wf wfVar = wo3Var.G;
                List list2 = xo3Var.b;
                wfVar.getClass();
                List list3 = list2;
                ArrayList arrayList5 = new ArrayList(k95.o(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList5.add(new kv2((pc) it.next()));
                }
                wfVar.K(arrayList5);
                itd itdVar = wo3Var.J;
                View actionView = (itdVar == null ? null : itdVar).findItem(2131364059).getActionView();
                if (actionView != null && (viewFindViewById = actionView.findViewById(2131364056)) != null) {
                    viewFindViewById.setVisibility(xo3Var.c ? 8 : 0);
                    break;
                }
                break;
            case 23:
                ((bo3) obj2).invoke(obj);
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((bo3) obj2).invoke(obj);
                break;
            case 25:
                ((bo3) obj2).invoke(obj);
                break;
            case 26:
                ((bo3) obj2).invoke(obj);
                break;
            case 27:
                ((bo3) obj2).invoke(obj);
                break;
            case 28:
                ((bo3) obj2).invoke(obj);
                break;
            default:
                ((bo3) obj2).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 12:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 13:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 14:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 15:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 16:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 17:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 19:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 21:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 23:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 25:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 26:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 27:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 28:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
