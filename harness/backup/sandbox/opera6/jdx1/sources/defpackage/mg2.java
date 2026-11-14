package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class mg2 {
    public final dsk a;
    public final Handler b;
    public zi8 c;
    public pf2 d;
    public byte f;
    public og2 h;
    public float g = 1.0f;
    public byte e = 0;

    public mg2(Context context, Looper looper, zi8 zi8Var) {
        this.a = jym.p(new lg2(context, (byte) 0));
        this.c = zi8Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b == 1 || b == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        AudioFocusRequest audioFocusRequest = this.h.f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (this.e != i) {
            this.e = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.g != f) {
                this.g = f;
                zi8 zi8Var = this.c;
                if (zi8Var != null) {
                    zi8Var.h.e(34);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kg2] */
    public final int c(int i, boolean z) {
        byte b;
        ng2 ng2Var;
        if (i == 1 || (b = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        byte b2 = this.e;
        if (z) {
            if (b2 != 2) {
                og2 og2Var = this.h;
                if (og2Var == null) {
                    if (og2Var == null) {
                        ng2Var = new ng2((byte) 0);
                        pf2 pf2Var = pf2.i;
                        ng2Var.b = b;
                    } else {
                        ng2 ng2Var2 = new ng2((byte) 0);
                        ng2Var2.b = og2Var.a;
                        ng2Var = ng2Var2;
                    }
                    pf2 pf2Var2 = this.d;
                    boolean z2 = pf2Var2 != null && pf2Var2.a == 1;
                    pf2Var2.getClass();
                    this.h = new og2(ng2Var.b, (kg2) new AudioManager.OnAudioFocusChangeListener() { // from class: kg2
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i2) {
                            pf2 pf2Var3;
                            mg2 mg2Var = this.a;
                            mg2Var.getClass();
                            if (i2 == -3 || i2 == -2) {
                                if (i2 != -2 && ((pf2Var3 = mg2Var.d) == null || pf2Var3.a != 1)) {
                                    mg2Var.b(4);
                                    return;
                                }
                                zi8 zi8Var = mg2Var.c;
                                if (zi8Var != null) {
                                    szk szkVar = zi8Var.h;
                                    szkVar.getClass();
                                    rzk rzkVarB = szk.b();
                                    rzkVarB.a = szkVar.a.obtainMessage(33, 0, 0);
                                    rzkVarB.b();
                                }
                                mg2Var.b(3);
                                return;
                            }
                            if (i2 == -1) {
                                zi8 zi8Var2 = mg2Var.c;
                                if (zi8Var2 != null) {
                                    szk szkVar2 = zi8Var2.h;
                                    szkVar2.getClass();
                                    rzk rzkVarB2 = szk.b();
                                    rzkVarB2.a = szkVar2.a.obtainMessage(33, -1, 0);
                                    rzkVarB2.b();
                                }
                                mg2Var.a();
                                mg2Var.b(1);
                                return;
                            }
                            if (i2 != 1) {
                                vep.y(i2, "Unknown focus change type: ");
                                return;
                            }
                            mg2Var.b(2);
                            zi8 zi8Var3 = mg2Var.c;
                            if (zi8Var3 != null) {
                                szk szkVar3 = zi8Var3.h;
                                szkVar3.getClass();
                                rzk rzkVarB3 = szk.b();
                                rzkVarB3.a = szkVar3.a.obtainMessage(33, 1, 0);
                                rzkVarB3.b();
                            }
                        }
                    }, this.b, pf2Var2, z2);
                }
                AudioManager audioManager = (AudioManager) this.a.get();
                AudioFocusRequest audioFocusRequest = this.h.f;
                audioFocusRequest.getClass();
                if (audioManager.requestAudioFocus(audioFocusRequest) == 1) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (b2 == 1) {
                return -1;
            }
            if (b2 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
