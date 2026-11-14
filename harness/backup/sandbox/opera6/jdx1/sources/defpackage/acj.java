package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class acj {
    public final u8i a;
    public final u8i b;
    public final u8i c;
    public final u8i d;
    public final u8i e;
    public final u8i f;
    public final u8i g;
    public final u8i h;

    public acj(u8i u8iVar, u8i u8iVar2, u8i u8iVar3, u8i u8iVar4, u8i u8iVar5) {
        u8i u8iVar6 = xaj.e;
        u8i u8iVar7 = xaj.g;
        u8i u8iVar8 = xaj.h;
        this.a = u8iVar;
        this.b = u8iVar2;
        this.c = u8iVar3;
        this.d = u8iVar4;
        this.e = u8iVar5;
        this.f = u8iVar6;
        this.g = u8iVar7;
        this.h = u8iVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acj)) {
            return false;
        }
        acj acjVar = (acj) obj;
        return Intrinsics.a(this.a, acjVar.a) && Intrinsics.a(this.b, acjVar.b) && Intrinsics.a(this.c, acjVar.c) && Intrinsics.a(this.d, acjVar.d) && Intrinsics.a(this.e, acjVar.e) && Intrinsics.a(this.f, acjVar.f) && Intrinsics.a(this.g, acjVar.g) && Intrinsics.a(this.h, acjVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
