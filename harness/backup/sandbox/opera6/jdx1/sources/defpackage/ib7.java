package defpackage;

import android.graphics.Point;
import android.view.Display;

/* loaded from: classes.dex */
public final class ib7 {
    public final Point a;
    public final boolean b;

    public ib7(Point point) {
        this.b = true;
        this.a = point;
    }

    public ib7(Display.Mode mode, boolean z) {
        if (mode == null) {
            t3p.q("Display.Mode == null, can't wrap a null reference");
            throw null;
        }
        this.b = z;
        this.a = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
    }
}
