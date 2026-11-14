package defpackage;

import android.view.View;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;
import org.chromium.third_party.android.media.MediaController;

/* loaded from: classes.dex */
public final class dhd implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ dhd(MediaController mediaController, byte b) {
        this.a = b;
        this.b = mediaController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        MediaController mediaController = this.b;
        switch (b) {
            case 0:
                int i = MediaController.o;
                wth wthVar = mediaController.a;
                if (wthVar != null) {
                    CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) wthVar.b;
                    boolean zIsPlaying = !cafExpandedControllerActivity.c.g() ? false : cafExpandedControllerActivity.s().isPlaying();
                    wth wthVar2 = mediaController.a;
                    if (zIsPlaying) {
                        CafExpandedControllerActivity cafExpandedControllerActivity2 = (CafExpandedControllerActivity) wthVar2.b;
                        if (cafExpandedControllerActivity2.c.g()) {
                            cafExpandedControllerActivity2.s().pause();
                        }
                    } else {
                        CafExpandedControllerActivity cafExpandedControllerActivity3 = (CafExpandedControllerActivity) wthVar2.b;
                        if (cafExpandedControllerActivity3.c.g()) {
                            cafExpandedControllerActivity3.s().play();
                        }
                    }
                    mediaController.c();
                    break;
                }
                break;
            case 1:
                wth wthVar3 = mediaController.a;
                if (wthVar3 != null) {
                    mediaController.a.O(wthVar3.H() - 5000);
                    mediaController.d();
                    break;
                }
                break;
            default:
                wth wthVar4 = mediaController.a;
                if (wthVar4 != null) {
                    mediaController.a.O(wthVar4.H() + 15000);
                    mediaController.d();
                    break;
                }
                break;
        }
    }
}
