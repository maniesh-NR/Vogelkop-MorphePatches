package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xnk implements jza {
    public final jva a;
    public final bza b;
    public final dd6 c;
    public final wsd d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public xnk(jva jvaVar, bza bzaVar, dd6 dd6Var, wsd wsdVar, String str, boolean z, boolean z2) {
        this.a = jvaVar;
        this.b = bzaVar;
        this.c = dd6Var;
        this.d = wsdVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnk)) {
            return false;
        }
        xnk xnkVar = (xnk) obj;
        return this.a.equals(xnkVar.a) && this.b.equals(xnkVar.b) && this.c == xnkVar.c && Intrinsics.a(this.d, xnkVar.d) && Intrinsics.a(this.e, xnkVar.e) && this.f == xnkVar.f && this.g == xnkVar.g;
    }

    @Override // defpackage.jza
    public final bza getRequest() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        wsd wsdVar = this.d;
        int iHashCode2 = (iHashCode + (wsdVar == null ? 0 : wsdVar.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + fki.k((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return z1m.m(sb, this.g, ")");
    }

    @Override // defpackage.jza
    public final jva y() {
        return this.a;
    }
}
