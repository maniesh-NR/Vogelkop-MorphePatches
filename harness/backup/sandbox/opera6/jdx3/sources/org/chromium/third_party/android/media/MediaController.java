package org.chromium.third_party.android.media;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import defpackage.dhd;
import defpackage.ehd;
import defpackage.wth;
import java.util.Formatter;
import java.util.Locale;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;

/* loaded from: classes.dex */
public class MediaController extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    public wth a;
    public final Context b;
    public final ViewGroup c;
    public final SeekBar d;
    public final TextView e;
    public final TextView f;
    public boolean g;
    public final StringBuilder h;
    public final Formatter i;
    public final ImageButton j;
    public final ImageButton k;
    public final ImageButton l;
    public final ImageButton m;
    public final ImageButton n;

    public MediaController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        byte b = 0;
        dhd dhdVar = new dhd(this, b);
        ehd ehdVar = new ehd(this, b);
        dhd dhdVar2 = new dhd(this, (byte) 1);
        dhd dhdVar3 = new dhd(this, (byte) 2);
        this.b = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131559040, (ViewGroup) this, true);
        ImageButton imageButton = (ImageButton) findViewById(2131363868);
        this.j = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.j.setOnClickListener(dhdVar);
        }
        ImageButton imageButton2 = (ImageButton) findViewById(2131362948);
        this.k = imageButton2;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(dhdVar3);
            this.k.setVisibility(0);
        }
        ImageButton imageButton3 = (ImageButton) findViewById(2131364085);
        this.l = imageButton3;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(dhdVar2);
            this.l.setVisibility(0);
        }
        ImageButton imageButton4 = (ImageButton) findViewById(2131363688);
        this.m = imageButton4;
        if (imageButton4 != null) {
            imageButton4.setVisibility(8);
        }
        ImageButton imageButton5 = (ImageButton) findViewById(2131363932);
        this.n = imageButton5;
        if (imageButton5 != null) {
            imageButton5.setVisibility(8);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(2131363457);
        this.c = viewGroup;
        if (viewGroup != null) {
            SeekBar seekBar = (SeekBar) viewGroup.findViewById(2131363456);
            this.d = seekBar;
            if (seekBar != null) {
                seekBar.setOnSeekBarChangeListener(ehdVar);
                this.d.setMax(1000);
            }
        }
        this.e = (TextView) findViewById(2131364755);
        this.f = (TextView) findViewById(2131364756);
        this.h = new StringBuilder();
        this.i = new Formatter(this.h, Locale.getDefault());
        ImageButton imageButton6 = this.m;
        if (imageButton6 != null) {
            imageButton6.setOnClickListener(null);
            this.m.setEnabled(false);
        }
        ImageButton imageButton7 = this.n;
        if (imageButton7 != null) {
            imageButton7.setOnClickListener(null);
            this.n.setEnabled(false);
        }
    }

    public final String a(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        this.h.setLength(0);
        Formatter formatter = this.i;
        return i5 > 0 ? formatter.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString() : formatter.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }

    public final void b() {
        wth wthVar = this.a;
        if (wthVar != null) {
            CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) wthVar.b;
            long j = (cafExpandedControllerActivity.c.g() && cafExpandedControllerActivity.s().isPlaying()) ? 74L : 76L;
            boolean zIsEnabled = isEnabled();
            ImageButton imageButton = this.j;
            if (imageButton != null) {
                imageButton.setEnabled(zIsEnabled && (((4 & j) > 0L ? 1 : ((4 & j) == 0L ? 0 : -1)) != 0 || ((j & 2) > 0L ? 1 : ((j & 2) == 0L ? 0 : -1)) != 0));
            }
            ImageButton imageButton2 = this.l;
            if (imageButton2 != null) {
                imageButton2.setEnabled(zIsEnabled);
            }
            ImageButton imageButton3 = this.k;
            if (imageButton3 != null) {
                imageButton3.setEnabled(zIsEnabled);
            }
            ImageButton imageButton4 = this.n;
            if (imageButton4 != null) {
                imageButton4.setEnabled(false);
            }
            ImageButton imageButton5 = this.m;
            if (imageButton5 != null) {
                imageButton5.setEnabled(false);
            }
        }
    }

    public final void c() {
        ImageButton imageButton;
        wth wthVar = this.a;
        if (wthVar == null || (imageButton = this.j) == null) {
            return;
        }
        CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) wthVar.b;
        if (!cafExpandedControllerActivity.c.g() ? false : cafExpandedControllerActivity.s().isPlaying()) {
            imageButton.setImageResource(R.drawable.ic_media_pause);
        } else {
            imageButton.setImageResource(R.drawable.ic_media_play);
        }
    }

    public final void d() {
        wth wthVar = this.a;
        if (wthVar == null || this.g) {
            return;
        }
        long jH = wthVar.H();
        CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) this.a.b;
        long j = !cafExpandedControllerActivity.c.g() ? 0L : cafExpandedControllerActivity.c.f.a.a;
        ViewGroup viewGroup = this.c;
        if (j > 0) {
            SeekBar seekBar = this.d;
            if (seekBar != null) {
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                int i = (int) ((1000 * jH) / j);
                seekBar.setProgress(i);
                seekBar.setSecondaryProgress(i);
            }
        } else if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(a((int) j));
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setText(a((int) jH));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MediaController.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MediaController.class.getName());
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        b();
    }
}
