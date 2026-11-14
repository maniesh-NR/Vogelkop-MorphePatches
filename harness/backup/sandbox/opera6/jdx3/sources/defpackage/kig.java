package defpackage;

import android.widget.SeekBar;
import com.google.android.material.slider.Slider;

/* loaded from: classes.dex */
public final class kig implements SeekBar.OnSeekBarChangeListener, w73, x73 {
    public final /* synthetic */ mig a;

    public kig(mig migVar) {
        this.a = migVar;
    }

    public final void a(Object obj) {
        long jZ0 = (long) ((Slider) obj).z0();
        mig migVar = this.a;
        migVar.h = true;
        migVar.c.h(migVar.e.t(jZ0));
    }

    public final void b(Object obj, float f, boolean z) {
        Slider slider = (Slider) obj;
        if (z) {
            long jZ0 = (long) slider.z0();
            mig migVar = this.a;
            migVar.c.h(migVar.e.t(jZ0));
        }
    }

    public final void c(Object obj) {
        long jZ0 = (long) ((Slider) obj).z0();
        mig migVar = this.a;
        migVar.h = false;
        migVar.c().seekTo(migVar.c().getCurrentWindowIndex(), jZ0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            long progress = seekBar.getProgress();
            mig migVar = this.a;
            migVar.c.h(migVar.e.t(progress));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        long progress = seekBar.getProgress();
        mig migVar = this.a;
        migVar.h = true;
        migVar.c.h(migVar.e.t(progress));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        long progress = seekBar.getProgress();
        mig migVar = this.a;
        migVar.h = false;
        migVar.c().seekTo(migVar.c().getCurrentWindowIndex(), progress);
    }
}
