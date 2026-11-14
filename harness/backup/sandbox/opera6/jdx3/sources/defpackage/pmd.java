package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.fragment.app.r;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;

/* loaded from: classes.dex */
public class pmd extends omd {
    public final yg8 d;
    public final qmd e;
    public boolean f;

    public pmd() {
        Handler handler = new Handler();
        this.d = new yg8();
        handler.post(new vl9(this, (byte) 12));
    }

    public pmd(qmd qmdVar) {
        new Handler();
        this.d = new yg8();
        this.e = qmdVar;
    }

    public final nmd h0(Context context) {
        nmd co4Var = new co4(this, context, getTheme(), (byte) 1);
        co4Var.setCanceledOnTouchOutside(true);
        return co4Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        qmd qmdVar;
        super/*androidx.fragment.app.i*/.onDismiss(dialogInterface);
        if (this.f || (qmdVar = this.e) == null) {
            return;
        }
        ((BrowserMediaRouterDialogController) qmdVar.e).a();
    }

    public final void onStart() {
        r activity = getActivity();
        yg8 yg8Var = this.d;
        yg8Var.getClass();
        int systemUiVisibility = ((FrameLayout) activity.getWindow().getDecorView()).getSystemUiVisibility();
        yg8Var.a = systemUiVisibility;
        yg8Var.b = (systemUiVisibility & 1024) != 0;
        super/*androidx.fragment.app.i*/.onStart();
    }

    public final void onStop() {
        super/*androidx.fragment.app.i*/.onStop();
        this.d.a(getActivity());
    }
}
