package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d34 implements yb6 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ d34(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.yb6
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.yb6
    public final void c() {
        byte b = this.a;
    }

    @Override // defpackage.yb6
    public final void cancel() {
        byte b = this.a;
    }

    @Override // defpackage.yb6
    public final void e(nyg nygVar, xb6 xb6Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    xb6Var.g(j34.a((File) obj));
                    break;
                } catch (IOException e) {
                    xb6Var.d(e);
                    return;
                }
            default:
                xb6Var.g(obj);
                break;
        }
    }

    @Override // defpackage.yb6
    public final int f() {
        byte b = this.a;
        return 1;
    }
}
