package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c9l implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r9l b;

    public /* synthetic */ c9l(r9l r9lVar, byte b) {
        this.a = b;
        this.b = r9lVar;
    }

    public final Object invoke() {
        byte b = this.a;
        final byte b2 = 1;
        final r9l r9lVar = this.b;
        switch (b) {
            case 0:
                final byte b3 = 0;
                isj isjVar = new isj(new esk() { // from class: i9l
                    public final Object get() {
                        byte b4 = b3;
                        r9l r9lVar2 = r9lVar;
                        switch (b4) {
                            case 0:
                                return r9lVar2.e;
                            default:
                                return r9lVar2.q.b;
                        }
                    }
                }, new esk() { // from class: i9l
                    public final Object get() {
                        byte b4 = b2;
                        r9l r9lVar2 = r9lVar;
                        switch (b4) {
                            case 0:
                                return r9lVar2.e;
                            default:
                                return r9lVar2.q.b;
                        }
                    }
                });
                isjVar.f = true;
                a26.V(isjVar, r9lVar.r, new n9l(r9lVar));
                break;
            case 1:
                break;
            case 2:
                if (r9lVar.w.Y()) {
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                b2l b2lVarA = r9lVar.c.A();
                z5l z5lVarF = r9lVar.f();
                x2l x2lVar = z5lVarF.v;
                RecyclerView recyclerView = z5lVarF.f;
                x2lVar.getClass();
                b2l b2lVar = (b2l) nxg.n(recyclerView, new bvk((byte) 3));
                if (b2lVar == null) {
                    b2lVar = (b2l) x2lVar.o.e.getValue();
                }
                if (!Intrinsics.a(b2lVar, b2lVarA)) {
                    r9lVar.p(b2lVarA);
                }
                r9lVar.q(new c9l(r9lVar, (byte) 7));
                break;
            case 5:
                g4l.e(r9lVar.D);
                break;
            case 6:
                g4l g4lVar = r9lVar.D;
                g4lVar.g.h(null);
                g4lVar.d(new d4l(g4lVar, (byte) 2));
                break;
            default:
                r9lVar.i(true);
                break;
        }
        return Unit.a;
    }
}
