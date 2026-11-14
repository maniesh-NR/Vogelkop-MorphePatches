package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class kjh implements kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wjh b;

    public /* synthetic */ kjh(wjh wjhVar, byte b) {
        this.a = b;
        this.b = wjhVar;
    }

    public final br9 a() {
        switch (this.a) {
        }
        return new nr9(1, this.b, wjh.class, "onRatingSelected", "onRatingSelected(I)V", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof kjh) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof kjh) && (obj instanceof kr9)) {
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
