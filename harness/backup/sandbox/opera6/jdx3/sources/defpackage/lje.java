package defpackage;

import android.view.View;
import com.opera.android.StatusBarDrawingFrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class lje implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StatusBarDrawingFrameLayout b;

    public /* synthetic */ lje(StatusBarDrawingFrameLayout statusBarDrawingFrameLayout, byte b) {
        this.a = b;
        this.b = statusBarDrawingFrameLayout;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = this.b;
        switch (b) {
            case 0:
                int iT = f03.t(2130969496, view.getContext(), 2131101243);
                if (iT != statusBarDrawingFrameLayout.k) {
                    statusBarDrawingFrameLayout.k = iT;
                    statusBarDrawingFrameLayout.b();
                    break;
                }
                break;
            default:
                statusBarDrawingFrameLayout.e(f03.t(2130969304, statusBarDrawingFrameLayout.getContext(), 2131103876));
                break;
        }
    }
}
