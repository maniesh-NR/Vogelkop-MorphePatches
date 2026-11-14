package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.media.MediaPlayerMini;

/* loaded from: classes.dex */
public final class tld implements lig {
    public final /* synthetic */ MediaPlayerMini a;

    public tld(MediaPlayerMini mediaPlayerMini) {
        this.a = mediaPlayerMini;
    }

    @Override // defpackage.lig
    public final void b(long j) {
        this.a.a.g.setMax((int) j);
    }

    @Override // defpackage.lig
    public final void d(boolean z, boolean z2) {
        MediaPlayerMini mediaPlayerMini = this.a;
        ((StylingImageButton) mediaPlayerMini.a.d).setImageResource(z ? 2131232175 : 2131232184);
        ((StylingImageButton) mediaPlayerMini.a.d).setEnabled(z2);
        n1h.n((StylingImageButton) mediaPlayerMini.a.d, z ? 2132021933 : 2132021934, 0);
    }

    @Override // defpackage.lig
    public final void e(long j) {
        this.a.a.g.setProgress((int) j);
    }

    @Override // defpackage.lig
    public final void i(CharSequence charSequence, CharSequence charSequence2) throws Resources.NotFoundException {
        MediaPlayerMini mediaPlayerMini = this.a;
        ((StylingTextView) mediaPlayerMini.a.i).setText(charSequence);
        if (TextUtils.isEmpty(charSequence2)) {
            mig migVar = mediaPlayerMini.c;
            qjd qjdVarG = migVar.c().g();
            egd egdVar = qjdVarG != null ? (egd) migVar.d.k.e.get(qjdVarG.a) : null;
            if (egdVar != null && egdVar.b() == o29.AUDIO) {
                charSequence2 = mediaPlayerMini.getResources().getString(2132022042);
            }
        }
        ((StylingTextView) mediaPlayerMini.a.h).setText(charSequence2);
        ((StylingTextView) mediaPlayerMini.a.h).setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
    }
}
