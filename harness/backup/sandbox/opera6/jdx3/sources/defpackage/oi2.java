package defpackage;

import J.N;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* loaded from: classes.dex */
public final /* synthetic */ class oi2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oi2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ oi2(ArrayList arrayList, long j) {
        this.a = (byte) 8;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        pc9 pc9VarQ;
        switch (this.a) {
            case 0:
                pi2 pi2Var = (pi2) this.c;
                pi2Var.h = pi2Var.k(this.b, null, new ab(pi2Var, (byte) 22));
                break;
            case 1:
                p43 p43Var = (p43) this.c;
                long j = this.b;
                p43Var.d = null;
                p43Var.b.B0(p43Var.h.b, j, TimeUnit.MILLISECONDS);
                break;
            case 2:
                th3 th3Var = (th3) this.c;
                long j2 = this.b;
                if (!th3Var.e) {
                    if (j2 <= 52428800) {
                        th3Var.c = j2;
                        if (th3Var.d < j2) {
                            PostTask.c(7, new bi2(th3Var, th3Var.f, (byte) 12));
                            break;
                        } else {
                            try {
                                th3Var.b.close();
                                th3Var.e = true;
                                lc6 lc6Var = th3Var.f;
                                th3Var.f = null;
                                fi3 fi3Var = th3Var.h;
                                th3Var.h = null;
                                Callback callback = th3Var.g;
                                th3Var.g = null;
                                PostTask.c(7, new sh3(lc6Var, fi3Var, callback, 0, (byte) 0));
                                break;
                            } catch (IOException unused) {
                                th3Var.l(1);
                                return;
                            }
                        }
                    } else {
                        th3Var.l(8);
                        break;
                    }
                }
                break;
            case 3:
                ((se9) this.c).run(Long.valueOf(this.b));
                break;
            case 4:
                ((qe9) this.c).run(Long.valueOf(this.b));
                break;
            case 5:
                j4c j4cVar = (j4c) this.c;
                long j3 = this.b;
                bf9 bf9Var = (bf9) j4cVar.get();
                if (bf9Var.r() >= 2 && (pc9VarQ = bf9Var.q()) != null) {
                    pc9VarQ.e(j3);
                    break;
                }
                break;
            case 6:
                pc9 pc9Var = (pc9) this.c;
                long j4 = this.b;
                if (pc9Var != null) {
                    pc9Var.e(j4);
                    break;
                }
                break;
            case 7:
                glh glhVar = (glh) this.c;
                long j5 = this.b;
                h7f h7fVar = glhVar.b;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((clh) g7fVarH.next()).d(j5);
                }
                break;
            default:
                N.Ml5G_GLY(this.b, (ArrayList) this.c);
                break;
        }
    }
}
