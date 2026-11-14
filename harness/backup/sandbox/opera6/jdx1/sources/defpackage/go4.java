package defpackage;

import J.N;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class go4 implements fjc, vid, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ go4(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        xkg xkgVar = (xkg) obj;
        switch (b) {
            case 7:
                xkgVar.setPlayWhenReady(z);
                break;
            case 8:
                xkgVar.D(z);
                break;
            default:
                xkgVar.setShuffleModeEnabled(z);
                break;
        }
    }

    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eig) obj).onShuffleModeEnabledChanged(this.b);
                break;
            case 1:
                ((eig) obj).z(1, this.b);
                break;
            case 2:
                ((eig) obj).P(this.b);
                break;
            case 3:
                ((eig) obj).onShuffleModeEnabledChanged(this.b);
                break;
            case 4:
                ((eig) obj).q(this.b);
                break;
            default:
                ((eig) obj).onShuffleModeEnabledChanged(this.b);
                break;
        }
    }

    public final void run(long j) {
        UUID uuid = MediaDrmBridge.n;
        N.MAaklmRW(j, this.b);
    }
}
