package com.opera.android.premium.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.amk;
import defpackage.h4i;
import defpackage.or2;
import defpackage.qvg;
import defpackage.vlk;
import defpackage.zsk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/premium/ui/view/SubscriptionPlanList;", "Landroid/widget/LinearLayout;", "f8d", "vlk", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubscriptionPlanList extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public final or2 a;
    public vlk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionPlanList(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        LayoutInflater.from(context).inflate(2131559384, this);
        int i2 = 2131363087;
        Object objJ = w1h.j(2131363087, this);
        if (objJ != null) {
            qvg qvgVar = new qvg((PremiumPricingCard) objJ);
            i2 = 2131363546;
            Object objJ2 = w1h.j(2131363546, this);
            if (objJ2 != null) {
                qvg qvgVar2 = new qvg((PremiumPricingCard) objJ2);
                i2 = 2131363980;
                Object objJ3 = w1h.j(2131363980, this);
                if (objJ3 != null) {
                    qvg qvgVar3 = new qvg((PremiumPricingCard) objJ3);
                    i2 = 2131365113;
                    Object objJ4 = w1h.j(2131365113, this);
                    if (objJ4 != null) {
                        this.a = new or2((View) this, (Object) qvgVar, (Object) qvgVar2, (Object) qvgVar3, (Object) new qvg((PremiumPricingCard) objJ4), (byte) 28);
                        ArrayList arrayListC = c();
                        int size = arrayListC.size();
                        while (i < size) {
                            Object obj = arrayListC.get(i);
                            i++;
                            ((PremiumPricingCard) obj).setOnClickListener(new h4i((Object) this, (byte) 16));
                        }
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final amk a() {
        Object obj;
        ArrayList arrayListC = c();
        int size = arrayListC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListC.get(i);
            i++;
            if (((PremiumPricingCard) obj).p) {
                break;
            }
        }
        ConstraintLayout constraintLayout = (PremiumPricingCard) obj;
        Object tag = constraintLayout != null ? constraintLayout.getTag(2131364593) : null;
        if (tag instanceof amk) {
            return (amk) tag;
        }
        return null;
    }

    public final PremiumPricingCard b(String str) {
        Map map = zsk.f;
        boolean zA = Intrinsics.a(str, "");
        or2 or2Var = this.a;
        if (zA) {
            return ((qvg) or2Var.b).a;
        }
        if (Intrinsics.a(str, "premium_6month")) {
            return ((qvg) or2Var.d).a;
        }
        if (Intrinsics.a(str, "premium_3month")) {
            return ((qvg) or2Var.f).a;
        }
        if (Intrinsics.a(str, "premium_monthly")) {
            return ((qvg) or2Var.e).a;
        }
        return null;
    }

    public final ArrayList c() {
        or2 or2Var = this.a;
        List listAsList = Arrays.asList((qvg) or2Var.b, (qvg) or2Var.d, (qvg) or2Var.f, (qvg) or2Var.e);
        ArrayList arrayList = new ArrayList(k95.o(listAsList, 10));
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((qvg) it.next()).a);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, com.opera.android.premium.ui.view.PremiumPricingCard, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.List r20, defpackage.f8d r21) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.premium.ui.view.SubscriptionPlanList.d(java.util.List, f8d):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(PremiumPricingCard premiumPricingCard) {
        if (premiumPricingCard.p) {
            return;
        }
        ArrayList arrayListC = c();
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            ((PremiumPricingCard) obj).setChecked(false);
        }
        premiumPricingCard.setChecked(true);
        vlk vlkVar = this.b;
        if (vlkVar != null) {
            vlkVar.i((amk) premiumPricingCard.getTag(2131364593));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View, com.opera.android.premium.ui.view.PremiumPricingCard] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final boolean f(String str, boolean z) {
        Object obj = null;
        ?? B = str != null ? b(str) : 0;
        if (B != 0 && B.getVisibility() == 0) {
            e(B);
            return true;
        }
        if (z) {
            ArrayList arrayListC = c();
            int size = arrayListC.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj2 = arrayListC.get(i);
                i++;
                if (((PremiumPricingCard) obj2).getVisibility() == 0) {
                    obj = obj2;
                    break;
                }
            }
            PremiumPricingCard premiumPricingCard = (PremiumPricingCard) obj;
            if (premiumPricingCard != null) {
                e(premiumPricingCard);
            }
        }
        return false;
    }
}
