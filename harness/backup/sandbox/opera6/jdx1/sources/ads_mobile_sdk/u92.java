package ads_mobile_sdk;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import defpackage.bwg;
import defpackage.jso;
import defpackage.l43;
import defpackage.mkh;
import defpackage.tso;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class u92 {
    public final Context a;
    public final ax0 b;
    public final g0 c;
    public final d91 d;
    public final ab0 e;
    public final ab0 f;
    public final ab0 g;
    public final ab0 h;
    public final ab0 i;
    public final pfe j = new pfe();
    public final LinkedHashMap k = new LinkedHashMap();

    public u92(Context context, ax0 ax0Var, g0 g0Var, d91 d91Var, ab0 ab0Var, ab0 ab0Var2, ab0 ab0Var3, ab0 ab0Var4, ab0 ab0Var5) {
        this.a = context;
        this.b = ax0Var;
        this.c = g0Var;
        this.d = d91Var;
        this.e = ab0Var;
        this.f = ab0Var2;
        this.g = ab0Var3;
        this.h = ab0Var4;
        this.i = ab0Var5;
    }

    public static final TextView a(u92 u92Var, AdActivity adActivity, String str, String str2) {
        TextView textView = new TextView(adActivity);
        textView.setTag(str2);
        textView.setText(str);
        textView.setTextAppearance(R.style.TextAppearance.Small);
        textView.setTextColor(-9210245);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 0.0f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        if (ads_mobile_sdk.d91.d(r10, r0) != r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.u92 r10, ads_mobile_sdk.w92 r11, mt5 r12) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.u92.a(ads_mobile_sdk.u92, ads_mobile_sdk.w92, mt5):java.lang.Object");
    }

    public static void a(defpackage.hp hpVar, l43 l43Var) {
        Iterator it = hpVar.e.iterator();
        while (it.hasNext()) {
            l43Var.f.add((String) it.next());
        }
        l43Var.e = hpVar.d.deepCopy();
        for (Map.Entry entry : hpVar.c.entrySet()) {
            l43Var.d.put((String) entry.getKey(), (String) entry.getValue());
        }
        String str = hpVar.b;
        if (str != null) {
        }
        l43Var.d(hpVar.f);
        String str2 = hpVar.h;
        if (str2 != null) {
            l43Var.i = str2;
        }
        Iterator it2 = hpVar.a.iterator();
        while (it2.hasNext()) {
            l43Var.b.add((String) it2.next());
        }
    }

    public static final TextView b(u92 u92Var, AdActivity adActivity, String str, String str2) {
        TextView textView = new TextView(adActivity);
        textView.setTag(str2);
        textView.setText(str);
        textView.setTextAppearance(R.style.TextAppearance.Medium);
        textView.setTextColor(-16777216);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    public final Object a(w92 w92Var, mt5 mt5Var) throws m2 {
        av2 av2Var = w92Var.b;
        defpackage.hp hpVar = w92Var.d;
        if (hpVar == null) {
            hpVar = new defpackage.hp(w92Var.a, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null);
        }
        ee0 ee0Var = (ee0) this.i.get();
        ee0Var.d = av2Var;
        ee0Var.b = hpVar;
        ee0Var.c = hpVar;
        ee0Var.e = Boolean.TRUE;
        ee0Var.f = Boolean.FALSE;
        bwg.f(ee0Var.d, av2.class);
        bwg.f((Boolean) ee0Var.e, Boolean.class);
        bwg.f((Boolean) ee0Var.f, Boolean.class);
        sb0 sb0Var = (sb0) ee0Var.a;
        defpackage.hp hpVar2 = (defpackage.hp) ee0Var.b;
        defpackage.hp hpVar3 = (defpackage.hp) ee0Var.c;
        av2 av2Var2 = ee0Var.d;
        Boolean bool = (Boolean) ee0Var.e;
        Boolean bool2 = (Boolean) ee0Var.f;
        fe0 fe0Var = new fe0((byte) 0);
        ob1 ob1Var = jso.a;
        fe0Var.b = new nj0(new a3(ob1Var, ob1Var, ob1Var));
        fe0Var.c = new nj0(new b(sb0Var.v0, (byte) 28));
        fe0Var.d = ob1.a(av2Var2);
        fe0Var.e = ob1.a(bool2);
        fe0Var.f = new n90(ob1.a(hpVar3));
        fe0Var.g = new nj0(new np(sb0Var.g1, fe0Var.d, fe0Var.f, fe0Var.c, ob1.a(bool), sb0Var.h));
        ob1 ob1VarA = ob1.a(hpVar2);
        nj0 nj0Var = new nj0(mkh.j);
        ah0 ah0Var = sb0Var.u;
        fe0Var.i = new nj0(new gq2(sb0Var.a3, ah0Var, fe0Var.b, sb0Var.t, sb0Var.G, fe0Var.c, fe0Var.d, sb0Var.d, fe0Var.e, fe0Var.g, ob1VarA, sb0Var.f3, new nj0(new dw(ah0Var, (tso) nj0Var, (byte) 1)), (byte) 0));
        Object objA = a(fe0Var, w92Var, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (ads_mobile_sdk.d91.d(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.klp r10, ads_mobile_sdk.w92 r11, mt5 r12) throws m2 {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.u92.a(klp, ads_mobile_sdk.w92, mt5):java.lang.Object");
    }
}
