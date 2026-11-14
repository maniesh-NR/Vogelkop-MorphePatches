package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class d21 extends View {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(Context context, pde pdeVar, pde pdeVar2) {
        super(context);
        this.a = (byte) 1;
        this.b = pdeVar2;
        a26.T(pdeVar2, pdeVar, new ks6(this, (byte) 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d21(BrowserActivity browserActivity) {
        super(browserActivity);
        this.a = (byte) 2;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d21(Object obj, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        eyj eyjVar = (eyj) ((pde) this.b).g();
        layoutParams.width = eyjVar.j.e.getWidth();
        layoutParams.height = eyjVar.j.e.getHeight();
    }

    @Override // android.view.View
    public final View getRootView() {
        switch (this.a) {
            case 0:
                return ((i21) this.b).e.getRootView();
            default:
                return super.getRootView();
        }
    }

    @Override // android.view.View
    public final IBinder getWindowToken() {
        switch (this.a) {
            case 0:
                return ((i21) this.b).e.getApplicationWindowToken();
            default:
                return super.getWindowToken();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), (Paint) this.b);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onPointerCaptureChange(boolean z) {
        switch (this.a) {
            case 3:
                super.onPointerCaptureChange(z);
                WindowAndroid windowAndroid = (WindowAndroid) this.b;
                b2b b2bVar = WindowAndroid.B;
                if (!z) {
                    View view = windowAndroid.p;
                    windowAndroid.q(false, true);
                    break;
                } else {
                    windowAndroid.getClass();
                    break;
                }
            default:
                super.onPointerCaptureChange(z);
                break;
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        switch (this.a) {
            case 1:
                super.setLayoutParams(layoutParams);
                a();
                break;
            default:
                super.setLayoutParams(layoutParams);
                break;
        }
    }
}
