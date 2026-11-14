package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.TabCountButton;
import com.opera.android.custom_views.ThemeSelector;
import com.opera.android.privacy_monitor.views.TextCenteredLayout;
import org.chromium.third_party.android.swiperefresh.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class svk implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ svk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r11v25, types: [android.app.Dialog, rzg] */
    /* JADX WARN: Type inference failed for: r11v64, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r12v25, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    @Override // defpackage.r8n
    public final void a(View view) {
        int defaultColor;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                Context context = swipeRefreshLayout.getContext();
                Context context2 = ((cy3) obj).b;
                Resources.Theme theme = context2.getTheme();
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(2130969943, typedValue, true);
                u8n.i(context, theme, typedValue.resourceId);
                int[] iArr = {swipeRefreshLayout.getResources().getColor(new int[]{2131103617}[0])};
                udd uddVar = swipeRefreshLayout.o.b;
                uddVar.j = iArr;
                uddVar.b(0);
                uddVar.b(0);
                swipeRefreshLayout.y = iArr[0];
                swipeRefreshLayout.z = f03.q(swipeRefreshLayout.getContext());
                int iT = f03.t(2130969331, swipeRefreshLayout.getContext(), 2131103616);
                swipeRefreshLayout.j.setBackgroundColor(iT);
                swipeRefreshLayout.o.b.w = iT;
                break;
            case 1:
                hpf hpfVar = (ivg) obj;
                ((dpf) ((vx) ((ivg) hpfVar).c).get()).a(hpfVar);
                break;
            case 2:
                ((fzk) obj).a();
                break;
            case 3:
                ((TabCountButton) obj).f(f03.v(view.getContext()));
                break;
            case 4:
                gal galVar = (gal) obj;
                galVar.c.a.postOnAnimation(new qlk(galVar, (byte) 29));
                break;
            case 5:
                TextCenteredLayout textCenteredLayout = (TextCenteredLayout) obj;
                int i = TextCenteredLayout.b;
                ((ImageView) textCenteredLayout.a.c).setImageDrawable(sgb.F(f03.I(textCenteredLayout.getContext()) ? 2131231870 : 2131231869, textCenteredLayout.getContext()));
                break;
            case 6:
                int i2 = ThemeSelector.f;
                ((ThemeSelector) obj).invalidate();
                break;
            case 7:
                ?? r11 = (rzg) obj;
                View decorView = r11.getWindow().getDecorView();
                switch (r11.g) {
                    case 0:
                        defaultColor = f03.G(view.getContext()).getDefaultColor();
                        break;
                    default:
                        defaultColor = f03.t(2130971175, view.getContext(), 2131101243);
                        break;
                }
                boolean zU0 = p37.u0(defaultColor);
                int systemUiVisibility = decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(zU0 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                break;
            case 8:
                ((p8f) obj).a();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((wyl) obj).H0();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((StylingImageView) ((y83) obj).d).c(f03.u(2130969303, view.getContext(), 2131100356));
                break;
            case 11:
                ((ala) obj).e();
                break;
            case 12:
                ((y5m) obj).X();
                break;
            case 13:
                l6n l6nVar = (l6n) obj;
                ShapeDrawable shapeDrawableE = j14.E(-1, l6nVar.b, f03.t(2130969315, ((i) l6nVar).itemView.getContext(), 2131101243));
                View view2 = ((i) l6nVar).itemView;
                view2.setBackground(l6nVar.U(f03.H(view2.getContext()), shapeDrawableE));
                break;
            case 14:
                m6n m6nVar = (m6n) obj;
                ?? r12 = m6nVar.c;
                Context context3 = r12.getContext();
                r12.setBackground(m6nVar.U(!f03.I(context3), j14.E(-1, m6nVar.b, f03.t(2130969315, context3, 2131101243))));
                r12.c(ColorStateList.valueOf(f03.t(2130969279, context3, 2131101243)));
                r12.setForeground(null);
                break;
            case 15:
                u6n u6nVar = (u6n) obj;
                aln alnVar = u6nVar.f;
                if (alnVar != null) {
                    u6nVar.U(alnVar);
                    break;
                }
                break;
            case 16:
                v6n v6nVar = (v6n) obj;
                View view3 = ((i) v6nVar).itemView;
                view3.setBackground(sgb.F(2131231207, view3.getContext()));
                View view4 = ((i) v6nVar).itemView;
                view4.setForeground(xgh.i((ShapeDrawable) null, ColorStateList.valueOf(f03.t(2130970279, view4.getContext(), 2131101243)), v6nVar.b));
                break;
            case 17:
                x6n x6nVar = (x6n) obj;
                ShapeDrawable shapeDrawableE2 = j14.E(-1, x6nVar.b, f03.t(2130969315, ((i) x6nVar).itemView.getContext(), 2131101243));
                View view5 = ((i) x6nVar).itemView;
                view5.setBackground(x6nVar.U(f03.H(view5.getContext()), shapeDrawableE2));
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                pyl pylVar = (pyl) obj;
                aln alnVar2 = (aln) pylVar.c;
                if (alnVar2 != null && alnVar2.a()) {
                    pyl.i(((View) pylVar.d).getContext(), alnVar2, (View) pylVar.d, (agm) pylVar.e, pylVar.b, ((tjn) pylVar.f).a());
                    break;
                }
                break;
            case 19:
                c7n c7nVar = (c7n) obj;
                p8i p8iVar = c7nVar.s;
                if (p8iVar != null) {
                    p8iVar.a(f03.s(((i) c7nVar).itemView.getContext()));
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                ?? r112 = (StylingImageView) ((pbn) obj).b.d;
                r112.c(ColorStateList.valueOf(f03.q(r112.getContext())));
                break;
            case 21:
                g3b g3bVar = (g3b) obj;
                StylingImageView stylingImageView = ((owc) ((q5g) g3bVar.u).d).c;
                Context context4 = view.getContext();
                fdn fdnVar = (fdn) g3bVar.s;
                stylingImageView.setImageDrawable(ddh.o(true, context4, fdnVar.h, fdnVar.i));
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((i9c) obj).a();
                break;
            case 23:
                ((bdn) obj).c();
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((cgn) obj).N0();
                break;
            case 25:
                qkn qknVar = ((nkn) obj).B;
                if (qknVar != null) {
                    zk7 zk7Var = qknVar.k;
                    Drawable drawableF = zk7Var.a.f();
                    Drawable drawable = zk7Var.c;
                    if (drawable != null) {
                        drawable.setVisible(false, false);
                    }
                    zk7Var.c = drawableF;
                    drawableF.setCallback(zk7Var.g);
                    zk7Var.c.setVisible(false, false);
                    q87 q87Var = qknVar.l;
                    Context context5 = q87Var.b;
                    q87Var.d = sgb.F(q87Var.c, context5);
                    q87Var.f = sgb.F(2131233317, context5);
                    qknVar.f.invalidate();
                    break;
                }
                break;
            case 26:
                qkn qknVar2 = ((ukn) obj).D;
                if (qknVar2 != null) {
                    zk7 zk7Var2 = qknVar2.k;
                    Drawable drawableF2 = zk7Var2.a.f();
                    Drawable drawable2 = zk7Var2.c;
                    if (drawable2 != null) {
                        drawable2.setVisible(false, false);
                    }
                    zk7Var2.c = drawableF2;
                    drawableF2.setCallback(zk7Var2.g);
                    zk7Var2.c.setVisible(false, false);
                    q87 q87Var2 = qknVar2.l;
                    Context context6 = q87Var2.b;
                    q87Var2.d = sgb.F(q87Var2.c, context6);
                    q87Var2.f = sgb.F(2131233317, context6);
                    qknVar2.f.invalidate();
                    break;
                }
                break;
            case 27:
                qkn qknVar3 = ((tln) obj).B;
                if (qknVar3 != null) {
                    zk7 zk7Var3 = qknVar3.k;
                    Drawable drawableF3 = zk7Var3.a.f();
                    Drawable drawable3 = zk7Var3.c;
                    if (drawable3 != null) {
                        drawable3.setVisible(false, false);
                    }
                    zk7Var3.c = drawableF3;
                    drawableF3.setCallback(zk7Var3.g);
                    zk7Var3.c.setVisible(false, false);
                    q87 q87Var3 = qknVar3.l;
                    Context context7 = q87Var3.b;
                    q87Var3.d = sgb.F(q87Var3.c, context7);
                    q87Var3.f = sgb.F(2131233317, context7);
                    qknVar3.f.invalidate();
                    break;
                }
                break;
            case 28:
                vkn vknVar = ((bmn) obj).f;
                if (vknVar != null) {
                    zk7 zk7Var4 = vknVar.d;
                    Drawable drawableF4 = zk7Var4.a.f();
                    Drawable drawable4 = zk7Var4.c;
                    if (drawable4 != null) {
                        drawable4.setVisible(false, false);
                    }
                    zk7Var4.c = drawableF4;
                    drawableF4.setCallback(zk7Var4.g);
                    zk7Var4.c.setVisible(false, false);
                    q87 q87Var4 = vknVar.c;
                    Context context8 = q87Var4.b;
                    q87Var4.d = sgb.F(q87Var4.c, context8);
                    q87Var4.f = sgb.F(2131233317, context8);
                    zk7 zk7Var5 = (zk7) vknVar.e.b;
                    Drawable drawableF5 = zk7Var5.a.f();
                    Drawable drawable5 = zk7Var5.c;
                    if (drawable5 != null) {
                        drawable5.setVisible(false, false);
                    }
                    zk7Var5.c = drawableF5;
                    drawableF5.setCallback(zk7Var5.g);
                    zk7Var5.c.setVisible(false, false);
                    zk7 zk7Var6 = (zk7) vknVar.f.b;
                    Drawable drawableF6 = zk7Var6.a.f();
                    Drawable drawable6 = zk7Var6.c;
                    if (drawable6 != null) {
                        drawable6.setVisible(false, false);
                    }
                    zk7Var6.c = drawableF6;
                    drawableF6.setCallback(zk7Var6.g);
                    zk7Var6.c.setVisible(false, false);
                    vknVar.b.invalidate();
                    break;
                }
                break;
            default:
                iuh iuhVar = (iuh) ((zg) obj).c;
                if (iuhVar != null) {
                    ((RecyclerView) iuhVar.b).invalidate();
                    break;
                }
                break;
        }
    }
}
