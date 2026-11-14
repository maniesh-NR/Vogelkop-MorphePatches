package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.e;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;
import org.chromium.third_party.android.media.MediaController;

/* loaded from: classes.dex */
public final class ehd implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ehd(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        byte b = this.a;
        ond ondVar = this.b;
        switch (b) {
            case 0:
                MediaController mediaController = (MediaController) ondVar;
                wth wthVar = mediaController.a;
                if (wthVar != null && z) {
                    CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) wthVar.b;
                    long j = ((!cafExpandedControllerActivity.c.g() ? 0L : cafExpandedControllerActivity.c.f.a.a) * i) / 1000;
                    mediaController.a.O(j);
                    TextView textView = mediaController.f;
                    if (textView != null) {
                        textView.setText(mediaController.a((int) j));
                        break;
                    }
                }
                break;
            default:
                if (z) {
                    cod codVar = (cod) seekBar.getTag();
                    e eVar = (e) ondVar.w.get(codVar.c);
                    if (eVar != null) {
                        eVar.V(i == 0);
                    }
                    codVar.j(i);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        byte b = this.a;
        ond ondVar = this.b;
        switch (b) {
            case 0:
                ((MediaController) ondVar).g = true;
                break;
            default:
                ond ondVar2 = ondVar;
                if (ondVar2.x != null) {
                    ondVar2.s.removeMessages(2);
                }
                ondVar2.x = (cod) seekBar.getTag();
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        byte b = this.a;
        ond ondVar = this.b;
        switch (b) {
            case 0:
                MediaController mediaController = (MediaController) ondVar;
                mediaController.g = false;
                mediaController.d();
                mediaController.c();
                break;
            default:
                ondVar.s.sendEmptyMessageDelayed(2, 500L);
                break;
        }
    }
}
