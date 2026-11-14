package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class bn9 extends Transition.EpicenterCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ bn9(Rect rect, byte b) {
        this.a = b;
        this.b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        byte b = this.a;
        Rect rect = this.b;
        switch (b) {
            case 0:
                break;
            default:
                if (rect.isEmpty()) {
                }
                break;
        }
        return rect;
    }
}
