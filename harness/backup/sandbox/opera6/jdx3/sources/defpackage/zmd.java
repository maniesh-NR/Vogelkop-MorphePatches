package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.fragment.app.r;
import androidx.mediarouter.app.d;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;

/* loaded from: classes.dex */
public class zmd extends ymd {
    public final yg8 d;
    public final and e;
    public final lmd f;

    public zmd() {
        Handler handler = new Handler();
        this.d = new yg8();
        handler.post(new vl9(this, (byte) 16));
    }

    public zmd(and andVar, lmd lmdVar) {
        new Handler();
        this.d = new yg8();
        this.e = andVar;
        this.f = lmdVar;
    }

    public final d g0(Context context) {
        d dVar = new d(context);
        dVar.setCanceledOnTouchOutside(true);
        return dVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super/*androidx.fragment.app.i*/.onDismiss(dialogInterface);
        and andVar = this.e;
        if (andVar == null) {
            return;
        }
        ((BrowserMediaRouterDialogController) andVar.e).a();
        ((dod) andVar.d).j(this.f);
        andVar.f = null;
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
        super.onStop();
        this.d.a(getActivity());
    }
}
