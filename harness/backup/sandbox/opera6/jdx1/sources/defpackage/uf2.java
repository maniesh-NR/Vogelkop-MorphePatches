package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class uf2 {
    public static final uf2 c = new uf2(h1b.v(tf2.d));
    public static final csh d;
    public static final l1b e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        c09.e(3, objArr);
        d = h1b.o(3, objArr);
        k1b k1bVar = new k1b(4);
        k1bVar.e(5, 6);
        k1bVar.e(17, 6);
        k1bVar.e(7, 6);
        k1bVar.e(30, 10);
        k1bVar.e(18, 6);
        k1bVar.e(6, 8);
        k1bVar.e(8, 8);
        k1bVar.e(14, 8);
        e = k1bVar.b(true);
    }

    public uf2(csh cshVar) {
        for (int i = 0; i < cshVar.d; i++) {
            tf2 tf2Var = (tf2) cshVar.get(i);
            this.a.put(tf2Var.a, tf2Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((tf2) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static csh a(int i, int[] iArr) {
        z0b z0bVarP = h1b.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            z0bVarP.c(new tf2(i2, i));
        }
        return z0bVarP.g();
    }

    public static uf2 b(Context context, pf2 pf2Var, AudioDeviceInfo audioDeviceInfo) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), pf2Var, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uf2 c(android.content.Context r10, android.content.Intent r11, defpackage.pf2 r12, android.media.AudioDeviceInfo r13) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf2.c(android.content.Context, android.content.Intent, pf2, android.media.AudioDeviceInfo):uf2");
    }

    public final Pair d(pf2 pf2Var, oj9 oj9Var) {
        String str = oj9Var.n;
        str.getClass();
        int iD = dzd.d(str, oj9Var.k);
        if (!e.containsKey(Integer.valueOf(iD))) {
            return null;
        }
        SparseArray sparseArray = this.a;
        if (iD == 18 && !tym.k(sparseArray, 18)) {
            iD = 6;
        } else if ((iD == 8 && !tym.k(sparseArray, 8)) || (iD == 30 && !tym.k(sparseArray, 30))) {
            iD = 7;
        }
        if (!tym.k(sparseArray, iD)) {
            return null;
        }
        tf2 tf2Var = (tf2) sparseArray.get(iD);
        tf2Var.getClass();
        int i = tf2Var.b;
        u1b u1bVar = tf2Var.c;
        int i2 = oj9Var.F;
        boolean zContains = false;
        if (i2 == -1 || iD == 18) {
            int i3 = oj9Var.G;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (u1bVar == null) {
                int i4 = tf2Var.a;
                i = 10;
                while (true) {
                    if (i > 0) {
                        int iR = tym.r(i);
                        if (iR != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i3).setChannelMask(iR).build(), pf2Var.b())) {
                            break;
                        }
                        i--;
                    } else {
                        i = 0;
                        break;
                    }
                }
            }
            i2 = i;
        } else if (!oj9Var.n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (u1bVar != null) {
                int iR2 = tym.r(i2);
                if (iR2 != 0) {
                    zContains = u1bVar.contains(Integer.valueOf(iR2));
                }
            } else if (i2 <= i) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int iR3 = tym.r(i2);
        if (iR3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iR3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf2)) {
            return false;
        }
        uf2 uf2Var = (uf2) obj;
        return tym.m(this.a, uf2Var.a) && this.b == uf2Var.b;
    }

    public final int hashCode() {
        return (tym.n(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
