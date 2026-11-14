package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzbd;", "Lh8e;", "Lacd;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class zbd extends h8e {
    public final short b;
    public final uac c;
    public final float d;

    /* JADX WARN: Multi-variable type inference failed */
    public zbd(int i, uac uacVar, float f) {
        this.b = i;
        this.c = uacVar;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return this.b == zbdVar.b && Intrinsics.a(this.c, zbdVar.c) && gh7.b(this.d, zbdVar.d);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new acd(this.b, this.c, this.d);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        acd acdVar = (acd) b8eVar;
        acdVar.x.setValue(this.c);
        acdVar.y.setValue(new ybd());
        byte b = acdVar.o;
        short s = this.b;
        float f = this.d;
        if (b == 3 && acdVar.p == 1200 && acdVar.q == s && gh7.b(acdVar.r, f)) {
            return;
        }
        acdVar.o = (byte) 3;
        acdVar.p = (short) 1200;
        acdVar.q = s;
        acdVar.r = f;
        acdVar.U0();
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + rfp.c(this.b, 126573, 31)) * 31);
    }

    public final String toString() {
        String strC = gh7.c(this.d);
        StringBuilder sb = new StringBuilder("MarqueeModifierElement(iterations=3, animationMode=Immediately, delayMillis=1200, initialDelayMillis=");
        sb.append((int) this.b);
        sb.append(", spacing=");
        sb.append(this.c);
        sb.append(", velocity=");
        return z1m.l(sb, strC, ")");
    }
}
