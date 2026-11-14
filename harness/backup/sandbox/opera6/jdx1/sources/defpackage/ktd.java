package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class ktd implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, kud {
    public itd a;
    public bz0 b;
    public iic c;

    @Override // defpackage.kud
    public final void f(itd itdVar, boolean z) {
        bz0 bz0Var;
        if ((z || itdVar == this.a) && (bz0Var = this.b) != null) {
            bz0Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        itd itdVar = this.a;
        iic iicVar = this.c;
        hic hicVar = iicVar.f;
        if (hicVar == null) {
            hicVar = new hic(iicVar);
            iicVar.f = hicVar;
        }
        itdVar.q(hicVar.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.f(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        itd itdVar = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                itdVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return itdVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.kud
    public final boolean p(itd itdVar) {
        return false;
    }
}
