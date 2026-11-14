package defpackage;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class s0b extends g07 {
    public final /* synthetic */ byte m = 0;
    public final Object n;

    public s0b(Surface surface, Size size, int i) {
        super(i, size);
        this.n = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0b(buk bukVar, Size size) {
        super(34, size);
        this.n = bukVar;
    }

    @Override // defpackage.g07
    public final ListenableFuture e() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return k1g.G((Surface) obj);
            default:
                return ((buk) obj).h;
        }
    }
}
