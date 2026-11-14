package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ah2 {
    public final csh a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public ah2(csh cshVar) {
        this.a = cshVar;
        bh2 bh2Var = bh2.e;
        this.d = false;
    }

    public final void a() {
        ch2 ch2Var = ch2.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long jB = ch2Var.a;
        int i = 0;
        while (true) {
            csh cshVar = this.a;
            if (i >= cshVar.d) {
                break;
            }
            eh2 eh2Var = (eh2) cshVar.get(i);
            new ch2(jB);
            eh2Var.flush();
            if (eh2Var.isActive()) {
                jB = eh2Var.b(jB);
                z4o.H(jB >= 0);
                arrayList.add(eh2Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((eh2) arrayList.get(i2)).getOutput();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((eh2) this.b.get(b())).isEnded() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    eh2 eh2Var = (eh2) arrayList.get(i);
                    if (!eh2Var.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : eh2.a;
                        long jRemaining = byteBuffer2.remaining();
                        eh2Var.queueInput(byteBuffer2);
                        this.c[i] = eh2Var.getOutput();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((eh2) arrayList.get(i + 1)).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ah2) {
            csh cshVar = ((ah2) obj).a;
            csh cshVar2 = this.a;
            if (cshVar2.d == cshVar.d) {
                for (int i = 0; i < cshVar2.d; i++) {
                    if (cshVar2.get(i) == cshVar.get(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
