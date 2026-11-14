package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class y46 extends FrameLayout {
    public final /* synthetic */ byte a = 2;
    public Object b;
    public Object c;

    public /* synthetic */ y46(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public y46(Context context, hcb hcbVar, hcb hcbVar2) {
        super(context);
        this.b = hcbVar;
        this.c = hcbVar2;
        setClickable(true);
        setFocusable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y46(com.google.android.libraries.ads.mobile.sdk.common.AdActivity r10, java.lang.String r11, ads_mobile_sdk.yu r12) throws android.content.res.Resources.NotFoundException {
        /*
            r9 = this;
            r0 = 3
            r9.a = r0
            int r0 = r12.a
            r9.<init>(r10)
            android.widget.ImageButton r1 = new android.widget.ImageButton
            r1.<init>(r10)
            r9.c = r1
            android.content.res.Resources r1 = r10.getResources()
            r2 = 0
            java.lang.String r3 = "white"
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r11, r3)     // Catch: android.content.res.Resources.NotFoundException -> L34
            if (r3 == 0) goto L24
            r11 = 2131231168(0x7f0801c0, float:1.807841E38)
            android.graphics.drawable.Drawable r11 = r1.getDrawable(r11, r2)     // Catch: android.content.res.Resources.NotFoundException -> L34
            goto L33
        L24:
            java.lang.String r3 = "black"
            boolean r11 = kotlin.jvm.internal.Intrinsics.a(r11, r3)     // Catch: android.content.res.Resources.NotFoundException -> L34
            if (r11 == 0) goto L34
            r11 = 2131231167(0x7f0801bf, float:1.8078407E38)
            android.graphics.drawable.Drawable r11 = r1.getDrawable(r11, r2)     // Catch: android.content.res.Resources.NotFoundException -> L34
        L33:
            r2 = r11
        L34:
            java.lang.Object r11 = r9.c
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            if (r2 != 0) goto L41
            r1 = 17301527(0x1080017, float:2.497932E-38)
            r11.setImageResource(r1)
            goto L4d
        L41:
            r11.setImageDrawable(r2)
            java.lang.Object r11 = r9.c
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r11.setScaleType(r1)
        L4d:
            java.lang.Object r11 = r9.c
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            r1 = 0
            r11.setBackgroundColor(r1)
            java.lang.Object r11 = r9.c
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            int r2 = r12.c
            int r12 = r12.b
            float r3 = (float) r0
            android.content.res.Resources r4 = r10.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r5 = 1
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r4)
            int r3 = (int) r3
            android.content.res.Resources r4 = r10.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r6 = 0
            float r4 = android.util.TypedValue.applyDimension(r5, r6, r4)
            int r4 = (int) r4
            float r6 = (float) r12
            android.content.res.Resources r7 = r10.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r6 = android.util.TypedValue.applyDimension(r5, r6, r7)
            int r6 = (int) r6
            float r7 = (float) r2
            android.content.res.Resources r8 = r10.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r5, r7, r8)
            int r7 = (int) r7
            r11.setPadding(r3, r4, r6, r7)
            java.lang.Object r11 = r9.c
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            java.lang.String r3 = "Fullscreen ad close button"
            r11.setContentDescription(r3)
            mlp r11 = new mlp
            r11.<init>(r9)
            r9.setOnClickListener(r11)
            java.lang.Object r11 = r9.c
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            mlp r1 = new mlp
            r1.<init>(r9)
            r11.setOnClickListener(r1)
            java.lang.Object r11 = r9.c
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r0 = r0 + 50
            int r0 = r0 + r12
            float r12 = (float) r0
            android.content.res.Resources r0 = r10.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r12 = android.util.TypedValue.applyDimension(r5, r12, r0)
            int r12 = (int) r12
            int r2 = r2 + 50
            float r0 = (float) r2
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = android.util.TypedValue.applyDimension(r5, r0, r10)
            int r10 = (int) r10
            r1.<init>(r12, r10)
            r9.addView(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y46.<init>(com.google.android.libraries.ads.mobile.sdk.common.AdActivity, java.lang.String, ads_mobile_sdk.yu):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y46(z46 z46Var, Context context) {
        super(context);
        this.c = z46Var;
        tni tniVar = new tni();
        this.b = tniVar;
        tniVar.a(z46Var);
        setVisibility(4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        int i;
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                super.onConfigurationChanged(configuration);
                ((tni) this.b).b(configuration);
                ViewGroup viewGroup = (ViewGroup) ((z46) this.c).findViewById(2131362514);
                if (viewGroup != null) {
                    int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(2131165349);
                    WeakHashMap weakHashMap = r5n.a;
                    g3o g3oVarA = i5n.a(viewGroup);
                    if (g3oVarA != null) {
                        r9b r9bVarI = g3oVarA.a.i(647);
                        i = r9bVarI.a;
                        i3 = r9bVarI.c;
                        i2 = r9bVarI.d;
                    } else {
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                    }
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = i + dimensionPixelSize;
                        marginLayoutParams.rightMargin = dimensionPixelSize + i3;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    p37.p0(i2, viewGroup);
                    break;
                }
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                hcb hcbVar = (hcb) this.b;
                if (hcbVar != null) {
                    i = View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(hcbVar.getAsInt(), i), 1073741824);
                }
                hcb hcbVar2 = (hcb) this.c;
                if (hcbVar2 != null) {
                    i2 = View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(hcbVar2.getAsInt(), i2), 1073741824);
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 0:
                super.onWindowFocusChanged(z);
                if (z) {
                    ((tni) this.b).b(getResources().getConfiguration());
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }
}
