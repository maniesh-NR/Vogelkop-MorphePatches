package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.opera.android.OperaApplication;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y4k implements e8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y4k(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(float f, int i, int i2) {
    }

    public final void d(int i) {
        xw8 xw8Var;
        bx8 bx8Var = ((c5k) this.b).A;
        if (i < 0 || i >= bx8Var.a.size() || (xw8Var = ((zw8) bx8Var.a.get(i)).b) == null) {
            return;
        }
        xw8Var.h.c.d();
    }

    public final void onPageScrollStateChanged(int i) {
        byte b = this.a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                d(i - 1);
                d(i);
                d(i + 1);
                c5k c5kVar = (c5k) this.b;
                kue kueVar = c5kVar.t;
                if (cs5.W(c5kVar.B)) {
                    f = -f;
                }
                ?? r0 = kueVar.b;
                r0.K0 = i;
                r0.L0 = f;
                r0.invalidate();
                break;
        }
    }

    public final void onPageSelected(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c5k c5kVar = (c5k) obj;
                bx8 bx8Var = c5kVar.A;
                if (bx8Var.u != i) {
                    xw8 xw8Var = ((zw8) bx8Var.a.get(i)).b;
                    if (xw8Var != null) {
                        String strA = xw8Var.b.a();
                        fp1 fp1Var = c5kVar.b;
                        String[] strArr = OperaApplication.K;
                        fue fueVarZ = ((OperaApplication) fp1Var.getApplication()).z();
                        fueVarZ.d();
                        cue cueVar = fueVarZ.a;
                        nv6 nv6VarB = c5kVar.X.b();
                        SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                        editor.putString("startpage.feed_category_id", strA);
                        editor.putInt("startpage.feed_category_backend", cueVar.a);
                        nv6VarB.w();
                    }
                    int i2 = 0;
                    if (bx8Var.u < bx8Var.a.size()) {
                        bx8Var.b(bx8Var.u, false);
                    }
                    bx8Var.u = i;
                    bx8Var.b(i, true);
                    ArrayList arrayList = bx8Var.a;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        xw8 xw8Var2 = ((zw8) obj2).b;
                        if (xw8Var2 != null && xw8.class.isAssignableFrom(xw8.class)) {
                            xw8Var2.h.c.d();
                        }
                    }
                    c5kVar.t.b(i, !c5kVar.Z);
                    ac8.a(new ir5());
                    break;
                }
                break;
            default:
                ifm ifmVar = (ifm) obj;
                View viewFindViewWithTag = ifmVar.h().findViewWithTag("page_" + i);
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.requestFocus();
                }
                ifmVar.w = Integer.valueOf(i);
                kfm kfmVar = ifmVar.x;
                if (kfmVar != null) {
                    kfmVar.r = i;
                    break;
                }
                break;
        }
    }
}
