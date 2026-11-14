package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.i;
import defpackage.cod;
import defpackage.o0g;
import defpackage.ond;
import defpackage.sgb;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class e extends i {
    public cod b;
    public final ImageButton c;
    public final MediaRouteVolumeSlider d;
    public final /* synthetic */ ond e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ond ondVar, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int color;
        int color2;
        super(view);
        this.e = ondVar;
        this.c = imageButton;
        this.d = mediaRouteVolumeSlider;
        Context context = ondVar.o;
        Drawable drawableF = sgb.F(2131232936, context);
        if (o0g.g0(context)) {
            drawableF.setTint(context.getColor(2131101263));
        }
        imageButton.setImageDrawable(drawableF);
        if (o0g.g0(context)) {
            color = context.getColor(2131101255);
            color2 = context.getColor(2131101253);
        } else {
            color = context.getColor(2131101254);
            color2 = context.getColor(2131101252);
        }
        if (mediaRouteVolumeSlider.e != color) {
            mediaRouteVolumeSlider.e = color;
        }
        if (mediaRouteVolumeSlider.f != color2) {
            mediaRouteVolumeSlider.f = color2;
        }
    }

    public final void U(cod codVar) {
        this.b = codVar;
        int i = codVar.p;
        boolean z = i == 0;
        ImageButton imageButton = this.c;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new sma(this, (byte) 27));
        cod codVar2 = this.b;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.d;
        mediaRouteVolumeSlider.setTag(codVar2);
        mediaRouteVolumeSlider.setMax(codVar.q);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.e.v);
    }

    public final void V(boolean z) {
        ImageButton imageButton = this.c;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        HashMap map = this.e.y;
        if (z) {
            map.put(this.b.c, Integer.valueOf(this.d.getProgress()));
        } else {
            map.remove(this.b.c);
        }
    }
}
