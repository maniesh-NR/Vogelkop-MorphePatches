package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class bmd implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bmd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cmd cmdVar = (cmd) obj2;
                z0c z0cVar = (z0c) obj;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                nvk nvkVar = (nvk) z0cVar.b;
                flb flbVar = (flb) z0cVar.c;
                nvkVar.t = true;
                flbVar.s(cmdVar);
                return true;
            case 1:
                return ((ScaleGestureDetector) obj2).onTouchEvent(motionEvent) | ((GestureDetector) obj).onTouchEvent(motionEvent);
            default:
                ((aoo) obj2).onTouch(view, motionEvent);
                ((GestureDetector) obj).onTouchEvent(motionEvent);
                return false;
        }
    }
}
