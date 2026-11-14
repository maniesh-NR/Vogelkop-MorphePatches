package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g2d extends ozb implements Function1 {
    public final /* synthetic */ p2d i;
    public final /* synthetic */ Matrix j;
    public final /* synthetic */ f3d k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ afe m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2d(p2d p2dVar, Matrix matrix, f3d f3dVar, Function0 function0, afe afeVar) {
        super(1);
        this.i = p2dVar;
        this.j = matrix;
        this.k = f3dVar;
        this.l = function0;
        this.m = afeVar;
    }

    public final Object invoke(Object obj) {
        mk7 mk7Var = (mk7) obj;
        sh4 sh4VarA = mk7Var.s0().A();
        p2d p2dVar = this.i;
        long jB = (zed.b(bpj.d(mk7Var.e())) << 32) | (zed.b(bpj.b(mk7Var.e())) & 4294967295L);
        float fN = i41.n((Float.floatToRawIntBits(p2dVar.i.width()) << 32) | (Float.floatToRawIntBits(p2dVar.i.height()) & 4294967295L), mk7Var.e());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fN) << 32) | (Float.floatToRawIntBits(fN) & 4294967295L);
        int i = (int) (jFloatToRawIntBits >> 32);
        int i2 = (int) (jFloatToRawIntBits & 4294967295L);
        long jIntBitsToFloat = (((int) (Float.intBitsToFloat(i) * bpj.d(r6))) << 32) | (((int) (Float.intBitsToFloat(i2) * bpj.b(r6))) & 4294967295L);
        long jRound = (Math.round(((mk7Var.getLayoutDirection() == d2c.a ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (jB >> 32)) - ((int) (jIntBitsToFloat >> 32))) / 2.0f)) << 32) | (Math.round((1.0f + 0.0f) * ((((int) (jB & 4294967295L)) - ((int) (jIntBitsToFloat & 4294967295L))) / 2.0f)) & 4294967295L);
        Matrix matrix = this.j;
        matrix.reset();
        matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        f3d f3dVar = this.k;
        if (f3dVar.j) {
            f3dVar.j = false;
            if (f3dVar.a != null) {
                f3dVar.d();
            }
        }
        f3dVar.F = 1;
        f3dVar.f();
        f3dVar.G = 1;
        f3dVar.o(p2dVar);
        if (this.m.getValue() != null) {
            h9o.t();
            return null;
        }
        if (f3dVar.k) {
            f3dVar.k = false;
            gi5 gi5Var = f3dVar.l;
            if (gi5Var != null) {
                gi5Var.F = false;
            }
            f3dVar.invalidateSelf();
        }
        f3dVar.r(((Number) this.l.invoke()).floatValue());
        f3dVar.setBounds(0, 0, p2dVar.i.width(), p2dVar.i.height());
        Canvas canvas = b31.a;
        Canvas canvas2 = ((a31) sh4VarA).a;
        Runnable runnable = f3dVar.C;
        ThreadPoolExecutor threadPoolExecutor = f3d.H;
        p3d p3dVar = f3dVar.b;
        Semaphore semaphore = f3dVar.B;
        gi5 gi5Var2 = f3dVar.l;
        p2d p2dVar2 = f3dVar.a;
        if (gi5Var2 != null && p2dVar2 != null) {
            int i3 = f3dVar.G;
            if (i3 == 0) {
                i3 = 1;
            }
            boolean z = i3 == 2;
            if (z) {
                try {
                    semaphore.acquire();
                    if (f3dVar.s()) {
                        f3dVar.r(p3dVar.b());
                    }
                } catch (InterruptedException unused) {
                    if (z) {
                        semaphore.release();
                        if (gi5Var2.E != p3dVar.b()) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        semaphore.release();
                        if (gi5Var2.E != p3dVar.b()) {
                            threadPoolExecutor.execute(runnable);
                        }
                    }
                    throw th;
                }
            }
            if (f3dVar.n) {
                canvas2.save();
                canvas2.concat(matrix);
                f3dVar.l(canvas2, gi5Var2);
                canvas2.restore();
            } else {
                gi5Var2.h(canvas2, matrix, f3dVar.m);
            }
            f3dVar.A = false;
            if (z) {
                semaphore.release();
                if (gi5Var2.E != p3dVar.b()) {
                    threadPoolExecutor.execute(runnable);
                }
            }
        }
        return Unit.a;
    }
}
