package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lgq;", "", "", "a", "I", "width", "b", "height", "", "c", "Z", "isFluid", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class gq {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("width")
    public final int width;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("height")
    public final int height;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("is_fluid_height")
    public final boolean isFluid;

    public gq(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.isFluid = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq)) {
            return false;
        }
        gq gqVar = (gq) obj;
        return this.width == gqVar.width && this.height == gqVar.height && this.isFluid == gqVar.isFluid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.height, Integer.hashCode(this.width) * 31);
        boolean z = this.isFluid;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iA + i;
    }

    public final String toString() {
        int i = this.width;
        int i2 = this.height;
        return z1m.m(sko.o(i, i2, "AdSizeBundle(width=", ", height=", ", isFluid="), this.isFluid, ")");
    }
}
