package defpackage;

import J.N;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.util.Size;
import java.util.Objects;

/* loaded from: classes.dex */
public final class goi {
    public final /* synthetic */ CancellationSignal a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ hoi c;

    public goi(hoi hoiVar, CancellationSignal cancellationSignal, Runnable runnable) {
        this.a = cancellationSignal;
        this.b = runnable;
        Objects.requireNonNull(hoiVar);
        this.c = hoiVar;
    }

    public final void a(Size size, Point point) {
        hoi hoiVar = this.c;
        ((h7f) hoiVar.c.d).c(this);
        if (size.getWidth() == 0 || size.getHeight() == 0) {
            hoiVar.c.b();
            this.a.cancel();
        } else {
            hoiVar.d = new Rect(0, 0, (int) Math.floor(size.getWidth() * hoiVar.f), (int) Math.floor(size.getHeight() * hoiVar.f));
            hoiVar.e = (int) Math.floor(point.y * hoiVar.f);
            this.b.run();
        }
    }

    public final void b(int i) {
        if (i == 5 || i == 4) {
            return;
        }
        hoi hoiVar = this.c;
        ((h7f) hoiVar.c.d).c(this);
        hoiVar.c.b();
        this.a.cancel();
        N.Mud1A5Xc();
    }
}
