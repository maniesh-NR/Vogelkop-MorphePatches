package defpackage;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.suggestion.CompactSuggestionView;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionButtonTargetView;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import com.opera.android.suggestion.adapter.SuggestionListActionItem;
import com.opera.android.suggestion.adapter.SuggestionListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hqk extends d implements iqk, jvk {
    public pvb A;
    public boolean B;
    public final fe5 a;
    public final FadingRecyclerView b;
    public final s28 c;
    public final SettingsManager d;
    public final ipk e;
    public final x5f f;
    public final osf g;
    public final x5f h;
    public final cbf i;
    public final boolean j;
    public final wjh k;
    public final qr8 l;
    public final nv2 m;
    public final pde n;
    public final hw3 o;
    public final eek p;
    public String q = "";
    public final l5b r;
    public final ArrayList s;
    public final b5a t;
    public final nv6 u;
    public final z61 v;
    public final mvk w;
    public iqk x;
    public List y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public hqk(fe5 fe5Var, FadingRecyclerView fadingRecyclerView, s28 s28Var, SettingsManager settingsManager, ipk ipkVar, x5f x5fVar, osf osfVar, x5f x5fVar2, qdh qdhVar, br6 br6Var, cbf cbfVar, int i, wjh wjhVar, qr8 qr8Var, nv2 nv2Var, pde pdeVar, hw3 hw3Var, eek eekVar) {
        this.a = fe5Var;
        this.b = fadingRecyclerView;
        this.c = s28Var;
        this.d = settingsManager;
        this.e = ipkVar;
        this.f = x5fVar;
        this.g = osfVar;
        this.h = x5fVar2;
        this.i = cbfVar;
        this.j = i;
        this.k = wjhVar;
        this.l = qr8Var;
        this.m = nv2Var;
        this.n = pdeVar;
        this.o = hw3Var;
        this.p = eekVar;
        this.r = new l5b((byte) 9, i == 1);
        this.s = new ArrayList();
        this.v = new z61(this, (byte) 23);
        this.w = nvk.v(2132018539);
        this.x = iqk.Bp;
        this.y = new ArrayList(1);
        this.t = new b5a(fadingRecyclerView, i == 1, new u7k(this), 2130969248, true);
        ((h42) ipkVar.a.d).k(new qzg(this, (byte) 25));
        ole oleVar = new ole(osfVar);
        wqi wqiVar = new wqi(qdhVar);
        SparseArray sparseArray = new SparseArray(7);
        sparseArray.put(16, new wk3(x5fVar));
        sparseArray.put(17, new xu4(oleVar));
        sparseArray.put(21, wqiVar);
        sparseArray.put(22, wqiVar);
        sparseArray.put(25, new xu4(x5fVar2, (byte) 0));
        sparseArray.put(32, new i3h(x5fVar));
        sparseArray.put(34, new xu4(x5fVar, (byte) 1));
        sparseArray.put(33, new z3f(x5fVar2, br6Var.a(), qdhVar.b));
        this.u = new nv6(sparseArray);
    }

    @Override // defpackage.jvk
    public final boolean C() {
        return true;
    }

    public final void G(int i) {
        pvb pvbVar;
        d dVar;
        if (this.y.isEmpty()) {
            return;
        }
        pvb pvbVar2 = this.A;
        if (pvbVar2 != null) {
            View view = pvbVar2.getView();
            int iA = vep.A(i);
            view.focusSearch(iA != 0 ? iA != 1 ? iA != 2 ? iA != 3 ? 0 : 2 : 1 : 130 : 33);
        }
        pvb pvbVar3 = this.A;
        ArrayList arrayList = new ArrayList();
        RecyclerView recyclerView = this.b;
        q9n.I(recyclerView, new ge5(arrayList, recyclerView, (byte) 28));
        Collections.sort(arrayList, new uc5((byte) 1, recyclerView.getLayoutDirection() == 1));
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (((qvb) arrayList.get(i2)).a == pvbVar3) {
                break;
            } else {
                i2++;
            }
        }
        int size = i2 == -1 ? o18.b(i) ? 0 : arrayList.size() - 1 : o18.b(i) ? i2 + 1 : i2 - 1;
        int i3 = i2 != -1 ? ((qvb) arrayList.get(i2)).c : Integer.MIN_VALUE;
        int i4 = o18.b(i) ? 1 : -1;
        while (true) {
            if (size >= 0 && size < arrayList.size()) {
                qvb qvbVar = (qvb) arrayList.get(size);
                if (i != 1 && i != 2) {
                    pvbVar = qvbVar.a;
                    break;
                }
                if (qvbVar.c != i3) {
                    if (i == 1) {
                        while (size > 0 && ((qvb) arrayList.get(size - 1)).c == qvbVar.c) {
                            size--;
                            qvbVar = (qvb) arrayList.get(size);
                        }
                    }
                    pvbVar = qvbVar.a;
                } else {
                    size += i4;
                }
            } else {
                break;
            }
        }
        pvbVar = null;
        if (pvbVar == null) {
            H(null, true);
            return;
        }
        pvb pvbVar4 = this.A;
        RecyclerView recyclerViewO = pvbVar4 != null ? lah.o(pvbVar4.getView()) : null;
        RecyclerView recyclerViewO2 = lah.o(pvbVar.getView());
        if (recyclerViewO != recyclerViewO2 && recyclerViewO2 != null && (dVar = recyclerViewO2.m) != null) {
            LinearLayoutManager linearLayoutManager = recyclerViewO2.n;
            if (linearLayoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                if (!o18.b(i) && (linearLayoutManager2.getOrientation() != 0 || i != 1)) {
                    int itemCount = dVar.getItemCount() - 1;
                    if (linearLayoutManager2.findLastVisibleItemPosition() < itemCount) {
                        linearLayoutManager2.scrollToPosition(itemCount);
                        recyclerViewO2.post(new d50(recyclerViewO2, this, i, (byte) 10));
                        return;
                    }
                } else if (linearLayoutManager2.findFirstVisibleItemPosition() > 0) {
                    linearLayoutManager2.scrollToPosition(0);
                    recyclerViewO2.post(new d50(recyclerViewO2, this, i, (byte) 10));
                    return;
                }
            }
        }
        H(pvbVar, true);
    }

    public final void H(pvb pvbVar, boolean z) {
        pvb pvbVar2 = this.A;
        if (pvbVar == pvbVar2) {
            return;
        }
        z61 z61Var = this.v;
        if (pvbVar2 != null) {
            pvbVar2.h(false);
            pvbVar2.getView().removeOnAttachStateChangeListener(z61Var);
        }
        this.A = pvbVar;
        if (pvbVar != null) {
            pvbVar.h(true);
            pvbVar.getView().addOnAttachStateChangeListener(z61Var);
        }
        l(this.A, z);
    }

    public final boolean I(Suggestion suggestion, int i, xpk xpkVar) {
        l5b l5bVar = this.r;
        int iOrdinal = l5bVar.b ? -xpkVar.ordinal() : xpkVar.ordinal();
        int size = this.y.size();
        int size2 = 0;
        while (true) {
            List list = this.y;
            if (size2 >= size) {
                size2 = list.size();
                break;
            }
            xpk xpkVar2 = ((gqk) list.get(size2)).b;
            boolean z = l5bVar.b;
            int iOrdinal2 = xpkVar2.ordinal();
            if (z) {
                iOrdinal2 = -iOrdinal2;
            }
            if (iOrdinal2 >= iOrdinal) {
                break;
            }
            size2++;
        }
        List list2 = this.y;
        if (suggestion == null) {
            if (size2 < list2.size() && ((gqk) this.y.get(size2)).a == i) {
                this.y.remove(size2);
                notifyItemRemoved(size2);
            }
            return false;
        }
        if (size2 >= list2.size() || ((gqk) this.y.get(size2)).a != i) {
            this.y.add(size2, lah.i(suggestion, i, xpkVar));
            notifyItemInserted(size2);
            return true;
        }
        this.y.set(size2, lah.i(suggestion, i, xpkVar));
        notifyItemChanged(size2);
        return false;
    }

    @Override // defpackage.jvk
    public final boolean a0() {
        return true;
    }

    @Override // defpackage.jvk
    public final boolean f() {
        return false;
    }

    public final int getItemCount() {
        return this.y.size();
    }

    public final long getItemId(int i) {
        return i;
    }

    public final int getItemViewType(int i) {
        return ((gqk) this.y.get(i)).a;
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.w;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc A[EDGE_INSN: B:59:0x00fc->B:53:0x00fc BREAK  A[LOOP:0: B:46:0x00d8->B:52:0x00f9], SYNTHETIC] */
    @Override // defpackage.jvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(androidx.recyclerview.widget.i r9, defpackage.hvk r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqk.k(androidx.recyclerview.widget.i, hvk):void");
    }

    @Override // defpackage.iqk
    public final void l(pvb pvbVar, boolean z) {
        this.x.l(pvbVar, z);
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        if (iVar != null) {
            if (iVar instanceof yqm) {
                fqk fqkVar = ((yqm) iVar).d;
                return fqkVar != null && fqkVar.c.a == 11;
            }
            if (iVar instanceof l55) {
                fqk fqkVar2 = ((l55) iVar).d;
                if (fqkVar2 == null) {
                    return false;
                }
                int i = fqkVar2.c.a;
                return i == 12 || i == 13;
            }
            if (iVar instanceof nmh) {
                return true;
            }
        }
        return false;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.m(this.t);
        pph pphVarU = recyclerView.c.c().u(0);
        pphVarU.b = (byte) 20;
        ArrayList arrayList = pphVarU.a;
        while (arrayList.size() > 20) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void onBindViewHolder(i iVar, int i) {
        ((pa3) iVar).U((gqk) this.y.get(i), this.q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.View, com.opera.android.suggestion.SuggestionButtonTargetView] */
    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        ViewGroup viewGroup2;
        i yqmVar;
        boolean z;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        byte b = 0;
        switch (i) {
            case 0:
                i2 = 2131559502;
                viewGroup2 = viewGroup;
                break;
            case 1:
            case 2:
            case SizeUtil.textSize0_1 /* 18 */:
            case SizeUtil.textSize1 /* 22 */:
                i2 = 2131558607;
                viewGroup2 = viewGroup;
                break;
            case 3:
                i2 = 2131558622;
                viewGroup2 = viewGroup;
                break;
            case 4:
            case 5:
                i2 = 2131559210;
                viewGroup2 = viewGroup;
                break;
            case 6:
                i2 = 2131559386;
                viewGroup2 = viewGroup;
                break;
            case 7:
                i2 = 2131559346;
                viewGroup2 = viewGroup;
                break;
            case 8:
            case 23:
                i2 = 2131558549;
                viewGroup2 = viewGroup;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                i2 = 2131559204;
                viewGroup2 = viewGroup;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                i2 = 2131559284;
                viewGroup2 = viewGroup;
                break;
            case 11:
                i2 = 2131559285;
                viewGroup2 = viewGroup;
                break;
            case 12:
                i2 = 2131558636;
                viewGroup2 = viewGroup;
                break;
            case 13:
            case 14:
            case 15:
            default:
                viewGroup2 = viewGroup;
                i2 = 0;
                break;
            case 16:
                i2 = 2131558582;
                viewGroup2 = viewGroup;
                break;
            case 17:
                i2 = 2131559264;
                viewGroup2 = viewGroup;
                break;
            case 19:
                i2 = 2131558430;
                viewGroup2 = viewGroup;
                break;
            case SizeUtil.textSize0 /* 20 */:
                i2 = 2131559387;
                viewGroup2 = viewGroup;
                break;
            case 21:
                i2 = 2131559249;
                viewGroup2 = viewGroup;
                break;
        }
        RecyclerView recyclerViewInflate = layoutInflaterFrom.inflate(i2, viewGroup2, false);
        byte b2 = 8;
        int i3 = 2131363525;
        boolean z2 = true;
        boolean z3 = this.j;
        nv6 nv6Var = this.u;
        switch (i) {
            case 0:
                yqmVar = new yqm((SuggestionListItem) recyclerViewInflate, this, nv6Var, z3 ? 1 : 0);
                break;
            case 1:
            case 2:
            case SizeUtil.textSize0_1 /* 18 */:
            case SizeUtil.textSize1 /* 22 */:
                if (recyclerViewInflate == null) {
                    t3p.q("rootView");
                    return null;
                }
                CompactSuggestionView compactSuggestionView = (CompactSuggestionView) recyclerViewInflate;
                kf kfVar = new kf((byte) 7, (View) compactSuggestionView, (Object) compactSuggestionView);
                boolean z4 = false;
                thk thkVar = new thk((byte) 2);
                if (i != 18) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (i != 22) {
                    z2 = z;
                    z = true;
                }
                yqmVar = new rc5(kfVar, thkVar, this.u, this, z4, z, z2);
                break;
            case 3:
            case 4:
            case 5:
                yqmVar = new l55((SuggestionListItem) recyclerViewInflate, this, i);
                break;
            case 6:
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, recyclerViewInflate);
                if (stylingTextView == null) {
                    t3p.q("Missing required view with ID: ".concat(recyclerViewInflate.getResources().getResourceName(2131363525)));
                    return null;
                }
                yqmVar = new rc5(new swc((FrameLayout) recyclerViewInflate, stylingTextView, (byte) 1));
                break;
            case 7:
                yqmVar = new d0k(this.a, this.e, recyclerViewInflate, this.f, this.d, this.h, this.g, this.i, this.l, this.m, new ikc(0), this.z ? p6l.b : p6l.a);
                break;
            case 8:
                yqmVar = new yk3((SuggestionListItem) recyclerViewInflate, this, nv6Var, (byte) 0);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                yqmVar = new f3g((SuggestionListItem) recyclerViewInflate, this, nv6Var, new wpk(this, (byte) 0));
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                yqmVar = new zri((SuggestionListItem) recyclerViewInflate, this, z3 ? 1 : 0);
                break;
            case 11:
                yqmVar = new dsi((SuggestionListItem) recyclerViewInflate, this, z3 ? 1 : 0);
                break;
            case 12:
                ?? r5 = (SuggestionButtonTargetView) w1h.j(2131362481, recyclerViewInflate);
                if (r5 == 0) {
                    t3p.q("Missing required view with ID: ".concat(recyclerViewInflate.getResources().getResourceName(2131362481)));
                    return null;
                }
                byte b3 = 29;
                txi txiVar = new txi(this, b3);
                yqmVar = new d76((ConstraintLayout) recyclerViewInflate);
                r5.R = new lb4(txiVar, b3);
                r5.setOnClickListener(new yk4(txiVar, b2));
                break;
            case 13:
            case 14:
            case 15:
            default:
                t3p.o();
                return null;
            case 16:
                if (recyclerViewInflate == null) {
                    t3p.q("rootView");
                    return null;
                }
                yqmVar = new rc5(new hl4(recyclerViewInflate, (byte) 0), this, this.n, nv6Var);
                break;
            case 17:
                yqmVar = new nmh((SuggestionListItem) recyclerViewInflate, this, nv6Var, z3 ? 1 : 0);
                break;
            case 19:
                TextView textView = (TextView) w1h.j(2131361895, recyclerViewInflate);
                if (textView == null) {
                    t3p.q("Missing required view with ID: ".concat(recyclerViewInflate.getResources().getResourceName(2131361895)));
                    return null;
                }
                yqmVar = new rc5(new kf(b, (SuggestionListActionItem) recyclerViewInflate, textView));
                break;
            case SizeUtil.textSize0 /* 20 */:
                OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131361847, recyclerViewInflate);
                if (operaMaterialButton != null) {
                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363525, recyclerViewInflate);
                    if (stylingTextView2 != null) {
                        yqmVar = new lmh(new q5g((FrameLayout) recyclerViewInflate, operaMaterialButton, stylingTextView2, (byte) 8), this.p);
                        break;
                    }
                } else {
                    i3 = 2131361847;
                }
                t3p.q("Missing required view with ID: ".concat(recyclerViewInflate.getResources().getResourceName(i3)));
                return null;
            case 21:
                yqmVar = new u3h((ProductSuggestionListItem) recyclerViewInflate, this, nv6Var);
                break;
            case 23:
                yqmVar = new yk3((SuggestionListItem) recyclerViewInflate, this, nv6Var, (byte) 1);
                break;
        }
        this.s.add(new WeakReference(yqmVar));
        return yqmVar;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.q0(this.t);
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final void onViewRecycled(i iVar) {
        ((pa3) iVar).Y();
    }

    @Override // defpackage.iqk
    public final void q(Suggestion suggestion, boolean z) {
        int i = suggestion.a;
        if (i == 10) {
            this.x.q(suggestion, true);
            x5f x5fVar = this.f;
            if (x5fVar.h) {
                x5fVar.o(9);
                return;
            }
            return;
        }
        iqk iqkVar = this.x;
        if (i == 28) {
            iqkVar.q(suggestion, true);
        } else if (i == 33) {
            iqkVar.q(suggestion, true);
        } else {
            iqkVar.q(suggestion, z);
        }
    }
}
