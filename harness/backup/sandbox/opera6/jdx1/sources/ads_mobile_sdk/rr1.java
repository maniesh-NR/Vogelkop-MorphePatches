package ads_mobile_sdk;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import defpackage.cek;
import defpackage.kap;
import defpackage.tx6;
import java.util.Optional;

/* loaded from: classes.dex */
public final class rr1 {
    public final bq1 a;
    public final nx5 b;
    public final nx5 c;
    public final js1 d;
    public final g0 e;
    public final kap f;
    public final sy0 g;
    public final cy0 h;
    public final pfe i;
    public PopupWindow j;
    public ImageView k;
    public ViewGroup.LayoutParams l;
    public cr3 m;
    public ViewGroup n;

    public rr1(bq1 bq1Var, nx5 nx5Var, nx5 nx5Var2, js1 js1Var, Optional optional, g0 g0Var, kap kapVar) {
        this.a = bq1Var;
        this.b = nx5Var;
        this.c = nx5Var2;
        this.d = js1Var;
        this.e = g0Var;
        this.f = kapVar;
        sy0 sy0Var = (sy0) optional.orElse(null);
        this.g = sy0Var;
        this.h = sy0Var != null ? sy0Var.a : null;
        this.i = new pfe();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.rr1 r25, java.util.Map r26, nt5 r27) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(ads_mobile_sdk.rr1, java.util.Map, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.rr1 r9, boolean r10, nt5 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(ads_mobile_sdk.rr1, boolean, nt5):java.lang.Object");
    }

    public final PopupWindow a(ev2 ev2Var, Activity activity, cy0 cy0Var) {
        String string;
        int iApplyDimension = (int) TypedValue.applyDimension(1, ev2Var.a, activity.getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, ev2Var.b, activity.getResources().getDisplayMetrics());
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(iApplyDimension, iApplyDimension2));
        relativeLayout.addView(this.g, -1, -1);
        cy0Var.a(new cr3(br3.b, iApplyDimension, iApplyDimension2, 8));
        LinearLayout linearLayout = new LinearLayout(activity);
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, 50.0f, activity.getResources().getDisplayMetrics());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iApplyDimension3, iApplyDimension3);
        csh cshVar = ev2Var.f.a;
        int i = cshVar.d;
        int i2 = 0;
        while (i2 < i) {
            Object obj = cshVar.get(i2);
            i2++;
            layoutParams.addRule(((Number) obj).intValue());
        }
        linearLayout.setOnClickListener(new pkm(this, (byte) 22));
        Resources resources = activity.getResources();
        if (resources == null || (string = resources.getString(2132018253)) == null) {
            string = "Close button";
        }
        linearLayout.setContentDescription(string);
        relativeLayout.addView(linearLayout, layoutParams);
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, iApplyDimension, iApplyDimension2, false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setTouchable(true);
        popupWindow.setClippingEnabled(!ev2Var.e);
        return popupWindow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:(1:(1:(7:13|101|14|54|84|85|86)(2:16|17))(9:18|107|19|20|105|48|(1:50)|(5:53|54|84|85|86)|52))(1:25))(3:26|(1:28)|52)|98|29|(5:31|99|32|33|(4:36|84|85|86)(1:37))|38|(1:40)|41|96|42|43|103|44|45|(5:47|105|48|(0)|(0))|52) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(2:4|(1:6)(1:7))(0)|8|94|(1:(1:(1:(7:13|101|14|54|84|85|86)(2:16|17))(9:18|107|19|20|105|48|(1:50)|(5:53|54|84|85|86)|52))(1:25))(3:26|(1:28)|52)|98|29|(5:31|99|32|33|(4:36|84|85|86)(1:37))|38|(1:40)|41|96|42|43|103|44|45|(5:47|105|48|(0)|(0))|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c9, code lost:
    
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cd, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0 A[Catch: all -> 0x01c1, Exception -> 0x01c3, TRY_LEAVE, TryCatch #10 {Exception -> 0x01c3, all -> 0x01c1, blocks: (B:48:0x0188, B:50:0x01b0), top: B:105:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:14:0x0042, B:54:0x01b7, B:84:0x0209, B:69:0x01ce, B:71:0x01e9, B:74:0x01ef, B:75:0x01f2, B:77:0x01f6, B:78:0x01fb, B:80:0x01ff, B:81:0x0202, B:83:0x0206), top: B:94:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ef A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:14:0x0042, B:54:0x01b7, B:84:0x0209, B:69:0x01ce, B:71:0x01e9, B:74:0x01ef, B:75:0x01f2, B:77:0x01f6, B:78:0x01fb, B:80:0x01ff, B:81:0x0202, B:83:0x0206), top: B:94:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:14:0x0042, B:54:0x01b7, B:84:0x0209, B:69:0x01ce, B:71:0x01e9, B:74:0x01ef, B:75:0x01f2, B:77:0x01f6, B:78:0x01fb, B:80:0x01ff, B:81:0x0202, B:83:0x0206), top: B:94:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:14:0x0042, B:54:0x01b7, B:84:0x0209, B:69:0x01ce, B:71:0x01e9, B:74:0x01ef, B:75:0x01f2, B:77:0x01f6, B:78:0x01fb, B:80:0x01ff, B:81:0x0202, B:83:0x0206), top: B:94:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0206 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:14:0x0042, B:54:0x01b7, B:84:0x0209, B:69:0x01ce, B:71:0x01e9, B:74:0x01ef, B:75:0x01f2, B:77:0x01f6, B:78:0x01fb, B:80:0x01ff, B:81:0x0202, B:83:0x0206), top: B:94:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ViewGroup r17, ads_mobile_sdk.ev2 r18, android.app.Activity r19, android.view.Window r20, ads_mobile_sdk.cy0 r21, ads_mobile_sdk.sy0 r22, nt5 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(android.view.ViewGroup, ads_mobile_sdk.ev2, android.app.Activity, android.view.Window, ads_mobile_sdk.cy0, ads_mobile_sdk.sy0, nt5):java.lang.Object");
    }

    public final void a(cy0 cy0Var, String str) {
        defpackage.na2.B(this.b, null, null, new cek((Object) str, (Object) this, (Object) cy0Var, (mt5) null, (byte) 19), 3);
    }

    public final void a(boolean z) {
        defpackage.na2.B(this.b, null, null, new tx6(this, z, null, (byte) 3), 3);
    }
}
