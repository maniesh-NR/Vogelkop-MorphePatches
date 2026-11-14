package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class dlb extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ glb b;

    public dlb(glb glbVar) {
        this.b = glbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewJ;
        i iVarT;
        glb glbVar = this.b;
        clb clbVar = glbVar.m;
        if (!this.a || (viewJ = glbVar.j(motionEvent)) == null || (iVarT = glbVar.r.T(viewJ)) == null) {
            return;
        }
        RecyclerView recyclerView = glbVar.r;
        if ((clb.c(clbVar.f(recyclerView, iVarT), recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = glbVar.l;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                glbVar.d = x;
                glbVar.e = y;
                glbVar.i = 0.0f;
                glbVar.h = 0.0f;
                if (clbVar instanceof ilb) {
                    return;
                }
                glbVar.n(iVarT, 2);
            }
        }
    }
}
