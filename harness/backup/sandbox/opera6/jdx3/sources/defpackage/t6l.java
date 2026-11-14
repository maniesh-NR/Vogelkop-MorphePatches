package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t6l implements r6l {
    public final /* synthetic */ byte a;
    public final k6l b;
    public final boolean c;
    public final ArrayList d;

    public t6l(k6l k6lVar, boolean z, Iterable iterable, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = k6lVar;
                this.c = z;
                this.d = exg.B(k6lVar, iterable);
                break;
            default:
                this.b = k6lVar;
                this.c = z;
                this.d = exg.x(k6lVar, iterable);
                break;
        }
    }

    @Override // defpackage.r6l
    public final pxh h() {
        byte b = this.a;
        boolean z = this.c;
        ArrayList arrayList = this.d;
        switch (b) {
            case 0:
                if (z) {
                    return new rxh(2132017534);
                }
                return new txh(new Object[]{Integer.valueOf(arrayList.size())}, 2131886153, arrayList.size());
            default:
                if (z) {
                    return new rxh(2132017535);
                }
                return new txh(new Object[]{Integer.valueOf(arrayList.size())}, 2131886154, arrayList.size());
        }
    }

    @Override // defpackage.r6l
    public final void l() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        k6l k6lVar = this.b;
        switch (b) {
            case 0:
                exg.B(k6lVar, arrayList);
                break;
            default:
                exg.x(k6lVar, arrayList);
                break;
        }
    }
}
