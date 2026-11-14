package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.custom_views.AnchoringViewGroup;
import com.opera.android.view.ConfigurationChangeFrameLayout;

/* loaded from: classes.dex */
public final class tzg extends zp1 {
    public final /* synthetic */ bp g;
    public final /* synthetic */ xzg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzg(xzg xzgVar, Context context, bp bpVar) {
        super(context, 2132083419);
        this.g = bpVar;
        this.h = xzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(2131559240, (ViewGroup) null, false);
        int i = 2131362409;
        View viewJ = w1h.j(2131362409, viewInflate);
        if (viewJ != null) {
            ei eiVarA = ei.a(viewJ);
            ConfigurationChangeFrameLayout configurationChangeFrameLayout = (ConfigurationChangeFrameLayout) w1h.j(2131362521, viewInflate);
            if (configurationChangeFrameLayout != null) {
                AnchoringViewGroup anchoringViewGroup = (AnchoringViewGroup) viewInflate;
                xzg xzgVar = this.h;
                xzgVar.g = configurationChangeFrameLayout;
                xzgVar.h = eiVarA;
                setContentView(anchoringViewGroup);
                getWindow().setLayout(-1, -1);
                getWindow().addFlags(-2013265920);
                getWindow().clearFlags(67108864);
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
                setCanceledOnTouchOutside(true);
                anchoringViewGroup.setOnClickListener(new zvd(this, (byte) 23));
                j21 j21Var = anchoringViewGroup.d;
                bp bpVar = anchoringViewGroup.e;
                if (bpVar != null) {
                    ((OmniButtonView) bpVar.b).getViewTreeObserver().removeOnGlobalLayoutListener(j21Var);
                }
                bp bpVar2 = this.g;
                anchoringViewGroup.e = bpVar2;
                ((OmniButtonView) bpVar2.b).getViewTreeObserver().addOnGlobalLayoutListener(j21Var);
                anchoringViewGroup.requestLayout();
                Window window = getWindow();
                if (window != null) {
                    p8f.w(window);
                }
                Window window2 = getWindow();
                if (window2 != null) {
                    q9n.g(window2.getDecorView(), new tu4(window2, (byte) 3));
                }
                xzgVar.i0();
                return;
            }
            i = 2131362521;
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
