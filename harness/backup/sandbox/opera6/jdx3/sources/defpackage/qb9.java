package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.BrowserActivity;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.custom_views.StylingImageButton;
import java.util.Collections;
import java.util.Date;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qb9 extends xb9 {
    public final fge m;
    public final nb9 n;

    @NonNull
    @WeakOwner
    private final TextView o;
    public final TextView p;
    public final ImageView q;
    public final ImageView r;
    public final StylingImageButton s;

    public qb9(BrowserActivity browserActivity, tcl tclVar, View view, String str, rn9 rn9Var, fge fgeVar, nb9 nb9Var) {
        super(browserActivity, tclVar, view, str, rn9Var);
        WeakHashMap weakHashMap = r5n.a;
        TextView textView = (TextView) ((View) m5n.f(view, 2131362869));
        this.o = textView;
        this.p = (TextView) ((View) m5n.f(view, 2131364480));
        this.q = (ImageView) ((View) m5n.f(view, 2131363933));
        ImageView imageView = (ImageView) ((View) m5n.f(view, 2131364860));
        this.r = imageView;
        this.s = (StylingImageButton) ((View) m5n.f(view, 2131361862));
        this.m = fgeVar;
        this.n = nb9Var;
        b0(textView);
        final byte b = 0;
        q9n.e(imageView, new r8n(this) { // from class: pb9
            public final /* synthetic */ qb9 b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view2) {
                byte b2 = b;
                qb9 qb9Var = this.b;
                switch (b2) {
                    case 0:
                        ja2 ja2Var = qb9Var.b;
                        if ((view2 instanceof ImageView) && (ja2Var instanceof ib9)) {
                            ib9 ib9Var = (ib9) ja2Var;
                            bc9.u((ImageView) view2, ib9Var.e, ib9Var.h);
                            break;
                        }
                        break;
                    default:
                        ja2 ja2Var2 = qb9Var.b;
                        if ((view2 instanceof TextView) && (ja2Var2 instanceof ib9)) {
                            TextView textView2 = (TextView) view2;
                            Context context = view2.getContext();
                            textView2.setTextColor(((ib9) ja2Var2).e() ? f03.u(2130969366, context, 2131102502) : f03.F(context));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        q9n.e(this.i, new r8n(this) { // from class: pb9
            public final /* synthetic */ qb9 b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view2) {
                byte b22 = b2;
                qb9 qb9Var = this.b;
                switch (b22) {
                    case 0:
                        ja2 ja2Var = qb9Var.b;
                        if ((view2 instanceof ImageView) && (ja2Var instanceof ib9)) {
                            ib9 ib9Var = (ib9) ja2Var;
                            bc9.u((ImageView) view2, ib9Var.e, ib9Var.h);
                            break;
                        }
                        break;
                    default:
                        ja2 ja2Var2 = qb9Var.b;
                        if ((view2 instanceof TextView) && (ja2Var2 instanceof ib9)) {
                            TextView textView2 = (TextView) view2;
                            Context context = view2.getContext();
                            textView2.setTextColor(((ib9) ja2Var2).e() ? f03.u(2130969366, context, 2131102502) : f03.F(context));
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.xb9, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        ib9 ib9Var = (ib9) ja2Var;
        int iC0 = c0(ib9Var);
        long j = ib9Var.j;
        String str = ib9Var.e;
        String str2 = ib9Var.k;
        boolean z2 = iC0 == 1;
        TextView textView = this.o;
        String[] strArr = aik.a;
        textView.setText(ehi.a(str));
        TextView textView2 = this.p;
        if (j > 0) {
            textView2.setVisibility(0);
            textView2.setText(aik.h(j, textView2.getContext()));
        } else {
            textView2.setVisibility(8);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        ImageView imageView = this.q;
        if (zIsEmpty) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            dwh dwhVarI = yne.b.i(str2);
            dwhVarI.d = true;
            dwhVarI.a();
            dwhVarI.m(wqm.r(str2) ? Collections.singletonList(this.n) : Collections.EMPTY_LIST);
            dwhVarI.b.k = true;
            dwhVarI.g(imageView, (d94) null);
        }
        int i = (z2 || this.m.G0(ib9Var) || ib9Var.e()) ? 8 : 0;
        AppCompatImageView appCompatImageView = this.s;
        appCompatImageView.setVisibility(i);
        appCompatImageView.setOnClickListener(new jf7(this, ib9Var, (byte) 10));
        bc9.u(this.r, str, ib9Var.h);
    }

    @Override // defpackage.xb9
    public final boolean e0(ja2 ja2Var) {
        ib9 ib9Var = (ib9) ja2Var;
        return this.m.K0(ib9Var, false) || ib9Var.e();
    }

    @Override // defpackage.xb9
    public final boolean h0(hb9 hb9Var) {
        ib9 ib9Var = (ib9) hb9Var;
        Uri uri = ib9Var.l;
        long j = ib9Var.i;
        TextView textView = this.i;
        if (uri != null) {
            textView.setText("");
            return true;
        }
        this.h.setEnabled(!ib9Var.e());
        Context context = textView.getContext();
        textView.setTextColor(ib9Var.e() ? f03.u(2130969366, context, 2131102502) : f03.F(context));
        if (ib9Var.e()) {
            textView.setText(2132019061);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ib9Var.c + 2000 > jCurrentTimeMillis) {
            textView.setText(2132019066);
            g0(jCurrentTimeMillis + 2000);
            return true;
        }
        textView.setText(textView.getResources().getString(2132019062, aik.e(new Date(j))));
        g0(j);
        return false;
    }
}
