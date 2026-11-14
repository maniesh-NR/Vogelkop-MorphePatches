package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class yj5 extends b23 {
    public final wj5 b;
    public final x5f c;
    public final wtm d;
    public boolean e;

    public yj5(wj5 wj5Var, x5f x5fVar, wtm wtmVar) {
        super((byte) 1);
        this.b = wj5Var;
        this.c = x5fVar;
        this.d = wtmVar;
    }

    @Override // defpackage.b23
    public final View f(Context context) {
        xj5 xj5Var;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View viewInflate = layoutInflaterFrom.inflate(2131558608, (ViewGroup) null, false);
        if (viewInflate == null) {
            t3p.q("rootView");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        wj5 wj5Var = this.b;
        List<y5j> list = wj5Var.q;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        for (y5j y5jVar : list) {
            if (y5jVar != null) {
                if ((y5jVar instanceof x5j) || (y5jVar instanceof w5j)) {
                    xj5Var = xj5.COLOR_THEME;
                } else if (y5jVar instanceof r5j) {
                    xj5Var = ((r5j) y5jVar).b ? xj5.LIVE_SCORES : xj5.START_PAGE;
                } else if (y5jVar instanceof u5j) {
                    xj5Var = xj5.NEWS_FEED;
                } else if (y5jVar instanceof v5j) {
                    xj5Var = xj5.NEWS_FEED;
                }
                arrayList.add(xj5Var);
            }
            h9o.p();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (wj5Var.t) {
            arrayList2.add(xj5.SPEED_DIALS);
        }
        if (!wj5Var.s.isEmpty()) {
            arrayList2.add(xj5.WALLPAPER);
        }
        if (wj5Var.u) {
            arrayList2.add(xj5.SEARCH_ENGINES);
        }
        Iterator it = CollectionsKt.F(CollectionsKt.c0(new yg9((byte) 20), arrayList2)).iterator();
        while (it.hasNext()) {
            String string = context.getString(((xj5) it.next()).a);
            View viewInflate2 = layoutInflaterFrom.inflate(2131558575, (ViewGroup) null, false);
            TextView textView = (TextView) w1h.j(2131363485, viewInflate2);
            if (textView == null) {
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(2131363485)));
                return null;
            }
            textView.setText(string);
            linearLayout.addView((LinearLayout) viewInflate2);
        }
        return linearLayout;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        return context.getText(2132018335);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132017596);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083349;
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        vb0 vb0Var;
        int iOrdinal = hjmVar.ordinal();
        if (iOrdinal == 0) {
            vb0Var = this.e ? vb0.b : vb0.c;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            vb0Var = vb0.d;
        }
        String str = this.b.p;
        x5f x5fVar = this.c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            u90 u90Var = new u90(2443, -1, 2);
            u90Var.q(0, 1, vb0Var);
            u90Var.q(1, str != null ? 1 : 0, str);
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(37);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 37, am2.q(xb0VarX, 37, 1)) : new hf0(xb0VarX, 37, list)).add(u90Var);
            x5fVar.U0(x56VarF);
        }
        if (this.e) {
            return;
        }
        ((su) this.d.c).run(new rw7(Collections.singletonList(xle.e)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        bz0Var.setCancelable(false);
        ?? r1 = (OperaMaterialButton) bz0Var.f(-1);
        r1.setClickable(false);
        r1.R(true);
        bz0Var.f(-2).setEnabled(false);
        this.e = true;
        this.mDismissReason = hjm.a;
        jl4 jl4Var = new jl4((Object) bz0Var, (byte) 16);
        wtm wtmVar = this.d;
        ((r9i) ((agm) wtmVar.a).c).k((wj5) wtmVar.b, new iyk(jl4Var, (su) wtmVar.c, (byte) 5));
    }

    @Override // defpackage.b23, defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) throws Resources.NotFoundException {
        super.onShowDialog(bz0Var);
        bz0Var.f(-1).setOnClickListener(new nf(this, bz0Var, (byte) 25));
    }
}
