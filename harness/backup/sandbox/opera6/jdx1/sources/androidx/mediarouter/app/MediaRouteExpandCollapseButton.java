package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.o0g;

/* loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimatedVectorDrawable d;
    public final AnimatedVectorDrawable e;
    public final String f;
    public final String g;
    public boolean h;
    public View.OnClickListener i;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131232945);
        this.d = animatedVectorDrawable;
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131232944);
        this.e = animatedVectorDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(o0g.R(context), PorterDuff.Mode.SRC_IN);
        animatedVectorDrawable.setColorFilter(porterDuffColorFilter);
        animatedVectorDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(2132019837);
        this.f = string;
        this.g = context.getString(2132019835);
        setImageDrawable(animatedVectorDrawable);
        setContentDescription(string);
        super.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
                AnimatedVectorDrawable animatedVectorDrawable3 = mediaRouteExpandCollapseButton.e;
                AnimatedVectorDrawable animatedVectorDrawable4 = mediaRouteExpandCollapseButton.d;
                boolean z = mediaRouteExpandCollapseButton.h;
                mediaRouteExpandCollapseButton.h = !z;
                if (z) {
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable3);
                    animatedVectorDrawable3.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable4);
                    animatedVectorDrawable4.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.g);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.i;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }
}
