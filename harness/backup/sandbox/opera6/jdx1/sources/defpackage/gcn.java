package defpackage;

import android.media.VolumeProvider;

/* loaded from: classes.dex */
public final class gcn extends VolumeProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcn(byte b, int i, int i2, int i3, Object obj) {
        super(i, i2, i3);
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                wpd wpdVar = (wpd) obj;
                tym.S(wpdVar.f, new vpd(wpdVar.g, i, b2));
                break;
            default:
                cz9 cz9Var = (cz9) obj;
                ((ez9) ((g77) cz9Var.f).c).a.post(new bz9(cz9Var, i, b2));
                break;
        }
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                wpd wpdVar = (wpd) obj;
                tym.S(wpdVar.f, new vpd(wpdVar.g, i, b2));
                break;
            default:
                cz9 cz9Var = (cz9) obj;
                ((ez9) ((g77) cz9Var.f).c).a.post(new bz9(cz9Var, i, b2));
                break;
        }
    }
}
