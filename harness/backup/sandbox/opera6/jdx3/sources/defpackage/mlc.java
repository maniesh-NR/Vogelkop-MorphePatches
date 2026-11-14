package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;

/* loaded from: classes.dex */
public final class mlc implements a5n {
    public final /* synthetic */ byte a = 0;
    public final ConstraintLayout b;
    public final StylingTextView c;
    public final StylingTextView d;
    public final StylingTextView e;
    public final View f;
    public final View g;
    public final Object h;
    public final View i;
    public final Object j;

    public mlc(View view, LiveScoreAudioCommentaryView liveScoreAudioCommentaryView, ConstraintLayout constraintLayout, StylingTextView stylingTextView, StylingTextView stylingTextView2, StylingTextView stylingTextView3, y83 y83Var, LiveScoreCarouselStarButton liveScoreCarouselStarButton, mlc mlcVar) {
        this.f = view;
        this.g = liveScoreAudioCommentaryView;
        this.b = constraintLayout;
        this.c = stylingTextView;
        this.d = stylingTextView2;
        this.e = stylingTextView3;
        this.h = y83Var;
        this.i = liveScoreCarouselStarButton;
        this.j = mlcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mlc(ConstraintLayout constraintLayout, StylingImageView stylingImageView, ImageView imageView, StylingTextView stylingTextView, StylingTextView stylingTextView2, StylingImageView stylingImageView2, ImageView imageView2, StylingTextView stylingTextView3, StylingTextView stylingTextView4) {
        this.b = constraintLayout;
        this.f = stylingImageView;
        this.g = imageView;
        this.c = stylingTextView;
        this.d = stylingTextView2;
        this.h = stylingImageView2;
        this.i = imageView2;
        this.e = stylingTextView3;
        this.j = stylingTextView4;
    }

    public static mlc a(View view) {
        int i = 2131362102;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362102, view);
        if (stylingImageView != null) {
            i = 2131362103;
            ImageView imageView = (ImageView) w1h.j(2131362103, view);
            if (imageView != null) {
                i = 2131362104;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362104, view);
                if (stylingTextView != null) {
                    i = 2131362106;
                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131362106, view);
                    if (stylingTextView2 != null) {
                        i = 2131363139;
                        StylingImageView stylingImageView2 = (StylingImageView) w1h.j(2131363139, view);
                        if (stylingImageView2 != null) {
                            i = 2131363141;
                            ImageView imageView2 = (ImageView) w1h.j(2131363141, view);
                            if (imageView2 != null) {
                                i = 2131363142;
                                StylingTextView stylingTextView3 = (StylingTextView) w1h.j(2131363142, view);
                                if (stylingTextView3 != null) {
                                    i = 2131363144;
                                    StylingTextView stylingTextView4 = (StylingTextView) w1h.j(2131363144, view);
                                    if (stylingTextView4 != null) {
                                        return new mlc((ConstraintLayout) view, stylingImageView, imageView, stylingTextView, stylingTextView2, stylingImageView2, imageView2, stylingTextView3, stylingTextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return this.f;
            default:
                return this.b;
        }
    }
}
