package defpackage;

import android.media.MediaCodec;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class y18 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f28 b;

    public /* synthetic */ y18(f28 f28Var, byte b) {
        this.a = b;
        this.b = f28Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws MediaCodec.CryptoException {
        q0b q0bVar;
        byte b = this.a;
        byte b2 = 8;
        f28 f28Var = this.b;
        switch (b) {
            case 0:
                Executor executor = f28Var.g;
                switch (vep.A(f28Var.E)) {
                    case 0:
                        q0bVar = new q0b(new IllegalStateException("Encoder is not started yet."), (byte) 1);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        AtomicReference atomicReference = new AtomicReference();
                        l94 l94Var = new l94();
                        l94Var.c = new byh();
                        o94 o94Var = new o94(l94Var);
                        l94Var.b = o94Var;
                        l94Var.a = vep.class;
                        try {
                            atomicReference.set(l94Var);
                            l94Var.a = "acquireInputBuffer";
                        } catch (Exception e) {
                            o94Var.a(e);
                        }
                        l94 l94Var2 = (l94) atomicReference.get();
                        l94Var2.getClass();
                        f28Var.k.offer(l94Var2);
                        l94Var2.a(new cn7(f28Var, l94Var2, b2), executor);
                        f28Var.b();
                        q0bVar = o94Var;
                        break;
                    case 7:
                        q0bVar = new q0b(new IllegalStateException("Encoder is in error state."), (byte) 1);
                        break;
                    case 8:
                        q0bVar = new q0b(new IllegalStateException("Encoder is released."), (byte) 1);
                        break;
                    default:
                        qp2.n("Unknown state: ".concat(o18.v(f28Var.E)));
                        break;
                }
                q0bVar.addListener(new wr9(q0bVar, new qe6(f28Var, (byte) 9), (byte) 0), executor);
                break;
            case 1:
                int iA = vep.A(f28Var.E);
                if (iA == 1) {
                    f28Var.e();
                    break;
                } else if (iA == 6 || iA == 8) {
                    qp2.n("Encoder is released");
                    break;
                }
            case 2:
                switch (vep.A(f28Var.E)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        f28Var.d();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        f28Var.g(7);
                        break;
                    case 6:
                    case 8:
                        break;
                    default:
                        qp2.n("Unknown state: ".concat(o18.v(f28Var.E)));
                        break;
                }
            case 3:
                f28Var.B = true;
                if (f28Var.A) {
                    if (!f28Var.r) {
                        f28Var.d.stop();
                    }
                    f28Var.f();
                    break;
                }
                break;
            case 4:
                f28Var.g.execute(new y18(f28Var, (byte) 5));
                break;
            default:
                if (f28Var.w) {
                    f28Var.x = null;
                    f28Var.h();
                    f28Var.w = false;
                    break;
                }
                break;
        }
    }
}
