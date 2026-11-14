package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.OperaEditText;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.custom_views.swipe_to_refresh.RefreshView;
import com.opera.android.media.PlayerContainerView;
import com.opera.android.settings.speed_dial.SpeedDialShapePreview;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.ScheduleRangeSlider;
import com.opera.android.widget.SelectableRelativeLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class kkf implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kkf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v26, types: [android.view.View, com.opera.android.suggestion.adapter.SuggestionListItem, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r3v59, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i = OperaEditText.r;
                ((OperaEditText) obj).j();
                break;
            case 1:
                ((hcg) obj).H0().d.setImageResource(2131231863);
                break;
            case 2:
                int i2 = PlayerContainerView.k;
                ((PlayerContainerView) obj).a();
                break;
            case 3:
                xzg xzgVar = (xzg) obj;
                xzgVar.k0(((StylingTextView) xzgVar.h.d).getText().toString(), ((qwi) xzgVar.e.f.g()).a);
                break;
            case 4:
                ((f0h) obj).i0();
                break;
            case 5:
                RecyclerView recyclerView = (RecyclerView) ((i0h) obj).e.d;
                recyclerView.y0(recyclerView.m);
                break;
            case 6:
                ProductSuggestionListItem productSuggestionListItem = (ProductSuggestionListItem) obj;
                int[] iArr = ProductSuggestionListItem.u;
                productSuggestionListItem.t();
                pbj pbjVar = productSuggestionListItem.r;
                pbjVar.e.setColor(f03.W(2130969115, view.getContext()).getDefaultColor());
                pbjVar.invalidateSelf();
                break;
            case 7:
                ((shf) obj).Q();
                break;
            case 8:
                alh alhVar = (alh) obj;
                p8i p8iVar = alhVar.k;
                if (p8iVar != null) {
                    p8iVar.a(f03.s(((i) alhVar).itemView.getContext()));
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((wmh) obj).X();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((ymh) obj).X();
                break;
            case 11:
                int i3 = RefreshView.e;
                ((RefreshView) obj).a();
                break;
            case 12:
                ((iji) obj).V();
                break;
            case 13:
                ScheduleRangeSlider scheduleRangeSlider = (ScheduleRangeSlider) obj;
                scheduleRangeSlider.H0(scheduleRangeSlider.h1);
                break;
            case 14:
                zri zriVar = (zri) obj;
                if (zriVar.i) {
                    ?? r3 = zriVar.b;
                    Context context = r3.getContext();
                    Drawable drawableI0 = j14.i0(2131232229, context);
                    drawableI0.setTintList(f03.v(context));
                    r3.z(new mxh(drawableI0));
                    break;
                }
                break;
            case 15:
                awi awiVar = (awi) obj;
                awiVar.L0((bwi) ((ode) awiVar.r.d).g());
                break;
            case 16:
                SelectableRelativeLayout selectableRelativeLayout = (SelectableRelativeLayout) obj;
                int i4 = SelectableRelativeLayout.h;
                selectableRelativeLayout.f = f03.t(2130969315, selectableRelativeLayout.getContext(), 2131101243);
                if (selectableRelativeLayout.e && selectableRelativeLayout.isSelected()) {
                    selectableRelativeLayout.invalidate();
                    break;
                }
                break;
            case 17:
                ((yzi) obj).a0();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                z8j z8jVar = (z8j) obj;
                int i5 = z8j.e;
                z8jVar.d = ColorStateList.valueOf(f03.C(view.getContext()));
                l6j l6jVar = z8jVar.c;
                if (l6jVar != null) {
                    z8jVar.U(l6jVar);
                    break;
                }
                break;
            case 19:
                int i6 = SpeedDialShapePreview.v;
                ((SpeedDialShapePreview) obj).r();
                break;
            case SizeUtil.textSize0 /* 20 */:
                view.setBackgroundTintList(ColorStateList.valueOf(((v8k) ((cu5) obj).f.g()).d(view.getContext())));
                break;
            case 21:
                view.setBackgroundTintList(ColorStateList.valueOf(((v8k) ((m6k) obj).e.g()).d(view.getContext())));
                break;
            case SizeUtil.textSize1 /* 22 */:
                r6k r6kVar = (r6k) obj;
                r6kVar.b0((v6k) ((pde) r6kVar.e.g).g());
                break;
            case 23:
                ((z6k) obj).b0();
                break;
            case SizeUtil.textSize2 /* 24 */:
                vkn vknVar = (vkn) obj;
                zk7 zk7Var = vknVar.d;
                Drawable drawableF = zk7Var.a.f();
                Drawable drawable = zk7Var.c;
                if (drawable != null) {
                    drawable.setVisible(false, false);
                }
                zk7Var.c = drawableF;
                drawableF.setCallback(zk7Var.g);
                zk7Var.c.setVisible(false, false);
                q87 q87Var = vknVar.c;
                Context context2 = q87Var.b;
                q87Var.d = sgb.F(q87Var.c, context2);
                q87Var.f = sgb.F(2131233317, context2);
                zk7 zk7Var2 = (zk7) vknVar.e.b;
                Drawable drawableF2 = zk7Var2.a.f();
                Drawable drawable2 = zk7Var2.c;
                if (drawable2 != null) {
                    drawable2.setVisible(false, false);
                }
                zk7Var2.c = drawableF2;
                drawableF2.setCallback(zk7Var2.g);
                zk7Var2.c.setVisible(false, false);
                zk7 zk7Var3 = (zk7) vknVar.f.b;
                Drawable drawableF3 = zk7Var3.a.f();
                Drawable drawable3 = zk7Var3.c;
                if (drawable3 != null) {
                    drawable3.setVisible(false, false);
                }
                zk7Var3.c = drawableF3;
                drawableF3.setCallback(zk7Var3.g);
                zk7Var3.c.setVisible(false, false);
                vknVar.b.invalidate();
                break;
            case 25:
                boolean zI = f03.I(view.getContext());
                mcj mcjVar = ((y8k) obj).a;
                mcjVar.t(zI);
                mcjVar.r(false);
                break;
            case 26:
                boolean zI2 = f03.I(view.getContext());
                mcj mcjVar2 = ((o9k) obj).d;
                mcjVar2.t(zI2);
                mcjVar2.r(zI2);
                break;
            case 27:
                c1f c1fVar = (c1f) ((ghf) obj).d;
                if (c1fVar != null) {
                    c1fVar.e();
                    break;
                }
                break;
            case 28:
                ((uck) obj).a();
                break;
            default:
                yjk yjkVar = (yjk) obj;
                ate ateVar = yjkVar.c;
                if (ateVar != null) {
                    ?? r32 = (OperaListItem) yjkVar.b.c;
                    r32.z(new mxh(ddh.o(true, r32.getContext(), 0, vtp.K(2131231685, ateVar.a))));
                    break;
                }
                break;
        }
    }
}
