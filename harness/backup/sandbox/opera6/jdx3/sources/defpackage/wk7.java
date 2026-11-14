package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class wk7 implements Drawable.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        RecyclerView recyclerView;
        long jFloatToRawIntBits;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zk7 zk7Var = (zk7) obj;
                if (!zk7Var.d && (recyclerView = zk7Var.e) != null) {
                    recyclerView.invalidate();
                    break;
                }
                break;
            case 1:
                bl7 bl7Var = (bl7) obj;
                t0g t0gVar = bl7Var.g;
                t0gVar.setValue(Integer.valueOf(((Number) t0gVar.getValue()).intValue() + 1));
                Drawable drawable2 = bl7Var.f;
                l4c l4cVar = cl7.a;
                if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
                    jFloatToRawIntBits = 9205357640488583168L;
                } else {
                    jFloatToRawIntBits = (Float.floatToRawIntBits(drawable2.getIntrinsicWidth()) << 32) | (Float.floatToRawIntBits(drawable2.getIntrinsicHeight()) & 4294967295L);
                }
                bl7Var.h.setValue(new bpj(jFloatToRawIntBits));
                break;
            case 2:
                ((vdd) obj).invalidateSelf();
                break;
            default:
                ((ivk) obj).d.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                RecyclerView recyclerView = ((zk7) obj).e;
                Handler handler = recyclerView != null ? recyclerView.getHandler() : null;
                if (handler != null) {
                    handler.postAtTime(runnable, drawable, j);
                    break;
                }
                break;
            case 1:
                ((Handler) cl7.a.getValue()).postAtTime(runnable, j);
                break;
            case 2:
                ((vdd) obj).scheduleSelf(runnable, j);
                break;
            default:
                runnable.run();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                RecyclerView recyclerView = ((zk7) obj).e;
                Handler handler = recyclerView != null ? recyclerView.getHandler() : null;
                if (handler != null) {
                    handler.removeCallbacks(runnable, drawable);
                    break;
                }
                break;
            case 1:
                ((Handler) cl7.a.getValue()).removeCallbacks(runnable);
                break;
            case 2:
                ((vdd) obj).unscheduleSelf(runnable);
                break;
        }
    }
}
