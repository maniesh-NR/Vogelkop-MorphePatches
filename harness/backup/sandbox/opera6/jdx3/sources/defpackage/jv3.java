package defpackage;

import android.app.Application;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.webaiassistant.WebAiAssistantLayoutSwitcher;
import com.opera.android.webaiassistant.WebAiAssistantSheetContentWrapper;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.MeasurableHeightScrollView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jv3 extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ BrowserActivity f;

    public /* synthetic */ jv3(BrowserActivity browserActivity, byte b) {
        this.e = b;
        this.f = browserActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        byte b2 = 1;
        BrowserActivity browserActivity = this.f;
        switch (b) {
            case 0:
                return new zw0(yne.b, new gv3(browserActivity, b2));
            case 1:
                j4c j4cVar = browserActivity.C0;
                k6l k6lVar = browserActivity.V;
                return new ex0(browserActivity, j4cVar, k6lVar != null ? k6lVar : null);
            case 2:
                String[] strArr = OperaApplication.K;
                xd5 xd5Var = this.f;
                Application application = xd5Var.getApplication();
                tw3 tw3Var = xd5Var.y;
                OperaApplication operaApplication = (OperaApplication) application;
                View viewFindViewById = xd5Var.findViewById(2131362000);
                int i = 2131361931;
                if (((StylingImageButton) w1h.j(2131361931, viewFindViewById)) != null) {
                    i = 2131362001;
                    WebAiAssistantSheetContentWrapper webAiAssistantSheetContentWrapper = (WebAiAssistantSheetContentWrapper) w1h.j(2131362001, viewFindViewById);
                    if (webAiAssistantSheetContentWrapper != null) {
                        i = 2131362002;
                        MeasurableHeightScrollView measurableHeightScrollView = (MeasurableHeightScrollView) w1h.j(2131362002, viewFindViewById);
                        if (measurableHeightScrollView != null) {
                            VelocityTrackingCoordinatorLayout velocityTrackingCoordinatorLayout = (VelocityTrackingCoordinatorLayout) viewFindViewById;
                            i = 2131362004;
                            ConstraintLayout constraintLayoutJ = w1h.j(2131362004, viewFindViewById);
                            if (constraintLayoutJ != null) {
                                i = 2131362351;
                                if (((StylingImageButton) w1h.j(2131362351, viewFindViewById)) != null) {
                                    i = 2131363011;
                                    View viewJ = w1h.j(2131363011, viewFindViewById);
                                    if (viewJ != null) {
                                        rvg rvgVarA = rvg.a(viewJ);
                                        i = 2131363313;
                                        WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = (WebAiAssistantLayoutSwitcher) w1h.j(2131363313, viewFindViewById);
                                        if (webAiAssistantLayoutSwitcher != null) {
                                            i = 2131363667;
                                            if (((StylingImageButton) w1h.j(2131363667, viewFindViewById)) != null) {
                                                i = 2131364742;
                                                View viewJ2 = w1h.j(2131364742, viewFindViewById);
                                                if (viewJ2 != null) {
                                                    i = 2131365082;
                                                    FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) w1h.j(2131365082, viewFindViewById);
                                                    if (fastResizeWebViewContainer != null) {
                                                        ei eiVar = new ei(velocityTrackingCoordinatorLayout, webAiAssistantSheetContentWrapper, measurableHeightScrollView, constraintLayoutJ, rvgVarA, webAiAssistantLayoutSwitcher, viewJ2, fastResizeWebViewContainer);
                                                        k6l k6lVar2 = xd5Var.V;
                                                        k6l k6lVar3 = k6lVar2 != null ? k6lVar2 : null;
                                                        tcc lifecycle = xd5Var.getLifecycle();
                                                        dll dllVar = xd5Var.a;
                                                        zv3 zv3Var = tw3Var.r0;
                                                        zv3 zv3Var2 = tw3Var.e;
                                                        gv3 gv3Var = new gv3(xd5Var, (byte) 2);
                                                        gv3 gv3Var2 = new gv3(xd5Var, (byte) 3);
                                                        gv3 gv3Var3 = new gv3(xd5Var, (byte) 4);
                                                        ji jiVar = new ji(operaApplication, (byte) 16);
                                                        zv3 zv3Var3 = tw3Var.c0;
                                                        tw3Var.a.e();
                                                        fx3 fx3Var = tw3Var.a.q;
                                                        wv1 wv1Var = new wv1(new li(operaApplication, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 20), (byte) 1);
                                                        j4c j4cVarE = operaApplication.e();
                                                        rw3 rw3Var = tw3Var.f0;
                                                        gv3 gv3Var4 = new gv3(xd5Var, (byte) 5);
                                                        gjm gjmVarP0 = xd5Var.P0();
                                                        hw3 hw3Var = tw3Var.t0;
                                                        y22 y22Var = (y22) tw3Var.u0.get();
                                                        ji jiVar2 = new ji(operaApplication, (byte) 17);
                                                        j4c j4cVar2 = tw3Var.h;
                                                        qim qimVar = xd5Var.o;
                                                        Objects.requireNonNull(qimVar);
                                                        return new t42(xd5Var, eiVar, k6lVar3, lifecycle, dllVar, zv3Var, zv3Var2, gv3Var, gv3Var2, gv3Var3, jiVar, zv3Var3, fx3Var, wv1Var, j4cVarE, rw3Var, gv3Var4, gjmVarP0, y22Var, jiVar2, j4cVar2, qimVar, operaApplication.B());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i)));
                return null;
            case 3:
                return ((jt3) browserActivity.y.r.get()).f;
            default:
                return (e7k) browserActivity.y.G0.get();
        }
    }
}
