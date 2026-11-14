package defpackage;

import java.io.EOFException;
import java.lang.reflect.Constructor;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class cl6 implements fjc, ee5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ cl6(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void b(long j, long j2) throws EOFException {
        throw new EOFException("DEF length " + j + ((Object) " object truncated by ") + j2);
    }

    public final Constructor a() {
        switch (this.a) {
            case 25:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(cn8.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(cn8.class).getConstructor(null);
        }
    }

    public final void invoke(Object obj) {
        e11 e11Var = (e11) obj;
        switch (this.a) {
            case 0:
                e11Var.getClass();
                break;
            case 1:
                e11Var.getClass();
                break;
            case 2:
                e11Var.getClass();
                break;
            case 3:
                e11Var.getClass();
                break;
            case 4:
                e11Var.getClass();
                break;
            case 5:
                e11Var.getClass();
                break;
            case 6:
                e11Var.getClass();
                break;
            case 7:
                e11Var.getClass();
                break;
            case 8:
                e11Var.getClass();
                break;
            case 9:
                e11Var.getClass();
                break;
            case 10:
                e11Var.getClass();
                break;
            case 11:
                e11Var.getClass();
                break;
            case 12:
                e11Var.getClass();
                break;
            case 13:
                e11Var.getClass();
                break;
            case 14:
                e11Var.getClass();
                break;
            case 15:
                e11Var.getClass();
                break;
            case 16:
                e11Var.getClass();
                break;
            case 17:
                e11Var.getClass();
                break;
            case 18:
                e11Var.getClass();
                break;
            case 19:
                e11Var.getClass();
                break;
            case 20:
                e11Var.getClass();
                break;
            case 21:
                e11Var.getClass();
                break;
            case 22:
                e11Var.getClass();
                break;
            case 23:
                e11Var.getClass();
                break;
            default:
                e11Var.getClass();
                break;
        }
    }

    public final Object r(x79 x79Var) {
        Set setI = x79Var.i(qfh.a(wn2.class));
        zy9 zy9Var = zy9.b;
        if (zy9Var == null) {
            synchronized (zy9.class) {
                zy9Var = zy9.b;
                if (zy9Var == null) {
                    zy9Var = new zy9((byte) 0);
                    zy9.b = zy9Var;
                }
            }
        }
        return new xx6(setI, zy9Var);
    }
}
