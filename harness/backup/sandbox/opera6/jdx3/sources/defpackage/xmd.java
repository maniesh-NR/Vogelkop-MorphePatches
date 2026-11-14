package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class xmd implements SeekBar.OnSeekBarChangeListener {
    public final vl9 a = new vl9(this, (byte) 15);
    public final /* synthetic */ d b;

    public xmd(d dVar) {
        this.b = dVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            cod codVar = (cod) seekBar.getTag();
            int i2 = d.q0;
            codVar.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        d dVar = this.b;
        if (dVar.N != null) {
            dVar.L.removeCallbacks(this.a);
        }
        dVar.N = (cod) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.L.postDelayed(this.a, 500L);
    }
}
