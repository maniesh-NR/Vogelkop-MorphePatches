package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes.dex */
public final class vf2 extends AudioDeviceCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                xf2 xf2Var = (xf2) obj;
                xf2Var.a(uf2.b((Context) xf2Var.b, (pf2) xf2Var.j, (AudioDeviceInfo) xf2Var.i));
                break;
            default:
                ((qg2) ((l45) obj).b).accept(Boolean.TRUE);
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                xf2 xf2Var = (xf2) obj;
                if (tym.l(audioDeviceInfoArr, (AudioDeviceInfo) xf2Var.i)) {
                    xf2Var.i = null;
                }
                xf2Var.a(uf2.b((Context) xf2Var.b, (pf2) xf2Var.j, (AudioDeviceInfo) xf2Var.i));
                break;
            default:
                ((qg2) ((l45) obj).b).accept(Boolean.FALSE);
                break;
        }
    }
}
