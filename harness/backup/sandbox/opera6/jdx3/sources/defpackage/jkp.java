package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class jkp {
    public final ViewGroup a;
    public final p7p b;
    public final short c;
    public wjp d;
    public final ttn e = new ttn((Object) this, (byte) 27);
    public int f = -1;
    public int g = -1;
    public long h = -1;
    public long i = -1;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public jkp(ViewGroup viewGroup, p7p p7pVar, long j) {
        this.a = viewGroup;
        this.b = p7pVar;
        this.c = (int) j;
    }

    public final void a() {
        wjp wjpVar = this.d;
        if (wjpVar != null) {
            wjpVar.k = true;
            if (this.i > 0) {
                wjpVar.l = SystemClock.elapsedRealtime() - this.i;
            }
            pfp.a.removeCallbacks(this.e);
            c();
        }
    }

    public final void b(View view, String str, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f = (int) motionEvent.getRawX();
            this.g = (int) motionEvent.getRawY();
            this.h = SystemClock.elapsedRealtime();
            this.i = -1L;
            return;
        }
        ttn ttnVar = this.e;
        if (actionMasked != 1) {
            if (actionMasked != 3) {
                return;
            }
            pfp.a.removeCallbacks(ttnVar);
            this.d = null;
            return;
        }
        zyk zykVar = fap.a;
        ViewGroup viewGroup = this.a;
        Size sizeC = fap.c(viewGroup.getContext());
        this.i = SystemClock.elapsedRealtime();
        int i = this.f;
        int i2 = this.g;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        long j = this.i - this.h;
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        zap zapVar = new zap(i3, i4, viewGroup.getWidth() + i3, viewGroup.getHeight() + i4);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i5 = iArr2[0];
        int i6 = iArr2[1];
        this.d = new wjp(i, i2, rawX, rawY, j, zapVar, new zap(i5, i6, view.getWidth() + i5, view.getHeight() + i6), sizeC.getWidth(), sizeC.getHeight(), str);
        Handler handler = pfp.a;
        handler.removeCallbacks(ttnVar);
        handler.postDelayed(ttnVar, this.c);
    }

    public final void c() {
        wjp wjpVar = this.d;
        if (wjpVar != null) {
            this.d = null;
            p7p p7pVar = this.b;
            if (p7pVar != null) {
                voo vooVar = p7pVar.a;
                String str = vooVar.c;
                pro proVar = vooVar.b;
                p8p.a(new izo(str, proVar.a, vooVar.j, proVar.b, vooVar.l, wjpVar));
            }
        }
    }
}
