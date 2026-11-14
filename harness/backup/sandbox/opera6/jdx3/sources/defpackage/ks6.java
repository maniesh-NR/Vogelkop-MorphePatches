package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.downloads.DownloadsPanel;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.undo.UndoBar;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.ClickAwareCardView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final /* synthetic */ class ks6 implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ks6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [android.view.View, com.opera.android.custom_views.StylingImageButton, com.opera.android.custom_views.StylingImageView] */
    public final void d0(Object obj) {
        String string;
        HashMap map;
        byte b = 8;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                qs6 qs6Var = (qs6) this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Set set = qs6Var.g;
                if (set != null) {
                    qs6Var.d.Z(qs6Var.a, zBooleanValue, set);
                    return;
                }
                return;
            case 1:
                int i = 0;
                wg7 wg7Var = (wg7) this.b;
                UndoBar undoBar = wg7Var.L;
                undoBar.getClass();
                List list = (List) ((List) obj).stream().filter(new zx1(undoBar, (byte) 18)).collect(Collectors.toList());
                wg7Var.L.a(true);
                wg7Var.z.J(list, wg7Var.L0());
                if (wg7Var.H) {
                    return;
                }
                wg7Var.H = true;
                ((DownloadsPanel) wg7Var.I.f).a.y0(wg7Var.A.c);
                wg7Var.A.c();
                rn9 rn9Var = wg7Var.S;
                long j = wg7Var.getArguments() != null ? wg7Var.getArguments().getLong("download", -1L) : -1L;
                int i2 = -1;
                if (j != -1) {
                    ze7 ze7Var = wg7Var.z;
                    while (true) {
                        xvj xvjVar = ze7Var.b;
                        if (i < xvjVar.h) {
                            if (((xe7) xvjVar.f(i)).a == j) {
                                i2 = i;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                rn9Var.E((FadingRecyclerView) wg7Var.I.c, i2);
                return;
            case 2:
                fi7 fi7Var = (fi7) obj;
                ((FrameLayout) ((hi7) this.b).e.b).setPadding(0, fi7Var.a, 0, fi7Var.b);
                return;
            case 3:
                rv7 rv7Var = (rv7) this.b;
                String str = (String) obj;
                if (str != null) {
                    rv7Var.n.k(str);
                    return;
                }
                return;
            case 4:
                ((aw7) this.b).I0(((Boolean) obj).booleanValue());
                return;
            case 5:
                ((d21) this.b).a();
                return;
            case 6:
                FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) this.b;
                int i3 = FastResizeWebViewContainer.i;
                fastResizeWebViewContainer.b();
                return;
            case 7:
                ar8 ar8Var = (ar8) this.b;
                ar8Var.y.V((tta) obj);
                RecyclerView recyclerView = ar8Var.v;
                d dVar = recyclerView.m;
                if (dVar != null) {
                    recyclerView.y0((d) null);
                    recyclerView.c.c().f();
                    recyclerView.y0(dVar);
                    return;
                }
                return;
            case 8:
                rs8 rs8Var = (rs8) this.b;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2 != rs8Var.k) {
                    rs8Var.k = zBooleanValue2;
                    if (zBooleanValue2) {
                        rs8Var.h.run();
                        return;
                    }
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                eu8 eu8Var = (eu8) this.b;
                if (((Boolean) obj).booleanValue()) {
                    ow8 ow8Var = eu8Var.c;
                    ow8Var.getClass();
                    boolean zEquals = mq.class.equals(ja2.class);
                    ArrayList arrayList = ow8Var.a;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ja2 ja2Var = (ja2) arrayList.get(size);
                        if (zEquals || mq.class.isInstance(ja2Var)) {
                            arrayList.remove(size);
                            ow8Var.notifyItemRemoved(size);
                        }
                    }
                    return;
                }
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((lu8) this.b).j0();
                return;
            case 11:
                xv8 xv8Var = (xv8) this.b;
                Boolean bool = (Boolean) obj;
                if (bool.equals(Boolean.valueOf(xv8Var.z))) {
                    return;
                }
                boolean zBooleanValue3 = bool.booleanValue();
                xv8Var.z = zBooleanValue3;
                ClickAwareCardView clickAwareCardView = xv8Var.A;
                if (zBooleanValue3) {
                    clickAwareCardView.setBackgroundColor(f03.t(2130969331, ((i) xv8Var).itemView.getContext(), 2131101243));
                    return;
                } else {
                    clickAwareCardView.setBackgroundColor(0);
                    return;
                }
            case 12:
                xw8 xw8Var = (xw8) this.b;
                Integer num = (Integer) obj;
                igi igiVar = xw8Var.B;
                if (igiVar != null) {
                    qv8 qv8Var = (qv8) igiVar.d;
                    int iIntValue = num.intValue();
                    if (qv8Var.f != iIntValue) {
                        qv8Var.f = iIntValue;
                        xw8Var.g.a0();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((z1h) this.b).b(obj);
                return;
            case 14:
                jd9 jd9Var = (jd9) this.b;
                gfh gfhVar = (gfh) obj;
                if (gfhVar instanceof efh) {
                    ((ConstraintLayout) jd9Var.p.e).setVisibility(0);
                    return;
                }
                if (gfhVar instanceof cfh) {
                    ((ConstraintLayout) jd9Var.p.e).setVisibility(8);
                    Toast.makeText(jd9Var.getContext(), mfh.q(((cfh) gfhVar).a).a(jd9Var.getResources()), 0).show();
                    jd9Var.g0();
                    return;
                } else {
                    if (gfhVar instanceof ffh) {
                        ((ConstraintLayout) jd9Var.p.e).setVisibility(8);
                        hmi hmiVar = ((ffh) gfhVar).a;
                        if (hmiVar == null || jd9Var.n) {
                            return;
                        }
                        fmi fmiVar = hmiVar.d;
                        if (fmiVar instanceof dmi) {
                            if (c09.t(jd9Var.getContext(), vml.d, ((dmi) fmiVar).a, false, new dg7(jd9Var, (byte) 24))) {
                                vml.c(new gd9(jd9Var, (byte) 1));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                ((hx5) this.b).r(obj);
                return;
            case 16:
                eyj eyjVar = (eyj) obj;
                ?? r0 = ((n4l) ((d5a) this.b).b).f;
                if (r0 != 0) {
                    r0.setImageDrawable(eyjVar.p.f(r0.getContext()));
                    return;
                }
                return;
            case 17:
                ((ne5) this.b).n((pxj) obj);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ((v8a) this.b).b();
                return;
            case 19:
                p12 p12Var = (p12) this.b;
                if (((lmm) obj) == lmm.a) {
                    ((gjm) p12Var.b).e(new o5g(), false);
                    return;
                }
                return;
            case SizeUtil.textSize0 /* 20 */:
                ((svb) this.b).a();
                return;
            case 21:
                f1c f1cVar = (f1c) this.b;
                h1c h1cVar = (h1c) obj;
                v3m v3mVar = f1cVar.z;
                v0g.m((OperaListItem) f1cVar.B.d, h1cVar.a);
                v0g.m((OperaListItem) f1cVar.B.n, h1cVar.b);
                OperaListItem operaListItem = (OperaListItem) f1cVar.B.l;
                z4m z4mVar = h1cVar.c;
                Context contextRequireContext = f1cVar.requireContext();
                q6e q6eVar = f1cVar.y;
                v0g.m(operaListItem, z4mVar.d(q6eVar, contextRequireContext));
                e5m e5mVar = h1cVar.d;
                boolean z3 = e5mVar.b;
                ((OperaListItem) f1cVar.B.i).t(z3);
                szb szbVar = e5mVar.c;
                v0g.m((OperaListItem) f1cVar.B.c, szbVar.g(f1cVar.requireContext()));
                if (z3) {
                    v3mVar.i(szbVar);
                }
                b1c b1cVar = f1cVar.w;
                Set<i0c> set2 = h1cVar.e;
                szb szbVar2 = szb.j;
                if (!b1cVar.c.equals(set2) || !szbVar.equals(b1cVar.d)) {
                    b1cVar.c = set2;
                    b1cVar.d = szbVar;
                    ArrayList arrayList2 = new ArrayList();
                    for (i0c i0cVar : set2) {
                        szb szbVar3 = i0cVar.a;
                        szb szbVar4 = szb.i;
                        arrayList2.add(new a1c(i0cVar, i0cVar.a.g(b1cVar.e.requireContext()), (szbVar3 == szbVar4 || szbVar3 == szbVar2) ? (szbVar.equals(szbVar4) || szbVar.equals(szbVar2)) ? z2 : z : szbVar.equals(szbVar3) ^ z));
                        z = true;
                        z2 = false;
                    }
                    arrayList2.sort(Comparator.comparing(new mn(b)));
                    ((ygc) b1cVar).a.b(arrayList2, b1cVar.b);
                }
                ((OperaListItem) f1cVar.B.f).t(e5mVar.d);
                boolean zF = v3m.f(v3mVar.a);
                Context contextRequireContext2 = f1cVar.requireContext();
                int iOrdinal = z4mVar.ordinal();
                if (iOrdinal == 0) {
                    string = null;
                } else {
                    if (iOrdinal != 1) {
                        h9o.p();
                        return;
                    }
                    string = contextRequireContext2.getString(2132021468, z4mVar.d(q6eVar, contextRequireContext2));
                }
                ((OperaIconedMessage) f1cVar.B.m).a(string);
                ((OperaIconedMessage) f1cVar.B.m).setVisibility((!zF || TextUtils.isEmpty(string)) ? 8 : 0);
                boolean z4 = z4mVar.a;
                ((OperaListItem) f1cVar.B.i).setVisibility((zF && z4) ? 0 : 8);
                if (z4 && ((OperaListItem) f1cVar.B.i).isChecked()) {
                    b = 0;
                }
                for (int i4 = 0; i4 < ((LinearLayout) f1cVar.B.g).getChildCount(); i4++) {
                    View childAt = ((LinearLayout) f1cVar.B.g).getChildAt(i4);
                    int id = childAt.getId();
                    if (id == 2131364844 || id == 2131363305 || id == 2131363303 || id == 2131363304 || id == 2131361941 || id == 2131362119 || id == 2131362120 || id == 2131362756 || id == 2131364234) {
                        childAt.setVisibility(b);
                    }
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                k9c k9cVar = (k9c) this.b;
                k9c.d(k9cVar.b.getContext().getResources(), k9cVar.d);
                k9c.e((Configuration) obj, k9cVar.e, k9cVar.f);
                return;
            case 23:
                ((afe) this.b).setValue(obj);
                return;
            case SizeUtil.textSize2 /* 24 */:
                ua7 ua7Var = (ua7) this.b;
                gkc gkcVar = (gkc) obj;
                synchronized (((HashMap) ua7Var.c)) {
                    map = new HashMap((HashMap) ua7Var.c);
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new zr9((Object) entry, (Object) gkcVar, (byte) 20));
                }
                return;
            case 25:
                mkc mkcVar = (mkc) this.b;
                mkcVar.setDrawable(0, (Drawable) obj);
                mkcVar.invalidateSelf();
                return;
            case 26:
                tkc tkcVar = (tkc) this.b;
                tkcVar.l.g(((Boolean) obj).booleanValue() ? qcc.e : qcc.c);
                tkcVar.A();
                return;
            case 27:
                s14 s14Var = (s14) this.b;
                moc mocVar = (moc) obj;
                if (mocVar != null) {
                    ((bml) s14Var.d).b(new zr9((Object) s14Var, (Object) mocVar, (byte) 21));
                    return;
                }
                return;
            case 28:
                ov0 ov0Var = (ov0) this.b;
                vr8 vr8Var = (vr8) obj;
                laj lajVar = vr8Var.b;
                TextView textView = (TextView) ov0Var.d;
                lajVar.a(textView);
                textView.setTextColor(vr8Var.f.a(textView.getContext()));
                laj lajVar2 = vr8Var.b;
                MaterialButton materialButton = (MaterialButton) ov0Var.c;
                lajVar2.a(materialButton);
                materialButton.setTextColor(vr8Var.i.a(materialButton.getContext()));
                materialButton.F(ColorStateList.valueOf(vr8Var.j.a(materialButton.getContext())));
                return;
            default:
                ((i7d) this.b).r0();
                return;
        }
    }
}
