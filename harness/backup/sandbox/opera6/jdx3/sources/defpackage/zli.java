package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class zli implements edf, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ami b;

    public /* synthetic */ zli(ami amiVar, byte b) {
        this.a = b;
        this.b = amiVar;
    }

    public final br9 a() {
        switch (this.a) {
        }
        return new nr9(1, this.b, ami.class, "onContentsLabelTextLayoutApplied", "onContentsLabelTextLayoutApplied(I)Lcom/opera/android/utilities/OnTextLayoutAppliedCallback$Response;", 0);
    }

    @Override // defpackage.edf
    public final ddf b(int i) {
        byte b = this.a;
        ami amiVar = this.b;
        switch (b) {
        }
        return amiVar.p(i);
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof edf) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof edf) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
