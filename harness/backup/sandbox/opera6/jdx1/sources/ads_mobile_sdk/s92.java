package ads_mobile_sdk;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import defpackage.p8n;

/* loaded from: classes.dex */
public final class s92 extends p8n {
    public final /* synthetic */ w92 a;
    public final /* synthetic */ td1 b;

    public s92(w92 w92Var, td1 td1Var) {
        this.a = w92Var;
        this.b = td1Var;
    }

    @Override // defpackage.p8n
    public final void a(AdActivity adActivity, LinearLayout linearLayout) {
        FrameLayout frameLayout = new FrameLayout(adActivity);
        frameLayout.setTag("layout");
        frameLayout.setBackgroundColor(-1);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        w92 w92Var = this.a;
        String str = w92Var.l;
        layoutParams.gravity = str.equals("TOP") ? 49 : str.equals("BOTTOM") ? 81 : 17;
        int i = w92Var.o;
        if (i > 0) {
            layoutParams.width = (int) TypedValue.applyDimension(1, i, adActivity.getResources().getDisplayMetrics());
        }
        View view = this.b.m;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        frameLayout.addView(view, layoutParams);
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(frameLayout);
    }

    @Override // defpackage.o5p
    public final void onDestroy() {
        this.b.destroy();
    }
}
