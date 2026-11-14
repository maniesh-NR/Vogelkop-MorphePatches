package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class eal implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fal b;

    public /* synthetic */ eal(fal falVar, byte b) {
        this.a = b;
        this.b = falVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        fal falVar = this.b;
        switch (b) {
        }
        return falVar.c.a(motionEvent);
    }
}
