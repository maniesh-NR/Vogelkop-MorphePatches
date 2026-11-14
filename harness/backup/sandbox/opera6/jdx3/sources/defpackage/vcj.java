package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.theme.ThemeableRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class vcj extends dej implements sni {
    public final mej c;
    public final Intent d;
    public final qn e;
    public final rii f;
    public final dt1 g;
    public final dt1 h;
    public final int i;
    public pt1 j;
    public p1j k;

    public vcj(mej mejVar, Intent intent, ArrayList arrayList, qn qnVar, rii riiVar) {
        super(mejVar);
        this.c = mejVar;
        this.d = intent;
        this.e = qnVar;
        this.f = riiVar;
        dt1 dt1Var = new dt1();
        d(dt1Var);
        this.g = dt1Var;
        dt1 dt1Var2 = new dt1();
        d(dt1Var2);
        this.h = dt1Var2;
        String[] strArr = OperaApplication.K;
        zcj zcjVar = (zcj) ((OperaApplication) mejVar.getContext().getApplicationContext()).r.Q0.get();
        this.i = this.b.getContext().getResources().getInteger(2131492994);
        p1j p1jVar = this.k;
        byte b = 0;
        if (p1jVar != null) {
            p1jVar.cancel(false);
        }
        zzh zzhVar = new zzh(this, (byte) 7);
        zcjVar.getClass();
        HashMap mapD = zcj.d(arrayList);
        qie qieVar = zcjVar.c;
        umi umiVar = zcjVar.b;
        nml nmlVarB = umiVar.b(new ycj(zcjVar, intent, mapD, b));
        nmlVarB.b(umiVar.f(new txi(zzhVar, (byte) 2)));
        this.k = qieVar.n(new oml(nmlVarB), null);
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        int dimensionPixelSize = this.b.getContext().getResources().getDimensionPixelSize(2131165351);
        pt1 pt1Var = this.j;
        if (pt1Var == null) {
            pt1Var = null;
        }
        RecyclerView recyclerView = (ThemeableRecyclerView) pt1Var.f;
        recyclerView.setPadding(dimensionPixelSize, recyclerView.getPaddingTop(), dimensionPixelSize, recyclerView.getPaddingBottom());
        pt1 pt1Var2 = this.j;
        RecyclerView recyclerView2 = (ThemeableRecyclerView) (pt1Var2 != null ? pt1Var2 : null).g;
        recyclerView2.setPadding(dimensionPixelSize, recyclerView2.getPaddingTop(), dimensionPixelSize, recyclerView2.getPaddingBottom());
    }

    @Override // defpackage.dej
    public final View a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131559322, (ViewGroup) null, false);
        int i = 2131363092;
        RelativeLayout relativeLayout = (RelativeLayout) w1h.j(2131363092, viewInflate);
        if (relativeLayout != null) {
            i = 2131362594;
            if (((ImageView) w1h.j(2131362594, viewInflate)) != null) {
                i = 2131364412;
                RecyclerView recyclerView = (ThemeableRecyclerView) w1h.j(2131364412, viewInflate);
                if (recyclerView != null) {
                    i = 2131364413;
                    RecyclerView recyclerView2 = (ThemeableRecyclerView) w1h.j(2131364413, viewInflate);
                    if (recyclerView2 != null) {
                        i = 2131364417;
                        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364417, viewInflate);
                        if (stylingTextView != null) {
                            i = 2131364418;
                            StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131364418, viewInflate);
                            if (stylingTextView2 != null) {
                                this.j = new pt1((ViewGroup) viewInflate, (View) relativeLayout, (View) recyclerView, (View) recyclerView2, stylingTextView, stylingTextView2, (byte) 19);
                                this.c.x(new tk(this, (byte) 2));
                                pt1 pt1Var = this.j;
                                if (pt1Var == null) {
                                    pt1Var = null;
                                }
                                ThemeableRecyclerView themeableRecyclerView = (ThemeableRecyclerView) pt1Var.f;
                                themeableRecyclerView.y0(this.g);
                                int i2 = this.i;
                                themeableRecyclerView.C0(new GridLayoutManager(i2));
                                pt1 pt1Var2 = this.j;
                                if (pt1Var2 == null) {
                                    pt1Var2 = null;
                                }
                                ThemeableRecyclerView themeableRecyclerView2 = (ThemeableRecyclerView) pt1Var2.g;
                                themeableRecyclerView2.y0(this.h);
                                themeableRecyclerView2.C0(new GridLayoutManager(i2));
                                Intent intent = this.d;
                                CharSequence stringExtra = intent.getStringExtra("android.intent.extra.TITLE");
                                String strJ = ocp.j(intent);
                                if (stringExtra == null || StringsKt.N(stringExtra)) {
                                    pt1 pt1Var3 = this.j;
                                    if (pt1Var3 == null) {
                                        pt1Var3 = null;
                                    }
                                    ((StylingTextView) pt1Var3.b).setVisibility(8);
                                } else {
                                    pt1 pt1Var4 = this.j;
                                    if (pt1Var4 == null) {
                                        pt1Var4 = null;
                                    }
                                    ((StylingTextView) pt1Var4.b).setText(stringExtra);
                                }
                                pt1 pt1Var5 = this.j;
                                if (strJ != null) {
                                    if (pt1Var5 == null) {
                                        pt1Var5 = null;
                                    }
                                    na2.R((StylingTextView) pt1Var5.c, new dkl(strJ), new wkl());
                                } else {
                                    if (pt1Var5 == null) {
                                        pt1Var5 = null;
                                    }
                                    ((RelativeLayout) pt1Var5.e).setVisibility(8);
                                }
                                pt1 pt1Var6 = this.j;
                                return (LayoutDirectionLinearLayout) (pt1Var6 != null ? pt1Var6 : null).d;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.dej
    public final void c(hjm hjmVar) {
        super.c(hjmVar);
        p1j p1jVar = this.k;
        if (p1jVar != null) {
            p1jVar.cancel(false);
            this.k = null;
        }
    }

    public final void d(dt1 dt1Var) {
        final byte b = 0;
        byte b2 = 4;
        dt1Var.J(tcj.class, new yjj(this) { // from class: qcj
            public final /* synthetic */ vcj b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                switch (b) {
                    case 0:
                        return new ucj(q5g.d(LayoutInflater.from(viewGroup.getContext()), viewGroup), new ldh(1, this.b, vcj.class, "onShareTargetClicked", "onShareTargetClicked(Lcom/opera/android/share/ShareTarget;)V", 0, (byte) 26));
                    default:
                        q5g q5gVarD = q5g.d(LayoutInflater.from(viewGroup.getContext()), viewGroup);
                        e6g e6gVar = new e6g(0, this.b, vcj.class, "onMoreClicked", "onMoreClicked()V", 0, (byte) 25);
                        scj scjVar = new scj((LayoutDirectionLinearLayout) q5gVarD.b);
                        Context context = ((i) scjVar).itemView.getContext();
                        View view = ((i) scjVar).itemView;
                        view.setOutlineProvider(new tk4(view, (byte) 4));
                        view.setClipToOutline(true);
                        ((TextView) q5gVarD.c).setText(context.getString(2132019807));
                        ((ImageView) q5gVarD.d).setImageDrawable(w8h.u(2131232142, context));
                        ((i) scjVar).itemView.setOnClickListener(new h4i((Object) e6gVar, (byte) 8));
                        return scjVar;
                }
            }
        }, new a3j((byte) 2), new a3j(b2));
        final byte b3 = 1;
        dt1Var.J(rcj.class, new yjj(this) { // from class: qcj
            public final /* synthetic */ vcj b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                switch (b3) {
                    case 0:
                        return new ucj(q5g.d(LayoutInflater.from(viewGroup.getContext()), viewGroup), new ldh(1, this.b, vcj.class, "onShareTargetClicked", "onShareTargetClicked(Lcom/opera/android/share/ShareTarget;)V", 0, (byte) 26));
                    default:
                        q5g q5gVarD = q5g.d(LayoutInflater.from(viewGroup.getContext()), viewGroup);
                        e6g e6gVar = new e6g(0, this.b, vcj.class, "onMoreClicked", "onMoreClicked()V", 0, (byte) 25);
                        scj scjVar = new scj((LayoutDirectionLinearLayout) q5gVarD.b);
                        Context context = ((i) scjVar).itemView.getContext();
                        View view = ((i) scjVar).itemView;
                        view.setOutlineProvider(new tk4(view, (byte) 4));
                        view.setClipToOutline(true);
                        ((TextView) q5gVarD.c).setText(context.getString(2132019807));
                        ((ImageView) q5gVarD.d).setImageDrawable(w8h.u(2131232142, context));
                        ((i) scjVar).itemView.setOnClickListener(new h4i((Object) e6gVar, (byte) 8));
                        return scjVar;
                }
            }
        }, new a3j((byte) 3), new a3j(b2));
    }
}
