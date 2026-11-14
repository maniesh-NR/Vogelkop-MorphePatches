package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class tj7 implements View.OnTouchListener {
    public final b6h a;
    public final i b;

    public tj7(b6h b6hVar, i iVar) {
        this.a = b6hVar;
        this.b = iVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            skb skbVar = (skb) this.a.get();
            if (skbVar.f == null) {
                View view2 = skbVar.h;
                if (view2 == null) {
                    view2 = null;
                }
                if (flb.n(view2) != null) {
                    return false;
                }
                flb flbVar = skbVar.g;
                (flbVar != null ? flbVar : null).s(this.b);
                return true;
            }
        }
        return false;
    }
}
