package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class rxo {

    @NotNull
    public static final dwo Companion = new dwo();
    public static final KSerializer[] j = {null, new k72(e0p.a, (byte) 0), null, null, null, null, null, null, null};
    public static final String k = "opera-android-2.14.0";
    public final String a;
    public final List b;
    public final huo c;
    public final jzo d;
    public final wwo e;
    public final int f;
    public final mwo g;
    public final hwo h;
    public final zvo i;

    public rxo(int i, String str, List list, huo huoVar, jzo jzoVar, wwo wwoVar, int i2, mwo mwoVar, hwo hwoVar, zvo zvoVar) {
        if (479 != (i & 479)) {
            x7d.I(i, 479, nvo.b);
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = huoVar;
        this.d = jzoVar;
        this.e = wwoVar;
        if ((i & 32) == 0) {
            this.f = 1;
        } else {
            this.f = i2;
        }
        this.g = mwoVar;
        this.h = hwoVar;
        this.i = zvoVar;
        if (str.length() <= 0 || (list.isEmpty() && mwoVar.a.f == null)) {
            qp2.o("Failed requirement.");
            throw null;
        }
    }

    public rxo(String str, List list, huo huoVar, jzo jzoVar, wwo wwoVar, mwo mwoVar, hwo hwoVar, zvo zvoVar) {
        this.a = str;
        this.b = list;
        this.c = huoVar;
        this.d = jzoVar;
        this.e = wwoVar;
        this.f = 1;
        this.g = mwoVar;
        this.h = hwoVar;
        this.i = zvoVar;
        if (str.length() <= 0 || (list.isEmpty() && mwoVar.a.f == null)) {
            qp2.o("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxo)) {
            return false;
        }
        rxo rxoVar = (rxo) obj;
        return Intrinsics.a(this.a, rxoVar.a) && Intrinsics.a(this.b, rxoVar.b) && Intrinsics.a(this.c, rxoVar.c) && Intrinsics.a(this.d, rxoVar.d) && Intrinsics.a(this.e, rxoVar.e) && this.f == rxoVar.f && Intrinsics.a(this.g, rxoVar.g) && Intrinsics.a(this.h, rxoVar.h) && Intrinsics.a(this.i, rxoVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.g.a.hashCode() + rfp.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rfp.f(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        zvo zvoVar = this.i;
        return iHashCode + (zvoVar == null ? 0 : zvoVar.hashCode());
    }

    public final String toString() {
        return "BidRequestObject(id=" + this.a + ", imp=" + this.b + ", app=" + this.c + ", device=" + this.d + ", user=" + this.e + ", at=" + this.f + ", source=" + this.g + ", regs=" + this.h + ", ext=" + this.i + ')';
    }
}
