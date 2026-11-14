package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xh5 extends TouchDelegate {
    public final ArrayList a;

    public xh5(View view) {
        super(new Rect(), view);
        this.a = new ArrayList();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            motionEvent.setLocation(x, y);
            if (((TouchDelegate) obj).onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
