package org.chromium.components.embedder_support.delegate;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import defpackage.ua7;

/* loaded from: classes.dex */
public class HtmlColorPickerAdvanced extends LinearLayout implements SeekBar.OnSeekBarChangeListener {
    public final ua7 a;
    public final ua7 b;
    public final ua7 c;
    public vma d;
    public int e;
    public final float[] f;

    public HtmlColorPickerAdvanced(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float[] fArr = new float[3];
        this.f = fArr;
        setOrientation(1);
        this.a = a(2132018300, 360, this);
        this.b = a(2132018302, 100, this);
        this.c = a(2132018303, 100, this);
        int iMax = Math.max(Math.min(Math.round(fArr[1] * 100.0f), 100), 0);
        int iMax2 = Math.max(Math.min(Math.round(fArr[2] * 100.0f), 100), 0);
        ((SeekBar) this.a.c).setProgress((int) fArr[0]);
        ((SeekBar) this.b.c).setProgress(iMax);
        ((SeekBar) this.c.c).setProgress(iMax2);
        float[] fArr2 = new float[3];
        fArr2[1] = 1.0f;
        fArr2[2] = 1.0f;
        int[] iArr = new int[7];
        for (int i = 0; i < 7; i++) {
            fArr2[0] = i * 60.0f;
            iArr[i] = Color.HSVToColor(fArr2);
        }
        this.a.Q(iArr);
        b();
        c();
    }

    public final ua7 a(int i, int i2, HtmlColorPickerAdvanced htmlColorPickerAdvanced) {
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(2131558602, (ViewGroup) null);
        addView(viewInflate);
        return new ua7(viewInflate, i, i2, htmlColorPickerAdvanced);
    }

    public final void b() {
        float[] fArr = {this.f[0], 0.0f, 1.0f};
        int iHSVToColor = Color.HSVToColor(fArr);
        fArr[1] = 1.0f;
        this.b.Q(new int[]{iHSVToColor, Color.HSVToColor(fArr)});
    }

    public final void c() {
        float[] fArr = this.f;
        float[] fArr2 = {fArr[0], fArr[1], 0.0f};
        int iHSVToColor = Color.HSVToColor(fArr2);
        fArr2[2] = 1.0f;
        this.c.Q(new int[]{iHSVToColor, Color.HSVToColor(fArr2)});
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            float progress = ((SeekBar) this.a.c).getProgress();
            float[] fArr = this.f;
            fArr[0] = progress;
            fArr[1] = ((SeekBar) this.b.c).getProgress() / 100.0f;
            fArr[2] = ((SeekBar) this.c.c).getProgress() / 100.0f;
            this.e = Color.HSVToColor(fArr);
            b();
            c();
            vma vmaVar = this.d;
            if (vmaVar != null) {
                vmaVar.a.c(Integer.valueOf(this.e));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
