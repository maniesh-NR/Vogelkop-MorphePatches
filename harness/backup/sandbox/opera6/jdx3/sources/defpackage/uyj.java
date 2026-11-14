package defpackage;

import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uyj extends UtteranceProgressListener implements TextToSpeech.OnInitListener {
    public static final zyk k = z4c.b(new unj((byte) 3));
    public final umi a;
    public final kze b;
    public final qie c;
    public final TextToSpeech d;
    public Function0 e;
    public final kze f;
    public final ode g;
    public final pyl h;
    public syj i;
    public float j;

    /* JADX WARN: Multi-variable type inference failed */
    public uyj(dx3 dx3Var, umi umiVar) {
        this.a = umiVar;
        kze kzeVar = new kze(wyj.a);
        this.b = kzeVar;
        this.c = new qie((byte) 19);
        this.d = new TextToSpeech(dx3Var.getApplicationContext(), this);
        this.e = new unj((byte) 4);
        this.f = new kze(0);
        this.g = new ode((Object) null);
        this.h = new pyl((byte) 9);
        this.j = 1.0f;
        kzeVar.k(new w4i(new tji((Object) this, (byte) 28), (byte) 8));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onAudioAvailable(String str, byte[] bArr) {
        syj syjVar = this.i;
        if (syjVar == null || bArr == null) {
            return;
        }
        int i = syjVar.b;
        int i2 = 0;
        if (i == 2) {
            ShortBuffer shortBufferAsShortBuffer = ByteBuffer.wrap(bArr).asShortBuffer();
            int length = bArr.length / 2;
            while (i2 < length) {
                syjVar.a(shortBufferAsShortBuffer.get(i2) / 32768.0f);
                i2++;
            }
            return;
        }
        if (i == 3) {
            int length2 = bArr.length;
            while (i2 < length2) {
                syjVar.a(bArr[i2] / 128.0f);
                i2++;
            }
            return;
        }
        if (i == 4) {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(bArr).asFloatBuffer();
            int length3 = bArr.length / 4;
            while (i2 < length3) {
                syjVar.a(floatBufferAsFloatBuffer.get(i2));
                i2++;
            }
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onBeginSynthesis(String str, int i, int i2, int i3) {
        tyj tyjVarL = this.h.l();
        if (Intrinsics.a(str, tyjVarL != null ? tyjVarL.b : null) && i3 == 1) {
            syj syjVar = this.i;
            if (syjVar != null) {
                synchronized (syjVar.f) {
                    vml.a(syjVar.j);
                    syjVar.g = null;
                }
            }
            this.i = null;
            this.i = new syj(this.g, i, i2, cs5.O(0.5f, 1.0f, this.j));
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        pyl pylVar = this.h;
        tyj tyjVarL = pylVar.l();
        tyj tyjVarL2 = null;
        if (Intrinsics.a(str, tyjVarL != null ? tyjVarL.b : null)) {
            ArrayList arrayList = (ArrayList) pylVar.e;
            if (!arrayList.isEmpty()) {
                arrayList.remove(0);
                tyjVarL2 = pylVar.l();
            }
            if (tyjVarL2 != null) {
                return;
            }
            this.b.n(zyj.a);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i) {
        tyj tyjVarL = this.h.l();
        if (Intrinsics.a(str, tyjVarL != null ? tyjVarL.b : null)) {
            ryj ryjVar = i != -9 ? (i == -7 || i == -6) ? ryj.c : ryj.d : ryj.a;
            this.b.n(new vyj(ryjVar));
        }
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        kze kzeVar = this.b;
        if (i != 0) {
            kzeVar.n(new vyj(ryj.d));
        } else if (this.d.setOnUtteranceProgressListener(this) != 0) {
            kzeVar.n(new vyj(ryj.d));
        } else {
            vml.c(new mni(this, (byte) 17));
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onRangeStart(String str, int i, int i2, int i3) {
        tyj tyjVarL = this.h.l();
        if (tyjVarL == null || !Intrinsics.a(str, tyjVarL.b)) {
            return;
        }
        pyl pylVar = this.h;
        tyj tyjVarL2 = pylVar.l();
        if (tyjVarL2 != null) {
            az7 az7Var = (az7) pylVar.d;
            if (az7Var != null) {
                ArrayList arrayList = az7Var.a;
                int size = arrayList.size();
                int i4 = 0;
                int i5 = i2;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    int i7 = i4 + 1;
                    if (i4 < 0) {
                        j95.n();
                        throw null;
                    }
                    int i8 = i4 + i2 + 1;
                    if (((Number) obj).intValue() < i8) {
                        i5 = i8;
                    }
                    i4 = i7;
                }
                i2 = i5;
            }
            tyjVarL2.e = i2;
        }
        this.f.n(Integer.valueOf(tyjVarL.d + tyjVarL.e));
        syj syjVar = this.i;
        if (syjVar != null) {
            synchronized (syjVar.f) {
                if (!syjVar.e.isEmpty() && syjVar.g == null) {
                    syjVar.g = Long.valueOf(SystemClock.uptimeMillis() / 20);
                    vml.c(syjVar.j);
                }
            }
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        tyj tyjVarL = this.h.l();
        if (tyjVarL == null || !Intrinsics.a(str, tyjVarL.b)) {
            return;
        }
        ode odeVar = this.g;
        odeVar.n((Object) null);
        this.b.n(new yyj(tyjVarL.a, tyjVarL.c, this.f, odeVar));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStop(String str, boolean z) {
        tyj tyjVarL = this.h.l();
        if (Intrinsics.a(str, tyjVarL != null ? tyjVarL.b : null)) {
            this.b.n(zyj.a);
        }
    }
}
