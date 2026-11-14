package defpackage;

import android.media.MediaPlayer;
import android.view.TextureView;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jmo implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener {
    public final WeakReference a;
    public final /* synthetic */ qoo b;

    public jmo(qoo qooVar, qoo qooVar2) {
        this.b = qooVar;
        this.a = new WeakReference(qooVar2);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[PHI: r7
      0x0087: PHI (r7v25 android.graphics.Bitmap) = (r7v24 android.graphics.Bitmap), (r7v26 android.graphics.Bitmap) binds: [B:30:0x0085, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.media.MediaPlayer.OnCompletionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(android.media.MediaPlayer r7) {
        /*
            r6 = this;
            java.lang.ref.WeakReference r7 = r6.a
            java.lang.Object r7 = r7.get()
            qoo r7 = (defpackage.qoo) r7
            if (r7 == 0) goto Lb7
            qoo r6 = r6.b
            rii r6 = r6.b
            if (r6 == 0) goto Lb7
            java.lang.Object r6 = r6.b
            euo r6 = (defpackage.euo) r6
            r7 = 7
            r6.a = r7
            android.widget.FrameLayout r7 = r6.f
            r0 = 0
            r7.setKeepScreenOn(r0)
            r6.f()
            r6.B = r0
            boolean r7 = r6.i()
            if (r7 == 0) goto L2b
            r6.h()
        L2b:
            t8p r6 = r6.m
            if (r6 == 0) goto Lb7
            wtm r7 = r6.x
            r1 = 12
            r7.a(r1)
            xho r7 = r6.z
            if (r7 == 0) goto Lb3
            android.widget.ImageView r7 = r6.v
            if (r7 != 0) goto L4e
            android.widget.ImageView r7 = new android.widget.ImageView
            android.content.Context r1 = r6.getContext()
            r7.<init>(r1)
            r6.v = r7
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r7.setScaleType(r1)
        L4e:
            java.lang.String r7 = r6.y
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L8c
            euo r7 = r6.u
            qoo r7 = r7.e
            if (r7 == 0) goto L63
            android.media.MediaPlayer r7 = r7.f     // Catch: java.lang.IllegalStateException -> L63
            int r7 = r7.getDuration()     // Catch: java.lang.IllegalStateException -> L63
            goto L64
        L63:
            r7 = r0
        L64:
            if (r7 <= 0) goto L7a
            r1 = 300000(0x493e0, float:4.2039E-40)
            if (r7 > r1) goto L7a
            xho r1 = r6.z
            java.lang.String r1 = r1.s
            long r2 = (long) r7
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            android.graphics.Bitmap r7 = dbh.b(r2, r1)
            if (r7 == 0) goto L8c
            goto L87
        L7a:
            xho r7 = r6.z
            java.lang.String r7 = r7.s
            r1 = 1000000(0xf4240, double:4.940656E-318)
            android.graphics.Bitmap r7 = dbh.b(r1, r7)
            if (r7 == 0) goto L8c
        L87:
            android.widget.ImageView r1 = r6.v
            r1.setImageBitmap(r7)
        L8c:
            android.widget.ImageView r7 = r6.v
            a8p r1 = new a8p
            r1.<init>(r6, r0)
            r7.setOnClickListener(r1)
            android.widget.ImageView r7 = r6.v
            upj.j(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r7.<init>(r0, r0)
            android.widget.ImageView r0 = r6.v
            r6.addView(r0, r7)
            sc r7 = r6.o
            if (r7 == 0) goto Lb3
            android.widget.ImageView r0 = r6.v
            pp9 r1 = pp9.b
            java.lang.String r2 = "end image"
            r7.d(r0, r1, r2)
        Lb3:
            r7 = 1
            r6.x(r7)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmo.onCompletion(android.media.MediaPlayer):void");
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        uto utoVar;
        if (((qoo) this.a.get()) == null || (utoVar = this.b.d) == null) {
            return false;
        }
        euo euoVar = (euo) utoVar.b;
        if (i != -38 && i != Integer.MIN_VALUE && i2 != -38 && i2 != Integer.MIN_VALUE) {
            if (euoVar.i()) {
                euoVar.h();
            }
            euoVar.a = -1;
            euoVar.f();
            euoVar.I = 1;
            t8p t8pVar = euoVar.m;
            if (t8pVar != null && !t8pVar.D) {
                t8pVar.x.a(16);
                t8pVar.y();
                t8pVar.D = true;
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        tvk tvkVar;
        TextureView textureView;
        if (((qoo) this.a.get()) == null || (tvkVar = this.b.e) == null) {
            return false;
        }
        euo euoVar = (euo) tvkVar.a;
        int i3 = 3;
        if (i == 3) {
            euoVar.a = 3;
            t8p t8pVar = euoVar.m;
            if (t8pVar == null) {
                return true;
            }
            upj.j(t8pVar.v);
            upj.j(t8pVar.w);
            sc scVar = t8pVar.o;
            if (scVar == null) {
                return true;
            }
            ImageView imageView = t8pVar.v;
            if (imageView != null) {
                scVar.c(imageView);
            }
            ImageButton imageButton = t8pVar.w;
            if (imageButton == null) {
                return true;
            }
            t8pVar.o.c(imageButton);
            return true;
        }
        if (i == 701) {
            int i4 = euoVar.a;
            if (i4 == 4 || i4 == 6) {
                euoVar.a = 6;
                return true;
            }
            euoVar.a = 5;
            return true;
        }
        if (i != 702) {
            if (i != 10001 || (textureView = euoVar.g) == null) {
                return true;
            }
            textureView.setRotation(i2);
            return true;
        }
        int i5 = euoVar.a;
        if (i5 == 5) {
            euoVar.a = 3;
        } else {
            i3 = i5;
        }
        if (i3 != 6) {
            return true;
        }
        euoVar.a = 4;
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        qoo qooVar;
        z4k z4kVar;
        if (((qoo) this.a.get()) == null || (z4kVar = (qooVar = this.b).a) == null) {
            return;
        }
        euo euoVar = (euo) z4kVar.b;
        euoVar.a = 2;
        qooVar.f.start();
        euoVar.l.a(8);
        euoVar.a = 3;
        euoVar.d();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (((qoo) this.a.get()) == null || this.b.c == null) {
            return;
        }
        int i3 = euo.J;
    }
}
