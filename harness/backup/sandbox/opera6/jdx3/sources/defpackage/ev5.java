package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.material.chip.Chip;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.sync.SyncedSessionTab;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.usercentrics.sdk.ui.components.UCTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ev5 extends d {
    public final /* synthetic */ byte a = 5;
    public final Object b;
    public final Object c;

    public ev5(fdn fdnVar, tah tahVar) {
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(fdnVar.g));
        Collections.sort(arrayList, new omj((byte) 17));
        this.b = arrayList;
        this.c = tahVar;
    }

    public ev5(qrk qrkVar, List list) {
        this.b = qrkVar;
        this.c = list;
    }

    public ev5(rse rseVar) {
        this.c = rseVar;
        pad padVar = ((sse) rseVar.r.getValue()).b;
        this.b = padVar == null ? null : padVar;
    }

    public ev5(u3m u3mVar, Context context) {
        this.c = u3mVar;
        ArrayList arrayList = u3mVar.v;
        int size = arrayList != null ? arrayList.size() : 0;
        boolean z = size > 1 || (size == 1 && !((szb) arrayList.get(0)).equals(u3mVar.u));
        ArrayList arrayListJ = nb6.J(sfe.M0(u3mVar.s, new q3m(context, z, u3mVar)));
        this.b = arrayListJ;
        Collections.sort(arrayListJ, new omj((byte) 13));
        if (z) {
            ArrayList arrayListJ2 = nb6.J(sfe.M0(arrayList, new oce(context, u3mVar, (byte) 1)));
            Collections.sort(arrayListJ2, new omj((byte) 14));
            arrayListJ.add(0, new r3m());
            int size2 = arrayListJ2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayListJ2.get(i);
                i++;
                ((ArrayList) this.b).add(0, (r3m) obj);
            }
            ((ArrayList) this.b).add(0, new r3m());
        }
    }

    public ev5(ufm ufmVar, List list) {
        this.b = ufmVar;
        this.c = list;
    }

    public ev5(vyk vykVar, SyncedSessionTab[] syncedSessionTabArr) {
        this.c = vykVar;
        this.b = syncedSessionTabArr;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
        }
        return ((ArrayList) obj2).size();
    }

    public final long getItemId(int i) {
        switch (this.a) {
            case 3:
                return ((SyncedSessionTab[]) this.b)[i].b;
            default:
                return super.getItemId(i);
        }
    }

    public final int getItemViewType(int i) {
        switch (this.a) {
            case 4:
                return ((r3m) ((ArrayList) this.b).get(i)).a == null ? 1 : 0;
            default:
                return super.getItemViewType(i);
        }
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void onBindViewHolder(i iVar, int i) throws NumberFormatException {
        byte b = this.a;
        Object obj = this.c;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dv5 dv5Var = (dv5) iVar;
                eqg eqgVar = (eqg) ((List) obj).get(i);
                ((UCTextView) dv5Var.b.getValue()).setText(eqgVar.a);
                ((UCTextView) dv5Var.c.getValue()).setText(CollectionsKt.P(eqgVar.b, "\n", (CharSequence) null, (String) null, 0, (Function1) null, 62));
                break;
            case 1:
                yjk yjkVar = (yjk) iVar;
                ate ateVar = (ate) ((ArrayList) ((pad) this.b).c).get(i);
                jri jriVar = new jri(this, ateVar, (byte) 18);
                yjkVar.c = ateVar;
                b7k b7kVar = yjkVar.b;
                ((OperaListItem) b7kVar.c).E(new qxh(ateVar.c));
                ?? r12 = (OperaListItem) b7kVar.c;
                r12.z(new mxh(ddh.o(true, r12.getContext(), 0, vtp.K(2131231685, ateVar.a))));
                ((OperaListItem) b7kVar.b).setOnClickListener(new h4i((Object) jriVar, (byte) 15));
                break;
            case 2:
                List list = (List) obj;
                int size = (i / 2) + ((list.size() / 2) * (i % 2));
                String str = (String) list.get(size);
                String strValueOf = String.valueOf(size + 1);
                SpannableString spannableString = new SpannableString(sko.v(strValueOf, ". ", str));
                spannableString.setSpan(new ForegroundColorSpan(f03.t(2130969303, ((qrk) obj2).requireContext(), 2131102502)), 0, strValueOf.length(), 33);
                Chip chip = (OperaChip) ((prk) iVar).b.c;
                chip.setText(spannableString);
                chip.setContentDescription(spannableString);
                break;
            case 3:
                uyk uykVar = (uyk) iVar;
                SyncedSessionTab syncedSessionTab = ((SyncedSessionTab[]) obj2)[i];
                TextView textView = uykVar.c;
                ImageView imageView = uykVar.d;
                vyk vykVar = uykVar.e;
                ((i) uykVar).itemView.setTag(2131364644, syncedSessionTab);
                uykVar.b.setText(syncedSessionTab.e);
                String str2 = syncedSessionTab.c;
                if (!z5i.a0(str2)) {
                    String strE = wqm.e(aik.s(str2, aik.a));
                    if (!strE.isEmpty() && strE.indexOf(47) == strE.length() - 1) {
                        strE = p3p.h(1, 0, str2);
                    }
                    textView.setText(strE);
                    Context context = vykVar.getContext();
                    int i2 = vykVar.D;
                    int i3 = vmj.g;
                    imageView.setImageDrawable(tmj.m(context, str2, i2, i2, null, 48));
                    break;
                } else {
                    Context context2 = vykVar.getContext();
                    int i4 = vykVar.D;
                    int i5 = vmj.g;
                    vmj vmjVarM = tmj.m(context2, str2, i4, i4, null, 48);
                    int i6 = vykVar.D;
                    Bitmap bitmapL0 = scd.l0(vmjVarM, i6, i6);
                    int i7 = vykVar.D;
                    Context context3 = vykVar.getContext();
                    PathInterpolator pathInterpolator = s8i.d;
                    p8i p8iVar = new p8i(i7, i7 / 2, context3, bitmapL0);
                    p8iVar.a(f03.s(vykVar.getContext()));
                    imageView.setImageDrawable(p8iVar);
                    textView.setText(2132017532);
                    break;
                }
                break;
            case 4:
                r3m r3mVar = (r3m) ((ArrayList) obj2).get(i);
                View view = ((i) ((t3m) iVar)).itemView;
                if (r3mVar.a != null) {
                    y83 y83VarD = y83.d(view);
                    ((TextView) y83VarD.f).setText(r3mVar.b);
                    ((TextView) y83VarD.c).setText(r3mVar.a.a);
                    view.setTag(r3mVar);
                    ((StylingImageView) y83VarD.d).setVisibility(r3mVar.c ? 0 : 8);
                    ((LinearLayout) y83VarD.b).setOnClickListener(new j5g(this, r3mVar, (byte) 23));
                    break;
                } else {
                    mn5.a(view).b.setText(i == 0 ? 2132019376 : 2132019375);
                    break;
                }
            default:
                bt1 bt1Var = ((kdn) iVar).b;
                fdn fdnVar = (fdn) ((ArrayList) obj2).get(i);
                bt1Var.c.setText(fdnVar.c);
                bt1Var.b.setOnClickListener(new obn(this, fdnVar, b2));
                break;
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        yq1 yq1Var;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new dv5((ufm) this.b, j7c.n(viewGroup, 2131559480, viewGroup, false));
            case 1:
                ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559382, viewGroup, false);
                if (constraintLayoutN != null) {
                    ConstraintLayout constraintLayout = (OperaListItem) constraintLayoutN;
                    return new yjk(new b7k((byte) 3, (View) constraintLayout, (Object) constraintLayout));
                }
                t3p.q("rootView");
                return null;
            case 2:
                return new prk(LayoutInflater.from(viewGroup.getContext()).inflate(2131559395, viewGroup, false));
            case 3:
                vyk vykVar = (vyk) obj;
                return new uyk(vykVar, vykVar.B.inflate(2131559406, viewGroup, false));
            case 4:
                boolean z = i == 1;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                if (z) {
                    yq1Var = mn5.a(layoutInflaterFrom.inflate(2131559301, viewGroup, false)).b;
                } else {
                    y83 y83VarE = y83.e(layoutInflaterFrom, viewGroup);
                    AppCompatImageView appCompatImageView = (StylingImageView) y83VarE.d;
                    appCompatImageView.setBackground(null);
                    appCompatImageView.setImageResource(2131232018);
                    svk svkVar = new svk(y83VarE, (byte) 10);
                    q9n.e(appCompatImageView, svkVar);
                    svkVar.a(appCompatImageView);
                    yq1Var = (LinearLayout) y83VarE.b;
                }
                return new t3m(yq1Var);
            default:
                View viewN = j7c.n(viewGroup, 2131559506, viewGroup, false);
                int i2 = 2131362457;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362457, viewN);
                if (stylingTextView != null) {
                    i2 = 2131363359;
                    StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363359, viewN);
                    if (stylingImageView != null) {
                        return new kdn(new bt1((LinearLayout) viewN, stylingImageView, stylingTextView), (tah) obj);
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i2)));
                return null;
        }
    }

    public final void onViewRecycled(i iVar) {
        switch (this.a) {
            case 1:
                yjk yjkVar = (yjk) iVar;
                super.onViewRecycled(yjkVar);
                yjkVar.c = null;
                break;
            default:
                super.onViewRecycled(iVar);
                break;
        }
    }
}
