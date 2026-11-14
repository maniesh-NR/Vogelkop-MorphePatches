package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class kld extends GestureDetector {
    public final /* synthetic */ nld a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kld(Context context, nld nldVar, nld nldVar2) {
        super(context, nldVar);
        this.a = nldVar2;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nld nldVar = this.a;
        old oldVar = nldVar.i;
        pld pldVar = nldVar.h;
        if (motionEvent.getActionMasked() == 1) {
            ((hld) pldVar.c.b).t.setVisibility(8);
            pldVar.h = false;
            ((hld) oldVar.a.b).t.setVisibility(8);
            qld qldVar = oldVar.j;
            if (qldVar != null) {
                qldVar.d();
                oldVar.j = null;
            }
            oldVar.i = null;
        } else if (motionEvent.getActionMasked() == 3) {
            ((hld) pldVar.c.b).t.setVisibility(8);
            pldVar.h = false;
            ((hld) oldVar.a.b).t.setVisibility(8);
            qld qldVar2 = oldVar.j;
            if (qldVar2 != null) {
                qldVar2.d();
                oldVar.j = null;
            }
            oldVar.i = null;
        }
        return super.onTouchEvent(motionEvent);
    }
}
