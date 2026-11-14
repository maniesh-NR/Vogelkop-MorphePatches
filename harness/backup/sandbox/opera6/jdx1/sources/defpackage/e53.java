package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class e53 implements eh2 {
    public bh2 b;
    public bh2 c;
    public bh2 d;
    public bh2 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public e53() {
        ByteBuffer byteBuffer = eh2.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        bh2 bh2Var = bh2.e;
        this.d = bh2Var;
        this.e = bh2Var;
        this.b = bh2Var;
        this.c = bh2Var;
    }

    @Override // defpackage.eh2
    public final bh2 a(bh2 bh2Var) {
        this.d = bh2Var;
        this.e = c(bh2Var);
        return isActive() ? this.e : bh2.e;
    }

    public bh2 c(bh2 bh2Var) throws dh2 {
        if (bh2Var.c == 2) {
            return bh2Var.a == -1 ? bh2.e : bh2Var;
        }
        throw new dh2(bh2Var);
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    @Override // defpackage.eh2
    public final void flush() {
        this.g = eh2.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        d();
    }

    public final ByteBuffer g(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.eh2
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = eh2.a;
        return byteBuffer;
    }

    @Override // defpackage.eh2
    public boolean isActive() {
        return this.e != bh2.e;
    }

    @Override // defpackage.eh2
    public boolean isEnded() {
        return this.h && this.g == eh2.a;
    }

    @Override // defpackage.eh2
    public final void queueEndOfStream() {
        this.h = true;
        e();
    }

    @Override // defpackage.eh2
    public final void reset() {
        ByteBuffer byteBuffer = eh2.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        bh2 bh2Var = bh2.e;
        this.d = bh2Var;
        this.e = bh2Var;
        this.b = bh2Var;
        this.c = bh2Var;
        f();
    }
}
