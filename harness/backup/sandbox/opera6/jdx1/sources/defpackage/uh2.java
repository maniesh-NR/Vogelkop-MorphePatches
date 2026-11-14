package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uh2 implements zg2 {
    public final Context a;
    public final n9a b;
    public final yqa c;
    public final u59 d;
    public ijc e;
    public kzk f;
    public uf2 g;
    public xf2 h;
    public Looper i;
    public Context j;

    public uh2(i3j i3jVar) {
        Context context = (Context) i3jVar.a;
        this.a = context;
        yqa yqaVar = (yqa) i3jVar.b;
        yqaVar.getClass();
        this.c = yqaVar;
        this.b = (n9a) i3jVar.c;
        this.g = (uf2) i3jVar.d;
        this.d = context == null ? null : new u59(this, (byte) 13);
        this.f = kzk.a;
    }

    public final th2 a(yg2 yg2Var) throws UnsupportedOperationException, wg2, IllegalArgumentException {
        Context context;
        Context context2;
        try {
            int i = yg2Var.h;
            int i2 = yg2Var.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(yg2Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : yg2Var.g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(yg2Var.b).setChannelMask(yg2Var.c).setEncoding(yg2Var.a).build()).setTransferMode(1).setBufferSizeInBytes(yg2Var.f).setSessionId(i);
            sessionId.setOffloadedPlayback(yg2Var.e);
            if (Build.VERSION.SDK_INT >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new th2(audioTrackBuild, yg2Var, this.d, this.f);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new wg2();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new wg2(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vg2 b(defpackage.ug2 r8) {
        /*
            r7 = this;
            r7.e(r8)
            oj9 r0 = r8.a
            pf2 r8 = r8.b
            yqa r1 = r7.c
            rg2 r1 = r1.g(r8, r0)
            vg2 r2 = new vg2
            r2.<init>()
            r3 = 0
            r2.d = r3
            java.lang.String r4 = r0.n
            int r5 = r0.H
            java.lang.String r6 = "audio/raw"
            boolean r4 = java.util.Objects.equals(r4, r6)
            r6 = 2
            if (r4 == 0) goto L32
            boolean r7 = defpackage.tym.I(r5)
            if (r7 != 0) goto L2e
            java.lang.String r7 = "Invalid PCM encoding: "
            vep.y(r5, r7)
            goto L3b
        L2e:
            if (r5 == r6) goto L3a
            r3 = 1
            goto L3b
        L32:
            uf2 r7 = r7.g
            android.util.Pair r7 = r7.d(r8, r0)
            if (r7 == 0) goto L3b
        L3a:
            r3 = r6
        L3b:
            r2.d = r3
            boolean r7 = r1.a
            r2.a = r7
            boolean r8 = r1.b
            r2.b = r8
            boolean r0 = r1.c
            r2.c = r0
            if (r7 != 0) goto L56
            if (r8 != 0) goto L4f
            if (r0 == 0) goto L56
        L4f:
            java.lang.String r7 = "Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false"
            qp2.n(r7)
            r7 = 0
            return r7
        L56:
            vg2 r7 = new vg2
            r7.<init>()
            boolean r8 = r2.a
            r7.a = r8
            boolean r8 = r2.b
            r7.b = r8
            boolean r8 = r2.c
            r7.c = r8
            byte r8 = r2.d
            r7.d = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh2.b(ug2):vg2");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yg2 c(defpackage.ug2 r24) throws defpackage.tg2 {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh2.c(ug2):yg2");
    }

    public final void d() {
        ijc ijcVar = this.e;
        if (ijcVar != null) {
            ijcVar.e();
        }
        xf2 xf2Var = this.h;
        if (xf2Var != null) {
            Context context = (Context) xf2Var.b;
            if (xf2Var.a) {
                xf2Var.h = null;
                scd.E(context).unregisterAudioDeviceCallback((vf2) xf2Var.e);
                context.unregisterReceiver((up1) xf2Var.f);
                ContentObserver contentObserver = (wf2) xf2Var.g;
                if (contentObserver != null) {
                    ((wf2) contentObserver).b.unregisterContentObserver(contentObserver);
                }
                xf2Var.a = false;
            }
        }
    }

    public final void e(ug2 ug2Var) {
        uf2 uf2VarC;
        AudioDeviceInfo audioDeviceInfo = ug2Var.c;
        pf2 pf2Var = ug2Var.b;
        f();
        xf2 xf2Var = this.h;
        if (xf2Var == null) {
            Context context = this.a;
            if (context != null) {
                xf2 xf2Var2 = new xf2(context, new va2(this, (byte) 3), pf2Var, audioDeviceInfo);
                this.h = xf2Var2;
                Handler handler = (Handler) xf2Var2.d;
                Context context2 = (Context) xf2Var2.b;
                if (xf2Var2.a) {
                    uf2VarC = (uf2) xf2Var2.h;
                    uf2VarC.getClass();
                } else {
                    xf2Var2.a = true;
                    ContentObserver contentObserver = (wf2) xf2Var2.g;
                    if (contentObserver != null) {
                        ((wf2) contentObserver).b.registerContentObserver((Uri) ((wf2) contentObserver).c, false, contentObserver);
                    }
                    scd.E(context2).registerAudioDeviceCallback((vf2) xf2Var2.e, handler);
                    uf2VarC = uf2.c(context2, context2.registerReceiver((up1) xf2Var2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (pf2) xf2Var2.j, (AudioDeviceInfo) xf2Var2.i);
                    xf2Var2.h = uf2VarC;
                }
                this.g = uf2VarC;
            }
        } else {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) xf2Var.i)) {
                xf2Var.i = audioDeviceInfo;
                xf2Var.a(uf2.b((Context) xf2Var.b, (pf2) xf2Var.j, audioDeviceInfo));
            }
            xf2 xf2Var3 = this.h;
            if (!Objects.equals(pf2Var, (pf2) xf2Var3.j)) {
                xf2Var3.j = pf2Var;
                xf2Var3.a(uf2.b((Context) xf2Var3.b, pf2Var, (AudioDeviceInfo) xf2Var3.i));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.i = looperMyLooper;
        } else {
            qp2.n(n1h.j("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
